package KWN.vmonkvm;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import java.util.Hashtable;

import java.util.Enumeration;

import java.util.Stack;
import java.util.Vector;


import javax.microedition.io.Connector;
import javax.microedition.io.Datagram;








 //invokevirtual
//invokeinterface
//invokestatic aastore
//invokespecial
//stack.peek() iand iushr 	if_icmple isub ldc


public class javaStack {

	//public static Vector StaticFields=new Vector();
	public static virtualStatics vs;
	public int i=0;
	public byte[][][] buf;
	public Stack stack;
	Object[] localv;
	_Class cinfo;
	Vector fieldinstance=new Vector();
	_Class tmpcinfo;
	public Methodinfo mf;


Object[] argsobjs=new Object[15];
	public javaStack(Methodinfo vmf,_Class cinfo){
		stack=new Stack();
		i=0;
		localv=new Object[vmf.max_locals];
		this.cinfo=cinfo;
		this.mf=vmf;
		buf=cinfo.getContentPool();

	}
	public javaStack(Methodinfo vmf,Object[] args,_Class cinfo){
		stack=new Stack();
		localv=new Object[vmf.max_locals+1];
		this.mf=vmf;
		i=0;
		;
		;
		;

		for (int i = 0; i < args.length; i++) {
			if(args[i]!=null)
			localv[i]=args[i];
		}


		;

		this.cinfo=cinfo;
		buf=cinfo.getContentPool();

	}

