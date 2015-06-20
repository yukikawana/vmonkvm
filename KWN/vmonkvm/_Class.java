package KWN.vmonkvm;

import java.util.Vector;


public class _Class {

	private String classname;
	private Vector mf;
	private byte[][][] ContentPool;
	private Vector fi;
	//static Vector fieldinst=new Vector();
	//static Vector loadedclass=new Vector();
	private String superclassname;
	public _Class(Vector mf,
			byte[][][] cp,
			Vector fi,
			String classname,
			String superclassname){
		this.mf=mf;
		this.ContentPool=cp;
		this.fi=fi;
		this.classname=classname;
		this.superclassname=superclassname;
	}
	public _Class(){}
	public Methodinfo getMethodinfo(String name){
		/*
		Methodinfo m=null;
		int nem=0;
		nem=SearchMethodbyName(mf, name);
		if(nem<0)return m;
		else{
		m= (Methodinfo) mf.elementAt(nem);
		return m;
		}
*/
		return (Methodinfo) javaStack.vs.methodtable.get(classname+name);
	}
	public byte[][][] getContentPool(){
		return ContentPool;
	}
	public String getClassName(){
		return classname;
	}
	public String getSuperClassName(){
		return superclassname;
	}
	public Fieldinfo getFieldinfo(String name){
		/*
		Fieldinfo m=null;
		int nem=0;
		nem=SearchFieldbyName(mf, name);
		if(nem<0)return m;
		else{
		m= (Fieldinfo) mf.elementAt(nem);
		return m;
		}*/
		return (Fieldinfo) javaStack.vs.fieldtable.get(classname+name);
	}
	public Vector returnMF(){
		return mf;
	}

	static int SearchMethodbyName(Vector vc,String name){
		;

		for (int i = 0; i < vc.size(); i++) {
			//;
			if((((Methodinfo)vc.elementAt(i)).name+((Methodinfo)vc.elementAt(i)).descripta).equals(name)){
				return i;
			}
		}


		;
		return -1;
	}

	static int SearchFieldbyName(Vector vc,String name){
		for (int i = 0; i < vc.size(); i++) {
			if(((Fieldinfo)vc.elementAt(i)).name.equals(name)){
				return i;
			}
		}

		;
		return -1;
	}
}
