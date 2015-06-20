import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;





public class classLoader {
	String classname;
	_Class classinfo;
	String superclassname;


	Object[] bindclassinfo=new Object[3];
	public classLoader(String classname){
		this.classname=classname;


	}




	public _Class getClassinfo(){return classinfo;}
	public boolean load() {

	try {



		DataInputStream di=new DataInputStream(new FileInputStream(new File(classname)));
		int cou=0;
		byte[] ifda=new byte[1];
		while (di.read(ifda)>0) {
			cou++;
		}

		//ByteArrayInputStream byi=new ByteArrayInputStream(di);d
		di.close();
		byte[] by=new byte[cou];
		di=new DataInputStream(new FileInputStream(new File(classname)));
		di.read(by);

		di.close();
		iStream is=new iStream(by);


			byte[] by2=new byte[2];


			is.Seek(8, iStream.STREAM_SEEK_SET);//skip first 8 bytes

			is.read(by2); //read number of constant pool's elements.

			int tmp=(0x00 | by2[0] & 0xff) << 8  | by2[1] & 0xff;


			buf=new byte[tmp+1][3][8];
			byte[] by3=new byte[1];
			byte[] tmpb1;
			byte [] tmpb2;
			byte [] yonby=new byte[4];
			byte[] hby=new byte[8];

			int tmp2;
			buf[0][1][0]=1;
			buf[0][1][1]=2;
			for(int i=1;i<tmp;i++){

				is.read(by3);
				tmp2=by3[0]& 0xFF;

				switch (tmp2) {
				case 1://

					is.read(by2);
					int a=(0x00 | by2[0] & 0xff) << 8  | by2[1] & 0xff;
					tmpb1=new byte[a];
					is.read(tmpb1);
					buf[i][0][0]=by3[0];
					buf[i][1]=bytecopy(tmpb1);

				//
					break;

				case 3:

					is.read(yonby);
					buf[i][0][0]=by3[0];
					buf[i][1][0]=yonby[0];
					buf[i][1][1]=yonby[1];
					buf[i][1][2]=yonby[2];
					buf[i][1][3]=yonby[3];
					//
					break;
				case 4://float_info

					is.read(yonby);
					buf[i][0][0]=by3[0];
					buf[i][1][0]=yonby[0];
					buf[i][1][1]=yonby[1];
					buf[i][1][2]=yonby[2];
					buf[i][1][3]=yonby[3];
				//

					break;
				case 5://Long_info

					buf[i][0][0]=by3[0];
					is.read(hby);
					buf[i][1][0]=hby[7];
					buf[i][1][1]=hby[6];
					buf[i][1][2]=hby[5];
					buf[i][1][3]=hby[4];

					buf[i][1][4]=hby[3];
					buf[i][1][5]=hby[2];
					buf[i][1][6]=hby[1];
					buf[i][1][7]=hby[0];
					i++;
				//
					break;
				case 6://Double_info

					buf[i][0][0]=by3[0];
					is.read(hby);
					buf[i][1][0]=hby[7];
					buf[i][1][1]=hby[6];
					buf[i][1][2]=hby[5];
					buf[i][1][3]=hby[4];

					buf[i][1][4]=hby[3];
					buf[i][1][5]=hby[2];
					buf[i][1][6]=hby[1];
					buf[i][1][7]=hby[0];
					//continue;
					i++;
					break;
				case 7:

					buf[i][0][0]=by3[0];
					is.read(by2);
					buf[i][1][0]=by2[0];
					buf[i][1][1]=by2[1];

				//
				//
					break;
				case 8:

					buf[i][0][0]=by3[0];
					is.read(by2);
					buf[i][1][0]=by2[0];
					buf[i][1][1]=by2[1];
				//
					break;
				case 9:

					buf[i][0][0]=by3[0];
					is.read(by2);
			//
					buf[i][1][0]=by2[0];
					buf[i][1][1]=by2[1];

					is.read(by2);
			//
					buf[i][2][0]=by2[0];
					buf[i][2][1]=by2[1];
			//
					break;

				case 10:

					buf[i][0][0]=by3[0];
					is.read(by2);
					buf[i][1][0]=by2[0];
					buf[i][1][1]=by2[1];
					is.read(by2);
					buf[i][2][0]=by2[0];
					buf[i][2][1]=by2[1];
				//
					break;
				case 11:

					buf[i][0][0]=by3[0];
					is.read(by2);
					buf[i][1][0]=by2[0];
					buf[i][1][1]=by2[1];
					is.read(by2);
					buf[i][2][0]=by2[0];
					buf[i][2][1]=by2[1];
			//
					break;
				case 12:

					buf[i][0][0]=by3[0];
					is.read(by2);
				//
					buf[i][1][0]=by2[0];
					buf[i][1][1]=by2[1];
					is.read(by2);
					buf[i][2][0]=by2[0];
					buf[i][2][1]=by2[1];
			//
					break;

				default:
					is.Seek((int)is.getCurrentPos()-2, iStream.STREAM_SEEK_SET);

					break;
				}



			}


			is.read(by2);//skip bytes which are for access_flag
			is.read(by2);
			tmp=(0x00 | by2[0] & 0xff) << 8  | by2[1] & 0xff;

			byte[] sby=buf[tmp][1];


			tmp=(0x00 | sby[0] & 0xff) << 8  | sby[1] & 0xff;

			//classname=new String(buf[tmp][1]);
			is.read(by2);//super_class
			tmp=(0x00 | by2[0] & 0xff) << 8  | by2[1] & 0xff;

			sby=buf[tmp][1];


			tmp=(0x00 | sby[0] & 0xff) << 8  | sby[1] & 0xff;

			superclassname=new String(buf[tmp][1]);


			by2=new byte[2];
			is.read(by2);//read bytes for interfaces_count
			int tmp3=0;
			int interfacenum=(0x00 | by2[0] & 0xff) << 8  | by2[1] & 0xff;
			Object[] obj =new Object[interfacenum];
			for(int i=0;i<interfacenum;i++){
				is.read(by2);
				tmp=(0x00 | by2[0] & 0xff) << 8  | by2[1] & 0xff;
				by3=classLoader.bytecopy(buf[tmp][1]);
				byte[] by4=classLoader.bytecopy(buf[(0x00 | by3[0] & 0xff) << 8  | by3[1] & 0xff][1]);

				tmp=(0x00 | by4[0] & 0xff) << 8  | by4[1] & 0xff;

				String interfacename=new String(by4);

				obj[i]=interfacename;

			}
			javaStack.vs.InterfaceTable.put(classname, obj);
			is.read(by2);//read bytes for fields_count

			int fieldnum=(0x00 | by2[0] & 0xff) << 8  | by2[1] & 0xff;
			for(int i=0;i<fieldnum;i++){//field_info starts from here
				is.read(by2);
				is.read(by2);

				fileds.addElement(new Fieldinfo());
				((Fieldinfo)fileds.elementAt(i)).name=new String(buf[(0x00 | by2[0] & 0xff) << 8  | by2[1] & 0xff][1]);

				is.read(by2);
				((Fieldinfo)fileds.elementAt(i)).descripta=new String(buf[(0x00 | by2[0] & 0xff) << 8  | by2[1] & 0xff][1]);
				javaStack.vs.fieldtable.put(classname+((Fieldinfo)fileds.elementAt(i)).name, ((Fieldinfo)fileds.elementAt(i)));
				is.read(by2);
				int wh=(0x00 | by2[0] & 0xff) << 8  | by2[1] & 0xff;
				int ftmp;
				int constantvaluecount=0;
				for (int j = 0; j < wh; j++) {
					((Fieldinfo)fileds.elementAt(i)).AddressOfValue=new int[wh];

					is.read(by2);

					ftmp=(0x00 | by2[0] & 0xff) << 8  | by2[1] & 0xff;



					if("ConstantValue".equals(new String(buf[ftmp][1]))){

						is.read(yonby);
						is.read(by2);


					}
					else {

					is.read(yonby);
					}
				}


			}//field_info ends here
by2=new byte[2];
			is.read(by2);//read bytes for method_count


int methodnum=(0x00 | by2[0] & 0xff) << 8  | by2[1] & 0xff;
;;
;

			for(int i=0;i<methodnum;i++){//method_info starts from here

				is.read(by2);
				methods.addElement(new Methodinfo());

				is.read(by2);

;

				((Methodinfo)methods.elementAt(i)).name=new String(buf[(0x00 | by2[0] & 0xff) << 8  | by2[1] & 0xff][1]);
				is.read(by2);




				((Methodinfo)methods.elementAt(i)).descripta=new String(buf[(0x00 | by2[0] & 0xff) << 8  | by2[1] & 0xff][1]);
				System.out.print(((Methodinfo)methods.elementAt(i)).name+((Methodinfo)methods.elementAt(i)).descripta);
				javaStack.vs.methodtable.put(classname+((Methodinfo)methods.elementAt(i)).name+((Methodinfo)methods.elementAt(i)).descripta, ((Methodinfo)methods.elementAt(i)));
				by2=new byte[2];
				is.read(by2);//�����z��
				int attributenum=(0x00 | by2[0] & 0xff) << 8  | by2[1] & 0xff;
				int tmp5;
				by2=new byte[2];
				for (int j = 0; j <attributenum; j++) {
					is.read(by2);

					tmp5=(0x00 | by2[0] & 0xff) << 8  | by2[1] & 0xff;



					String sec=new String(buf[tmp5][1]);

					if("Exceptions".equals(sec)){


						is.read(yonby);
						is.read(by2);
						int exeptionarraynum=(0x00 | by2[0] & 0xff) << 8  | by2[1] & 0xff;

						for (int k = 0; k < exeptionarraynum; k++) {
							is.read(by2);
						}

					}
					else if("synthetic".equals(sec)){

						is.read(yonby);

					}
					else if("Signature".equals(sec)){

						is.read(yonby);

					}
					else if("Code".equals(sec)){

						is.read(by2);

						is.read(by2);

						is.read(by2);

						int maxstack=(0x00 | by2[0] & 0xff) << 8  | by2[1] & 0xff;

						((Methodinfo)methods.elementAt(i)).max_stack=maxstack;
						is.read(by2);

						int maxlocal=(0x00 | by2[0] & 0xff) << 8  | by2[1] & 0xff;

						((Methodinfo)methods.elementAt(i)).max_locals=maxlocal;

						is.read(by2);
						//

						int first2bytes=(0x00 | by2[0] & 0xff) << 8  | by2[1] & 0xff;


						is.read(by2);

						first2bytes+=(0x00 | by2[0] & 0xff) << 8  | by2[1] & 0xff;




						//
						byte[] orders=new byte[first2bytes];
					//
						is.read(orders);

						for (int f = 0; f < orders.length; f++) {

						}


						((Methodinfo)methods.elementAt(i)).orders=orders;
					//
						;
						//is.skip(8);
						by2=new byte[2];
						is.read(by2);


						int exeptionnum=(0x00 | by2[0] & 0xff) << 8  | by2[1] & 0xff;


						Object[][] execpinfos=new Object[exeptionnum][4];
						for (int k = 0; k < exeptionnum; k++) {
							is.read(yonby);



							execpinfos[k][0]=new Integer((0x00 | yonby[0] & 0xff) << 8  | yonby[1] & 0xff);


							execpinfos[k][1]=new Integer((0x00 | yonby[2] & 0xff) << 8  | yonby[3] & 0xff);


							is.read(yonby);
							execpinfos[k][2]=new Integer((0x00 | yonby[0] & 0xff) << 8  | yonby[1] & 0xff);


							int nameofexeption=((0x00 | yonby[2] & 0xff) << 8  | yonby[3] & 0xff);
							byte[] exeby=buf[nameofexeption][1];
							execpinfos[k][3]=new String(bytecopy(buf[((0x00 | exeby[0] & 0xff) << 8  | exeby[1] & 0xff)][1]));




						}
						((Methodinfo)methods.elementAt(i)).exepinfo=execpinfos;

						is.read(by2);

						int attributes_count=(0x00 | by2[0] & 0xff) << 8  | by2[1] & 0xff;


						int tmp6;
						for (int k = 0; k < attributes_count; k++) {

							int wi;
							wi=is.read(by2);


							int attribute_name_index=(0x00 | by2[0] & 0xff) << 8  | by2[1] & 0xff;


							if("LineNumberTable".equals(new String(buf[attribute_name_index][1]))){

								is.read(yonby);
								is.read(by2);
								int line_number_table_length=(0x00 | by2[0] & 0xff) << 8  | by2[1] & 0xff;
								for (int l = 0; l < line_number_table_length; l++) {
									is.read(yonby);
								}
							}
							else if("StackMap".equals(new String(buf[attribute_name_index][1]))){
								;
								is.read(yonby);
								is.skip((javaStack.read16bitsToSignedInteger(yonby, -1)& 0xffffffffL));
							}
							else if("LocalVariableTable".equals(new String(buf[attribute_name_index][1]))) {

								;
is.read(yonby);

								is.read(by2);
								int local_variable_table_length=(0x00 | by2[0] & 0xff) << 8  | by2[1] & 0xff;
								for (int l = 0; l < local_variable_table_length; l++) {
									yonby=new byte[4];
									is.read(yonby);
									yonby=new byte[4];
									is.read(yonby);
									by2=new byte[2];
									is.read(by2);

									//is.skip(10);

								}

							}
							else if("StackMapTable".equals(new String(buf[attribute_name_index][1]))){
								;
								is.read(yonby);
								is.skip((javaStack.read16bitsToSignedInteger(yonby, -1)& 0xffffffffL));
							}
							else if("Signature".equals(new String(buf[attribute_name_index][1]))){
								;
								is.read(yonby);
								is.skip((javaStack.read16bitsToSignedInteger(yonby, -1)& 0xffffffffL));
							}
							else {
								System.out.println("else "+new String(buf[attribute_name_index][1]));
								//is.read(yonby);
								//is.skip((javaStack.read16bitsToSignedInteger(yonby, -1)& 0xffffffffL));

								is.read(by2);
								int i_index = by2[0] & 0xFF;
								i_index = (i_index << 8) | (by2[1] & 0xFF);
								is.skip(i_index);

							}
						}
					}
					else{

					}

				}//method_info ends here

;
			}


			classinfo=new _Class(methods,buf,fileds,classname,superclassname);

			StringTokenizer st=new StringTokenizer(classname,".");





			String classname1=st.nextToken();
			bindclassinfo[0]=classname1;
			bindclassinfo[1]=classinfo;
			bindclassinfo[2]=superclassname;
			javaStack.vs.loadedclassinfo.addElement(bindclassinfo);
			javaStack.vs.clsclTable.put(classname1, superclassname);


			Methodinfo mf=getMethodinfo(classinfo.returnMF(), "<clinit>");


			if(mf!=null){



			javaStack js=new javaStack(mf,new Object[]{new Object()},classinfo);
			js.exec(mf.orders);
			}
		} catch (Exception e) {

			e.printStackTrace();
			return false;

		}

		return true;

	}
	DataInputStream di;
	public Vector methods=new Vector();
	byte[][][] buf;
	public Vector fileds=new Vector();

	Fieldinfo fi;
	Methodinfo mf;

	public static byte[] bytecopy(byte[] a){

		 byte[] res;
		 res=new byte[a.length];
		 for (int i = 0; i < res.length; i++) {
			res[i]=a[i];
		}

		 return res;
	}
		public static Object[] Objectcopy(Object[] a){

			 Object[] res;
			 res=new Object[a.length];
			 for (int i = 0; i < res.length; i++) {
				res[i]=a[i];
			}

			 return res;
		}
		static int SearchMethodbyName(Vector vc,String name){
			for (int i = 0; i < vc.size(); i++) {
				if(((Methodinfo)vc.elementAt(i)).name.equals(name)){
					return i;
				}
			}

			return -1;
		}
		public Methodinfo getMethodinfo(Vector mf,String name){
			Methodinfo m=null;
			int nem=0;
			nem=SearchMethodbyName(mf, name);
			if(nem<0)return m;
			else{
			m= (Methodinfo) mf.elementAt(nem);
			return m;
			}

		}

}