 synchronized Object exec(byte[] instcode){
	try{
		;
	byte[] by,by2,by3,by4,by5;
	int mp,mp2,mp3,mp4;
	Object exobj,exobj2,exobj3;//?ｽ?ｽﾆ用
	Object[] execobj,execobj2;//?ｽ?ｽﾆ用
	Object[][] exe_dobj,exe_dobj2;//?ｽ?ｽﾆ用
	boolean wide=false;
	//int i=0; getfield  NonNative //getfield

	for (; i < instcode.length; i++) {
		;

		for (int j = 0; j < stack.size(); j++) {

			;
		}

		System.gc();
	;
		System.out.print(i+": ");
		switch(instcode[i]){
		case 0x00:
			;
			break;
		case 0x01:
			;
			stack.push(null);
			break;
		case 0x02:
			;
			stack.push(new Integer(-1));
			break;
		case 0x03:
			;
			stack.push(new Integer(0));

			break;
		case 0x04:
			;
			stack.push(new Integer(1));
			break;
		case 0x05:
			;
			stack.push(new Integer(2));
			break;
		case (byte) 0x06 :
			;
			//;
			stack.push(new Integer(3));
			break;
		case (byte) 0x07 :
			;
			//;
			stack.push(new Integer(4));
			break;
		case 0x08:
			;
			stack.push(new Integer(5));
			break;
		case 0x09:
			;
			stack.push(null);
			stack.push(new Long(0));
			break;
		case 0x0A:
			;
			stack.push(null);
			stack.push(new Long(1));
			break;
		case 0x0b:
			;
			stack.push(new Float(0.0));
			break;
		case 0x0c:
			;
			stack.push(new Float(1.0));
			break;
		case 0x0d:
			;
			stack.push(new Float(2.0));
			break;
		case 0x0e:
			;
			stack.push(null);
			stack.push(new Double(0.0));
			break;
		case 0x0f:
			;
			stack.push(null);
			stack.push(new Double(1.0));
			break;
		case 0x10:
			;
		//	mp=instcode[++i]&0xff;
			((Methodinfo)javaStack.vs.methodtable.get(cinfo.getClassName()+mf.name+mf.descripta)).orders[i]=(byte) 0xca;
			mf.values_of_quick_code.put(new Integer(i), new Integer(  instcode[1+i]));
			stack.push(new Integer(instcode[++i]));
			break;
		case 0x11:
			;

			((Methodinfo)javaStack.vs.methodtable.get(cinfo.getClassName()+mf.name+mf.descripta)).orders[i]=(byte) 0xcc;
			mf.values_of_quick_code.put(new Integer(i), new Integer(  read8bitsToSignedShort(instcode, i)));
			//stack.push(new Integer(((instcode[++i] << 8)|instcode[++i]   & 0xff)));
//			 int i_b0 = instcode[++i]& 0xFF;
//		        int i_b1 = instcode[++i]& 0xFF;

		        stack.push(new Integer(  read8bitsToSignedShort(instcode, i)));
		        i+=2;
			break;
		case 0x12:
			;
			((Methodinfo)javaStack.vs.methodtable.get(cinfo.getClassName()+mf.name+mf.descripta)).orders[i]=(byte) 0xcb;

			mp2=instcode[++i]&0xff;
			;
			by3=classLoader.bytecopy(buf[mp2][0]);

			DataInputStream diss= new DataInputStream(new ByteArrayInputStream(classLoader.bytecopy(buf[mp2][1])));

			byte[] bs=new byte[4];

	;
					if((buf[mp2][0][0]&0xff)==3){

						;


/*

					diss.read(bs);
					int n = 0;
					for (int x = 0;x< 4;x++)
					n = (n << 8) | (bs[x] & 0xff);
					stack.push(new Integer(n));
*/
				//stack.push(new Integer(diss.readInt()));

				mf.values_of_quick_code.put(new Integer(i-1), new Integer(diss.readInt()));
		stack.push(mf.values_of_quick_code.get(new Integer(i-1)));

				}
					else if((buf[mp2][0][0]&0xff)==4) {

						;
/*
						diss.read(bs);
						int n = 0;
						for (int x = 0;x< 4;x++)
						n = (n << 8) | (bs[x] & 0xff);
						stack.push(new Float(Float.intBitsToFloat(n)));
*/
						//stack.push(new Float(Float.intBitsToFloat(diss.readInt())));
						mf.values_of_quick_code.put(new Integer(i-1), new Float(Float.intBitsToFloat(diss.readInt())));
						stack.push(mf.values_of_quick_code.get(new Integer(i-1)));
					}
					else{

						;
						//by=classLoader.bytecopy(buf[mp2][1]);
						//String ls=	new String(buf[((by[0]<<8)&0xFF00) + ((by[1])&0xFF)][1]);
						String ls=	new String(buf[diss.readUnsignedShort()][1]);
						;
						//stack.push(new CLDCinstance(ls));
						mf.values_of_quick_code.put(new Integer(i-1), new CLDCinstance(ls));
						stack.push(mf.values_of_quick_code.get(new Integer(i-1)));
					}diss.close();




			break;
		case 0x13:
			;

			((Methodinfo)javaStack.vs.methodtable.get(mf.name+mf.descripta)).orders[i]=(byte) 0xcd;
                 mp2 = ((instcode[++i] & 0xFF) << 8) | (instcode[++i] & 0xFF);


			;
			by3=classLoader.bytecopy(buf[mp2][0]);

			DataInputStream dis= new DataInputStream(new ByteArrayInputStream(classLoader.bytecopy(buf[mp2][1])));
			by4=buf[mp2][1];
			;
			byte[] b=new byte[4];

	//;
					if((buf[mp2][0][0]&0xff)==3){

						;
					//	dis.readByte();

/*

					dis.read(b);
					int n = 0;
					for (int x = 0;x< 4;x++)
					n = (n << 8) | (b[x] & 0xff);
					stack.push(new Integer(n));
*/
						mf.values_of_quick_code.put(new Integer(i-2), new Integer(dis.readInt()));
						stack.push(mf.values_of_quick_code.get(new Integer(i-2)));
					//stack.push(new Integer(dis.readInt()));


				}
					else if((buf[mp2][0][0]&0xff)==4) {

						;
						//stack.push(null);// long double?ｽ?ｽ2word?ｽ?ｽ ifne
/*
						dis.read(b);
						int n = 0;
						for (int x = 0;x< 4;x++)
						n = (n << 8) | (b[x] & 0xff);
						stack.push(new Float(Float.intBitsToFloat(n)));
						*/

						mf.values_of_quick_code.put(new Integer(i-2), new Float(Float.intBitsToFloat(dis.readInt())));
						stack.push(mf.values_of_quick_code.get(new Integer(i-2)));
						//stack.push(new Float(Float.intBitsToFloat(dis.readInt())));
					}
					else{

						;
						by=classLoader.bytecopy(buf[mp2][1]);
						String s=	new String(buf[dis.readUnsignedShort()][1]);
						;
						//stack.push(new CLDCinstance(s));
						mf.values_of_quick_code.put(new Integer(i-2), new CLDCinstance(s));
						stack.push(mf.values_of_quick_code.get(new Integer(i-2)));

					}

dis.close();




			break;
		case (byte) 0x14:
			;
		((Methodinfo)javaStack.vs.methodtable.get(mf.name+mf.descripta)).orders[i]=(byte) 0xce;
		mp2=read8bitsToSignedShort(instcode, i) & 0xFFFF;
		i+=2;
		//((instcode[++i]<<8)&0xFF00) + ((instcode[++i])&0xFF);
		;
		by3=classLoader.bytecopy(buf[mp2][0]);

		dis= new DataInputStream(new ByteArrayInputStream(classLoader.bytecopy(buf[mp2][1])));
		by4=buf[mp2][1];
		;
		b=new byte[8];


				if((buf[mp2][0][0]&0xff)==6){

					;
				//	dis.readByte();


				stack.push(null);
/*
				dis.read(b);
				long n = 0L;
				for (int x= 7; x >= 0; x--)
				  n = (n << 8) | (b[x] & 0xffL);

				double  tempdouble = Double.longBitsToDouble(n);


				;

				stack.push(new Double((double)tempdouble));
*/
				int long1=dis.readInt();
				int long2=dis.readInt();
				mf.values_of_quick_code.put(new Integer(i-2), new Double(Double.longBitsToDouble(( ((long)long1)<<32 ) | ( ((long)long2) & 0xFFFFFFFFL))));
				stack.push(mf.values_of_quick_code.get(new Integer(i-2)));
			//stack.push(new Double(Double.longBitsToDouble(( ((long)long1)<<32 ) | ( ((long)long2) & 0xFFFFFFFFL))));

			}
				else {

					;
					stack.push(null);
					dis.read(b);
					long n = 0L;
					for (int x= 7; x >= 0; x--)
					  n = (n << 8) | (b[x] & 0xffL);




					;


					stack.push(new Long((long)n));
					mf.values_of_quick_code.put(new Integer(i-2),new Long((long)n));
					stack.push(mf.values_of_quick_code.get(new Integer(i-2)));


				//stack.push(new Long(( ((long)dis.readInt())<<32 ) | ( ((long)dis.readInt()) & 0xFFFFFFFFL)));
				}




dis.close();

			break;
		case 0x15:
			;
			i++;
			if(wide){
				;
				 int i_index = instcode[i] & 0xFF;


                     i_index = (i_index << 8) | (instcode[++i] & 0xFF);


				stack.push(localv[i_index]);
				wide=false;
			}

			else{
			mp=instcode[i]&0xff;
			stack.push(localv[mp]);
			}
			break;
		case 0x16:
			;
			i++;
			if(wide){
				;
				 int i_index = instcode[i] & 0xFF;


                 i_index = (i_index << 8) | (instcode[++i] & 0xFF);


			stack.push(localv[i_index+1]);
			stack.push(localv[i_index]);
			wide=false;

			}
			else{
			mp=instcode[i]&0xff;
			stack.push(localv[mp+1]);
			stack.push(localv[mp]);
			}
			break;
		case 0x17:
			;
			i++;
			if(wide){
				;
				 int i_index = instcode[i] & 0xFF;


                 i_index = (i_index << 8) | (instcode[++i] & 0xFF);


			stack.push(localv[i_index]);
			wide=false;
			}
			else{
			mp=instcode[i]&0xff;
			stack.push(localv[mp]);
			}
			break;
		case 0x18:
			;
			i++;
			if(wide){
				;
				 int i_index = instcode[i] & 0xFF;


                 i_index = (i_index << 8) | (instcode[++i] & 0xFF);


			stack.push(localv[i_index+1]);
			stack.push(localv[i_index]);
			wide=false;
			}
			else{
			mp=instcode[i]&0xff;
			stack.push(localv[mp+1]);
			stack.push(localv[mp]);
			}
			break;
		case 0x19:
			;
			i++;
			if(wide){
				;
				 int i_index = instcode[i] & 0xFF;


                 i_index = (i_index << 8) | (instcode[++i] & 0xFF);


			stack.push(localv[i_index]);
			wide=false;
			}
			else{
			mp=instcode[i]&0xff;
			stack.push(localv[mp]);
			}
			break;
		case 0x1a:
			;
			stack.push(localv[0]);
			break;
		case 0x1B:
			;
		//	Integer tmpIn=new Integer(((Integer) localv[1]).intValue()); bipush
		//	tmpIn=(Integer) localv[1];
			stack.push(localv[1]);
			break;
		case 0x1c:
			;
		//	Integer tmpIn=new Integer(((Integer) localv[1]).intValue()); i2c
		//	tmpIn=(Integer) localv[1];
			stack.push(localv[2]);
			break;
		case 0x1d:
			;
			stack.push(localv[3]);
			break;
		case 0x1E:
			;
			stack.push(localv[1]);
			stack.push(localv[0]);
			break;
		case 0x1f:
			;
			stack.push(localv[2]);
			stack.push(localv[1]);
			break;
		case 0x20:
			;
			stack.push(localv[3]);
			stack.push(localv[2]);
			break;
		case 0x21:
			;
			stack.push(localv[4]);
			stack.push(localv[3]);
			break;
		case 0x22:
			;
			stack.push(localv[0]);
			break;
		case 0x23:
			;
			stack.push(localv[1]);
			break;
		case 0x24:
			;
			stack.push(localv[2]);
			break;
		case 0x25:
			;
			stack.push(localv[3]);
			break;
		case 0x26:
			;
			stack.push(localv[1]);
			stack.push(localv[0]);
			break;
		case 0x27:
			;
			stack.push(localv[2]);
			stack.push(localv[1]);
			break;
		case 0x28:
			;
			stack.push(localv[3]);
			stack.push(localv[2]);
			break;
		case 0x29:
			;
			stack.push(localv[4]);
			stack.push(localv[3]);
			break;
		case 0x2A:
			;

			stack.push(localv[0]);
			break;
		case 0x2B:
			;

			stack.push(localv[1]);
			break;
		case 0x2C:
			;
			stack.push(localv[2]);
			break;
		case 0x2d:
			;
			stack.push(localv[3]);
			break;
		case 0x2E:
			;
			int 	dastorei=((Integer)stack.pop()).intValue();
			int[] intarey=(int[])stack.pop();
			stack.push(new Integer(intarey[dastorei]));
			break;
		case 0x2f:
			;
		dastorei=((Integer)stack.pop()).intValue();
		long[]	lastoredoublea=(long[])stack.pop();
			stack.push(null);//dumy null 0x2E
			stack.push((Object)new Long(lastoredoublea[dastorei]));
			break;
		case 0x30:
			;
			dastorei=((Integer)stack.pop()).intValue();
			float[] floatarray=(float[])stack.pop();
			stack.push((Object)new Float(floatarray[dastorei]));
			break;
		case 0x31:
			;
			dastorei=((Integer)stack.pop()).intValue();
			double[] dastoredoublea=(double[])stack.pop();
			stack.push(null);//dumy null
			stack.push((Object)new Double(dastoredoublea[dastorei]));
			break;
		case 0x32:
			;
			Integer aaloadinteger=(Integer)stack.pop();
			Object[] aaloadobj=(Object[])stack.pop();
			if(aaloadobj[(aaloadinteger).intValue()].getClass().getName().equals("KWN.vmonkvm.CLDCinstance"))
			stack.push(new CLDCinstance(aaloadobj[(aaloadinteger).intValue()]));
			else stack.push(aaloadobj[(aaloadinteger).intValue()]);
			break;
		case 0x33:
			;

			aaloadinteger=(Integer)stack.pop();
			;
			;
			if(stack.elementAt(stack.size()-1).toString().charAt(1)=='B'){
				//;
			byte[] baload=(byte[])stack.pop();


			stack.push(new Integer(baload[aaloadinteger.intValue()]));
			break;
			}
			else{

				boolean[] baloadc=(boolean[])stack.pop();
				int bool=(baloadc[aaloadinteger.intValue()])?1:0;
				stack.push(new Integer(bool));
				break;
			}
		case 0x34:
			;
			aaloadinteger=(Integer)stack.pop();
			mp=aaloadinteger.intValue();
			char[] caload=(char[])stack.pop();
;
			stack.push(new Integer((int)caload[mp]));

			break;
		case 0x35:
			;
			aaloadinteger=(Integer)stack.pop();
			short[] saload=(short[])stack.pop();
			stack.push(new Integer(saload[aaloadinteger.intValue()]));
			break;
		case 0x36:
			;

			i++;
			if(wide){
				;
				 int i_index = instcode[i] & 0xFF;


                 i_index = (i_index << 8) | (instcode[++i] & 0xFF);
				localv[ i_index]=stack.pop();

				wide=false;
			}//monitorenter

			else{
			mp=instcode[i]&0xff;
			localv[mp]=stack.pop();

			}
			break;
		case 0x37:
			;

			i++;
			if(wide){
				;
				 int i_index = instcode[i] & 0xFF;


                 i_index = (i_index << 8) | (instcode[++i] & 0xFF);


				localv[ i_index ]=stack.pop();
				localv[ i_index +1]=stack.pop();
				wide=false;
			}
			else{
			mp=instcode[i]&0xff;
			localv[mp]=stack.pop();
			localv[mp+1]=stack.pop();
			}
			break;
		case 0x38:
			;

			i++;
			if(wide){
				;
				 int i_index = instcode[i] & 0xFF;


                 i_index = (i_index << 8) | (instcode[++i] & 0xFF);
				localv[ i_index]=stack.pop();

				wide=false;
			}
			else{
			mp=instcode[i]&0xff;
			localv[mp]=stack.pop();

			}
			break;
		case 0x39:
			;

			i++;
			if(wide){
				;
				 int i_index = instcode[i] & 0xFF;


                 i_index = (i_index << 8) | (instcode[++i] & 0xFF);


				localv[ i_index ]=stack.pop();
				localv[ i_index +1]=stack.pop();
				wide=false;
				wide=false;
			}
			else{
			mp=instcode[i]&0xff;
			localv[mp]=stack.pop();
			localv[mp+1]=stack.pop();
			}
			break;
		case 0x3A:
			;

			i++;
			if(wide){
				;
				 int i_index = instcode[i] & 0xFF;


                 i_index = (i_index << 8) | (instcode[++i] & 0xFF);
				localv[ i_index]=stack.pop();

				wide=false;
			}
			else{
			mp=instcode[i]&0xff;
			localv[mp]=stack.pop();

			}
			break;
		case 0x3b:
			;
			localv[0]=stack.pop();
			break;
		case 0x3C:
			;
			localv[1]=stack.pop();
			break;
		case 0x3D:
			;
			localv[2]=stack.pop();
			break;
		case 0x3e:
			;
			localv[3]=stack.pop();
			break;
		case 0x3F:
			;
			localv[0]=stack.pop();
			localv[1]=stack.pop();
			break;
		case 0x40:
			;
			localv[1]=stack.pop();
			localv[2]=stack.pop();//?ｽQ?ｽ?ｽ?ｽ[?ｽh?ｽ?ｽ?ｽﾅゑｿｽ
			break;
		case 0x41:
			;
			localv[2]=stack.pop();
			localv[3]=stack.pop();
			break;
		case 0x42:
			;
			localv[3]=stack.pop();
		localv[4]=stack.pop();
			break;
		case 0x43:
			;
			localv[0]=stack.pop();
			break;
		case 0x44:
			;
			localv[1]=stack.pop();
			break;
		case 0x45:
			;
			localv[2]=stack.pop();
			break;
		case 0x46:
			;
			localv[3]=stack.pop();
			break;
		case 0x47:
			;
			localv[0]=stack.pop();
			localv[1]=stack.pop();
			break;
		case 0x48:
			;
			localv[1]=stack.pop();
			localv[2]=stack.pop();//?ｽQ?ｽ?ｽ?ｽ[?ｽh?ｽ?ｽ?ｽﾅゑｿｽ new
			break;
		case 0x49:
			;
			localv[2]=stack.pop();
			localv[3]=stack.pop();
			break;
		case 0x4a:
			;
			localv[3]=stack.pop();
			localv[4]=stack.pop();
			break;
		case 0x4b:
			;
			localv[0]=stack.pop();
			break;
		case 0x4C:
			;
			;
			localv[1]=stack.pop();
			;
			break;
		case 0x4d:
			;
			localv[2]=stack.pop();
			break;
		case 0x4e://////////////////////////////////////////////////////
			;
			localv[3]=stack.pop();
			break;
		case 0x4F:
			;
			Integer int1=(Integer)stack.pop();
			dastorei=((Integer)stack.pop()).intValue();
			intarey=(int[])stack.pop();
			intarey[dastorei]=int1.intValue();
			break;
		case 0x50:
			;
			Long long1=(Long)stack.pop();
			stack.pop();//pop out dumy null
			dastorei=((Integer)stack.pop()).intValue();
			lastoredoublea=(long[])stack.pop();
			lastoredoublea[dastorei]=long1.longValue();
			break;
		case 0x51:
			;
			Float tempfloat=(Float)stack.pop();
			dastorei=((Integer)stack.pop()).intValue();
			floatarray=(float[])stack.pop();
			floatarray[dastorei]=tempfloat.floatValue();
			break;
		case 0x52:
			;
			Double tempdouble=(Double)stack.pop();
			stack.pop();//pop out dumy null
			dastorei=((Integer)stack.pop()).intValue();
			dastoredoublea=(double[])stack.pop();
			dastoredoublea[dastorei]=tempdouble.doubleValue();
			break;
		case 0x53:
			;
			exobj=stack.pop();
			if(exobj==null){

			}
			else if(exobj.getClass().getName().equals("KWN.vmonkvm.CLDCinstance")){
				exobj=((CLDCinstance)exobj).cldcobj;
			}
			aaloadinteger=(Integer)stack.pop();
			execobj=(Object[])stack.pop();
			execobj[aaloadinteger.intValue()]=exobj;
			break;
		case 0x54:
			;
			Integer Bastore=null;aaloadinteger=null;
			;
			if(stack.elementAt(stack.size()-3).toString().charAt(1)=='B'){
				 Bastore=(Integer)stack.pop();
				aaloadinteger=(Integer)stack.pop();
				mp=aaloadinteger.intValue();

				byte[] bastore=(byte[])stack.pop();

				bastore[mp]=(byte)Bastore.intValue();
				break;
			} else {
				// TODO: handle exception putfield
;
Bastore=(Integer)stack.pop();
aaloadinteger=(Integer)stack.pop();
				mp=aaloadinteger.intValue();

				boolean[]  cbastore=(boolean[])stack.pop();
				cbastore[mp]=(Bastore.intValue()!=0)?true:false;

				break;
			}


		case 0x55:
			;
			Integer Castore=(Integer)stack.pop();
			aaloadinteger=(Integer)stack.pop();
			mp=aaloadinteger.intValue();

			caload=(char[])stack.pop();
			caload[mp]=(char) Castore.intValue();
			;
			break;
		case 0x56:
			;
			Bastore=(Integer)stack.pop();
			aaloadinteger=(Integer)stack.pop();
			mp=aaloadinteger.intValue();

			short[] sastore=(short[])stack.pop();
			;
			sastore[mp]=(short) Bastore.intValue();
			break;
		case 0x57:
			;
			stack.pop();
			break;
		case 0x58:
			;
			stack.pop();stack.pop();
			break;
		case 0x59:
			;
			//Object obj=new Object();
			//obj=stack.peek();
			stack.push(stack.peek());
			break;
		case 0x5a:///////not checked yet!!!!////////////
			;
			stack.insertElementAt(stack.peek(), stack.size()-2);
			break;
		case 0x5b:
			;
			stack.insertElementAt(stack.peek(), stack.size()-3);
			break;
		case 0x5c:
			;
			stack.push(stack.elementAt(stack.size()-2));
			stack.push(stack.elementAt(stack.size()-2));
			break;
		case 0x5D:
			;
			stack.insertElementAt(stack.peek(), stack.size()-3);
			stack.insertElementAt(stack.elementAt(stack.size()-2), stack.size()-4);
			break;
		case 0x5e:
			;
			stack.insertElementAt(stack.peek(), stack.size()-4);
			stack.insertElementAt(stack.elementAt(stack.size()-2), stack.size()-5);
			break;
		case 0x5F:
			;
			stack.push(stack.elementAt(stack.size()-2));
			stack.removeElementAt(stack.size()-3);
			break;
		case 0x60:
			;
			Integer i1=new Integer(0);
			i1=(Integer) stack.pop();
			Integer i2=new Integer(0);
			i2=(Integer) stack.pop();
			int iaddres=i1.intValue()+i2.intValue();
			stack.push(new Integer(iaddres));
			break;
		case 0x61:
			;
			long1 =(Long)stack.pop();
			stack.pop();//dumy null
			Long long3=(Long)stack.pop();
			stack.pop();
			stack.push(null);//dumy
			stack.push((Long)new Long(long1.longValue()+long3.longValue()));
			break;
		case 0x62:
			;
			stack.push(new Float((((Float)stack.pop()).floatValue()+((Float)stack.pop()).floatValue())));
			break;
		case 0x63:
			;
			Double double1 =(Double)stack.pop();
			stack.pop();//dumy null
			Double double3=(Double)stack.pop();
			stack.pop();
			stack.push(null);//dumy
			stack.push((Double)new Double(double1.doubleValue()+double3.doubleValue()));
			break;
		case 0x64:
			;
			i1=(Integer)stack.pop();
			i2=(Integer)stack.pop();
			stack.push(new Integer(i2.intValue()-i1.intValue()));
			break;
		case 0x65:
			;
			long1 =(Long)stack.pop();
			stack.pop();//dumy null
			long3=(Long)stack.pop();
			stack.pop();
			stack.push(null);//dumy
			stack.push((Long)new Long(long3.longValue()-long1.longValue()));
			break;
		case 0x66:
			;
			tempfloat=(Float)stack.pop();
		Float	float3=(Float)stack.pop();
			stack.push(new Float(float3.floatValue()-tempfloat.floatValue()));
			break;
		case 0x67:
			;
			double1 =(Double)stack.pop();
			stack.pop();//dumy null
			double3=(Double)stack.pop();
			stack.pop();
			stack.push(null);
			stack.push(new Double(double3.doubleValue()-double1.doubleValue()));
			break;
		case 0x68:
			;
			Integer imul1=new Integer(0);
			i1=(Integer) stack.pop();
			Integer imul2=new Integer(0);
			i2=(Integer) stack.pop();
			int imulres=i1.intValue()*i2.intValue();
			stack.push(new Integer(imulres));
			break;
		case 0x69:
			;
			long1 =(Long)stack.pop();
			stack.pop();//dumy null
			long3=(Long)stack.pop();
			stack.pop();
			stack.push(null);//dumy

			stack.push((Long)new Long(long1.longValue()*long3.longValue()));
			break;
		case 0x6a:
			;
			stack.push(new Float((((Float)stack.pop()).floatValue()*((Float)stack.pop()).floatValue())));
			break;
		case 0x6b:
			;
			double1 =(Double)stack.pop();
			stack.pop();//dumy null lshr
			double3=(Double)stack.pop();
			stack.pop();
			stack.push(null);
			if(double1.isNaN()||double3.isNaN())stack.push(new Double(Double.NaN));
			else if((double1.isInfinite()&&(double3.doubleValue()==0))||(double3.isInfinite()&&(double1.doubleValue()==0)))stack.push(new Double(Double.NaN));
			else stack.push((Double)new Double(double3.doubleValue()*double1.doubleValue()));
			break;
		case 0x6c:
			;
			i1=(Integer)stack.pop();
			i2=(Integer)stack.pop();
			stack.push(new Integer(i2.intValue()/i1.intValue()));
			break;
		case 0x6D:
			;
			long1 =(Long)stack.pop();
			stack.pop();//dumy null
			long3=(Long)stack.pop();
			stack.pop();
			stack.push(null);//dumy
			stack.push((Long)new Long(long3.longValue()/long1.longValue()));
			break;
		case 0x6e:
			;
			tempfloat=(Float)stack.pop();
			float3=(Float)stack.pop();
			stack.push(new Float(float3.floatValue()/tempfloat.floatValue()));
			break;
		case 0x6f:
			;
			double1 =(Double)stack.pop();
			stack.pop();//dumy null
			double3=(Double)stack.pop();
			stack.pop();
			stack.push(null);
			stack.push((Double)new Double(double3.doubleValue()/double1.doubleValue()));
			break;
		case 0x70:
			;
			i1=(Integer)stack.pop();
			i2=(Integer)stack.pop();
			stack.push(new Integer(i2.intValue()-(i2.intValue()/i1.intValue())*i1.intValue()));

			break;
		case 0x71:
			;
			long1 =(Long)stack.pop();
			stack.pop();//dumy null
			long3=(Long)stack.pop();
			stack.pop();
			stack.push(null);//dumy
			stack.push((Long)new Long(long3.longValue()-(long3.longValue()/long1.longValue())*long1.longValue()));
			break;
		case 0x72:
			;
			tempfloat =(Float)stack.pop();

			float3=(Float)stack.pop();
			stack.push(new Float(float3.floatValue() - ((int)( float3.floatValue() / tempfloat.doubleValue() ) *  tempfloat.floatValue() )));
		//	stack.push(new Float(tempfloat.floatValue()%float3.floatValue()));
			break;
		case 0x73:
			;
			double1 =(Double)stack.pop();
			stack.pop();//dumy null
			double3=(Double)stack.pop();
			stack.pop();
			if(double1.isNaN()||double3.isNaN()){
				stack.push(null);
				stack.push(new Double(Double.NaN));
			}else{
			stack.push(null);
			//stack.push(new Double(double1.doubleValue()%double3.doubleValue()));
			stack.push(new Double(double3.doubleValue() - ((int)( double3.doubleValue() / double1.doubleValue() ) * double1.doubleValue() )));
			}
			break;
		case 0x74:  //lookupswitch goto checkcast
			;
			stack.push(new Integer(-((Integer)stack.pop()).intValue()));
			break;
		case 0x75:
			;
			long1 =(Long)stack.pop();
		//	stack.pop();//dumy null
			stack.push(new Long(-long1.longValue()));
			break;
		case 0x76:
			;
			float3=(Float)stack.pop();
			stack.push(new Float(-float3.floatValue()));
			break;
		case 0x77:
			;
			double1 =(Double)stack.pop();
			//stack.pop();//dumy null
			stack.push(new Double(-double1.doubleValue()));
			break;
		case 0x78:
			;
			int1=(Integer)stack.pop();
			Integer int2=(Integer)stack.pop();
		/*	int s=int1.intValue()& 0x0000001f;
			stack.push(new Integer((int2.intValue()<<s)));
			*/
			stack.push(new Integer(int2.intValue()<<int1.intValue()));
			break;
		case 0x79:
			;


			i1 =(Integer)stack.pop();

			long3=(Long)stack.pop();
			stack.pop();
			/*
			s=i1.intValue()&0x3f;

			//dumy ishr
			stack.push((Long)new Long(long3.longValue()<<s));
			*/
			stack.push(null);
			stack.push((Long)new Long(long3.longValue()<<i1.intValue()));
			break;
		case 0x7a:
			;
			int1=(Integer)stack.pop();
			int2=(Integer)stack.pop();
		/*	s=int1.intValue()& 0x0000001f;
			stack.push(new Integer((int2.intValue()>>>s)));
			*/
			stack.push(new Integer((int2.intValue()>>int1.intValue())));
			break;
		case 0x7B:
			;

i1 =(Integer)stack.pop();

			long3=(Long)stack.pop();
			stack.pop();
			stack.push(null);//dumy ishr
			//s=i1.intValue()&0x1f;


			/*
			 * ;
		int1=(Integer)stack.pop();
		int2=(Integer)stack.pop();
		s=int2.intValue()&0x1f;
		stack.push(new Integer((int1.intValue()/pow(2,s))));
			 */

			//stack.push((Long)new Long(i1.intValue()/pow(2,(long3.longValue()&0x3f)))); iushr
		/*
			s=i1.intValue()&0x3f;
		stack.push((Long)new Long(long3.longValue()>>>s));
		*/
			stack.push(new Long(long3.longValue()>>i1.intValue()));
			break;
		case 0x7C:
			;
			int1=(Integer)stack.pop();
			int2=(Integer)stack.pop();
			//s=int2.intValue()&0x1f;
		/*	s=int1.intValue()& 0x0000001f;
			if(int2.intValue()<0){
				stack.push(new Integer(((int2.intValue() >> s) + (2 << ~s))));
			}
			else stack.push(new Integer((int2.intValue() >> s)));
			//stack.push(new Integer(int1.intValue()>>int2.intValue())); lshr
			 *
			 */
			stack.push(new Integer(int2.intValue()>>>int1.intValue()));
			break;
		case 0x7D:
			;

i1 =(Integer)stack.pop();

			long3=(Long)stack.pop();
			stack.pop();
		/*	s=i1.intValue()&0x3f;
			if(long3.longValue()>0){
				stack.push(null);
				stack.push((Long)new Long(long3.longValue()>>s));
			}else{
			stack.push(null);//dumyi1
			stack.push((Long)new Long((long3.longValue()>>s)+(2L<<~s)));
			}
			*/
			stack.push(new Long(long3.longValue()>>>i1.intValue()));
			break;
		case 0x7e:
			;
			int1=(Integer)stack.pop();
			int2=(Integer)stack.pop();
			stack.push(new Integer(int2.intValue()&int1.intValue()));
			break;
		case 0x7F:
			;
			long1 =(Long)stack.pop();
			stack.pop();//dumy null
			long3=(Long)stack.pop();
			stack.pop();
			stack.push(null);//dumy
			stack.push((Long)new Long(long3.longValue()&long1.longValue()));
			break;
		case (byte) 0x80:
			;
			int1=(Integer)stack.pop();
			int2=(Integer)stack.pop();
			stack.push(new Integer(int2.intValue()|int1.intValue()));
			break;
		case (byte) 0x81:
			;
			long1 =(Long)stack.pop();
			stack.pop();//dumy null
			long3=(Long)stack.pop();
			stack.pop();
			stack.push(null);//dumy
			stack.push((Long)new Long(long3.longValue()|long1.longValue()));
			break;

		case (byte) 0x82:
			;
			int1=(Integer)stack.pop();
			int2=(Integer)stack.pop();
			stack.push(new Integer(int2.intValue()^int1.intValue()));
			break;
		case (byte) 0x83:
			;
			long1 =(Long)stack.pop();
			stack.pop();//dumy null
			long3=(Long)stack.pop();
			stack.pop();
			stack.push(null);//dumy
			stack.push((Long)new Long(long3.longValue()^long1.longValue()));
			break;
		case (byte) 0x84:
			;
		/*
		if(wide){
			;
			//int wherelocalviinc=instcode[++i]+instcode[++i]&0xff;
			int wherelocalviinc=((instcode[++i] << 8)|instcode[++i]   & 0xff);
			;
			Integer iincin=(Integer)localv[wherelocalviinc];
			//int consts=(instcode[++i]+instcode[++i]&0xff);
			int consts=_readShortFromBytecode(instcode, i);
			i+=2;
			int iinc=iincin.intValue()+consts;
			;
			localv[wherelocalviinc]=new Integer(iinc);
		}
		else{
		int wherelocalviinc=instcode[++i]&0xff;
		;
		Integer iincin=(Integer)localv[wherelocalviinc];
		int consts=instcode[++i];
		int iinc=iincin.intValue()+consts;
		;
		;
		;
		localv[wherelocalviinc]=new Integer(iinc);
		}
		*/
		   int i_index = instcode[++i] & 0xFF;

           if (wide)
           {
               i_index = (i_index << 8) | (instcode[++i] & 0xFF);
           }


           int i_const = instcode[++i] ;

           if (wide)
           {
               i_const = (i_const << 8) | (instcode[++i] & 0xFF);
               wide = false;
           }
           ;
           ;
           ;
           ;

           int i_val = ((Integer) localv[i_index]).intValue() + i_const;
       	localv[i_index]=new Integer(i_val);


		wide=false;
			break;

		case (byte) 0x85:
			;
			Long lg1=new Long(((Integer)stack.pop()).longValue());
			stack.push(null);
			stack.push(lg1);
			break;

		case (byte) 0x86:
			;
			stack.push(new Float(((Integer)stack.pop()).floatValue()));
			break;
		case (byte) 0x87:
			;
			double1=new Double(((Integer)stack.pop()).doubleValue());
			stack.push(null);
			stack.push(double1);
			break;
		case (byte) 0x88:
			;
		long1 =(Long)stack.pop();
		stack.pop();//dumy null
		stack.push(new Integer((int)long1.longValue()));
		break;
		case (byte) 0x89:
			;
			long1=(Long)stack.pop();
			stack.pop();
			stack.push(new Float(long1.floatValue()));
			break;


		case (byte) 0x8a:
			;
		long1 =(Long)stack.pop();
		;//dumy null
		stack.push(new Double(long1.doubleValue()));
		break;
		case (byte) 0x8B:
			;
			stack.push(new Integer((int)((Float)stack.pop()).intValue()));
			break;
		case (byte) 0x8c:
			;
			lg1=new Long(((Float)stack.pop()).longValue());
			stack.push(null);
			stack.push(lg1);
			break;
		case (byte) 0x8d:
			;
			double1=new Double(((Float)stack.pop()).doubleValue());
			stack.push(null);
			stack.push(double1);
			break;
		case (byte) 0x8e:
			;
		double1 =(Double)stack.pop();
		stack.pop();//dumy null
		stack.push(new Integer(double1.intValue()));
		break;
		case (byte) 0x8f:
			;
		double1 =(Double)stack.pop();

		stack.push(new Long(double1.longValue()));
		break;
		case (byte) 0x90:
			;
			double1=(Double)stack.pop();
			stack.pop();
			stack.push(new Float(double1.floatValue()));
			break;
		case (byte) 0x91:
			;
			//stack.push(new Integer(((Integer)stack.pop()).byteValue()));

			break;
		case (byte) 0x92:
			;
		//char ic=(char) ((Integer)stack.pop()).intValue();
		//	stack.push(new Integer(ic));
			break;

		case (byte) 0x93:
			;
		//	stack.push(new Integer((new Short(((Integer)stack.pop()).shortValue())).shortValue()));
			break;
		case (byte) 0x94:
			;
		long1 =(Long)stack.pop();
		stack.pop();//dumy null
		long3=(Long)stack.pop();
		stack.pop();

			if(long1.longValue()==long3.longValue())stack.push(new Integer(0));
			else if(long1.longValue()>long3.longValue())stack.push(new Integer(-1));
			else if(long1.longValue()<long3.longValue())stack.push(new Integer(1));


			break;
		case (byte) 0x95:
			;
		tempfloat =(Float)stack.pop();

		float3=(Float)stack.pop();

		if(tempfloat.isNaN()||float3.isNaN())stack.push(new Integer(-1));
		else {
			if(tempfloat.doubleValue()==float3.doubleValue())stack.push(new Integer(0));
			else if(tempfloat.doubleValue()>float3.doubleValue())stack.push(new Integer(-1));
			else if(tempfloat.doubleValue()<float3.doubleValue())stack.push(new Integer(1));
		}

			break;
		case (byte) 0x96:
			;
		tempfloat =(Float)stack.pop();

		float3=(Float)stack.pop();

		if(tempfloat.isNaN()||float3.isNaN())stack.push(new Integer(1));
		else {
			if(tempfloat.doubleValue()==float3.doubleValue())stack.push(new Integer(0));
			else if(tempfloat.doubleValue()>float3.doubleValue())stack.push(new Integer(-1));
			else if(tempfloat.doubleValue()<float3.doubleValue())stack.push(new Integer(1));
		}

			break;
		case (byte) 0x97:
			;
		double1 =(Double)stack.pop();
		stack.pop();//dumy null
		double3=(Double)stack.pop();
		stack.pop();
		if(double1.isNaN()||double3.isNaN())stack.push(new Integer(-1));
		else {
			if(double1.doubleValue()==double3.doubleValue())stack.push(new Integer(0));
			else if(double1.doubleValue()>double3.doubleValue())stack.push(new Integer(-1));
			else if(double1.doubleValue()<double3.doubleValue())stack.push(new Integer(1));
		}

			break;
		case (byte) 0x98:
			;
		double1 =(Double)stack.pop();
		stack.pop();//dumy null
		double3=(Double)stack.pop();
		stack.pop();
		if(double1.isNaN()||double3.isNaN())stack.push(new Integer(1));
		else {
			if(double1.doubleValue()==double3.doubleValue())stack.push(new Integer(0));
			else if(double1.doubleValue()>double3.doubleValue())stack.push(new Integer(-1));
			else if(double1.doubleValue()<double3.doubleValue())stack.push(new Integer(1));
		}

			break;

		case (byte) 0x99:
			;
		int temppos=i;
		int branchoffset=read8bitsToSignedShort(instcode, i);
        i+= 2;

			if(((Integer)stack.pop()).intValue()==0)i=branchoffset+temppos-1;
			break;
		case (byte) 0x9a:
			;
			temppos=i;

			branchoffset=read8bitsToSignedShort(instcode, i);
	        i+= 2;

			;
			;
			if(((Integer)stack.pop()).intValue()!=0)i=(branchoffset+temppos-1);
			break;
		case (byte) 0x9b:
			;
			temppos=i;
			branchoffset=read8bitsToSignedShort(instcode, i);
	        i+= 2;
			if(((Integer)stack.pop()).intValue()<0)i=branchoffset+temppos-1;
			break;
		case (byte) 0x9c:
			;
			temppos=i;
			branchoffset=read8bitsToSignedShort(instcode, i);
	        i+= 2;
			if(((Integer)stack.pop()).intValue()>=0)i=branchoffset+temppos-1;
			break;
		case (byte) 0x9d:
			;
			temppos=i;
			branchoffset=read8bitsToSignedShort(instcode, i);
	        i+= 2;
			if(((Integer)stack.pop()).intValue()>0)i=branchoffset+temppos-1;
			break;
		case (byte) 0x9e:
			;
		temppos=i;
		branchoffset=read8bitsToSignedShort(instcode, i);
        i+= 2;
		if(((Integer)stack.pop()).intValue()<=0)i=branchoffset+temppos-1;
		break;
		case (byte) 0x9f:
			;
			temppos=i;
			//branchoffset=((instcode[++i] << 8)|instcode[++i]   & 0xff);
			  branchoffset = read8bitsToSignedShort(instcode, i);
              i+= 2;
			if(((Integer)stack.pop()).intValue()==((Integer)stack.pop()).intValue())i=branchoffset+temppos-1;
			break;
		case (byte) 0xa0:
			;
			temppos=i;
			//branchoffset=((instcode[++i]<<8)|instcode[++i]&0xff); ldc
			branchoffset = read8bitsToSignedShort(instcode, i);
            i+= 2;
			if(((Integer)stack.pop()).intValue()!=((Integer)stack.pop()).intValue())i=branchoffset+temppos-1;
			break;
		case (byte) 0xA1:
			;


		int tempposs=i;
		branchoffset = read8bitsToSignedShort(instcode, i);
        i+= 2;
		if(((Integer)stack.pop()).intValue()>((Integer)stack.pop()).intValue())i=branchoffset+tempposs-1;
		break;

		case (byte) 0xa2:
			;
			temppos=i;
			branchoffset = read8bitsToSignedShort(instcode, i);
            i+= 2;
			if(((Integer)stack.pop()).intValue()<=((Integer)stack.pop()).intValue())i=branchoffset+temppos-1;
			break;
		case (byte) 0xa3:
			;
			temppos=i;
			branchoffset = read8bitsToSignedShort(instcode, i);
            i+= 2;
			if(((Integer)stack.pop()).intValue()<((Integer)stack.pop()).intValue())i=branchoffset+temppos-1;
			break;

		case (byte) 0xa4:
			;
			temppos=i;
			branchoffset = read8bitsToSignedShort(instcode, i);
            i+= 2;
			if(((Integer)stack.pop()).intValue()>=((Integer)stack.pop()).intValue())i=branchoffset+temppos-1;
			break;
		case (byte) 0xA5:
			;
			temppos=i;


            int i_jumpoffset =   read8bitsToSignedShort(instcode, i);
            i+= 2;
			if(stack.pop()==stack.pop())i= i_jumpoffset+temppos-1;
			break;
		case (byte) 0xA6:
			;
			temppos=i;
			 i_jumpoffset =   read8bitsToSignedShort(instcode, i);
	            i+= 2;
			if(stack.pop()!=stack.pop())i= i_jumpoffset+temppos-1;
			break;
		case (byte) 0xA7:
			;
		int currentadd=i;
		///mp=instcode[++i]+instcode[++i]&0xff; jsr
		mp=read8bitsToSignedShort(instcode, i);
        i+= 2;
		i=currentadd+mp-1;
			break;
		case (byte) 0xA8:
			;
			temppos=i;
			branchoffset=read8bitsToSignedShort(instcode, i);
			i+=2;
			stack.push(new Integer(temppos+3));
			i=branchoffset+temppos-1;
			break;
			/*
		case (byte) 0x99:
			; iinc
		int temppos=i;
		int branchoffset=((instcode[++i] << 8)|instcode[++i]   );
			if(((Integer)stack.pop()).intValue()==0)i=branchoffset+temppos-1;
			break;
		case (byte) 0x9a:
			; goto
			temppos=i;

;
int ib1=instcode[++i];
int ib2=instcode[++i];
			branchoffset=(ib1 << 8)|ib2  ;
 ldc

			;
			;
			if(((Integer)stack.pop()).intValue()!=0)i=(branchoffset+temppos-1);
			break;
		case (byte) 0x9b:
			;
			temppos=i;
			branchoffset=(instcode[++i] << 8)|instcode[++i];
			if(((Integer)stack.pop()).intValue()<0)i=branchoffset+temppos-1;
			break;
		case (byte) 0x9c:
			;
			temppos=i;
			branchoffset=((instcode[++i] << 8)|instcode[++i]  );
			if(((Integer)stack.pop()).intValue()>=0)i=branchoffset+temppos-1;
			break;
		case (byte) 0x9d:
			;
			temppos=i;
			branchoffset=((instcode[++i] << 8)|instcode[++i]   );
			if(((Integer)stack.pop()).intValue()>0)i=branchoffset+temppos-1;
			break;
		case (byte) 0x9e:
			;
		temppos=i;
		branchoffset=((instcode[++i] << 8)|instcode[++i]  );
		if(((Integer)stack.pop()).intValue()<=0)i=branchoffset+temppos-1;
		break;
		case (byte) 0x9f:
			;
			temppos=i;
			branchoffset=((instcode[++i] << 8)|instcode[++i]   );
			if(((Integer)stack.pop()).intValue()==((Integer)stack.pop()).intValue())i=branchoffset+temppos-1;
			break;
		case (byte) 0xa0:
			;
			temppos=i;
			branchoffset=((instcode[++i] << 8)|instcode[++i]   );
			if(((Integer)stack.pop()).intValue()!=((Integer)stack.pop()).intValue())i=branchoffset+temppos-1;
			break;
		case (byte) 0xA1:
			;


		int tempposs=i;
	int	branchoffsets=((instcode[++i] << 8)|instcode[++i]   );
		if(((Integer)stack.pop()).intValue()>((Integer)stack.pop()).intValue())i=branchoffsets+tempposs-1;
		break;

		case (byte) 0xa2:
			;
			temppos=i;
			branchoffset=((instcode[++i] << 8)|instcode[++i]   );
			if(((Integer)stack.pop()).intValue()<=((Integer)stack.pop()).intValue())i=branchoffset+temppos-1;
			break;
		case (byte) 0xa3:
			;
			temppos=i;
			branchoffset=((instcode[++i] << 8)|instcode[++i]   );
			if(((Integer)stack.pop()).intValue()<((Integer)stack.pop()).intValue())i=branchoffset+temppos-1;
			break;

		case (byte) 0xa4:
			;
			temppos=i;
			branchoffset=((instcode[++i] << 8)|instcode[++i]   );
			if(((Integer)stack.pop()).intValue()>=((Integer)stack.pop()).intValue())i=branchoffset+temppos-1;
			break;
		case (byte) 0xA5:
			;
			temppos=i;
			branchoffset=((instcode[++i] << 8)|instcode[++i]   );
			if(stack.pop()==stack.pop())i=branchoffset+temppos-1;
			break;
		case (byte) 0xA6:
			;
			temppos=i;
			branchoffset=((instcode[++i] << 8)|instcode[++i]  );
			if(stack.pop()!=stack.pop())i=branchoffset+temppos-1;
			break;
		case (byte) 0xA7:
			;
		int currentadd=i;
		///mp=instcode[++i]+instcode[++i]&0xff; jsr
		mp=((instcode[++i] << 8)|instcode[++i]   );
		i=currentadd+mp-1;
			break;
		case (byte) 0xA8:
			;
			temppos=i;
			branchoffset=((instcode[++i] << 8) | instcode[++i]);
			stack.push(new Integer(temppos+3));
			i=branchoffset+temppos-1;
			break;
*/
		case (byte) 0xa9:
			;

		i_index = instcode[++i] & 0xFF;
		if(wide){
			;//unsigned
			mp=((i_index << 8) | instcode[++i]& 0xff);
			i=((Integer)localv[mp]).intValue()-1;
//jsr
			wide=false;
		}
		else{
		mp= i_index;//unsigned
		i=((Integer)localv[mp]).intValue()-1;

		}
		break;
		case (byte) 0xaa:
			;

		int tableoffset=i;
		int whtstart=(i)%4;
		switch (whtstart) {
		case 0:
			i+=3;
			break;
		case 1:
			i+=2;
			break;
		case 2:
			i+=1;
			break;
		case 3:
			//i+=1;
			break;
		default:
			break;
		}

		int defaultoffset= read16bitsToSignedInteger(instcode, i);
		;
        i+= 4;
		int low=read16bitsToSignedInteger(instcode, i);
        i+= 4;
		int high=read16bitsToSignedInteger(instcode, i);
        i+= 4;
		int tablesize=high-low+1;

		int jampaddress=0;
		int[] address_table=new int[tablesize];
		for (int j =0; j <tablesize; j++) {
			//address_table[j]=((instcode[++i] << 24) | (instcode[++i] << 16) | (instcode[++i] << 8) | instcode[++i]& 0xff);
			int i_b0 = instcode[++i] & 0xFF;
		    int i_b1 = instcode[++i] & 0xFF;
		     int i_b2 =instcode[++i] & 0xFF;
		     int i_b3 =instcode[++i] & 0xFF;

		     address_table[j]=(i_b0 << 24) | (i_b1 << 16) | (i_b2 << 8) | i_b3;
			;
		}

		int val=((Integer)stack.pop()).intValue();
		;
		 int i_offset = defaultoffset;
/*
		        if (val >= low && val <= high)
         {
             i_offset = _readIntegerFromBytecode(instcode, i + ((val - low) << 2));

         }
         i=tableoffset+i_offset-1;
       */
		if(val<low||val>high){
			jampaddress=defaultoffset;
			;
		}
		else{

			jampaddress=address_table[val-low];
			;
			;
		}
		i=tableoffset+jampaddress-1;

		;
			break;
		case (byte) 0xAB:
			;
		int lookupoffset=i;
		int lookupstart=(i)%4;
		switch (lookupstart) {
		case 0:
			i+=3;
			break;
		case 1:
			i+=2;
			break;
		case 2:
			i+=1;
			break;
		case 3:
			//i+=1;
			break;
		default:
			break;
		}
		/*
		int defaultlook=((instcode[++i] << 24) | (instcode[++i] << 16) | (instcode[++i] << 8) | instcode[++i]& 0xff);
		int pair=((instcode[++i] << 24) | (instcode[++i] << 16) | (instcode[++i] << 8) | instcode[++i]& 0xff);
		int[] lookuptable_key=new int[pair];
		int[] lookuptable_add=new int[pair];
		;
		for (int j = 0; j < pair; j++) {
			;
			lookuptable_key[j]=((instcode[++i] << 24) | (instcode[++i] << 16) | (instcode[++i] << 8) | instcode[++i]);
			lookuptable_add[j]=((instcode[++i] << 24) | (instcode[++i] << 16) | (instcode[++i] << 8) | instcode[++i]);
		}
		;
		int item=((Integer)stack.pop()).intValue();
		int jampaddress_lookup=defaultlook;
		for (int j = 0; j < lookuptable_add.length; j++) {
			if(item==lookuptable_key[j]){
				jampaddress_lookup=lookuptable_add[j];
				break;
			}
		}
		i=lookupoffset+jampaddress_lookup-1;

		*/
		defaultoffset= read16bitsToSignedInteger(instcode, i);
        i += 4;
        int i_pairsnumber = read16bitsToSignedInteger(instcode, i);
        i += 4;

       val=((Integer)stack.pop()).intValue();

       i_offset = defaultoffset;

        for (int li = 0; li < i_pairsnumber; li++)
        {
           i_index = read16bitsToSignedInteger(instcode, i);

            if (val == i_index)
            {
                i += 4;
                i_offset = read16bitsToSignedInteger(instcode, i);
                break;
            }
            else
            {
                i += 8;
            }
        }

        i = lookupoffset+ i_offset-1;
		;
			break;
		case (byte) 0xAC:
			;


		Integer ire=new Integer(0);
		ire=(Integer) stack.pop();
		;
			return ire;
		case (byte) 0xad:
			;
			return stack.pop();
		case (byte) 0xae:
			;
			return stack.pop();
		case (byte) 0xaf:
			;
			return stack.pop();
		case (byte) 0xb0:
			;
		return stack.pop();
		case (byte) 0xB1:
			;
			return null;

		case (byte) 0xb2:

			;
		i++;
			//mp=instcode[i]+instcode[++i]&0xff; 0x3b
		mp=((instcode[i]<<8)&0xFF00) + ((instcode[++i])&0xFF);
			;
			//i+=2;
			by=classLoader.bytecopy(buf[mp][1]);//class_index:CONSTANT_Fieldref_info
			by2=classLoader.bytecopy(buf[mp][2]);//name_and_type_index:CONSTANT_Fieldref_info
			mp2=((by[0]<<8)&0xFF00) + ((by[1])&0xFF);
			mp4=((by2[0]<<8)&0xFF00) + ((by2[1])&0xFF);
			;
			;
			by3=classLoader.bytecopy(buf[mp2][1]);
			by4=classLoader.bytecopy(buf[((by3[0]<<8)&0xFF00) + ((by3[1])&0xFF)][1]);
			;
			mp3=((by4[0]<<8)&0xFF00) + ((by4[1])&0xFF);
			;
			String classname=new String(by4);
		//	; lshr lushr iload_3

			;
		//	mp2=by2[0]+by2[1]&0xFF;
			by=classLoader.bytecopy(buf[mp4][1]);//name&type info  0x00

			mp=((by[0]<<8)&0xFF00) + ((by[1])&0xFF);//name_index

			by=classLoader.bytecopy(buf[mp][1]);


			String fieldname=new String(by);

			;
			by=classLoader.bytecopy(buf[mp4][2]);
			mp2=((by[0]<<8)&0xFF00) + ((by[1])&0xFF);
			;
			String in_fieldclass=new String(buf[mp2][1]);
			;
			Object sta;
			if(isCLDCClass(classname)){
			sta=getStaticFieldbyName(classname+"/"+fieldname);


				if(sta!=null&&sta.getClass().getName().equals("java.lang.Long")||sta!=null&&sta.getClass().getName().equals("java.lang.Double")){
					stack.push(null);stack.push(sta);
				}else
				stack.push(sta);
				}
			else{
				;
				sta=staticfield.getStaticField(classname, fieldname);
				if(sta!=null&&sta.getClass().getName().equals("java.lang.Long")||sta!=null&&sta.getClass().getName().equals("java.lang.Double")){
					stack.push(null);stack.push(sta);
				}else
					;
				stack.push(sta);
				}
//putstatic

			break;
		case (byte) 0xB3:
			;
			//;



		mp=((instcode[++i]<<8)&0xFF00) + ((instcode[++i])&0xFF);
		//;
		//i+=2;
		by=classLoader.bytecopy(buf[mp][1]);//class_index:CONSTANT_Fieldref_info
		by2=classLoader.bytecopy(buf[mp][2]);//name_and_type_index:CONSTANT_Fieldref_info
		mp2=((by[0]<<8)&0xFF00) + ((by[1])&0xFF);
		mp4=((by2[0]<<8)&0xFF00) + ((by2[1])&0xFF);
	//	;
		//;
		by3=classLoader.bytecopy(buf[mp2][1]);
		by4=classLoader.bytecopy(buf[((by3[0]<<8)&0xFF00) + ((by3[1])&0xFF)][1]);
		;
		mp3=((by4[0]<<8)&0xFF00) + ((by4[1])&0xFF);
		;
		String fieldclassname=new String(by4);
	//	; goto_w

		;
	//	mp2=by2[0]+by2[1]&0xFF;
		by=classLoader.bytecopy(buf[mp4][1]);//name&type info

		mp=((by[0]<<8)&0xFF00) + ((by[1])&0xFF);//name_index

		by=classLoader.bytecopy(buf[mp][1]);


		String ffieldname=new String(by);

		;
		by=classLoader.bytecopy(buf[mp4][2]);
		mp2=((by[0]<<8)&0xFF00) + ((by[1])&0xFF);
		;
	String 	fhikiandret=new String(buf[mp2][1]);
		;
		//stack.push(getStaticFieldbyName(classname+"/"+fieldname));
	Object[]	fargobj=new Object[2];
	char[]	fchararray=fhikiandret.toCharArray();
	Object[]	fiobj=new Object[3];
		fiobj[2]=stack.pop();
		if((fiobj[2]!=null)&&(fiobj[2].getClass().getName().equals("java.lang.Long")||(fiobj[2]!=null)&&fiobj[2].getClass().getName().equals("java.lang.Double")))
		{
		staticfield.setStaticField(fieldclassname, ffieldname, fiobj[2]);
		stack.pop();
		}
		else staticfield.setStaticField(fieldclassname, ffieldname, fiobj[2]);
;
			break;
		case (byte) 0xB4:
			;

		mp=((instcode[++i]<<8)&0xFF00) + ((instcode[++i])&0xFF);
		//;
		//i+=2;
		by=classLoader.bytecopy(buf[mp][1]);//class_index:CONSTANT_Fieldref_info
		by2=classLoader.bytecopy(buf[mp][2]);//name_and_type_index:CONSTANT_Fieldref_info
		mp2=((by[0]<<8)&0xFF00) + ((by[1])&0xFF);
		mp4=((by2[0]<<8)&0xFF00) + ((by2[1])&0xFF);
	//	;
		//;
		by3=classLoader.bytecopy(buf[mp2][1]);
		by4=classLoader.bytecopy(buf[((by3[0]<<8)&0xFF00) + ((by3[1])&0xFF)][1]);
		;
		mp3=((by4[0]<<8)&0xFF00) + ((by4[1])&0xFF);
		;
		String gfieldclassname=new String(by4);
	//	;

		;
	//	mp2=by2[0]+by2[1]&0xFF;
		by=classLoader.bytecopy(buf[mp4][1]);//name&type info

		mp=((by[0]<<8)&0xFF00) + ((by[1])&0xFF);//name_index checkcast

		by=classLoader.bytecopy(buf[mp][1]);


		String gffieldname=new String(by);

		;
		by=classLoader.bytecopy(buf[mp4][2]);
		mp2=((by[0]<<8)&0xFF00) + ((by[1])&0xFF);
		;
		String gfhikiandret=new String(buf[mp2][1]);
		;
		/*_Class.fieldinst=(Vector)stack.peek();
		;
			int iniornotg=isFieldIntialized(gfieldclassname+":"+gffieldname);
		//if(iniornotg>0){
			; putfield checkcast
		//	stack.pop();
			Object[] bindobj=null;
			bindobj=	(Object[])((Vector)((Vector)stack.pop()).elementAt(0)).elementAt(iniornotg);
			//stack.push(((Object[])((Vector)stack.pop()).elementAt(iniornotg))[2]); arryalenght
			stack.push(bindobj[2]);*/
		//}
		if(isCLDCClass(gfieldclassname)){
			if(stack.peek()==null){
				System.exit(2);
			};
			Object getobj=getCLDCfield(gfieldclassname,gffieldname,stack.pop());
;
			if((getobj!=null)&&(getobj.getClass().getName().equals("java.lang.Double")||(getobj!=null)&&getobj.getClass().getName().equals("java.lang.Long")))
				stack.push(null);
			stack.push(getobj);
		}
		else{
			;
		Object getobj=((instance)stack.pop()).getField(gfieldclassname+":"+gffieldname+":"+gfhikiandret,gfhikiandret);
		;
		if((getobj!=null)&&(getobj.getClass().getName().equals("java.lang.Double")||(getobj!=null)&&getobj.getClass().getName().equals("java.lang.Long")))
			stack.push(null);
		stack.push(getobj);
		}
			break;
		case (byte) 0xB5:
			;



		mp=((instcode[++i]<<8)&0xFF00) + ((instcode[++i])&0xFF);
		//;
		//i+=2;
		by=classLoader.bytecopy(buf[mp][1]);//class_index:CONSTANT_Fieldref_info
		by2=classLoader.bytecopy(buf[mp][2]);//name_and_type_index:CONSTANT_Fieldref_info
		mp2=((by[0]<<8)&0xFF00) + ((by[1])&0xFF);
		mp4=((by2[0]<<8)&0xFF00) + ((by2[1])&0xFF);
	//	;
		//;
		by3=classLoader.bytecopy(buf[mp2][1]);
		by4=classLoader.bytecopy(buf[((by3[0]<<8)&0xFF00) + ((by3[1])&0xFF)][1]);
		;
		mp3=((by4[0]<<8)&0xFF00) + ((by4[1])&0xFF);
		;
		fieldclassname=new String(by4);
	//	;

		;
	//	mp2=by2[0]+by2[1]&0xFF;
		by=classLoader.bytecopy(buf[mp4][1]);//name&type info

		mp=((by[0]<<8)&0xFF00) + ((by[1])&0xFF);//name_index

		by=classLoader.bytecopy(buf[mp][1]);


		ffieldname=new String(by);

		;
		by=classLoader.bytecopy(buf[mp4][2]);
		mp2=((by[0]<<8)&0xFF00) + ((by[1])&0xFF);
		;
		fhikiandret=new String(buf[mp2][1]);
		;
		//stack.push(getStaticFieldbyName(classname+"/"+fieldname));
		fargobj=new Object[2];
		fchararray=fhikiandret.toCharArray();
		/*int iniornot=isFieldIntialized(fieldclassname+":"+ffieldname);
		if(iniornot<0){
			//((Object[])_Class.fieldinst.elementAt(iniornot))[2]=stack.pop();
			Object[] fiobj=new Object[3];
			fiobj[0]=fieldclassname+":"+ffieldname;
			fiobj[1]=fhikiandret;
			fiobj[2]=stack.pop();
			//_Class.fieldinst.addElement(fiobj);
			fieldinstance.addElement(fiobj);
			;
			((Vector)stack.pop()).addElement(fieldinstance);
			;
		}
		else{
			((Object[])fieldinstance.elementAt(iniornot))[2]=stack.pop(); getfield
			((Vector)stack.pop()).addElement(fieldinstance); if_icmplt


		}*/fiobj=new Object[3];
		fiobj[2]=stack.pop();

		if((fiobj[2]!=null)&&(fiobj[2].getClass().getName().equals("java.lang.Double")||(fiobj[2]!=null)&&fiobj[2].getClass().getName().equals("java.lang.Long")))
			stack.pop();
		if(stack.peek()==null){
			;
			System.exit(2);
		}
		((instance)stack.pop()).setField(fieldclassname+":"+ffieldname+":"+fhikiandret, fhikiandret,fiobj[2]);
		/*for (int j = 0; j < fchararray.length; j++) {
		char tmpchar=fhikiandret.charAt(j);
		if(tmpchar=='L'){


		}
		else if(tmpchar==')'){
			;
			argobj1=new Object[j];
			break;
		}
	}
	;

	; putfield
	;
	for (int j = 1; j < fargobj.length; j++) {
		switch (fchararray[j]) {
		case 'I':
			argobj1[j]=stack.pop();
			;
			break;
		case 'L':
			argobj1[j]=stack.pop();
			;
			break;
		case 'B':
			argobj1[j]=stack.pop();
			;
			break;
		case 'C':
			argobj1[j]=stack.pop();
			;
			break;
		case 'D':
			argobj1[j]=stack.pop();
			;
			break;
		case 'F':
			argobj1[j]=stack.pop();
			;
			break;
		case 'J':
			argobj1[j]=stack.pop();
			;
			break;
		case 'S':
			argobj1[j]=stack.pop();
			;
			break;

		case 'Z':
			argobj1[j]=stack.pop();
			;
			break;

		default:
			break;
		}
	}*/
			break;

			/*Pmp=instcode[++i]&0xff;
			by=classLoader.bytecopy(buf[mp][1]);
	String s=	new String(buf[(by[0]+by[1]&0xff)][1]);
	;
	stack.push(s);*/

		case (byte) 0xb6:
			;
		i++;
	//	mp=instcode[i]+instcode[++i]&0xff;
		mp=((instcode[i]<<8)&0xFF00) + ((instcode[++i])&0xFF);

		by=classLoader.bytecopy(buf[mp][1]);//class_index:CONSTANT_Fieldref_info
		by2=classLoader.bytecopy(buf[mp][2]);//name_and_type_index:CONSTANT_Fieldref_info
		mp2=((by[0]<<8)&0xFF00) + ((by[1])&0xFF);
		mp4=((by2[0]<<8)&0xFF00) + ((by2[1])&0xFF);

		by3=classLoader.bytecopy(buf[mp2][1]);
		by4=classLoader.bytecopy(buf[((by3[0]<<8)&0xFF00) + ((by3[1])&0xFF)][1]);
		;
		mp3=((by4[0]<<8)&0xFF00) + ((by4[1])&0xFF);
		;
		String methodclassname=new String(by4);


		;

		by=classLoader.bytecopy(buf[mp4][1]);//name&type info

		mp=((by[0]<<8)&0xFF00) + ((by[1])&0xFF);//name_index

		by=classLoader.bytecopy(buf[mp][1]);


		String methodname=new String(by);

		;
		by=classLoader.bytecopy(buf[mp4][2]);
		mp2=((by[0]<<8)&0xFF00) + ((by[1])&0xFF);
		;
		String hikiandret=new String(buf[mp2][1]);
		;

		Object[] objs=new Object[1];

		//objs[0]=stack.peek();
		Object[] argobj=new Object[2];
		char[] chararray=hikiandret.toCharArray();
		int count=0;
		boolean isarray=false;
		boolean cn=true;
	for (int j = 0; j < chararray.length; j++) {
		char tmpchar=hikiandret.charAt(j);
		if(cn)
		count++;
		if(tmpchar=='L'){
cn=false;
//count--; lstore
		}
		else if(tmpchar==';'){
cn=true;

		}
		else if(tmpchar=='['){
			isarray=true;
			count--;
					}
		else if(tmpchar=='D'||tmpchar=='J'){
		if(isarray) isarray=false;
		else if(cn)
			count++;
		}
		else if(tmpchar==')'){
			count--;
			argobj=new Object[count+1];
			break;
		}
		else if(tmpchar=='('){
			count--;
		}
	}
	;
	Vector argsv=new Vector();
	Object[] rstack=new Object[argobj.length];
;
	for (int j = argobj.length-1;j > -1; j--) {
		if(stack.peek()!=null&&(stack.peek().getClass().getName().equals("java.lang.Long")||stack.peek()!=null&&stack.peek().getClass().getName().equals("java.lang.Double"))){

			Object temp=stack.pop();
argobj[j]=stack.pop();
			argobj[--j]=temp;
		}else
			argobj[j]=stack.pop();
	}
	;
for (int j= 0; j < rstack.length;j++) {
	;
}
	;
	;
	boolean charb=true;;
	int argscount1=argobj.length-1;

		for (int j = 1; j < argobj.length; j++) {
	/*	switch (chararray[j]) {
//	if(charb){
		case ';':
			charb=true;
		break;

		case 'I':
			if(charb){
			argobj[argscount1--]=stack.pop();
			;}
			break;
		case 'L':
			if(charb){
			argobj[argscount1--]=stack.pop();
			;
			charb=false;}
			break;
		case 'B':
			if(charb){
			argobj[argscount1--]=stack.pop();
			;}
			break;
		case 'C':
			if(charb){
			argobj[argscount1--]=stack.pop();
			;}
			break;
		case 'D':
			if(charb){
			argobj[argscount1--]=stack.pop();stack.pop();
			stack.pop();
			;}
			break;
		case 'F':
			if(charb){
			argobj[argscount1--]=stack.pop();
			;}
			break;
		case 'J':
			if(charb){
			argobj[argscount1--]=stack.pop();stack.pop();
			stack.pop();
			;}
			break;
		case 'S':
			if(charb){
			argobj[argscount1--]=stack.pop();
			;}
			break;

		case 'Z':
			if(charb){
			argobj[argscount1--]=stack.pop();
			;}
			break;

		default:
			break;

		}

			argobj[argscount1--]=stack.pop();
			if((argobj[argscount1+1]!=null)&&(argobj[argscount1+1].getClass().getName().equals("java.lang.Double")||argobj[argscount1+1].getClass().getName().equals("java.lang.Long")))
				stack.pop();
				*/
	}
//argobj=rstack; ifne
	//argobj[0]=stack.pop();
	;
	;
	;

		;
		if(argobj[0].getClass().getName().equals("KWN.vmonkvm.instance")){
		;
		methodclassname=((instance)argobj[0]).classname;
		}
		char[] ch=hikiandret.toCharArray();
		if(ch[ch.length-1]=='V')
		execMethod(methodclassname, methodname, hikiandret, argobj,argobj[0],2,false,false,false);

		else {
			if((ch[ch.length-1]=='D')||((ch[ch.length-1]=='J')))stack.push(null);
			;
			Object j=execMethod(methodclassname, methodname, hikiandret, argobj,argobj[0],2,false,false,false);
			;
			stack.push(j);
		}


		;
		/*if(doMethodbyName(methodclassname+":"+methodname+":"+hikiandret, argobj,argobj[0],0)==null){

		}*/
			break;



		case (byte) 0xB7:
			;




		mp=((instcode[++i]<<8)&0xFF00) + ((instcode[++i])&0xFF);
		//;
		//i+=2
		;
		by=classLoader.bytecopy(buf[mp][1]);//class_index:CONSTANT_Fieldref_info
		;
		by2=classLoader.bytecopy(buf[mp][2]);//name_and_type_index:CONSTANT_Fieldref_info
		mp2=((by[0]<<8)&0xFF00) + ((by[1])&0xFF);
		mp4=((by2[0]<<8)&0xFF00) + ((by2[1])&0xFF);
	//	;
		//;
		by3=classLoader.bytecopy(buf[mp2][1]);
		by4=classLoader.bytecopy(buf[((by3[0]<<8)&0xFF00) + ((by3[1])&0xFF)][1]);
		;
		mp3=((by4[0]<<8)&0xFF00) + ((by4[1])&0xFF);
		;
		String methodclassname1=new String(by4);
	//	;

		;
	//	mp2=by2[0]+by2[1]&0xFF;
		by=classLoader.bytecopy(buf[mp4][1]);//name&type info

		mp=((by[0]<<8)&0xFF00) + ((by[1])&0xFF);//name_index

		by=classLoader.bytecopy(buf[mp][1]);


		String methodname1=new String(by);

		;
		by=classLoader.bytecopy(buf[mp4][2]);
		mp2=((by[0]<<8)&0xFF00) + ((by[1])&0xFF);
		;
		String hikiandret1=new String(buf[mp2][1]);
		;
		//stack.push(getStaticFieldbyName(classname+"/"+fieldname));
		Object[] objs1=new Object[1];

		//objs1[0]=stack.peek(); ldc_w
		Object[] argobj1=new Object[2];
		char[] chararray1=hikiandret1.toCharArray();
		count=0;
		cn=true;
		isarray=false;
	for (int j = 0; j < chararray1.length; j++) {
		char tmpchar=hikiandret1.charAt(j);
		if(cn)
		count++;
		if(tmpchar=='L'){

			cn=false;

					}
					else if(tmpchar==';'){
			cn=true;
			//count++; iushr

					}
					else if(tmpchar=='['){
						isarray=true;
						count--;
								}
					else if(tmpchar=='D'||tmpchar=='J'){
					if(isarray) isarray=false;
					else if(cn)
						count++;
					}
					else if(tmpchar==')'){
						count--;

						argobj1=new Object[count+1];
						break;
					}
					else if(tmpchar=='('){
						count--;
					}
				}
	;
;
;
;
	;
	;
	boolean charb1=true;
	int argscount=argobj1.length-1;

	for (int j = 1; j < argobj1.length; j++) {
		;
	/*	switch (chararray1[j]) {
		case ':':
			charb1=true;
			break;
		case 'I':
			if(charb1){
			argobj1[argscount--]=stack.pop();
			;}
			break;
		case 'L':
			if(charb1){
			argobj1[argscount--]=stack.pop();

			;
			charb1=false;}
			break;
		case 'B':
			if(charb1){
			argobj1[argscount--]=stack.pop();
			;}
			break;
		case 'C':
			if(charb1){
			argobj1[argscount--]=stack.pop();
			;}
			break;
		case 'D':
			if(charb1){
			argobj1[argscount--]=stack.pop();
			stack.pop();
			;}
			break;
		case 'F':
			if(charb1){
			argobj1[argscount--]=stack.pop();
			;}
			break;
		case 'J':
			if(charb1){
			argobj1[argscount--]=stack.pop();
			stack.pop();
			;}
			break;
		case 'S':
			if(charb1){
			argobj1[argscount--]=stack.pop();
			;}
			break;
ifle
		case 'Z':
			if(charb1){
			argobj1[argscount--]=stack.pop();
			;}
			break;

		default:
			break;
		}
*/
		argobj1[argscount--]=stack.pop();
		;
		if(argobj1[argscount+1]!=null&&argobj1[argscount+1].getClass().getName().equals("java.lang.Double")||argobj1[argscount+1]!=null&&argobj1[argscount+1].getClass().getName().equals("java.lang.Long"))
			stack.pop();
	}
	if(argobj1.length<=0)argobj1=new Object[1];
	argobj1[0]=stack.pop();
	;
	;
	;
	for (int i = 0; i < argobj1.length; i++) {
		;

	}

	if(argobj1[0].getClass().getName().equals("KWN.vmonkvm.instance")){
		;
	//	methodclassname1=((instance)argobj1[0]).classname;
		}
	ch=hikiandret1.toCharArray();
	//&&(!methodname1.equals("<init>"));
	if(ch[ch.length-1]=='V')
	execMethod(methodclassname1,methodname1,hikiandret1, argobj1,argobj1[0],2,false,true,false);

	else {
		if((ch[ch.length-1]=='D')||((ch[ch.length-1]=='J')))stack.push(null);
		stack.push(execMethod(methodclassname1,methodname1,hikiandret1, argobj1,argobj1[0],2,false,true,false));
	}



		;
			break;
		case (byte) 0xb8:
			;

		mp=((instcode[++i]<<8)&0xFF00) + ((instcode[++i])&0xFF);

		by=classLoader.bytecopy(buf[mp][1]);//class_index:CONSTANT_Fieldref_info
		by2=classLoader.bytecopy(buf[mp][2]);//name_and_type_index:CONSTANT_Fieldref_info
		mp2=((by[0]<<8)&0xFF00) + ((by[1])&0xFF);
		mp4=((by2[0]<<8)&0xFF00) + ((by2[1])&0xFF);

		by3=classLoader.bytecopy(buf[mp2][1]);
		by4=classLoader.bytecopy(buf[((by3[0]<<8)&0xFF00) + ((by3[1])&0xFF)][1]);
		;
		mp3=((by4[0]<<8)&0xFF00) + ((by4[1])&0xFF);
		;
		methodclassname=new String(by4);


		;

		by=classLoader.bytecopy(buf[mp4][1]);//name&type info

		mp=((by[0]<<8)&0xFF00) + ((by[1])&0xFF);//name_index

		by=classLoader.bytecopy(buf[mp][1]);


		 methodname=new String(by);

		;
		by=classLoader.bytecopy(buf[mp4][2]);
		mp2=((by[0]<<8)&0xFF00) + ((by[1])&0xFF);
		;
		hikiandret=new String(buf[mp2][1]);
		;

		objs=new Object[1];

		//objs[0]=stack.peek();
		argobj=new Object[2];
		chararray=hikiandret.toCharArray();
		count=0;
		isarray=false;
		cn=true;
	for (int j = 0; j < chararray.length; j++) {
		char tmpchar=hikiandret.charAt(j);
		if(cn)
		count++;
		if(tmpchar=='L'){
cn=false;
//count++;
		}
		else if(tmpchar==';'){
cn=true;

		}
		else if(tmpchar=='['){
			isarray=true;
			count--;
					}
		else if(tmpchar=='D'||tmpchar=='J'){
		if(isarray) isarray=false;
		else if(cn)
			count++;
		}
		else if(tmpchar==')'){
			count--;
			argobj=new Object[count];
			break;
		}
		else if(tmpchar=='('){
			count--;
		}
	}
	;

	rstack=new Object[argobj.length];
;
	for (int j = argobj.length-1;j > -1; j--) {
		if(stack.peek()!=null&&(stack.peek().getClass().getName().equals("java.lang.Long")||stack.peek()!=null&&stack.peek().getClass().getName().equals("java.lang.Double"))){
			Object temp=stack.pop();
			argobj[j]=stack.pop();
			argobj[--j]=temp;
		}else
			argobj[j]=stack.pop();
	}
	;
for (int j= 0; j < rstack.length;j++) {
	;
}
	;
	;
	charb=true;;
	argscount1=argobj.length-1;

		for (int j = 1; j < argobj.length; j++) {
	/*	switch (chararray[j]) {
//	if(charb){
		case ';':
			charb=true;
		break;

		case 'I':
			if(charb){
			argobj[argscount1--]=stack.pop();
			;}
			break;
		case 'L':
			if(charb){
			argobj[argscount1--]=stack.pop();
			;
			charb=false;}
			break;
		case 'B':
			if(charb){
			argobj[argscount1--]=stack.pop();
			;}
			break;
		case 'C':
			if(charb){
			argobj[argscount1--]=stack.pop();
			;}
			break;
		case 'D':
			if(charb){
			argobj[argscount1--]=stack.pop();stack.pop();
			stack.pop();
			;}
			break;
		case 'F':
			if(charb){
			argobj[argscount1--]=stack.pop();
			;}
			break;
		case 'J':
			if(charb){
			argobj[argscount1--]=stack.pop();stack.pop();
			stack.pop();
			;}
			break;
		case 'S':
			if(charb){
			argobj[argscount1--]=stack.pop();
			;}
			break;

		case 'Z':
			if(charb){
			argobj[argscount1--]=stack.pop();
			;}
			break;

		default:
			break;

		}

			argobj[argscount1--]=stack.pop();
			if((argobj[argscount1+1]!=null)&&(argobj[argscount1+1].getClass().getName().equals("java.lang.Double")||argobj[argscount1+1].getClass().getName().equals("java.lang.Long")))
				stack.pop();
				*/
	};
	//argobj[0]=stack.pop();
	;

	;

		;
		//;
		//if(argobj[0].getClass().getName().equals("KWN.vmonkvm.instance"))
			//methodclassname=((instance)argobj[0]).classname;
		ch=hikiandret.toCharArray();
		if(ch[ch.length-1]=='V')
		execMethod(methodclassname, methodname, hikiandret, argobj,null,2,false,false,true);
		else{if((ch[ch.length-1]=='D')||((ch[ch.length-1]=='J')))stack.push(null);
			stack.push(execMethod(methodclassname, methodname, hikiandret, argobj,null,2,false,false,true));
	}




		;
		/*if(doMethodbyName(methodclassname+":"+methodname+":"+hikiandret, argobj,argobj[0],0)==null){

		}*/
			break;
		case (byte) 0xb9:
			;

		mp=((instcode[++i]<<8)&0xFF00) + ((instcode[++i])&0xFF);
		++i;++i;

		by=classLoader.bytecopy(buf[mp][1]);//class_index:CONSTANT_Fieldref_info
		by2=classLoader.bytecopy(buf[mp][2]);//name_and_type_index:CONSTANT_Fieldref_info ret_w
		mp2=((by[0]<<8)&0xFF00) + ((by[1])&0xFF);
		mp4=((by2[0]<<8)&0xFF00) + ((by2[1])&0xFF);

		by3=classLoader.bytecopy(buf[mp2][1]);
		by4=classLoader.bytecopy(buf[((by3[0]<<8)&0xFF00) + ((by3[1])&0xFF)][1]);
		;
		mp3=((by4[0]<<8)&0xFF00) + ((by4[1])&0xFF);
		;
		methodclassname=new String(by4);


		;

		by=classLoader.bytecopy(buf[mp4][1]);//name&type info

		mp=((by[0]<<8)&0xFF00) + ((by[1])&0xFF);//name_index

		by=classLoader.bytecopy(buf[mp][1]);


		methodname=new String(by);

		;
		by=classLoader.bytecopy(buf[mp4][2]);
		mp2=((by[0]<<8)&0xFF00) + ((by[1])&0xFF);
		;
		hikiandret=new String(buf[mp2][1]);
		;

		objs=new Object[1];

		//objs[0]=stack.peek();
		argobj=new Object[2];
		chararray=hikiandret.toCharArray();
		 isarray=false;
		 cn=true;
		 count=0;
	for (int j = 0; j < chararray.length; j++) {
		char tmpchar=hikiandret.charAt(j);
		if(cn)
		count++;
		if(tmpchar=='L'){
cn=false;
//count--;
		}
		else if(tmpchar==';'){
cn=true;

		}
		else if(tmpchar=='['){
			isarray=true;
			count--;
					}
		else if(tmpchar=='D'||tmpchar=='J'){
		if(isarray) isarray=false;
		else if(cn)
			count++;
		}
		else if(tmpchar==')'){
			count--;
			argobj=new Object[count+1];
			break;
		}
		else if(tmpchar=='('){
			count--;
		}
	}
	;
	argsv=new Vector();
	rstack=new Object[argobj.length];
;
	for (int j = argobj.length-1;j > -1; j--) {
		if(stack.peek()!=null&&(stack.peek().getClass().getName().equals("java.lang.Long")||stack.peek()!=null&&stack.peek().getClass().getName().equals("java.lang.Double"))){
			Object temp=stack.pop();
			argobj[j]=stack.pop();
			argobj[--j]=temp;
		}else
			argobj[j]=stack.pop();
	}
	;
for (int j= 0; j < rstack.length;j++) {
	;
}
	;
	;
	charb=true;;
	argscount1=argobj.length-1;

		for (int j = 1; j < argobj.length; j++) {
	/*	switch (chararray[j]) {
//	if(charb){
		case ';':
			charb=true;
		break;

		case 'I':
			if(charb){
			argobj[argscount1--]=stack.pop();
			;}
			break;
		case 'L':
			if(charb){
			argobj[argscount1--]=stack.pop();
			;
			charb=false;}
			break;
		case 'B':
			if(charb){
			argobj[argscount1--]=stack.pop();
			;}
			break;
		case 'C':
			if(charb){
			argobj[argscount1--]=stack.pop();
			;}
			break;
		case 'D':
			if(charb){
			argobj[argscount1--]=stack.pop();stack.pop();
			stack.pop();
			;}
			break;
		case 'F':
			if(charb){
			argobj[argscount1--]=stack.pop();
			;}
			break;
		case 'J':
			if(charb){
			argobj[argscount1--]=stack.pop();stack.pop();
			stack.pop();
			;}
			break;
		case 'S':
			if(charb){
			argobj[argscount1--]=stack.pop();
			;}
			break;

		case 'Z':
			if(charb){
			argobj[argscount1--]=stack.pop();
			;}
			break;

		default:
			break;

		}

			argobj[argscount1--]=stack.pop(); goto
			if((argobj[argscount1+1]!=null)&&(argobj[argscount1+1].getClass().getName().equals("java.lang.Double")||argobj[argscount1+1].getClass().getName().equals("java.lang.Long")))
				stack.pop();
				*/
	}
//argobj=rstack; ifne
	//argobj[0]=stack.pop();
	;
	;
	;

		;
		if(argobj[0].getClass().getName().equals("KWN.vmonkvm.instance"))
			methodclassname=((instance)argobj[0]).classname;
		ch=hikiandret.toCharArray();
		if(ch[ch.length-1]=='V')
		execMethod(methodclassname, methodname, hikiandret, argobj,argobj[0],2,true,false,false);
		else{
			if((ch[ch.length-1]=='D')&&((ch[ch.length-1]=='J')))stack.push(null);
			stack.push(execMethod(methodclassname, methodname, hikiandret, argobj,argobj[0],2,true,false,false));

		}
		;
		/*if(doMethodbyName(methodclassname+":"+methodname+":"+hikiandret, argobj,argobj[0],0)==null){

		}*/
			break;
		case (byte)0xba:
			;
		break;
		case (byte) 0xBB:
			;
			//mp=instcode[++i]+instcode[++i]&0xff;((by[0]<<8)&0xFF00) + ((by[1])&0xFF);
		mp=((instcode[++i]<<8)&0xFF00) + ((instcode[++i])&0xFF);
		by=classLoader.bytecopy(buf[mp][1]);
		mp=((by[0]<<8)&0xFF00) + ((by[1])&0xFF);
		String tmpS=new String(buf[mp][1]);
		;
		;
		if(!isCLDCClass(tmpS)){
			String sup=whatSuperClass(tmpS);
			sup=(sup==null)?"java/lang/Object":sup;
				stack.push(new instance(tmpS,sup));
				;

		}
		else{
			;
				stack.push(new CLDCinstance(new Object()));

		}
		break;
		case (byte) 0xBC:
			;
		int newarray=((Integer)stack.pop()).intValue();
			switch (instcode[++i]&0xff) {
			case 4:
				stack.push(new boolean[newarray]);
				break;
			case 5:
				stack.push(new char[newarray]);
				break;
			case 6:
				stack.push(new float[newarray]);
				break;
			case 7:
				stack.push(new double[newarray]);
				break;
			case 8:
				stack.push(new byte[newarray]);
				break;
			case 9:
				stack.push(new short[newarray]);
				break;
			case 10:
				stack.push(new int[newarray]);
				break;
			case 11:
				stack.push(new long[newarray]);
				break;

			default:
				break;
			}
			break;









		case (byte) 0xBd:
			;
			aaloadinteger=(Integer)stack.pop();
			execobj=new Object[aaloadinteger.intValue()];
			stack.push(execobj);
			mp=((instcode[i++]<<8)&0xFF00) + ((instcode[i++])&0xFF);
			break;

		case (byte) 0xbe:
			;
		;



			aaloadinteger=new Integer(arraylength(stack.pop()));
			stack.push(aaloadinteger);
			break;


		case (byte) 0xbf:
			;
		if(stack.peek().getClass().getName().equals("KWN.vmonkvm.instance"))
		throw new NonNativeException((instance) stack.pop());
		else throw (Throwable)((CLDCinstance)stack.pop()).cldcobj;
		case (byte) 0xc0:
			;
		mp2=mp=((instcode[++i]<<8)&0xFF00) + ((instcode[++i])&0xFF);
		by3=classLoader.bytecopy(buf[mp2][1]);
		by4=classLoader.bytecopy(buf[mp=((by3[0]<<8)&0xFF00) + ((by3[1])&0xFF)][1]);
		;
		mp3=((by4[0]<<8)&0xFF00) + ((by4[1])&0xFF);
		;
		String checkcastclassname1=new String(by4);
		Object checkcast1=stack.peek();
		;
		if(checkcast1==null){

			break;
		}

		else{
		String instof1=((checkcast1!=null)&&(checkcast1.getClass().getName().equals("KWN.vmonkvm.instance")))?((instance)checkcast1).classname:null;
	if(Instanceof(checkcast1, instof1, checkcastclassname1));


		else throw new ClassCastException();
		}
			break;
		case (byte) 0xC1:
			;
		mp2=((instcode[++i]<<8)&0xFF00) + ((instcode[++i])&0xFF);
		by3=classLoader.bytecopy(buf[mp2][1]);
		by4=classLoader.bytecopy(buf[((by3[0]<<8)&0xFF00) + ((by3[1])&0xFF)][1]);
		;
		mp3=((by4[0]<<8)&0xFF00) + ((by4[1])&0xFF);
		;
		String checkcastclassname=new String(by4);
		;
		Object checkcast=stack.pop();
		String instof=(checkcast.getClass().getName().equals("KWN.vmonkvm.instance"))?((instance)checkcast).classname:null;
		if(Instanceof(checkcast, instof, checkcastclassname))
			stack.push(new Integer(1));

		else stack.push(new Integer(0));
		break;
		case (byte) 0xc2:
			;
			//;
		//System.exit(2);
		/*
			synchronized (stack.pop()) {

				byte[] moncode=new byte[instcode.length-(++i)];
				ByteArrayInputStream bas=new ByteArrayInputStream(instcode,i,instcode.length-1);
				bas.read(moncode);
				exec(moncode);
			}
*/stack.pop();
			break;
		case (byte) 0xc3:
			;
		/*
			//;
			stack.pop().notifyAll();
			return null;
			*/
		stack.pop();
			break;
		case (byte) 0xc4:
			;
			wide=true;
			break;
		case (byte) 0xc5:
			;

		mp=((instcode[++i]<<8)&0xFF00) + ((instcode[++i])&0xFF);
		by3=classLoader.bytecopy(buf[mp][1]);
		by4=classLoader.bytecopy(buf[((by3[0]<<8)&0xFF00) + ((by3[1])&0xFF)][1]);
		gfieldclassname=new String(by4);
		;
		String concat="";
		int dimen=instcode[++i]&0xff;
		;
		char[] cs=gfieldclassname.toCharArray();
		for (int j = 0; j <cs.length; j++) {
			if(cs[j]!='['){
				concat=gfieldclassname.substring(j);
				break;
			}
		}
		;
		;
			switch (concat.charAt(0)) {

			case 'I':
				switch(dimen){

				case 1:
					stack.push(new int[((Integer)stack.pop()).intValue()]);
					break;
				case 2:
					;
					stack.push(new int[((Integer)stack.elementAt(stack.size()-2)).intValue()][((Integer)stack.elementAt(stack.size()-1)).intValue()]);
					stack.removeElementAt(stack.size()-2);
					stack.removeElementAt(stack.size()-2);
					break;
				case 3:
					stack.push(new int[((Integer)stack.elementAt(stack.size()-3)).intValue()][((Integer)stack.elementAt(stack.size()-2)).intValue()][((Integer)stack.elementAt(stack.size()-1)).intValue()]);
					stack.removeElementAt(stack.size()-2);
					stack.removeElementAt(stack.size()-2);
					stack.removeElementAt(stack.size()-2);
					break;
				case 4:
					stack.push(new int[((Integer)stack.elementAt(stack.size()-4)).intValue()][((Integer)stack.elementAt(stack.size()-3)).intValue()][((Integer)stack.elementAt(stack.size()-2)).intValue()][((Integer)stack.elementAt(stack.size()-1)).intValue()]);
					stack.removeElementAt(stack.size()-2);
					stack.removeElementAt(stack.size()-2);
					stack.removeElementAt(stack.size()-2);
					stack.removeElementAt(stack.size()-2);
					break;
				case 5:
					stack.push(new int[((Integer)stack.elementAt(stack.size()-5)).intValue()][((Integer)stack.elementAt(stack.size()-4)).intValue()][((Integer)stack.elementAt(stack.size()-3)).intValue()][((Integer)stack.elementAt(stack.size()-2)).intValue()][((Integer)stack.elementAt(stack.size()-1)).intValue()]);
					stack.removeElementAt(stack.size()-2);
					stack.removeElementAt(stack.size()-2);
					stack.removeElementAt(stack.size()-2);
					stack.removeElementAt(stack.size()-2);
					stack.removeElementAt(stack.size()-2);
					break;
				case 6:
					stack.push(new int[((Integer)stack.elementAt(stack.size()-6)).intValue()][((Integer)stack.elementAt(stack.size()-5)).intValue()][((Integer)stack.elementAt(stack.size()-4)).intValue()][((Integer)stack.elementAt(stack.size()-3)).intValue()][((Integer)stack.elementAt(stack.size()-2)).intValue()][((Integer)stack.elementAt(stack.size()-1)).intValue()]);
					stack.removeElementAt(stack.size()-2);
					stack.removeElementAt(stack.size()-2);
					stack.removeElementAt(stack.size()-2);
					stack.removeElementAt(stack.size()-2);
					stack.removeElementAt(stack.size()-2);
					stack.removeElementAt(stack.size()-2);
					break;


				}




			;
			break;
		case 'L':
			switch(dimen){
		case 1:
			stack.push(new Object[((Integer)stack.pop()).intValue()]);
			break;
		case 2:
			stack.push(new Object[((Integer)stack.elementAt(stack.size()-2)).intValue()][((Integer)stack.elementAt(stack.size()-1)).intValue()]);
			stack.removeElementAt(stack.size()-2);
			stack.removeElementAt(stack.size()-2);
			break;

		case 3:
			stack.push(new Object[((Integer)stack.elementAt(stack.size()-3)).intValue()][((Integer)stack.elementAt(stack.size()-2)).intValue()][((Integer)stack.elementAt(stack.size()-1)).intValue()]);
			stack.removeElementAt(stack.size()-2);
			stack.removeElementAt(stack.size()-2);
			stack.removeElementAt(stack.size()-2);

			break;
		case 4:
			stack.push(new Object[((Integer)stack.elementAt(stack.size()-4)).intValue()][((Integer)stack.elementAt(stack.size()-3)).intValue()][((Integer)stack.elementAt(stack.size()-2)).intValue()][((Integer)stack.elementAt(stack.size()-1)).intValue()]);
			stack.removeElementAt(stack.size()-2);
			stack.removeElementAt(stack.size()-2);
			stack.removeElementAt(stack.size()-2);
			stack.removeElementAt(stack.size()-2);

			break;
		case 5:
			stack.push(new Object[((Integer)stack.elementAt(stack.size()-5)).intValue()][((Integer)stack.elementAt(stack.size()-4)).intValue()][((Integer)stack.elementAt(stack.size()-3)).intValue()][((Integer)stack.elementAt(stack.size()-2)).intValue()][((Integer)stack.elementAt(stack.size()-1)).intValue()]);
			stack.removeElementAt(stack.size()-2);
			stack.removeElementAt(stack.size()-2);
			stack.removeElementAt(stack.size()-2);
			stack.removeElementAt(stack.size()-2);
			stack.removeElementAt(stack.size()-2);

			break;
		case 6:
			stack.push(new Object[((Integer)stack.elementAt(stack.size()-6)).intValue()][((Integer)stack.elementAt(stack.size()-5)).intValue()][((Integer)stack.elementAt(stack.size()-4)).intValue()][((Integer)stack.elementAt(stack.size()-3)).intValue()][((Integer)stack.elementAt(stack.size()-2)).intValue()][((Integer)stack.elementAt(stack.size()-1)).intValue()]);
			stack.removeElementAt(stack.size()-2);
			stack.removeElementAt(stack.size()-2);
			stack.removeElementAt(stack.size()-2);
			stack.removeElementAt(stack.size()-2);
			stack.removeElementAt(stack.size()-2);
			stack.removeElementAt(stack.size()-2);
			break;
			}


			;

			break;
		case 'B':
			switch(dimen){

			case 1:
				stack.push(new byte[((Integer)stack.pop()).intValue()]);stack.pop();
				break;
			case 2:
				//;
				stack.push(new byte[((Integer)stack.elementAt(stack.size()-2)).intValue()][((Integer)stack.elementAt(stack.size()-1)).intValue()]);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);
				break;
			case 3:
				stack.push(new byte[((Integer)stack.elementAt(stack.size()-3)).intValue()][((Integer)stack.elementAt(stack.size()-2)).intValue()][((Integer)stack.elementAt(stack.size()-1)).intValue()]);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);

				break;
			case 4:
				stack.push(new byte[((Integer)stack.elementAt(stack.size()-4)).intValue()][((Integer)stack.elementAt(stack.size()-3)).intValue()][((Integer)stack.elementAt(stack.size()-2)).intValue()][((Integer)stack.elementAt(stack.size()-1)).intValue()]);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);
				break;
			case 5:
				stack.push(new byte[((Integer)stack.elementAt(stack.size()-5)).intValue()][((Integer)stack.elementAt(stack.size()-4)).intValue()][((Integer)stack.elementAt(stack.size()-3)).intValue()][((Integer)stack.elementAt(stack.size()-2)).intValue()][((Integer)stack.elementAt(stack.size()-1)).intValue()]);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);stack.removeElementAt(stack.size()-2);

				break;
			case 6:
				stack.push(new byte[((Integer)stack.elementAt(stack.size()-6)).intValue()][((Integer)stack.elementAt(stack.size()-5)).intValue()][((Integer)stack.elementAt(stack.size()-4)).intValue()][((Integer)stack.elementAt(stack.size()-3)).intValue()][((Integer)stack.elementAt(stack.size()-2)).intValue()][((Integer)stack.elementAt(stack.size()-1)).intValue()]);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);

				break;


			}

