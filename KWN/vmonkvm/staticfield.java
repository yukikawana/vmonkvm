package KWN.vmonkvm;

import java.util.Hashtable;
import java.util.Vector;


public class staticfield {
		//static private Hashtable staticfields=new Hashtable();
		//static public Object currentDisplay;
		//static public String applicationname="";
		static Object getStaticField(String clas,String name){
			try{
				;
				;
				if(javaStack.isCLDCClass(clas)){return javaStack.getStaticFieldbyName(clas+"/"+name);}
			;

			Object stf=javaStack.vs.staticfields.get(clas+"."+name);
		//	if(!javaStack.isCLDCClass(clas)){

			if(stf!=null&&stf.equals("hashtablenull"))return null;
			;
			if(stf==null){
				;
			/*	for (int i = 0; i < _Class.loadedclass.size(); i++) {
					Object[] stfa=(Object[])_Class.loadedclass.elementAt(i);
					String spcln=((_Class)stfa[1]).getSuperClassName();
					if(!javaStack.isCLDCClass(spcln)){
						if(javaStack.isAlreadyLoaded(spcln)!=null)return getStaticField(spcln, name);
"bug"
						else{
							;
							javaStack.isAlreadyLoaded(spcln);return getStaticField(spcln, name);
						}
					}

				}*/
				_Class cls=javaStack.isAlreadyLoaded(clas);
				if(cls==null){
					;
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
			else{;}
			return stf;
		//}
		//h	else return "loaderror";
			}
			catch(Exception e){
				;
				System.exit(2);
				return "stackendmarker";

			}
		}
		static void setStaticField(String clas,String name,Object field){
			;
			if(field==null)
				javaStack.vs.staticfields.put(clas+"."+name, "hashtablenull");
			else
				javaStack.vs.staticfields.put(clas+"."+name, field);

		}

}
