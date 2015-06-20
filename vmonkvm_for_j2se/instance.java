import java.util.Hashtable;
import java.util.Vector;


public class instance {
	//Vector fields=new Vector();
	Hashtable fields =new Hashtable();
	String classname;
	String superclassname;
	Object sclassobj;
	public instance(String classname,String superclassname){
		this.classname=classname;
		this.superclassname=superclassname;
		//sclassobj=sclass(superclassname);

	}
	public void setField(String name,String discry,Object value){
	//	int inior=isFieldIntialized(name);
		Object[] objs=(Object[]) fields.get(name);
		if(objs==null){
			//Object[] newfield=new Object[3];
			Object[] newfield=new Object[2];

			//newfield[0]=name;
			//newfield[0]=discry;
			//newfield[1]=value;
			newfield[0]=discry;
			newfield[1]=value;
			fields.put(name,newfield);

		}
		else{
			System.out.println("modify field");

		objs[1]=value;
		}
	}
	///public int fieldInitializer(String name,String discry,Object value){
	//	return isFieldIntialized(name);
	//}
	public Object getField(String name,String diskry){
		//int inior=isFieldIntialized(name);
		Object obj=isFieldIntialized(name);
		if(obj==null){
			if(diskry.equals("I")){
				return new Integer(0);
			}
			else	if(diskry.equals("S")){
				return new Integer(0);
			}
			else	if(diskry.equals("B")){
				return new Integer(0);
			}
			else	if(diskry.equals("Z")){
				return new Integer(0);
			}
			else	if(diskry.equals("C")){
				return new Integer(0);
			}
			else	if(diskry.equals("J")){
				return new Long(0);
			}
			else	if(diskry.equals("F")){
				return new Float(0);
			}
			else	if(diskry.equals("D")){
				return new Double(0);
			}

			else	return null;
		}
		else{
			return obj;
		}
	}
	 public Object isFieldIntialized(String name){/*
		 for (int i = 0; i<fields.size() ; i++) {

			 Object[] bindobj=(Object[])fields.elementAt(i);

				if(((String)bindobj[0]).equals(name)){
					System.out.println("field initialized");
					return i;
				}
		}
		 System.out.println("field not initialized");
		 return -1;
		 */
		 Object[] obj=(Object[]) fields.get(name);
		 if(obj==null||((Object[])obj)[1]==null){
			 System.out.println("no such field or not initialized yet");
			 return null;
		 }
		 else return  ((Object[])obj)[1];
	 }

public String toString() {
	// TODO 自動生成されたメソッド・スタブ
	return classname+" : instance";
}

}