			;
			break;
		case 'C':
			switch(dimen){

			case 1:
				stack.push(new char[((Integer)stack.pop()).intValue()]);
				break;
			case 2:
				stack.push(new char[((Integer)stack.elementAt(stack.size()-2)).intValue()][((Integer)stack.elementAt(stack.size()-1)).intValue()]);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);
				break;

			case 3:
				stack.push(new char[((Integer)stack.elementAt(stack.size()-3)).intValue()][((Integer)stack.elementAt(stack.size()-2)).intValue()][((Integer)stack.elementAt(stack.size()-1)).intValue()]);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);

				break;
			case 4:
				stack.push(new char[((Integer)stack.elementAt(stack.size()-4)).intValue()][((Integer)stack.elementAt(stack.size()-3)).intValue()][((Integer)stack.elementAt(stack.size()-2)).intValue()][((Integer)stack.elementAt(stack.size()-1)).intValue()]);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);

				break;
			case 5:
				stack.push(new char[((Integer)stack.elementAt(stack.size()-5)).intValue()][((Integer)stack.elementAt(stack.size()-4)).intValue()][((Integer)stack.elementAt(stack.size()-3)).intValue()][((Integer)stack.elementAt(stack.size()-2)).intValue()][((Integer)stack.elementAt(stack.size()-1)).intValue()]);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);

				break;
			case 6:
				stack.push(new char[((Integer)stack.elementAt(stack.size()-6)).intValue()][((Integer)stack.elementAt(stack.size()-5)).intValue()][((Integer)stack.elementAt(stack.size()-4)).intValue()][((Integer)stack.elementAt(stack.size()-3)).intValue()][((Integer)stack.elementAt(stack.size()-2)).intValue()][((Integer)stack.elementAt(stack.size()-1)).intValue()]);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);
				break;


			}
