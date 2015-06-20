package KWN.vmonkvm;

import java.util.Hashtable;


public class Methodinfo {
	public String name;
	public String descripta;
	public byte[] orders;
	public int max_stack;
	public int max_locals;
	public  Object[][] exepinfo;
	public Hashtable values_of_quick_code=new Hashtable();//experimental, not yet implemented.

}
