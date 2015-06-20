

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;



public class iStream extends InputStream  {
	InputStream ins;
	DataInputStream di;
	private int position=-873;
	String address;
	byte[] inby;
	boolean isbyte=false;
	boolean isaddress=false;
	boolean isinst=false;

	static public final int STREAM_SEEK_SET	= 0;
	  static public final int STREAM_SEEK_CUR	= 1;

	public iStream(String address){
		try {
			this.address=address;
			isaddress=true;
			di=new DataInputStream(new FileInputStream(address));
		//	di.mark(0);
		} catch (IOException e) {
			// TODO �����������ꂽ catch �u���b�N
			e.printStackTrace();
		}
	}
	public iStream(InputStream ins){
		this.ins=ins;
		isinst=true;
		di=new DataInputStream(ins);
	}
	public iStream(byte[] inby){
		//di=new ByteBuffer(in);
		this.inby=inby;
		isbyte=true;
		di=new DataInputStream(new ByteArrayInputStream(inby));

	}




	 public int Seek(int offset, int seekOrigin)  throws java.io.IOException {


		 if (seekOrigin == STREAM_SEEK_SET) {

			 ///di.mark(0);
			// di.reset();
			 di.close();
			 if(isbyte){
				 di=new DataInputStream(new ByteArrayInputStream(inby));
			 }
			 else if(isaddress){
			 di=new DataInputStream(new FileInputStream(address));
			 }
			 else if(isinst){
				 di=new DataInputStream(ins);
			 }
	        	for(int i=0;i<offset;i++){
	        		position+= di.read();
	             }
	             //position+=offset;
	        }
	        else if (seekOrigin == STREAM_SEEK_CUR) {
	           // position+=di.skip(offset + position);

	          // int f=(int) offset;
	        	position=di.skipBytes((int) offset);
	        	//for(int i=0;i<offset+position;i++){
	        		//position+= di.read();
	            // }

	        }
	        return position;
	    }

	    public int read() throws java.io.IOException {
	    	int tmp=di.read();
	    	position+=tmp;
	        return tmp;

	    }

	    public int read(byte [] data, int off, int size) throws java.io.IOException {
	    	int tmp=di.read(data,off,size);
	    	position+=tmp;
	    	return tmp;

	    }

	    public int read(byte [] data, int size) throws java.io.IOException {
	    	int tmp= di.read(data,0,size);
	    	position+=tmp;
	        return tmp;
	    }
	    public int read(byte[] data)  throws java.io.IOException{
	    	int tmp=di.read(data);
	    	position+=tmp;
	        return tmp;
	    }


	    public void close() throws java.io.IOException {
	        di.close();
	       // di = null;

	    }
	    public long getCurrentPos(){return position;}


}