//monitor
			;
			break;
		case 'D':
			switch(dimen){

			case 1:
				stack.push(new double[((Integer)stack.pop()).intValue()]);
				break;
			case 2:
				stack.push(new double[((Integer)stack.elementAt(stack.size()-2)).intValue()][((Integer)stack.elementAt(stack.size()-1)).intValue()]);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);
				break;

			case 3:
				stack.push(new double[((Integer)stack.elementAt(stack.size()-3)).intValue()][((Integer)stack.elementAt(stack.size()-2)).intValue()][((Integer)stack.elementAt(stack.size()-1)).intValue()]);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);

				break;
			case 4:
				stack.push(new double[((Integer)stack.elementAt(stack.size()-4)).intValue()][((Integer)stack.elementAt(stack.size()-3)).intValue()][((Integer)stack.elementAt(stack.size()-2)).intValue()][((Integer)stack.elementAt(stack.size()-1)).intValue()]);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);

				break;
			case 5:
				stack.push(new double[((Integer)stack.elementAt(stack.size()-5)).intValue()][((Integer)stack.elementAt(stack.size()-4)).intValue()][((Integer)stack.elementAt(stack.size()-3)).intValue()][((Integer)stack.elementAt(stack.size()-2)).intValue()][((Integer)stack.elementAt(stack.size()-1)).intValue()]);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);

				break;
			case 6:
				stack.push(new double[((Integer)stack.elementAt(stack.size()-6)).intValue()][((Integer)stack.elementAt(stack.size()-5)).intValue()][((Integer)stack.elementAt(stack.size()-4)).intValue()][((Integer)stack.elementAt(stack.size()-3)).intValue()][((Integer)stack.elementAt(stack.size()-2)).intValue()][((Integer)stack.elementAt(stack.size()-1)).intValue()]);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);
				break;


			}

			;
			break;
		case 'F':
			switch(dimen){

			case 1:
				stack.push(new float[((Integer)stack.pop()).intValue()]);
				break;
			case 2:
				stack.push(new float[((Integer)stack.elementAt(stack.size()-2)).intValue()][((Integer)stack.elementAt(stack.size()-1)).intValue()]);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);
				break;

			case 3:
				stack.push(new float[((Integer)stack.elementAt(stack.size()-3)).intValue()][((Integer)stack.elementAt(stack.size()-2)).intValue()][((Integer)stack.elementAt(stack.size()-1)).intValue()]);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);

				break;
			case 4:
				stack.push(new float[((Integer)stack.elementAt(stack.size()-4)).intValue()][((Integer)stack.elementAt(stack.size()-3)).intValue()][((Integer)stack.elementAt(stack.size()-2)).intValue()][((Integer)stack.elementAt(stack.size()-1)).intValue()]);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);

				break;
			case 5:
				stack.push(new float[((Integer)stack.elementAt(stack.size()-5)).intValue()][((Integer)stack.elementAt(stack.size()-4)).intValue()][((Integer)stack.elementAt(stack.size()-3)).intValue()][((Integer)stack.elementAt(stack.size()-2)).intValue()][((Integer)stack.elementAt(stack.size()-1)).intValue()]);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);

				break;
			case 6:
				stack.push(new float[((Integer)stack.elementAt(stack.size()-6)).intValue()][((Integer)stack.elementAt(stack.size()-5)).intValue()][((Integer)stack.elementAt(stack.size()-4)).intValue()][((Integer)stack.elementAt(stack.size()-3)).intValue()][((Integer)stack.elementAt(stack.size()-2)).intValue()][((Integer)stack.elementAt(stack.size()-1)).intValue()]);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);
				break;


			}

			;
			break;
		case 'J':
			switch(dimen){

			case 1:
				stack.push(new long[((Integer)stack.pop()).intValue()]);
				break;
			case 2:
				stack.push(new long[((Integer)stack.elementAt(stack.size()-2)).intValue()][((Integer)stack.elementAt(stack.size()-1)).intValue()]);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);
				break;

			case 3:
				stack.push(new long[((Integer)stack.elementAt(stack.size()-3)).intValue()][((Integer)stack.elementAt(stack.size()-2)).intValue()][((Integer)stack.elementAt(stack.size()-1)).intValue()]);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);

				break;
			case 4:
				stack.push(new long[((Integer)stack.elementAt(stack.size()-4)).intValue()][((Integer)stack.elementAt(stack.size()-3)).intValue()][((Integer)stack.elementAt(stack.size()-2)).intValue()][((Integer)stack.elementAt(stack.size()-1)).intValue()]);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);

				break;
			case 5:
				stack.push(new long[((Integer)stack.elementAt(stack.size()-5)).intValue()][((Integer)stack.elementAt(stack.size()-4)).intValue()][((Integer)stack.elementAt(stack.size()-3)).intValue()][((Integer)stack.elementAt(stack.size()-2)).intValue()][((Integer)stack.elementAt(stack.size()-1)).intValue()]);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);

				break;
			case 6:
				stack.push(new long[((Integer)stack.elementAt(stack.size()-6)).intValue()][((Integer)stack.elementAt(stack.size()-5)).intValue()][((Integer)stack.elementAt(stack.size()-4)).intValue()][((Integer)stack.elementAt(stack.size()-3)).intValue()][((Integer)stack.elementAt(stack.size()-2)).intValue()][((Integer)stack.elementAt(stack.size()-1)).intValue()]);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);
				break;


			}

			;
			break;
		case 'S':
			switch(dimen){

			case 1:
				stack.push(new short[((Integer)stack.pop()).intValue()]);
				break;
			case 2:
				stack.push(new short[((Integer)stack.elementAt(stack.size()-2)).intValue()][((Integer)stack.elementAt(stack.size()-1)).intValue()]);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);
				break;

			case 3:
				stack.push(new short[((Integer)stack.elementAt(stack.size()-3)).intValue()][((Integer)stack.elementAt(stack.size()-2)).intValue()][((Integer)stack.elementAt(stack.size()-1)).intValue()]);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);

				break;
			case 4:
				stack.push(new short[((Integer)stack.elementAt(stack.size()-4)).intValue()][((Integer)stack.elementAt(stack.size()-3)).intValue()][((Integer)stack.elementAt(stack.size()-2)).intValue()][((Integer)stack.elementAt(stack.size()-1)).intValue()]);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);

				break;
			case 5:
				stack.push(new short[((Integer)stack.elementAt(stack.size()-5)).intValue()][((Integer)stack.elementAt(stack.size()-4)).intValue()][((Integer)stack.elementAt(stack.size()-3)).intValue()][((Integer)stack.elementAt(stack.size()-2)).intValue()][((Integer)stack.elementAt(stack.size()-1)).intValue()]);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);

				break;
			case 6:
				stack.push(new short[((Integer)stack.elementAt(stack.size()-6)).intValue()][((Integer)stack.elementAt(stack.size()-5)).intValue()][((Integer)stack.elementAt(stack.size()-4)).intValue()][((Integer)stack.elementAt(stack.size()-3)).intValue()][((Integer)stack.elementAt(stack.size()-2)).intValue()][((Integer)stack.elementAt(stack.size()-1)).intValue()]);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);
				break;


			}

			;
			break;

		case 'Z':
			switch(dimen){

			case 1:
				stack.push(new boolean[((Integer)stack.pop()).intValue()]);
				break;
			case 2:
				stack.push(new boolean[((Integer)stack.elementAt(stack.size()-2)).intValue()][((Integer)stack.elementAt(stack.size()-1)).intValue()]);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);
				break;

			case 3:
				stack.push(new boolean[((Integer)stack.elementAt(stack.size()-3)).intValue()][((Integer)stack.elementAt(stack.size()-2)).intValue()][((Integer)stack.elementAt(stack.size()-1)).intValue()]);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);

				break;
			case 4:
				stack.push(new boolean[((Integer)stack.elementAt(stack.size()-4)).intValue()][((Integer)stack.elementAt(stack.size()-3)).intValue()][((Integer)stack.elementAt(stack.size()-2)).intValue()][((Integer)stack.elementAt(stack.size()-1)).intValue()]);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);

				break;
			case 5:
				stack.push(new boolean[((Integer)stack.elementAt(stack.size()-5)).intValue()][((Integer)stack.elementAt(stack.size()-4)).intValue()][((Integer)stack.elementAt(stack.size()-3)).intValue()][((Integer)stack.elementAt(stack.size()-2)).intValue()][((Integer)stack.elementAt(stack.size()-1)).intValue()]);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);

				break;
			case 6:
				stack.push(new boolean[((Integer)stack.elementAt(stack.size()-6)).intValue()][((Integer)stack.elementAt(stack.size()-5)).intValue()][((Integer)stack.elementAt(stack.size()-4)).intValue()][((Integer)stack.elementAt(stack.size()-3)).intValue()][((Integer)stack.elementAt(stack.size()-2)).intValue()][((Integer)stack.elementAt(stack.size()-1)).intValue()]);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);
				stack.removeElementAt(stack.size()-2);
				break;


			}

			;
			break;

		default:
			break;

		}
			break;
		case (byte) 0xc6:
			;
		temppos=i;
		branchoffset=read8bitsToSignedShort(instcode, i);
		i+=2;
		if(stack.pop()==null)
			i=branchoffset+temppos-1;
		break;
		case (byte) 0xc7:
			;

			temppos=i;
			branchoffset=read8bitsToSignedShort(instcode, i);
			i+=2;
			if(stack.pop()!=null)
				i=branchoffset+temppos-1;
			break;

		case (byte) 0xc8:
			;
			temppos=i;
			branchoffset=read16bitsToSignedInteger(instcode, i);
			i+=4;
			i=branchoffset+temppos-1;
			break;

		case (byte) 0xC9:
			;
			temppos=i;
			branchoffset=read16bitsToSignedInteger(instcode, i);
			i+=4;
			stack.push(new Integer(temppos+5));
			i=branchoffset+temppos-1;
			break;
		case (byte) 0xca:
		case (byte) 0xcb:
			;
		stack.push(mf.values_of_quick_code.get(new Integer(i)));

			i++;
			for (int n = 0; n < stack.size() ;n++) {
				;
			}
			//System.exit(2);
			break;
		case (byte) 0xcc:
			;
		stack.push(mf.values_of_quick_code.get(new Integer(i)));

			i+=2;
			for (int n = 0; n < stack.size() ;n++) {
				;
			}
			//System.exit(2);
			break;
		case (byte) 0xcd:
			;
		stack.push(mf.values_of_quick_code.get(new Integer(i)));
		i++;
		break;
		case (byte) 0xce:
			;
		stack.push(null);
		stack.push(mf.values_of_quick_code.get(new Integer(i)));
		i+=2;
		break;
		/*
		case (byte) 0xcf:

			;
		sta=staticfield.getStaticField(((String[])mf.values_of_quick_code.get(new Integer(i)))[0], ((String[])mf.values_of_quick_code.get(new Integer(i)))[1]);
		if(sta!=null&&sta.getClass().getName().equals("java.lang.Long")||sta!=null&&sta.getClass().getName().equals("java.lang.Double")){
			stack.push(null);stack.push(sta);
		}else{
			;

		stack.push(sta);
		}
		i+=2;
		break;
		case (byte) 0xd0:
			;
		sta=stack.pop();
		if((sta!=null)&&(sta.getClass().getName().equals("java.lang.Long")||(sta!=null)&&sta.getClass().getName().equals("java.lang.Double")))
		{
		staticfield.setStaticField(((String[])mf.values_of_quick_code.get(new Integer(i)))[0], ((String[])mf.values_of_quick_code.get(new Integer(i)))[1], sta);
		stack.pop();
		}
		else staticfield.setStaticField(((String[])mf.values_of_quick_code.get(new Integer(i)))[0], ((String[])mf.values_of_quick_code.get(new Integer(i)))[1], sta);
		i+=2;
break;
		case (byte) 0xd1:
			;
		Object getobj;
		if(isCLDCClass(((String[])mf.values_of_quick_code.get(new Integer(i)))[0])){
			if(stack.peek()==null){
				System.exit(2);
			};
			getobj=getCLDCfield(((String[])mf.values_of_quick_code.get(new Integer(i)))[0], ((String[])mf.values_of_quick_code.get(new Integer(i)))[1],stack.pop());
;
			if((getobj!=null)&&(getobj.getClass().getName().equals("java.lang.Double")||(getobj!=null)&&getobj.getClass().getName().equals("java.lang.Long")))
				stack.push(null);
			stack.push(getobj);
		}
		else{
			;
		getobj=((instance)stack.pop()).getField(((String[])mf.values_of_quick_code.get(new Integer(i)))[0]+":"+ ((String[])mf.values_of_quick_code.get(new Integer(i)))[1]+":"+ ((String[])mf.values_of_quick_code.get(new Integer(i)))[2],((String[])mf.values_of_quick_code.get(new Integer(i)))[2]);
		;
		if((getobj!=null)&&(getobj.getClass().getName().equals("java.lang.Double")||(getobj!=null)&&getobj.getClass().getName().equals("java.lang.Long")))
			stack.push(null);
		stack.push(getobj);
		}
		i+=2;
		break;
		case (byte) 0xd2:
			;
		sta=stack.pop();

		if((sta!=null)&&(sta.getClass().getName().equals("java.lang.Double")||(sta!=null)&&sta.getClass().getName().equals("java.lang.Long")))
			stack.pop();
		if(stack.peek()==null){
			;
			System.exit(2);
		}
		((instance)stack.pop()).setField(((String[])mf.values_of_quick_code.get(new Integer(i)))[0], ((String[])mf.values_of_quick_code.get(new Integer(i)))[1],sta);

		i+=2;
		break;
*/


	}
		}

	}catch(Throwable e){e.printStackTrace();
	//need implement exception handler iinc
	//exec(instcode.)
	//;//getstatic
	;
	;
	;
	//System.exit(2);
	stack.push(new Object());//a_store dumy;
	if(e.getClass().getName().equals("KWN.vmonkvm.NonNativeException")){
		;
		String esclass=whatSuperClass(((instance)((NonNativeException)e).inst).classname);
		for(int j=0;j<mf.exepinfo.length;j++){
			if(((String)mf.exepinfo[j][3]).equals(((instance)((NonNativeException)e).inst).classname)){
				if((((Integer)mf.exepinfo[j][0]).intValue()<=i)&&(i<=((Integer)mf.exepinfo[j][1]).intValue()-1)){

					i=((Integer)mf.exepinfo[j][2]).intValue();
					exec(instcode);
					break;
					}
			}else{
				if(returnExcepSclass(e.getClass().getName(), ((instance)((NonNativeException)e).inst).classname, (instance)((NonNativeException)e).inst))
				{
					if((((Integer)mf.exepinfo[j][0]).intValue()<=i)&&(i<=((Integer)mf.exepinfo[j][1]).intValue()-1)){
					i=((Integer)mf.exepinfo[j][2]).intValue();
					exec(instcode);
					break;
					}
				}

			}

		}

	}

	else{
	for (int j = 0; j<mf.exepinfo.length ; j++) {
		try {
			if(Class.forName(((String)mf.exepinfo[j][3]).replace('/', '.')).isInstance(e)){
			;
			if((((Integer)mf.exepinfo[j][0]).intValue()<=i)&&(i<=((Integer)mf.exepinfo[j][1]).intValue()-1)){

						i=((Integer)mf.exepinfo[j][2]).intValue();
						exec(instcode);
						break;

			}
			}

		} catch (ClassNotFoundException e1) {
			// TODO ?ｽ?ｽ?ｽ?ｽ?ｽ?ｽ?ｽ?ｽ?ｽ?ｽ?ｽ黷ｽ catch ?ｽu?ｽ?ｽ?ｽb?ｽN
			e1.printStackTrace();
		}


	}
	}

	}
	return null;


}
Object getCLDCfield(String classname,String fieldname,Object obj){
	if(classname.equals("java/util/Vector")){
		if(fieldname.equals("capacityIncrement")){
			if(obj.getClass().getName().equals("KWN.vmonkvm.CLDCinstance"))
				return new Integer(((java.util.Vector)(((CLDCinstance)obj)).cldcobj).capacity());
			else return new Integer(((java.util.Vector)(((instance)obj)).sclassobj).capacity());
		}
		if(fieldname.equals("elementCount")){
			if(obj.getClass().getName().equals("KWN.vmonkvm.CLDCinstance"))
				return new Integer(((java.util.Vector)(((CLDCinstance)obj)).cldcobj).size());
			else return new Integer(((java.util.Vector)(((instance)obj)).sclassobj).size());
		}
		if(fieldname.equals("elementData")){
			Object[] tempobj=null;
			if(obj.getClass().getName().equals("KWN.vmonkvm.CLDCinstance")){
				((java.util.Vector)(((CLDCinstance)obj)).cldcobj).copyInto(tempobj);
				return tempobj;
			}
			else{ ((java.util.Vector)(((instance)obj)).sclassobj).copyInto(tempobj);
			return tempobj;
			}
		}
		else {
			;
			System.exit(2);
		}
	}
	else {
		;
		System.exit(2);
	}
	return null;
}
static public Object getStaticFieldbyName(String absname){
/*	if(absname.equals("java/lang/System/out")){

			//return java7z.io;

		return new CLDCinstance(System.out);//putstatic

	}*/

	//Writer//java.io.Writer
	//?ｽt?ｽB?ｽ[?ｽ?ｽ?ｽh?ｽﾌ概?ｽv
	//ArithmeticException//java.lang.ArithmeticException
	//ArrayIndexOutOfBoundsException//java.lang.ArrayIndexOutOfBoundsException
	//ArrayStoreException//java.lang.ArrayStoreException
	//Boolean//java.lang.Boolean
	//?ｽt?ｽB?ｽ[?ｽ?ｽ?ｽh?ｽﾌ概?ｽv
	if(!absname.startsWith("java")){
		return null;
	}
	if(absname.equals("java.lang.Boolean.FALSE".replace('.','/'))){
	return new CLDCinstance(java.lang.Boolean.FALSE);
	}
	if(absname.equals("java.lang.Boolean.TRUE".replace('.','/'))){
	return new CLDCinstance(java.lang.Boolean.TRUE);
	}
	//Byte//java.lang.Byte
	//?ｽt?ｽB?ｽ[?ｽ?ｽ?ｽh?ｽﾌ概?ｽv
	if(absname.equals("java.lang.Byte.MAX_VALUE".replace('.','/'))){
	return new Integer((int)java.lang.Byte.MAX_VALUE);
	}
	if(absname.equals("java.lang.Byte.MIN_VALUE".replace('.','/'))){
	return new Integer((int)java.lang.Byte.MIN_VALUE);
	}
	//ByteArrayInputStream//java.io.ByteArrayInputStream
	//?ｽt?ｽB?ｽ[?ｽ?ｽ?ｽh?ｽﾌ概?ｽv
	//ByteArrayOutputStream//java.io.ByteArrayOutputStream
	//?ｽt?ｽB?ｽ[?ｽ?ｽ?ｽh?ｽﾌ概?ｽv
	//Calendar//java.util.Calendar
	//?ｽt?ｽB?ｽ[?ｽ?ｽ?ｽh?ｽﾌ概?ｽv
	if(absname.equals("java.util.Calendar.AM".replace('.','/'))){
	return new Integer(java.util.Calendar.AM);
	}
	if(absname.equals("java.util.Calendar.AM_PM".replace('.','/'))){
	return new Integer(java.util.Calendar.AM_PM);
	}
	if(absname.equals("java.util.Calendar.APRIL".replace('.','/'))){
	return new Integer(java.util.Calendar.APRIL);
	}
	if(absname.equals("java.util.Calendar.AUGUST".replace('.','/'))){
	return new Integer(java.util.Calendar.AUGUST);
	}
	if(absname.equals("java.util.Calendar.DATE".replace('.','/'))){
	return new Integer(java.util.Calendar.DATE);
	}
	if(absname.equals("java.util.Calendar.DAY_OF_MONTH".replace('.','/'))){
	return new Integer(java.util.Calendar.DAY_OF_MONTH);
	}
	if(absname.equals("java.util.Calendar.DAY_OF_WEEK".replace('.','/'))){
	return new Integer(java.util.Calendar.DAY_OF_WEEK);
	}
	if(absname.equals("java.util.Calendar.DECEMBER".replace('.','/'))){
	return new Integer(java.util.Calendar.DECEMBER);
	}
	if(absname.equals("java.util.Calendar.FEBRUARY".replace('.','/'))){
	return new Integer(java.util.Calendar.FEBRUARY);
	}
	if(absname.equals("java.util.Calendar.FRIDAY".replace('.','/'))){
	return new Integer(java.util.Calendar.FRIDAY);
	}
	if(absname.equals("java.util.Calendar.HOUR".replace('.','/'))){
	return new Integer(java.util.Calendar.HOUR);
	}
	if(absname.equals("java.util.Calendar.HOUR_OF_DAY".replace('.','/'))){
	return new Integer(java.util.Calendar.HOUR_OF_DAY);
	}
	if(absname.equals("java.util.Calendar.JANUARY".replace('.','/'))){
	return new Integer(java.util.Calendar.JANUARY);
	}
	if(absname.equals("java.util.Calendar.JULY".replace('.','/'))){
	return new Integer(java.util.Calendar.JULY);
	}
	if(absname.equals("java.util.Calendar.JUNE".replace('.','/'))){
	return new Integer(java.util.Calendar.JUNE);
	}
	if(absname.equals("java.util.Calendar.MARCH".replace('.','/'))){
	return new Integer(java.util.Calendar.MARCH);
	}
	if(absname.equals("java.util.Calendar.MAY".replace('.','/'))){
	return new Integer(java.util.Calendar.MAY);
	}
	if(absname.equals("java.util.Calendar.MILLISECOND".replace('.','/'))){
	return new Integer(java.util.Calendar.MILLISECOND);
	}
	if(absname.equals("java.util.Calendar.MINUTE".replace('.','/'))){
	return new Integer(java.util.Calendar.MINUTE);
	}
	if(absname.equals("java.util.Calendar.MONDAY".replace('.','/'))){
	return new Integer(java.util.Calendar.MONDAY);
	}
	if(absname.equals("java.util.Calendar.MONTH".replace('.','/'))){
	return new Integer(java.util.Calendar.MONTH);
	}
	if(absname.equals("java.util.Calendar.NOVEMBER".replace('.','/'))){
	return new Integer(java.util.Calendar.NOVEMBER);
	}
	if(absname.equals("java.util.Calendar.OCTOBER".replace('.','/'))){
	return new Integer(java.util.Calendar.OCTOBER);
	}
	if(absname.equals("java.util.Calendar.PM".replace('.','/'))){
	return new Integer(java.util.Calendar.PM);
	}
	if(absname.equals("java.util.Calendar.SATURDAY".replace('.','/'))){
	return new Integer(java.util.Calendar.SATURDAY);
	}
	if(absname.equals("java.util.Calendar.SECOND".replace('.','/'))){
	return new Integer(java.util.Calendar.SECOND);
	}
	if(absname.equals("java.util.Calendar.SEPTEMBER".replace('.','/'))){
	return new Integer(java.util.Calendar.SEPTEMBER);
	}
	if(absname.equals("java.util.Calendar.SUNDAY".replace('.','/'))){
	return new Integer(java.util.Calendar.SUNDAY);
	}
	if(absname.equals("java.util.Calendar.THURSDAY".replace('.','/'))){
	return new Integer(java.util.Calendar.THURSDAY);
	}
	if(absname.equals("java.util.Calendar.TUESDAY".replace('.','/'))){
	return new Integer(java.util.Calendar.TUESDAY);
	}
	if(absname.equals("java.util.Calendar.WEDNESDAY".replace('.','/'))){
	return new Integer(java.util.Calendar.WEDNESDAY);
	}
	if(absname.equals("java.util.Calendar.YEAR".replace('.','/'))){
	return new Integer(java.util.Calendar.YEAR);
	}
	//Character//java.lang.Character
	//?ｽt?ｽB?ｽ[?ｽ?ｽ?ｽh?ｽﾌ概?ｽv
	if(absname.equals("java.lang.Character.MAX_RADIX".replace('.','/'))){
	return new Integer(java.lang.Character.MAX_RADIX);
	}
	if(absname.equals("java.lang.Character.MAX_VALUE".replace('.','/'))){
	return new Integer((int)java.lang.Character.MAX_VALUE);
	}
	if(absname.equals("java.lang.Character.MIN_RADIX".replace('.','/'))){
	return new Integer(java.lang.Character.MIN_RADIX);
	}
	if(absname.equals("java.lang.Character.MIN_VALUE".replace('.','/'))){
	return new Integer((int)java.lang.Character.MIN_VALUE);
	}
	//Class//java.lang.Class
	//ClassCastException//java.lang.ClassCastException
	//ClassNotFoundException//java.lang.ClassNotFoundException
	//Connection//close
	//ConnectionNotFoundException//javax.microedition.io.ConnectionNotFoundException
	//Connector//javax.microedition.io.Connector
	//?ｽt?ｽB?ｽ[?ｽ?ｽ?ｽh?ｽﾌ概?ｽv
	if(absname.equals("javax.microedition.io.Connector.READ".replace('.','/'))){
	return new Integer(javax.microedition.io.Connector.READ);
	}
	if(absname.equals("javax.microedition.io.Connector.READ_WRITE".replace('.','/'))){
	return new Integer(javax.microedition.io.Connector.READ_WRITE);
	}
	if(absname.equals("javax.microedition.io.Connector.WRITE".replace('.','/'))){
	return new Integer(javax.microedition.io.Connector.WRITE);
	}
	//ContentConnection//getType
	//Datagram//getAddress
	//DatagramConnection//getMaximumLength
	//DataInput//readFully
	//DataInputStream//java.io.DataInputStream
	//?ｽt?ｽB?ｽ[?ｽ?ｽ?ｽh?ｽﾌ概?ｽv
	//DataOutput//write
	//DataOutputStream//java.io.DataOutputStream
	//?ｽt?ｽB?ｽ[?ｽ?ｽ?ｽh?ｽﾌ概?ｽv
	//Date//java.util.Date
	//EmptyStackException//java.util.EmptyStackException
	//Enumeration//hasMoreElements
	//EOFException//java.io.EOFException
	//Error//java.lang.Error
	//Exception//java.lang.Exception
	//Hashtable//java.util.Hashtable
	//IllegalAccessException//java.lang.IllegalAccessException
	//IllegalArgumentException//java.lang.IllegalArgumentException
	//IllegalMonitorStateException//java.lang.IllegalMonitorStateException
	//IllegalThreadStateException//java.lang.IllegalThreadStateException
	//IndexOutOfBoundsException//java.lang.IndexOutOfBoundsException
	//InputConnection//openInputStream
	//InputStream//java.io.InputStream
	//InputStreamReader//java.io.InputStreamReader
	//?ｽt?ｽB?ｽ[?ｽ?ｽ?ｽh?ｽﾌ概?ｽv
	//InstantiationException//java.lang.InstantiationException
	//Integer//java.lang.Integer
	//?ｽt?ｽB?ｽ[?ｽ?ｽ?ｽh?ｽﾌ概?ｽv
	if(absname.equals("java.lang.Integer.MAX_VALUE".replace('.','/'))){
	return new Integer(java.lang.Integer.MAX_VALUE);
	}
	if(absname.equals("java.lang.Integer.MIN_VALUE".replace('.','/'))){
	return new Integer(java.lang.Integer.MIN_VALUE);
	}
	//InterruptedException//java.lang.InterruptedException
	//InterruptedIOException//java.io.InterruptedIOException
	//?ｽt?ｽB?ｽ[?ｽ?ｽ?ｽh?ｽﾌ概?ｽv
	//IOException//java.io.IOException
	//Long//java.lang.Long
	//?ｽt?ｽB?ｽ[?ｽ?ｽ?ｽh?ｽﾌ概?ｽv
	if(absname.equals("java.lang.Long.MAX_VALUE".replace('.','/'))){
	return new Long(java.lang.Long.MAX_VALUE);
	}
	if(absname.equals("java.lang.Long.MIN_VALUE".replace('.','/'))){
	return new Long(java.lang.Long.MIN_VALUE);
	}
	//Math//java.lang.Math
	//?ｽt?ｽB?ｽ[?ｽ?ｽ?ｽh?ｽﾌ概?ｽv
	if(absname.equals("java.lang.Math.E".replace('.','/'))){
	return new Double((double)java.lang.Math.E);
	}
	if(absname.equals("java.lang.Math.PI".replace('.','/'))){
	return new Double((double)java.lang.Math.PI);
	}
	//NegativeArraySizeException//java.lang.NegativeArraySizeException
	//NoSuchElementException//java.util.NoSuchElementException
	//NullPointerException//java.lang.NullPointerException
	//NumberFormatException//java.lang.NumberFormatException
	//Object//java.lang.Object
	//OutOfMemoryError//java.lang.OutOfMemoryError
	//OutputConnection//openOutputStream
	//OutputStream//java.io.OutputStream
	//OutputStreamWriter//java.io.OutputStreamWriter
	//?ｽt?ｽB?ｽ[?ｽ?ｽ?ｽh?ｽﾌ概?ｽv
	//PrintStream//java.io.PrintStream
	//Random//java.util.Random
	//Reader//java.io.Reader
	//?ｽt?ｽB?ｽ[?ｽ?ｽ?ｽh?ｽﾌ概?ｽv
	//Runnable//run
	//Runtime//java.lang.Runtime
	//RuntimeException//java.lang.RuntimeException
	//SecurityException//java.lang.SecurityException
	//Short//java.lang.Short
	//?ｽt?ｽB?ｽ[?ｽ?ｽ?ｽh?ｽﾌ概?ｽv
	if(absname.equals("java.lang.Short.MAX_VALUE".replace('.','/'))){
	return new Integer((int)java.lang.Short.MAX_VALUE);
	}
	if(absname.equals("java.lang.Short.MIN_VALUE".replace('.','/'))){
	return new Integer((int)java.lang.Short.MIN_VALUE);
	}
	//Stack//java.util.Stack
	//?ｽt?ｽB?ｽ[?ｽ?ｽ?ｽh?ｽﾌ概?ｽv
	//StreamConnection//StreamConnectionNotifier//acceptAndOpen
	//String//java.lang.String
	//StringBuffer//java.lang.StringBuffer
	//StringIndexOutOfBoundsException//java.lang.StringIndexOutOfBoundsException
	//System//java.lang.System
	//?ｽt?ｽB?ｽ[?ｽ?ｽ?ｽh?ｽﾌ概?ｽv
	if(absname.equals("java.lang.System.err".replace('.','/'))){
	return new CLDCinstance(java.lang.System.err);
	}
	if(absname.equals("java.lang.System.out".replace('.','/'))){
	return new CLDCinstance(java.lang.System.out);
	}
	//Thread//java.lang.Thread
	//?ｽt?ｽB?ｽ[?ｽ?ｽ?ｽh?ｽﾌ概?ｽv
	if(absname.equals("java.lang.Thread.MAX_PRIORITY".replace('.','/'))){
	return new Integer(java.lang.Thread.MAX_PRIORITY);
	}
	if(absname.equals("java.lang.Thread.MIN_PRIORITY".replace('.','/'))){
	return new Integer(java.lang.Thread.MIN_PRIORITY);
	}
	if(absname.equals("java.lang.Thread.NORM_PRIORITY".replace('.','/'))){
	return new Integer(java.lang.Thread.NORM_PRIORITY);
	}
	//Throwable//java.lang.Throwable
	//TimeZone//java.util.TimeZone
	//UnsupportedEncodingException//java.io.UnsupportedEncodingException
	//UTFDataFormatException//java.io.UTFDataFormatException
	//Vector//java.util.Vector
	//?ｽt?ｽB?ｽ[?ｽ?ｽ?ｽh?ｽﾌ概?ｽv
	//VirtualMachineError//java.lang.VirtualMachineError
	//



//getstatic

	                //?ｽR?ｽ?ｽ?ｽX?ｽg?ｽ?ｽ?ｽN?ｽ^?ｽﾌ概?ｽv


	/*else {
		for (int i = 0; i < StaticFields.size(); i++) {
			Object[] sta=(Object[])StaticFields.elementAt(i);
			if(sta[0].equals(absname))return sta[1];
		}


	}*/
	return null;
}


 Object doMethodbyName(String classname,String methodname,String discry,Object[] args,Object obj,int mode)throws Exception{
	/*boolean bl1,bl2,bl3,bl4;
	double d1,d2,d3;
	byte b1,b2,b3;
	short s1,s3,s2;
	float f1,f2,f3;
	long l1,l2,l3;
	int i1,i2,i3;
Connector cant execute method system will exit
	char c1,c2,c3;*/
	if(obj==null){
		;
		obj=new Object();
	}
		boolean[] bl=new boolean[args.length];
	double[] d=new double[args.length];
	byte[] b=new byte[args.length];
	short[] s=new short[args.length];
	float[] f=new float[args.length];
	long[] l=new long[args.length];
	int[] in=new int[args.length];
	char[] c=new char[args.length];
	;
	;
	char[] dmn=discry.toCharArray();//getfield
	;
	;
	if(dmn[1]!=')'){
		for (int i = 1; i < args.length; i++) {


			if(args[i]!=null&&args[i].getClass().getName().equals("java.lang.String")){
				args[i]=new CLDCinstance(args[i]);
				;
				;
			}
//monitorenter

		}
	}

	//

	if(obj.getClass().getName().equals("KWN.vmonkvm.CLDCinstance")&&(!methodname.equals("<init>")))obj=((CLDCinstance)obj).cldcobj;

	String absname=classname+":"+methodname+":"+discry;
	int re1,re2,ew3,re4,re5;
	if(absname.equals("java/io/PrintStream:println:(Ljava/lang/Object;)V")){
		if(mode!=1){
//putfield
		;
		java.io.PrintStream ps=(PrintStream) obj;
		if(args[1].getClass().getName().equals("KWN.vmonkvm.CLDCinstance")){
		ps.println(((CLDCinstance)args[1]).cldcobj);
		return null;
		}
		else{

			;
			return null;
		}
		}
		else return new Integer(0);
	}

	else
	{
		;
		;
		//if(classname.equals(javaStack.vs.applicationname)){
			//classname="com/nttdocomo/ui/IApplication";
			//}

		return domethod.doMethodbyName(classname, methodname, discry, args, obj, mode);

	}

}


