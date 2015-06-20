import java.util.Hashtable;
import java.util.Vector;


public class staticfield {
		//static private Hashtable staticfields=new Hashtable();
		//static public Object currentDisplay;
		//static public String applicationname="";
		static Object getStaticField(String clas,String name){
			try{
				System.out.println("static field classname: "+clas);
				System.out.println("static field field name: "+name);
				if(javaStack.isCLDCClass(clas)){return javaStack.getStaticFieldbyName(clas+"/"+name);}
			System.out.println("staticfield:"+clas+":"+name);

			Object stf=javaStack.vs.staticfields.get(clas+"."+name);
		//	if(!javaStack.isCLDCClass(clas)){

			if(stf!=null&&stf.equals("hashtablenull"))return null;
			System.out.println("stf is not hashtabenull");
			if(stf==null){
				System.out.println("static field not exist yet");
			/*	for (int i = 0; i < _Class.loadedclass.size(); i++) {
					Object[] stfa=(Object[])_Class.loadedclass.elementAt(i);
					String spcln=((_Class)stfa[1]).getSuperClassName();
					if(!javaStack.isCLDCClass(spcln)){
						if(javaStack.isAlreadyLoaded(spcln)!=null)return getStaticField(spcln, name);
"bug"
						else{
							System.out.println("coudnt find static fields classs spcl.");
							javaStack.isAlreadyLoaded(spcln);return getStaticField(spcln, name);
						}
					}

				}*/
				_Class cls=javaStack.isAlreadyLoaded(clas);
				if(cls==null){
					System.out.println("start class load in staticfield");
					classLoader cl=new classLoader(clas +
					".clas");
			cl.load();
			_Class cinfo=cl.getClassinfo();
			return getStaticField(clas, name);
				}
				else{
					return getStaticField(cls.getSuperClassName(), name);
				}

			}
			else{System.out.println("static field exist");}
			return stf;
		//}
		//h	else return "loaderror";
			}
			catch(Exception e){
				System.out.println("stackendmarker");
				System.exit(2);
				return "stackendmarker";

			}
		}
		static void setStaticField(String clas,String name,Object field){
			System.out.println(clas+"."+name);
			if(field==null)
				javaStack.vs.staticfields.put(clas+"."+name, "hashtablenull");
			else
				javaStack.vs.staticfields.put(clas+"."+name, field);

		}

}
