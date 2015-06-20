package KWN.vmonkvm;

import java.util.Hashtable;
import java.util.Vector;


public class virtualStatics {

	public Hashtable staticfields=new Hashtable();
	public Object currentDisplay;
	public String applicationname="";
	public Vector fieldinst=new Vector();
	public Vector loadedclass=new Vector();
	public  Hashtable clsclTable=new Hashtable();
	public  Hashtable InterfaceTable=new Hashtable();
	public Vector loadedclassinfo=new Vector();
	public Hashtable fieldtable=new Hashtable();
	public Hashtable methodtable=new Hashtable();

	public virtualStatics(){
	staticfields=new Hashtable();
		//public Object currentDisplay;
		applicationname="";
		fieldinst=new Vector();
		loadedclass=new Vector();
		clsclTable=new Hashtable();
		InterfaceTable=new Hashtable();
		loadedclassinfo=new Vector();
		fieldtable=new Hashtable();
		methodtable=new Hashtable();

	}


}