public static boolean isCLDCClass(String absname){



	if(absname.equals("dummyPanel")){
		return true;
	}
	else if(absname.equals("dummyCanvas")){
		return true;
	}
	else if(absname.equals("myDataStream")){
		return true;
	}

	//else 	if(absname.equals(staticfield.applicationname)){//putstatic
		//return true;
	//}
	else if(!absname.startsWith("java")){
		return false;
	}
	else if(absname.startsWith("java.lang.".replace('.','/'))){
	 if(absname.endsWith("Runnable")){
	return true;
	}
	else if(absname.endsWith("Boolean")){
	return true;
	}
	else if(absname.endsWith("Byte")){
	return true;
	}
	else if(absname.endsWith("Character")){
	return true;
	}
	else if(absname.endsWith("Class")){
	return true;
	}
	else if(absname.endsWith("Double")){
	return true;
	}
	else if(absname.endsWith("Float")){
	return true;
	}
	else if(absname.endsWith("Integer")){
	return true;
	}
	else if(absname.endsWith("Long")){
	return true;
	}
	else if(absname.endsWith("Math")){
	return true;
	}
	else if(absname.endsWith("Object")){
	return true;
	}
	else if(absname.endsWith("Runtime")){
	return true;
	}
	else if(absname.endsWith("Short")){
	return true;
	}
	else if(absname.endsWith("String")){
	return true;
	}
	else if(absname.endsWith("StringBuffer")){
	return true;
	}
	else if(absname.endsWith("StringBuilder")){
		return true;
	}
	else if(absname.endsWith("System")){
	return true;
	}
	else if(absname.endsWith("Thread")){
	return true;
	}
	else if(absname.endsWith("Throwable")){
	return true;
	}
	else if(absname.endsWith("ArithmeticException")){
	return true;
	}
	else if(absname.endsWith("ArrayIndexOutOfBoundsException")){
	return true;
	}
	else if(absname.endsWith("ArrayStoreException")){
	return true;
	}
	else if(absname.endsWith("ClassCastException")){
	return true;
	}
	else if(absname.endsWith("ClassNotFoundException")){
	return true;
	}
	else if(absname.endsWith("Exception")){
	return true;
	}
	else if(absname.endsWith("IllegalAccessException")){
	return true;
	}
	else if(absname.endsWith("IllegalArgumentException")){
	return true;
	}
	else if(absname.endsWith("IllegalMonitorStateException")){
	return true;
	}
	else if(absname.endsWith("IllegalThreadStateException")){
	return true;
	}
	else if(absname.endsWith("IndexOutOfBoundsException")){
	return true;
	}
	else if(absname.endsWith("InstantiationException")){
	return true;
	}
	else if(absname.endsWith("InterruptedException")){
	return true;
	}
	else if(absname.endsWith("NegativeArraySizeException")){
	return true;
	}
	else if(absname.endsWith("NullPointerException")){
	return true;
	}
	else if(absname.endsWith("NumberFormatException")){
	return true;
	}
	else if(absname.endsWith("RuntimeException")){
	return true;
	}
	else if(absname.endsWith("SecurityException")){
	return true;
	}
	else if(absname.endsWith("StringIndexOutOfBoundsException")){
	return true;
	}
	else if(absname.endsWith("Error")){
	return true;
	}
	else if(absname.endsWith("NoClassDefFoundError")){
	return true;
	}
	else if(absname.endsWith("OutOfMemoryError")){
	return true;
	}
	else if(absname.endsWith("VirtualMachineError")){
	return true;
	}
	}//java.util.
	else if(absname.startsWith("java.util.".replace('.','/'))){
	 if(absname.endsWith("Enumeration")){
	return true;
	}
	else if(absname.endsWith("Calendar")){
	return true;
	}
	else if(absname.endsWith("Date")){
	return true;
	}
	else if(absname.endsWith("Hashtable")){
	return true;
	}
	else if(absname.endsWith("Random")){
	return true;
	}
	else if(absname.endsWith("Stack")){
	return true;
	}
	else if(absname.endsWith("TimeZone")){
	return true;
	}
	else if(absname.endsWith("Vector")){
	return true;
	}
	else if(absname.endsWith("EmptyStackException")){
	return true;
	}
	else if(absname.endsWith("NoSuchElementException")){
	return true;
	}
	}//java.io.
	if(absname.startsWith("java.io.".replace('.','/'))){
	if(absname.endsWith("DataInput")){
	return true;
	}
	else if(absname.endsWith("DataOutput")){
	return true;
	}
	else if(absname.endsWith("ByteArrayInputStream")){
	return true;
	}
	else if(absname.endsWith("ByteArrayOutputStream")){
	return true;
	}
	else if(absname.endsWith("DataInputStream")){
	return true;
	}
	else if(absname.endsWith("DataOutputStream")){
	return true;
	}
	else if(absname.endsWith("InputStream")){
	return true;
	}
	else if(absname.endsWith("InputStreamReader")){
	return true;
	}
	else if(absname.endsWith("OutputStream")){
	return true;
	}
	else if(absname.endsWith("OutputStreamWriter")){
	return true;
	}
	else if(absname.endsWith("PrintStream")){
	return true;
	}
	else if(absname.endsWith("Reader")){
	return true;
	}
	else if(absname.endsWith("Writer")){
	return true;
	}
	else if(absname.endsWith("EOFException")){
	return true;
	}
	else if(absname.endsWith("InterruptedIOException")){
	return true;
	}
	else if(absname.endsWith("IOException")){
	return true;
	}
	else if(absname.endsWith("UnsupportedEncodingException")){
	return true;
	}
	else if(absname.endsWith("UTFDataFormatException")){
	return true;
	}
	}//javax.microedition.io.
	if(absname.startsWith("javax.microedition.io.".replace('.','/'))){
	 if(absname.endsWith("Connection")){
	return true;
	}
	else if(absname.endsWith("ContentConnection")){
	return true;
	}
	else if(absname.endsWith("Datagram")){
	return true;
	}
	else if(absname.endsWith("DatagramConnection")){
	return true;
	}
	else if(absname.endsWith("InputConnection")){
	return true;
	}
	else if(absname.endsWith("OutputConnection")){
	return true;
	}
	else if(absname.endsWith("StreamConnection")){
	return true;
	}
	else if(absname.endsWith("StreamConnectionNotifier")){
	return true;
	}
	else if(absname.endsWith("Connector")){
	return true;
	}
	else if(absname.endsWith("ConnectionNotFoundException")){
	return true;
	}
	}//java.lang.ref.
	if(absname.startsWith("java.lang.ref.".replace('.','/'))){
	 if(absname.endsWith("Reference")){
	return true;
	}
	else if(absname.endsWith("WeakReference")){
	return true;
	}
	}//

	/*
	else if(absname.equals("java/lang/StringBuffer")){
		return true;
	}
	else if (absname.equals("java/util/Vector")){
		return true;
	}else if (absname.equals("java/lang/ArithmeticException")){
		return true;
	}
	else if (absname.equals("java/lang/ArrayIndexOutOfBoundsException")){
		return true;
	}

	else if (absname.equals("java/lang/ArrayStoreException")){
		return true;
	}
	else if (absname.equals("java/lang/Byte")){
		return true;
	}
	else if (absname.equals("java/io/ByteArrayInputStream")){
		return true;
	}
	else if (absname.equals("java/io/ByteArrayOutputStream")){
		return true;
	}
	else if (absname.equals("java/util/Calendar")){
		return true;
	}
	else if (absname.equals("java/lang/Boolean")){
		return true;
	}

	else if (absname.equals("java/lang/Character")){
		return true;
	}
	else if (absname.equals("java/lang/Class")){
		return true;
	}

	else if (absname.equals("java/lang/ClassCastException")){
		return true;
	}
	else if (absname.equals("java/lang/ClassNotFoundException")){
		return true;
	}
	else if (absname.equals("javax/microedition/io/ConnectionNotFoundException")){
		return true;
	}
	else if (absname.equals("javax/microedition/io/Connector")){
		return true;
	}
	else if (absname.equals("java/io/DataInputStream")){
		return true;
	}
	else if (absname.equals("java/io/DataOutputStream")){
		return true;
	}
	else if (absname.equals("java/util/Date")){
		return true;
	}
	else if (absname.equals("java/util/EmptyStackException")){
		return true;
	}
	else if (absname.equals("java/io/EOFException")){
		return true;
	}
	else if (absname.equals("java/lang/Error")){
		return true;
	}
	else if (absname.equals("java/lang/Exception")){
		return true;
	}
	else if (absname.equals("java/util/Hashtable")){
		return true;
	}
	else if (absname.equals("java/lang/IllegalAccessException")){
		return true;
	}
	else if (absname.equals("java/lang/IllegalArgumentException")){
		return true;
	}
	else if (absname.equals("java/lang/IllegalMonitorStateException")){
		return true;
	}
	else if (absname.equals("java/lang/IllegalThreadStateException")){
		return true;
	}
	else if (absname.equals("java/lang/IndexOutOfBoundsException")){
		return true;
	}
	else if (absname.equals("java/io/InputStream")){
		return true;
	}
	else if (absname.equals("java/io/PrintStream")){
		return true;
	}
	else if (absname.equals("java/io/InputStreamReader")){
		return true;
	}
	else if (absname.equals("java/lang/InstantiationException")){
		return true;
	}
	else if (absname.equals("java/lang/Integer")){
		return true;
	}
	else if (absname.equals("java/lang/InterruptedException")){
		return true;
	}
	else if (absname.equals("java/io/InterruptedIOException")){
		return true;
	}
	else if (absname.equals("java/io/IOException")){
		return true;
	}
	else if (absname.equals("java/lang/Long")){
		return true;
	}
	else if (absname.equals("java/lang/Math")){
		return true;
	}
	else if (absname.equals("java/lang/NegativeArraySizeException")){
		return true;
	}
	else if (absname.equals("java/util/NoSuchElementException")){
		return true;
	}
	else if (absname.equals("java/lang/NullPointerException")){
		return true;
	}
	else if (absname.equals("java/lang/NumberFormatException")){
		return true;
	}
	else if (absname.equals("java/lang/Object")){
		return true;
	}
	else if (absname.equals("java/lang/OutOfMemoryError")){
		return true;
	}
	else if (absname.equals("java/io/OutputStream")){
		return true;
	}
	else if (absname.equals("java/io/OutputStreamWriter")){
		return true;
	}
	else if (absname.equals("java/util/Random")){
		return true;
	}
	else if (absname.equals("java/io/Reader")){
		return true;
	}
	else if (absname.equals("java/lang/Runtime")){
		return true;
	}
	else if (absname.equals("java/lang/Short")){
		return true;
	}
	else if (absname.equals("java/lang/SecurityException")){
		return true;
	}
	else if (absname.equals("java/util/Stack")){
		return true;
	}
	else if (absname.equals("java/lang/String")){
		return true;
	}
	else if (absname.equals("java/lang/StringBuilder")){

		return true;
	}
	else if (absname.equals("java/lang/StringIndexOutOfBoundsException")){
		return true;
	}
	else if (absname.equals("java/lang/System")){
		return true;
	}
	else if (absname.equals("java/lang/Thread")){
		return true;
	}
	else if (absname.equals("java/lang/Throwable")){
		return true;
	}
	else if (absname.equals("java/util/TimeZone")){
		return true;
	}
	else if (absname.equals("java/io/UnsupportedEncodingException")){
		return true;
	}
	else if (absname.equals("java/io/UTFDataFormatException")){
		return true;
	}
	else if (absname.equals("java/util/Vector")){
		return true;
	}
	else if (absname.equals("java/io/Writer")){
		return true;
	}
	*/
	//System.exit(2);
	;
	return false;
}


 static public _Class isAlreadyLoaded(String classname){
	 ;
	// classLoader.loadedclassinfo.elementAt(arg0)
	 for (int i = 0; i < javaStack.vs.loadedclassinfo.size(); i++) {
		Object[] bindobj=(Object[])javaStack.vs.loadedclassinfo.elementAt(i);
		if(((String)bindobj[0]).equals(classname)){
			;
			return (_Class)bindobj[1];
		}
	}
	 ;
	 return null;
 }
 static public String whatSuperClass(String classname){
	 ;
	 String wsc=(String) javaStack.vs.clsclTable.get(classname);
	 if(wsc!=null)return wsc;
	 else if((!isCLDCClass(classname))&&wsc==null){
		 classLoader cl=new classLoader(classname+".clas");
			 cl.load();
			 return (String) javaStack.vs.clsclTable.get(classname);

	 }
	 /*for (int i = 0; i < classLoader.loadedclassinfo.size(); i++) {
			Object[] bindobj=(Object[])classLoader.loadedclassinfo.elementAt(i);
			if(((String)bindobj[0]).equals(classname)){

				return (String)bindobj[2];
			}
		}*/
		// ;
		 return null;
 }
 public static Object StartVM(String classname,String methodname, Object[] args, String scheme,boolean isInitializeStatics){
	 if(isInitializeStatics){
		 javaStack.vs=new virtualStatics();
	 }
	 classLoader.scheme=scheme;
		classLoader cl=new classLoader(classname+".clas");
		cl.load();
		_Class cinfo=cl.getClassinfo();
		Methodinfo mf=cinfo.getMethodinfo(methodname);

		javaStack.vs.applicationname=classname;





				javaStack js=new javaStack(mf,args,cinfo);



				return js.exec(mf.orders);
	}
 public static void StartIapp(String appname, Object Iapp){
	 javaStack.vs=new virtualStatics();
	 instance ins=new instance(appname, "com/nttdocomo/ui/IApplication");
		ins.sclassobj=Iapp;
		classLoader cl=new classLoader(appname+".clas");
		cl.load();
		_Class cinfo=cl.getClassinfo();
		javaStack.vs.applicationname=appname;
		Methodinfo mf=cinfo.getMethodinfo("<init>()V");
		javaStack js=new javaStack(mf,new Object[]{ins},cinfo);



		 js.exec(mf.orders);
		mf=cinfo.getMethodinfo("start()V");






				 js=new javaStack(mf,new Object[]{ins},cinfo);



			 js.exec(mf.orders);
		//javaStack.StartVM(appname, "start()V", new Object[]{ins});
 }
 public int isFieldIntialized(String name){
	 for (int i = 0; i<vs.fieldinst.size() ; i++) {
		 ;
		 Object[] bindobj=(Object[])((Vector)vs.fieldinst.elementAt(0)).elementAt(i);
		 ;
			if(((String)bindobj[0]).equals(name)){
				;
				return i;
			}
	}
	 ;
	 return -1;
 }
public  Object execMethod(String classname, String methodname,String discry, Object[] args,Object obj, int mode,boolean IVIflag,boolean IVSflag,boolean IVTflag) throws Exception{
	 _Class tmpcls=null;
	 Methodinfo minfo=null;

	 boolean iscldc=isCLDCClass(classname);
	 if(IVTflag){

			if(iscldc){//: 8 :
				;

				return doMethodbyName(classname, methodname, discry, args, obj, mode);
			}
			else{
			//: 6 :
			;
			;
			 tmpcls=isAlreadyLoaded(classname);
			 if(tmpcls==null){
				 classLoader cl=new classLoader(classname+".clas");
					cl.load();
					tmpcls=cl.getClassinfo();
			 }
			 minfo=tmpcls.getMethodinfo(methodname+discry);
			 if(minfo!=null){
				 javaStack v=new javaStack(minfo,args,tmpcls);


						Object nullor=v.exec(minfo.orders);
						;
						;
						if(nullor!=null){
							;
							//stack.push(nullor);
							;
							return nullor;
						}

			 }
			 else{//: 7 :

				 ;
				 return execMethod(tmpcls.getSuperClassName(), methodname, discry, args, obj, mode,false,IVSflag,IVTflag);
			 }
			}
		}
	 else if(IVIflag==false){//&&(!obj.getClass().getName().equals("KWN.vmonkvm.instance"))
		 ;
		 ;
		 ;
		 ;

	if(IVSflag&&iscldc){//: 1 :
		;
		return doMethodbyName(classname, methodname, discry, args, obj, mode);
	}
	else if(((!obj.getClass().getName().equals("KWN.vmonkvm.instance")))&&iscldc){//: 2 :
		;

		Object tempo= doMethodbyName(classname, methodname, discry, args, obj, mode);
		;
		return tempo;
	}
	else if(((obj.getClass().getName().equals("KWN.vmonkvm.instance")))&&iscldc){//: 3 :
		;
		;
		Object tempo=doMethodbyName(classname, methodname, discry, args, ((instance)obj).sclassobj, mode);
		;
		return tempo;
	}
else if(obj.getClass().getName().equals("KWN.vmonkvm.instance")){//: 4 :
	;
	;
	 tmpcls=isAlreadyLoaded(classname);
	 if(tmpcls==null){
		 classLoader cl=new classLoader(classname+".clas");
			cl.load();
			tmpcls=cl.getClassinfo();

	 }
	 minfo=tmpcls.getMethodinfo(methodname+discry);
	 if(minfo!=null){
		 javaStack v=new javaStack(minfo,args,tmpcls);


				Object nullor=v.exec(minfo.orders);
				;
				;
				if(nullor!=null){
					;
					//stack.push(nullor);
					;
					return nullor;
				}

	 }
	 else{//: 5 :

		 ;
		 return execMethod(tmpcls.getSuperClassName(), methodname, discry, args, obj, mode,false,IVSflag,IVTflag);
	 }

}

else{
	;
	System.exit(0);
	return null;
}


	/*	// original argorizm
		 if(isCLDCClass(classname)){
		 doMethodbyName(classname, methodname, discry, args, obj, mode);
	 }
	 else{
		 tmpcls=isAlreadyLoaded(classname);
		 if(tmpcls==null){
			 classLoader cl=new classLoader(classname+".clas");
				cl.load();
				tmpcls=cl.getClassinfo();
		 }
		 minfo=tmpcls.getMethodinfo(methodname);
		 if(minfo!=null){
			 javaStack v=new javaStack(minfo,args,tmpcls);


					Object nullor=v.exec(minfo.orders);
					;
					;
					if(nullor!=null){
						;
						stack.push(nullor);
					}
		 }
		 else{
			 execMethod(tmpcls.getSuperClassName(), methodname, discry, args, obj, mode,false);
		 }
	 }






*/

 }

	 else {//invokeinterface flag on
	 if(isCLDCClass(classname)){;
	 									   ;
	 									   ;
	 									  // System.exit(2);
	 									 return doMethodbyName(classname, methodname, discry, args, obj, mode);

	 }
	 ;
	 if(obj.getClass().getName().equals("KWN.vmonkvm.instance")){
	 tmpcls=isAlreadyLoaded(classname);
	 if(tmpcls==null){
		 classLoader cl=new classLoader(classname+".clas");
			cl.load();
			tmpcls=cl.getClassinfo();
	 }
	 minfo=tmpcls.getMethodinfo(methodname+discry);
	 if(minfo!=null){
		 javaStack v=new javaStack(minfo,args,tmpcls);


				Object nullor=v.exec(minfo.orders);
				;
				;
				if(nullor!=null){
					;
					//stack.push(nullor);
					return nullor;
				}

	 }
	 else{
		 return execMethod(tmpcls.getSuperClassName(), methodname, discry, args, obj, mode,false,IVSflag,IVTflag);

	 }

	 }
 }
return null;

 }
 public boolean Instanceof(Object obj,String objclassname,String compname){
if(obj==null) return false;
	 if(obj.getClass().getName().equals("KWN.vmonkvm.CLDCinstance")){
		 ;
		 if(!isCLDCClass(compname)){
			 ;
			 return false;
		 		 }
		else{
			try {
				;
				;

				return Class.forName(compname.replace('/', '.')).isInstance(((CLDCinstance)obj).cldcobj);
			} catch (ClassNotFoundException e) {
				// TODO ?ｽ?ｽ?ｽ?ｽ?ｽ?ｽ?ｽ?ｽ?ｽ?ｽ?ｽ黷ｽ catch ?ｽu?ｽ?ｽ?ｽb?ｽN checkcast
			;
				e.printStackTrace();
				return false;
			}
		}

	 }
	 else if(obj.getClass().getName().equals("KWN.vmonkvm.instance")){
		 ;
		 //if(objclassname==null)
		//objclassname=((instance)obj).classname;
		 if(objclassname.equals(compname))return true;
		 else {
			if(whatsuperInterface(objclassname, compname))return true;


		 }
		 ;
		 if(isCLDCClass(objclassname)){
			 ;
			 if(isCLDCClass(compname)){
				 ;
			 try {
				return Class.forName(compname.replace('/', '.')).isInstance(((instance)obj).sclassobj);
			} catch (ClassNotFoundException e) {
				// TODO ?ｽ?ｽ?ｽ?ｽ?ｽ?ｽ?ｽ?ｽ?ｽ?ｽ?ｽ黷ｽ catch ?ｽu?ｽ?ｽ?ｽb?ｽN
				e.printStackTrace();
				return false;
			}
		 }
			 else{
				 ;
				 return false;
			 }
		 }
		 else{
			 if(objclassname.equals(compname)){
				 ;
				 return true;
			 }
			 ;
			 return Instanceof(obj, whatSuperClass(objclassname), compname);
		 }
	 }
	 if(obj.getClass().getName().equals("KWN.vmonkvm.NonNativeException")){
		 ;
			;
			String esclass=whatSuperClass(((instance)((NonNativeException)obj).inst).classname);

				if((compname).equals(((instance)((NonNativeException)obj).inst).classname)){

					 ;
						return true;

				}else{
					if(whatsuperInterface(((instance)((NonNativeException)obj).inst).classname, compname))return true;
					;
					if(returnExcepSclass(obj.getClass().getName(), ((instance)((NonNativeException)obj).inst).classname, (instance)((NonNativeException)obj).inst))
					{
						;
						return true;
					}
					else {
						;
						return false;
					}

				}



		}


		else{
			;
			try {
				return Class.forName(compname.replace('/', '.')).isInstance(obj);
			} catch (ClassNotFoundException e) {
				// TODO ?ｽ?ｽ?ｽ?ｽ?ｽ?ｽ?ｽ?ｽ?ｽ?ｽ?ｽ黷ｽ catch ?ｽu?ｽ?ｽ?ｽb?ｽN
				e.printStackTrace();
				return false;
			}
		}




 }
 static public boolean  whatsuperInterface(String classname,String compname){

;
		;

		 String wsc=(String) javaStack.vs.clsclTable.get(classname);
		 if(wsc!=null);
		 else if((!isCLDCClass(classname))&&wsc==null){
			 classLoader cl=new classLoader(classname+".clas");
				 cl.load();


		 }

		//	;
		Object[] interfacearry=(Object[])javaStack.vs.InterfaceTable.get(classname+".clas");
		if(interfacearry==null){;}
		if((interfacearry!=null)){
			;
			for (int i = 0; i < interfacearry.length; i++) {
				;
				if(interfacearry[i].equals(compname)) {
					;return true;
					}
				else{
					return whatsuperInterface((String)interfacearry[i],compname);
				}

			}
		}else return false;
		return false;
		 }
 static boolean returnExcepSclass(String target,String classname,instance ins){
	 if(isCLDCClass(classname)&&isCLDCClass(target)){
		try {
			if(Class.forName(target.replace('/', '.')).isInstance(ins.sclassobj))return true;
			else return false;
		} catch (ClassNotFoundException e) {
			// TODO ?ｽ?ｽ?ｽ?ｽ?ｽ?ｽ?ｽ?ｽ?ｽ?ｽ?ｽ黷ｽ catch ?ｽu?ｽ?ｽ?ｽb?ｽN // getStatic
			e.printStackTrace();
		}
	 }
	 else if(target.equals(whatSuperClass(classname))){
		 return true;
	 }
	 else returnExcepSclass(target, classname,ins);
	 return false;
 }
 public static int pow(int x, int y){
     int intResult;

     intResult = 1;
     for (int j=1; j<=y; j++){
         intResult = intResult * x;
     }
     return intResult;
 }
 public static int pow(int x, long y){
     int intResult;

     intResult = 1;
     for (int j=1; j<=y; j++){
         intResult = intResult * x;
     }
     return intResult;
 }
 public static int arraylength(Object array){
	 char[] ch=array.getClass().getName().toCharArray();
	 int count=0;
	 for(int i=0;i<ch.length;i++){
		 if(ch[i]!='['){
			 count=i;
			 break;
		 }
	 }
	 ;
	 ;
	 if(array.getClass().isInstance(new Object[3])){
	 return ((Object[])array).length;
	 }
	 else if(array.getClass().getName().endsWith("I")){

				int[] obj1=(int[])array;
				return obj1.length;

	 }
	 else if(array.getClass().getName().endsWith("S")){

				short[] obj1=(short[])array;
				return obj1.length;

	 }
	 else if(array.getClass().getName().endsWith("B")){

				byte[] obj1=(byte[])array;
				return obj1.length;

	 }
	 else if(array.getClass().getName().endsWith("Z")){

				boolean[] obj1=(boolean[])array;
				return obj1.length;

	 }
	 else if(array.getClass().getName().endsWith("J")){

				long[] obj1=(long[])array;
				return obj1.length;

	 }
	 else if(array.getClass().getName().endsWith("D")){

				double[] obj1=(double[])array;
				return obj1.length;

	 }
	 else if(array.getClass().getName().endsWith("F")){

				float[] obj1=(float[])array;
				return obj1.length;

	 }
	 else if(array.getClass().getName().endsWith("C")){

				char[] obj1=(char[])array;
				return obj1.length;

	 }
	return -1;

}


 public static int ByteToBigInteger(byte[] b) throws IOException{
	 DataInputStream diss= new DataInputStream(new ByteArrayInputStream(classLoader.bytecopy(b)));
		//	by4=buf[mp2][1];
		//	;
			byte[] bs=new byte[4];





					diss.read(bs);
					int n = 0;
					for (int x = 0;x< 4;x++)
					n = (n << 8) | (bs[x] & 0xff);
					return n;
 }
 public static  int read8bitsToSignedShort(byte[] bytecode, int address)
 {
     int i_b0 = bytecode[++address] & 0xFF;
     int i_b1 = bytecode[++address] & 0xFF;

     return (short) ((i_b0 << 8) | i_b1);
 }
public static int read16bitsToSignedInteger(byte[] bytecode, int address)
 {
     int i_b0 = bytecode[++address] & 0xFF;
     int i_b1 = bytecode[++address] & 0xFF;
     int i_b2 = bytecode[++address] & 0xFF;
     int i_b3 = bytecode[++address] & 0xFF;

     return (i_b0 << 24) | (i_b1 << 16) | (i_b2 << 8) | i_b3;
 }

}
