import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Random;

public class domethod {
public static Object doMethodbyName(String classname,String methodname,String discry,Object[] args,Object obj,int mode)throws Exception{
boolean[] bl=new boolean[args.length]
; double[] d=new double[args.length]
; byte[] b=new byte[args.length]
; short[] s=new short[args.length]
; float[] f=new float[args.length]
; long[] l=new long[args.length]
; int[] in=new int[args.length]
; char[] c=new char[args.length]
; Object[] o=new Object[args.length];
//StringBuffer//java.lang.StringBuffer

if(classname.equals("java/lang/StringBuilder")){
//constructor_summary
if(methodname.equals("<init>")&&classname.replace('/','.').equals("java.lang.StringBuilder")){
if ((methodname+":"+discry).equals("<init>:()V")){

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.lang.StringBuffer();return null;}
else{
((CLDCinstance)obj).cldcobj=new java.lang.StringBuffer() ;return null;}
}

else if ((methodname+":"+discry).equals("<init>:(I)V")){
in[0]=((Integer)args[1]).intValue();

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.lang.StringBuffer(in[0]);return null;}
else{
((CLDCinstance)obj).cldcobj=new java.lang.StringBuffer(in[0]) ;return null;}
}

else if ((methodname+":"+discry).equals("<init>:(Ljava/lang/String;)V")){
	System.out.println("init sbu");
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.lang.StringBuffer((java.lang.String)o[0]);return null;}
else{
((CLDCinstance)obj).cldcobj=new java.lang.StringBuffer((java.lang.String)o[0]) ;return null;}
}
}

//Method Summary
else if((methodname+":"+discry).equals("append:(Z)Ljava/lang/StringBuilder;")){
bl[0]=(((Integer)args[1]).intValue()==0)?false:true;

if(obj.getClass().getName().equals("instance")){return new CLDCinstance( ((java.lang.StringBuffer)((instance)obj).sclassobj).append(bl[0]) );}
else{
return new CLDCinstance( ((java.lang.StringBuffer)obj).append(bl[0]) );
}
}
else if((methodname+":"+discry).equals("append:(C)Ljava/lang/StringBuilder;")){
c[0]=(char)((Integer)args[1]).intValue();
if(obj.getClass().getName().equals("instance")){return new CLDCinstance( ((java.lang.StringBuffer)((instance)obj).sclassobj).append(c[0]) );}
else{
return new CLDCinstance( ((java.lang.StringBuffer)obj).append(c[0]) );
}
}
else if((methodname+":"+discry).equals("append:([C)Ljava/lang/StringBuilder;")){

if(obj.getClass().getName().equals("instance")){return new CLDCinstance( ((java.lang.StringBuffer)((instance)obj).sclassobj).append((char[])args[1]) );}
else{
return new CLDCinstance( ((java.lang.StringBuffer)obj).append((char[])args[1]) );
}
}
else if((methodname+":"+discry).equals("append:([CII)Ljava/lang/StringBuilder;")){
in[0]=((Integer)args[2]).intValue();
in[1]=((Integer)args[3]).intValue();

if(obj.getClass().getName().equals("instance")){return new CLDCinstance( ((java.lang.StringBuffer)((instance)obj).sclassobj).append((char[])args[1],in[0],in[1]) );}
else{
return new CLDCinstance( ((java.lang.StringBuffer)obj).append((char[])args[1],in[0],in[1]) );
}
}
else if((methodname+":"+discry).equals("append:(D)Ljava/lang/StringBuilder;")){
d[0]=((Double)args[1]).doubleValue();
if(obj.getClass().getName().equals("instance")){return new CLDCinstance( ((java.lang.StringBuffer)((instance)obj).sclassobj).append(d[0]) );}
else{
return new CLDCinstance( ((java.lang.StringBuffer)obj).append(d[0]) );
}
}
else if((methodname+":"+discry).equals("append:(F)Ljava/lang/StringBuilder;")){
f[0]=((Float)args[1]).floatValue();
if(obj.getClass().getName().equals("instance")){return new CLDCinstance( ((java.lang.StringBuffer)((instance)obj).sclassobj).append(f[0]) );}
else{
return new CLDCinstance( ((java.lang.StringBuffer)obj).append(f[0]) );
}
}
else if((methodname+":"+discry).equals("append:(I)Ljava/lang/StringBuilder;")){
in[0]=((Integer)args[1]).intValue();

if(obj.getClass().getName().equals("instance")){return new CLDCinstance( ((java.lang.StringBuffer)((instance)obj).sclassobj).append(in[0]) );}
else{
return new CLDCinstance( ((java.lang.StringBuffer)obj).append(in[0]) );
}
}
else if((methodname+":"+discry).equals("append:(J)Ljava/lang/StringBuilder;")){
l[0]=((Long)args[1]).longValue();
if(obj.getClass().getName().equals("instance")){return new CLDCinstance( ((java.lang.StringBuffer)((instance)obj).sclassobj).append(l[0]) );}
else{
return new CLDCinstance( ((java.lang.StringBuffer)obj).append(l[0]) );
}
}
else if((methodname+":"+discry).equals("append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;")){
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}

if(obj.getClass().getName().equals("instance")){return new CLDCinstance( ((java.lang.StringBuffer)((instance)obj).sclassobj).append((java.lang.Object)o[0]) );}
else{
return new CLDCinstance( ((java.lang.StringBuffer)obj).append((java.lang.Object)o[0]) );
}
}
else if((methodname+":"+discry).equals("append:(Ljava/lang/String;)Ljava/lang/StringBuilder;")){
	System.out.println("obj class "+obj.getClass().getName());
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}
System.out.println("obj class "+obj.getClass().getName()+" : "+o[0].getClass().getName());

if(obj.getClass().getName().equals("instance")){return new CLDCinstance( ((java.lang.StringBuffer)((instance)obj).sclassobj).append((java.lang.String)o[0]) );}
else{
return new CLDCinstance( ((java.lang.StringBuffer)obj).append((java.lang.String)o[0]) );
}
}
else if((methodname+":"+discry).equals("capacity:()I")){

if(obj.getClass().getName().equals("instance")){return new Integer( ((java.lang.StringBuffer)((instance)obj).sclassobj).capacity() );}
else{
return new Integer( ((java.lang.StringBuffer)obj).capacity() );
}
}
else if((methodname+":"+discry).equals("charAt:(I)C")){
in[0]=((Integer)args[1]).intValue();

if(obj.getClass().getName().equals("instance")){return new Integer((int) ((java.lang.StringBuffer)((instance)obj).sclassobj).charAt(in[0]) );}
else{
return new Integer((int) ((java.lang.StringBuffer)obj).charAt(in[0]) );
}
}
else if((methodname+":"+discry).equals("delete:(II)Ljava/lang/StringBuilder;")){
in[0]=((Integer)args[1]).intValue();
in[1]=((Integer)args[2]).intValue();

if(obj.getClass().getName().equals("instance")){return new CLDCinstance( ((java.lang.StringBuffer)((instance)obj).sclassobj).delete(in[0],in[1]) );}
else{
return new CLDCinstance( ((java.lang.StringBuffer)obj).delete(in[0],in[1]) );
}
}
else if((methodname+":"+discry).equals("deleteCharAt:(I)Ljava/lang/StringBuilder;")){
in[0]=((Integer)args[1]).intValue();

if(obj.getClass().getName().equals("instance")){return new CLDCinstance( ((java.lang.StringBuffer)((instance)obj).sclassobj).deleteCharAt(in[0]) );}
else{
return new CLDCinstance( ((java.lang.StringBuffer)obj).deleteCharAt(in[0]) );
}
}
else if((methodname+":"+discry).equals("ensureCapacity:(I)V")){
in[0]=((Integer)args[1]).intValue();

if(obj.getClass().getName().equals("instance")){ ((java.lang.StringBuffer)((instance)obj).sclassobj).ensureCapacity(in[0]) ;return null;}
else{
((java.lang.StringBuffer)obj).ensureCapacity(in[0]) ;return null;
}
}
else if((methodname+":"+discry).equals("getChars:(II[CI)V")){
in[0]=((Integer)args[1]).intValue();
in[1]=((Integer)args[2]).intValue();
in[2]=((Integer)args[4]).intValue();

if(obj.getClass().getName().equals("instance")){ ((java.lang.StringBuffer)((instance)obj).sclassobj).getChars(in[0],in[1],(char[])args[3],in[2]) ;return null;}
else{
((java.lang.StringBuffer)obj).getChars(in[0],in[1],(char[])args[3],in[2]) ;return null;
}
}
else if((methodname+":"+discry).equals("insert:(IZ)Ljava/lang/StringBuilder;")){
in[0]=((Integer)args[1]).intValue();
bl[0]=(((Integer)args[2]).intValue()==0)?false:true;

if(obj.getClass().getName().equals("instance")){return new CLDCinstance( ((java.lang.StringBuffer)((instance)obj).sclassobj).insert(in[0],bl[0]) );}
else{
return new CLDCinstance( ((java.lang.StringBuffer)obj).insert(in[0],bl[0]) );
}
}
else if((methodname+":"+discry).equals("insert:(IC)Ljava/lang/StringBuilder;")){
in[0]=((Integer)args[1]).intValue();
c[0]=(char)((Integer)args[2]).intValue();
if(obj.getClass().getName().equals("instance")){return new CLDCinstance( ((java.lang.StringBuffer)((instance)obj).sclassobj).insert(in[0],c[0]) );}
else{
return new CLDCinstance( ((java.lang.StringBuffer)obj).insert(in[0],c[0]) );
}
}
else if((methodname+":"+discry).equals("insert:(I[C)Ljava/lang/StringBuilder;")){
in[0]=((Integer)args[1]).intValue();

if(obj.getClass().getName().equals("instance")){return new CLDCinstance( ((java.lang.StringBuffer)((instance)obj).sclassobj).insert(in[0],(char[])args[2]) );}
else{
return new CLDCinstance( ((java.lang.StringBuffer)obj).insert(in[0],(char[])args[2]) );
}
}
else if((methodname+":"+discry).equals("insert:(ID)Ljava/lang/StringBuilder;")){
in[0]=((Integer)args[1]).intValue();
d[0]=((Double)args[2]).doubleValue();
if(obj.getClass().getName().equals("instance")){return new CLDCinstance( ((java.lang.StringBuffer)((instance)obj).sclassobj).insert(in[0],d[0]) );}
else{
return new CLDCinstance( ((java.lang.StringBuffer)obj).insert(in[0],d[0]) );
}
}
else if((methodname+":"+discry).equals("insert:(IF)Ljava/lang/StringBuilder;")){
in[0]=((Integer)args[1]).intValue();
f[0]=((Float)args[2]).floatValue();
if(obj.getClass().getName().equals("instance")){return new CLDCinstance( ((java.lang.StringBuffer)((instance)obj).sclassobj).insert(in[0],f[0]) );}
else{
return new CLDCinstance( ((java.lang.StringBuffer)obj).insert(in[0],f[0]) );
}
}
else if((methodname+":"+discry).equals("insert:(II)Ljava/lang/StringBuilder;")){
in[0]=((Integer)args[1]).intValue();
in[1]=((Integer)args[2]).intValue();

if(obj.getClass().getName().equals("instance")){return new CLDCinstance( ((java.lang.StringBuffer)((instance)obj).sclassobj).insert(in[0],in[1]) );}
else{
return new CLDCinstance( ((java.lang.StringBuffer)obj).insert(in[0],in[1]) );
}
}
else if((methodname+":"+discry).equals("insert:(IJ)Ljava/lang/StringBuilder;")){
in[0]=((Integer)args[1]).intValue();
l[0]=((Long)args[2]).longValue();
if(obj.getClass().getName().equals("instance")){return new CLDCinstance( ((java.lang.StringBuffer)((instance)obj).sclassobj).insert(in[0],l[0]) );}
else{
return new CLDCinstance( ((java.lang.StringBuffer)obj).insert(in[0],l[0]) );
}
}
else if((methodname+":"+discry).equals("insert:(ILjava/lang/Object;)Ljava/lang/StringBuilder;")){
in[0]=((Integer)args[1]).intValue();
if(args[2].getClass().getName().equals("instance")){
o[0]=((instance)args[2]).sclassobj;
}
else if(args[2].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[2]).cldcobj;
}

if(obj.getClass().getName().equals("instance")){return new CLDCinstance( ((java.lang.StringBuffer)((instance)obj).sclassobj).insert(in[0],(java.lang.Object)o[0]) );}
else{
return new CLDCinstance( ((java.lang.StringBuffer)obj).insert(in[0],(java.lang.Object)o[0]) );
}
}
else if((methodname+":"+discry).equals("insert:(ILjava/lang/String;)Ljava/lang/StringBuilder;")){
in[0]=((Integer)args[1]).intValue();
if(args[2].getClass().getName().equals("instance")){
o[0]=((instance)args[2]).sclassobj;
}
else if(args[2].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[2]).cldcobj;
}

if(obj.getClass().getName().equals("instance")){return new CLDCinstance( ((java.lang.StringBuffer)((instance)obj).sclassobj).insert(in[0],(java.lang.String)o[0]) );}
else{
return new CLDCinstance( ((java.lang.StringBuffer)obj).insert(in[0],(java.lang.String)o[0]) );
}
}
else if((methodname+":"+discry).equals("length:()I")){

if(obj.getClass().getName().equals("instance")){return new Integer( ((java.lang.StringBuffer)((instance)obj).sclassobj).length() );}
else{
return new Integer( ((java.lang.StringBuffer)obj).length() );
}
}
else if((methodname+":"+discry).equals("reverse:()Ljava/lang/StringBuilder;")){

if(obj.getClass().getName().equals("instance")){return new CLDCinstance( ((java.lang.StringBuffer)((instance)obj).sclassobj).reverse() );}
else{
return new CLDCinstance( ((java.lang.StringBuffer)obj).reverse() );
}
}
else if((methodname+":"+discry).equals("setCharAt:(IC)V")){
in[0]=((Integer)args[1]).intValue();
c[0]=(char)((Integer)args[2]).intValue();
if(obj.getClass().getName().equals("instance")){ ((java.lang.StringBuffer)((instance)obj).sclassobj).setCharAt(in[0],c[0]) ;return null;}
else{
((java.lang.StringBuffer)obj).setCharAt(in[0],c[0]) ;return null;
}
}
else if((methodname+":"+discry).equals("setLength:(I)V")){
in[0]=((Integer)args[1]).intValue();

if(obj.getClass().getName().equals("instance")){ ((java.lang.StringBuffer)((instance)obj).sclassobj).setLength(in[0]) ;return null;}
else{
((java.lang.StringBuffer)obj).setLength(in[0]) ;return null;
}
}
else if((methodname+":"+discry).equals("toString:()Ljava/lang/String;")){

if(obj.getClass().getName().equals("instance")){return new CLDCinstance( ((java.lang.StringBuffer)((instance)obj).sclassobj).toString() );}
else{
return new CLDCinstance( ((java.lang.StringBuffer)obj).toString() );
}
}
return null;
}
return doMethodbyName1(classname,methodname,discry,args,obj,mode);
}
public static Object doMethodbyName1(String classname,String methodname,String discry,Object[] args,Object obj,int mode)throws Exception{
boolean[] bl=new boolean[args.length];
double[] d=new double[args.length];
byte[] b=new byte[args.length];
short[] s=new short[args.length];
float[] f=new float[args.length];
long[] l=new long[args.length];
int[] in=new int[args.length];
char[] c=new char[args.length];
Object[] o=new Object[args.length];
//Writer//java.io.Writer
if(Class.forName("java.io.Writer").isAssignableFrom(Class.forName(classname.replace('/','.')))){
//print this is abstract class
//constructor_summary
if(methodname.equals("<init>")&&classname.replace('/','.').equals("java.io.Writer")){
}
//Method Summary
if((methodname+":"+discry).equals("close:()V")){

if(obj.getClass().getName().equals("instance")){ ((java.io.Writer)((instance)obj).sclassobj).close() ;return null;}
else{
((java.io.Writer)obj).close() ;return null;
}
}
else if((methodname+":"+discry).equals("flush:()V")){

if(obj.getClass().getName().equals("instance")){ ((java.io.Writer)((instance)obj).sclassobj).flush() ;return null;}
else{
((java.io.Writer)obj).flush() ;return null;
}
}
else if((methodname+":"+discry).equals("write:([C)V")){

if(obj.getClass().getName().equals("instance")){ ((java.io.Writer)((instance)obj).sclassobj).write((char[])args[1]) ;return null;}
else{
((java.io.Writer)obj).write((char[])args[1]) ;return null;
}
}
else if((methodname+":"+discry).equals("write:([CII)V")){
in[0]=((Integer)args[2]).intValue();
in[1]=((Integer)args[3]).intValue();

if(obj.getClass().getName().equals("instance")){ ((java.io.Writer)((instance)obj).sclassobj).write((char[])args[1],in[0],in[1]) ;return null;}
else{
((java.io.Writer)obj).write((char[])args[1],in[0],in[1]) ;return null;
}
}
else if((methodname+":"+discry).equals("write:(I)V")){
in[0]=((Integer)args[1]).intValue();

if(obj.getClass().getName().equals("instance")){ ((java.io.Writer)((instance)obj).sclassobj).write(in[0]) ;return null;}
else{
((java.io.Writer)obj).write(in[0]) ;return null;
}
}
else if((methodname+":"+discry).equals("write:(Ljava/lang/String;)V")){
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}

if(obj.getClass().getName().equals("instance")){ ((java.io.Writer)((instance)obj).sclassobj).write((java.lang.String)o[0]) ;return null;}
else{
((java.io.Writer)obj).write((java.lang.String)o[0]) ;return null;
}
}
else if((methodname+":"+discry).equals("write:(Ljava/lang/String;II)V")){
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}
in[0]=((Integer)args[2]).intValue();
in[1]=((Integer)args[3]).intValue();

if(obj.getClass().getName().equals("instance")){ ((java.io.Writer)((instance)obj).sclassobj).write((java.lang.String)o[0],in[0],in[1]) ;return null;}
else{
((java.io.Writer)obj).write((java.lang.String)o[0],in[0],in[1]) ;return null;
}
}
}
//ArithmeticException//java.lang.ArithmeticException
if(Class.forName("java.lang.ArithmeticException").isAssignableFrom(Class.forName(classname.replace('/','.')))){
//constructor_summary
if(methodname.equals("<init>")&&classname.replace('/','.').equals("java.lang.ArithmeticException")){
if ((methodname+":"+discry).equals("<init>:()V")){

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.lang.ArithmeticException();return null;}
else{
((CLDCinstance)obj).cldcobj=new java.lang.ArithmeticException() ;return null;}
}

else if ((methodname+":"+discry).equals("<init>:(Ljava/lang/String;)V")){
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.lang.ArithmeticException((java.lang.String)o[0]);return null;}
else{
((CLDCinstance)obj).cldcobj=new java.lang.ArithmeticException((java.lang.String)o[0]) ;return null;}
}

}
}
//ArrayIndexOutOfBoundsException//java.lang.ArrayIndexOutOfBoundsException
if(Class.forName("java.lang.ArrayIndexOutOfBoundsException").isAssignableFrom(Class.forName(classname.replace('/','.')))){
//constructor_summary
if(methodname.equals("<init>")&&classname.replace('/','.').equals("java.lang.ArrayIndexOutOfBoundsException")){
if ((methodname+":"+discry).equals("<init>:()V")){

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.lang.ArrayIndexOutOfBoundsException();return null;}
else{
((CLDCinstance)obj).cldcobj=new java.lang.ArrayIndexOutOfBoundsException() ;return null;}
}

else if ((methodname+":"+discry).equals("<init>:(I)V")){
in[0]=((Integer)args[1]).intValue();

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.lang.ArrayIndexOutOfBoundsException(in[0]);return null;}
else{
((CLDCinstance)obj).cldcobj=new java.lang.ArrayIndexOutOfBoundsException(in[0]) ;return null;}
}

else if ((methodname+":"+discry).equals("<init>:(Ljava/lang/String;)V")){
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.lang.ArrayIndexOutOfBoundsException((java.lang.String)o[0]);return null;}
else{
((CLDCinstance)obj).cldcobj=new java.lang.ArrayIndexOutOfBoundsException((java.lang.String)o[0]) ;return null;}
}

}
}
//ArrayStoreException//java.lang.ArrayStoreException
if(Class.forName("java.lang.ArrayStoreException").isAssignableFrom(Class.forName(classname.replace('/','.')))){
//constructor_summary
if(methodname.equals("<init>")&&classname.replace('/','.').equals("java.lang.ArrayStoreException")){
if ((methodname+":"+discry).equals("<init>:()V")){

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.lang.ArrayStoreException();return null;}
else{
((CLDCinstance)obj).cldcobj=new java.lang.ArrayStoreException() ;return null;}
}

else if ((methodname+":"+discry).equals("<init>:(Ljava/lang/String;)V")){
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.lang.ArrayStoreException((java.lang.String)o[0]);return null;}
else{
((CLDCinstance)obj).cldcobj=new java.lang.ArrayStoreException((java.lang.String)o[0]) ;return null;}
}

}
}
//Boolean//java.lang.Boolean
if(Class.forName("java.lang.Boolean").isAssignableFrom(Class.forName(classname.replace('/','.')))){
//constructor_summary
if(methodname.equals("<init>")&&classname.replace('/','.').equals("java.lang.Boolean")){
if ((methodname+":"+discry).equals("<init>:(Z)V")){
bl[0]=(((Integer)args[1]).intValue()==0)?false:true;

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.lang.Boolean(bl[0]);return null;}
else{
((CLDCinstance)obj).cldcobj=new java.lang.Boolean(bl[0]) ;return null;}
}

}
//Method Summary
else if((methodname+":"+discry).equals("booleanValue:()Z")){

if(obj.getClass().getName().equals("instance")){return ( ((java.lang.Boolean)((instance)obj).sclassobj).booleanValue() )?new Integer(1):new Integer(0);}
else{
return ( ((java.lang.Boolean)obj).booleanValue() )?new Integer(1):new Integer(0);
}
}
else if((methodname+":"+discry).equals("equals:(Ljava/lang/Object;)Z")){
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}

if(obj.getClass().getName().equals("instance")){return ( ((java.lang.Boolean)((instance)obj).sclassobj).equals((java.lang.Object)o[0]) )?new Integer(1):new Integer(0);}
else{
return ( ((java.lang.Boolean)obj).equals((java.lang.Object)o[0]) )?new Integer(1):new Integer(0);
}
}
else if((methodname+":"+discry).equals("hashCode:()I")){

if(obj.getClass().getName().equals("instance")){return new Integer( ((java.lang.Boolean)((instance)obj).sclassobj).hashCode() );}
else{
return new Integer( ((java.lang.Boolean)obj).hashCode() );
}
}
else if((methodname+":"+discry).equals("toString:()Ljava/lang/String;")){

if(obj.getClass().getName().equals("instance")){return new CLDCinstance( ((java.lang.Boolean)((instance)obj).sclassobj).toString() );}
else{
return new CLDCinstance( ((java.lang.Boolean)obj).toString() );
}
}
}
//Byte//java.lang.Byte
if(Class.forName("java.lang.Byte").isAssignableFrom(Class.forName(classname.replace('/','.')))){
//constructor_summary
if(methodname.equals("<init>")&&classname.replace('/','.').equals("java.lang.Byte")){
if ((methodname+":"+discry).equals("<init>:(B)V")){
b[0]=((Integer)args[1]).byteValue();
if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.lang.Byte(b[0]);return null;}
else{
((CLDCinstance)obj).cldcobj=new java.lang.Byte(b[0]) ;return null;}
}

}
//Method Summary
else if((methodname+":"+discry).equals("byteValue:()B")){

if(obj.getClass().getName().equals("instance")){return new Integer( ((java.lang.Byte)((instance)obj).sclassobj).byteValue() );}
else{
return new Integer( ((java.lang.Byte)obj).byteValue() );
}
}
else if((methodname+":"+discry).equals("equals:(Ljava/lang/Object;)Z")){
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}

if(obj.getClass().getName().equals("instance")){return ( ((java.lang.Byte)((instance)obj).sclassobj).equals((java.lang.Object)o[0]) )?new Integer(1):new Integer(0);}
else{
return ( ((java.lang.Byte)obj).equals((java.lang.Object)o[0]) )?new Integer(1):new Integer(0);
}
}
else if((methodname+":"+discry).equals("hashCode:()I")){

if(obj.getClass().getName().equals("instance")){return new Integer( ((java.lang.Byte)((instance)obj).sclassobj).hashCode() );}
else{
return new Integer( ((java.lang.Byte)obj).hashCode() );
}
}
else if((methodname+":"+discry).equals("parseByte:(Ljava/lang/String;)B")){
if(args[0].getClass().getName().equals("instance")){
o[0]=((instance)args[0]).sclassobj;
}
else if(args[0].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[0]).cldcobj;
}



return new Integer( java.lang.Byte.parseByte((java.lang.String)o[0]) );
}

else if((methodname+":"+discry).equals("parseByte:(Ljava/lang/String;I)B")){
if(args[0].getClass().getName().equals("instance")){
o[0]=((instance)args[0]).sclassobj;
}
else if(args[0].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[0]).cldcobj;
}
in[0]=((Integer)args[1]).intValue();



return new Integer( java.lang.Byte.parseByte((java.lang.String)o[0],in[0]) );
}

else if((methodname+":"+discry).equals("toString:()Ljava/lang/String;")){

if(obj.getClass().getName().equals("instance")){return new CLDCinstance( ((java.lang.Byte)((instance)obj).sclassobj).toString() );}
else{
return new CLDCinstance( ((java.lang.Byte)obj).toString() );
}
}
}
//ByteArrayInputStream//java.io.ByteArrayInputStream
if(Class.forName("java.io.ByteArrayInputStream").isAssignableFrom(Class.forName(classname.replace('/','.')))){
//constructor_summary
if(methodname.equals("<init>")&&classname.replace('/','.').equals("java.io.ByteArrayInputStream")){
if ((methodname+":"+discry).equals("<init>:([B)V")){

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.io.ByteArrayInputStream((byte[])args[1]);return null;}
else{
((CLDCinstance)obj).cldcobj=new java.io.ByteArrayInputStream((byte[])args[1]) ;return null;}
}

else if ((methodname+":"+discry).equals("<init>:([BII)V")){
in[0]=((Integer)args[2]).intValue();
in[1]=((Integer)args[3]).intValue();

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.io.ByteArrayInputStream((byte[])args[1],in[0],in[1]);return null;}
else{
((CLDCinstance)obj).cldcobj=new java.io.ByteArrayInputStream((byte[])args[1],in[0],in[1]) ;return null;}
}

}
//Method Summary
else if((methodname+":"+discry).equals("available:()I")){

if(obj.getClass().getName().equals("instance")){return new Integer( ((java.io.ByteArrayInputStream)((instance)obj).sclassobj).available() );}
else{
return new Integer( ((java.io.ByteArrayInputStream)obj).available() );
}
}
else if((methodname+":"+discry).equals("close:()V")){

if(obj.getClass().getName().equals("instance")){ ((java.io.ByteArrayInputStream)((instance)obj).sclassobj).close() ;return null;}
else{
((java.io.ByteArrayInputStream)obj).close() ;return null;
}
}
else if((methodname+":"+discry).equals("mark:(I)V")){
in[0]=((Integer)args[1]).intValue();

if(obj.getClass().getName().equals("instance")){ ((java.io.ByteArrayInputStream)((instance)obj).sclassobj).mark(in[0]) ;return null;}
else{
((java.io.ByteArrayInputStream)obj).mark(in[0]) ;return null;
}
}
else if((methodname+":"+discry).equals("markSupported:()Z")){

if(obj.getClass().getName().equals("instance")){return ( ((java.io.ByteArrayInputStream)((instance)obj).sclassobj).markSupported() )?new Integer(1):new Integer(0);}
else{
return ( ((java.io.ByteArrayInputStream)obj).markSupported() )?new Integer(1):new Integer(0);
}
}
else if((methodname+":"+discry).equals("read:()I")){

if(obj.getClass().getName().equals("instance")){return new Integer( ((java.io.ByteArrayInputStream)((instance)obj).sclassobj).read() );}
else{
return new Integer( ((java.io.ByteArrayInputStream)obj).read() );
}
}
else if((methodname+":"+discry).equals("read:([BII)I")){
in[0]=((Integer)args[2]).intValue();
in[1]=((Integer)args[3]).intValue();

if(obj.getClass().getName().equals("instance")){return new Integer( ((java.io.ByteArrayInputStream)((instance)obj).sclassobj).read((byte[])args[1],in[0],in[1]) );}
else{
return new Integer( ((java.io.ByteArrayInputStream)obj).read((byte[])args[1],in[0],in[1]) );
}
}
else if((methodname+":"+discry).equals("reset:()V")){

if(obj.getClass().getName().equals("instance")){ ((java.io.ByteArrayInputStream)((instance)obj).sclassobj).reset() ;return null;}
else{
((java.io.ByteArrayInputStream)obj).reset() ;return null;
}
}
else if((methodname+":"+discry).equals("skip:(J)J")){
l[0]=((Long)args[1]).longValue();
if(obj.getClass().getName().equals("instance")){return new Long( ((java.io.ByteArrayInputStream)((instance)obj).sclassobj).skip(l[0]) );}
else{
return new Long( ((java.io.ByteArrayInputStream)obj).skip(l[0]) );
}
}
}
//ByteArrayOutputStream//java.io.ByteArrayOutputStream
if(Class.forName("java.io.ByteArrayOutputStream").isAssignableFrom(Class.forName(classname.replace('/','.')))){
//constructor_summary
if(methodname.equals("<init>")&&classname.replace('/','.').equals("java.io.ByteArrayOutputStream")){
if ((methodname+":"+discry).equals("<init>:()V")){

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.io.ByteArrayOutputStream();return null;}
else{
((CLDCinstance)obj).cldcobj=new java.io.ByteArrayOutputStream() ;return null;}
}

else if ((methodname+":"+discry).equals("<init>:(I)V")){
in[0]=((Integer)args[1]).intValue();

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.io.ByteArrayOutputStream(in[0]);return null;}
else{
((CLDCinstance)obj).cldcobj=new java.io.ByteArrayOutputStream(in[0]) ;return null;}
}

}
//Method Summary
else if((methodname+":"+discry).equals("close:()V")){

if(obj.getClass().getName().equals("instance")){ ((java.io.ByteArrayOutputStream)((instance)obj).sclassobj).close() ;return null;}
else{
((java.io.ByteArrayOutputStream)obj).close() ;return null;
}
}
else if((methodname+":"+discry).equals("reset:()V")){

if(obj.getClass().getName().equals("instance")){ ((java.io.ByteArrayOutputStream)((instance)obj).sclassobj).reset() ;return null;}
else{
((java.io.ByteArrayOutputStream)obj).reset() ;return null;
}
}
else if((methodname+":"+discry).equals("size:()I")){

if(obj.getClass().getName().equals("instance")){return new Integer( ((java.io.ByteArrayOutputStream)((instance)obj).sclassobj).size() );}
else{
return new Integer( ((java.io.ByteArrayOutputStream)obj).size() );
}
}
else if((methodname+":"+discry).equals("toByteArray:()[B")){

if(obj.getClass().getName().equals("instance")){return ((java.io.ByteArrayOutputStream)((instance)obj).sclassobj).toByteArray() ;}
else{
return ((java.io.ByteArrayOutputStream)obj).toByteArray() ;
}
}
else if((methodname+":"+discry).equals("toString:()Ljava/lang/String;")){

if(obj.getClass().getName().equals("instance")){return new CLDCinstance( ((java.io.ByteArrayOutputStream)((instance)obj).sclassobj).toString() );}
else{
return new CLDCinstance( ((java.io.ByteArrayOutputStream)obj).toString() );
}
}
else if((methodname+":"+discry).equals("write:([BII)V")){
in[0]=((Integer)args[2]).intValue();
in[1]=((Integer)args[3]).intValue();

if(obj.getClass().getName().equals("instance")){ ((java.io.ByteArrayOutputStream)((instance)obj).sclassobj).write((byte[])args[1],in[0],in[1]) ;return null;}
else{
((java.io.ByteArrayOutputStream)obj).write((byte[])args[1],in[0],in[1]) ;return null;
}
}
else if((methodname+":"+discry).equals("write:(I)V")){
in[0]=((Integer)args[1]).intValue();

if(obj.getClass().getName().equals("instance")){ ((java.io.ByteArrayOutputStream)((instance)obj).sclassobj).write(in[0]) ;return null;}
else{
((java.io.ByteArrayOutputStream)obj).write(in[0]) ;return null;
}
}
}
//Calendar//java.util.Calendar
if(Class.forName("java.util.Calendar").isAssignableFrom(Class.forName(classname.replace('/','.')))){
//print this is abstract class
//constructor_summary
if(methodname.equals("<init>")&&classname.replace('/','.').equals("java.util.Calendar")){
}
//Method Summary
if((methodname+":"+discry).equals("after:(Ljava/lang/Object;)Z")){
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}

if(obj.getClass().getName().equals("instance")){return ( ((java.util.Calendar)((instance)obj).sclassobj).after((java.lang.Object)o[0]) )?new Integer(1):new Integer(0);}
else{
return ( ((java.util.Calendar)obj).after((java.lang.Object)o[0]) )?new Integer(1):new Integer(0);
}
}
else if((methodname+":"+discry).equals("before:(Ljava/lang/Object;)Z")){
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}

if(obj.getClass().getName().equals("instance")){return ( ((java.util.Calendar)((instance)obj).sclassobj).before((java.lang.Object)o[0]) )?new Integer(1):new Integer(0);}
else{
return ( ((java.util.Calendar)obj).before((java.lang.Object)o[0]) )?new Integer(1):new Integer(0);
}
}
else if((methodname+":"+discry).equals("equals:(Ljava/lang/Object;)Z")){
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}

if(obj.getClass().getName().equals("instance")){return ( ((java.util.Calendar)((instance)obj).sclassobj).equals((java.lang.Object)o[0]) )?new Integer(1):new Integer(0);}
else{
return ( ((java.util.Calendar)obj).equals((java.lang.Object)o[0]) )?new Integer(1):new Integer(0);
}
}
else if((methodname+":"+discry).equals("get:(I)I")){
in[0]=((Integer)args[1]).intValue();

if(obj.getClass().getName().equals("instance")){return new Integer( ((java.util.Calendar)((instance)obj).sclassobj).get(in[0]) );}
else{
return new Integer( ((java.util.Calendar)obj).get(in[0]) );
}
}
else if((methodname+":"+discry).equals("getInstance:()Ljava/util/Calendar;")){



return new CLDCinstance( java.util.Calendar.getInstance() );
}

else if((methodname+":"+discry).equals("getInstance:(Ljava/util/TimeZone;)Ljava/util/Calendar;")){
if(args[0].getClass().getName().equals("instance")){
o[0]=((instance)args[0]).sclassobj;
}
else if(args[0].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[0]).cldcobj;
}



return new CLDCinstance( java.util.Calendar.getInstance((java.util.TimeZone)o[0]) );
}

else if((methodname+":"+discry).equals("getTime:()Ljava/util/Date;")){

if(obj.getClass().getName().equals("instance")){return new CLDCinstance( ((java.util.Calendar)((instance)obj).sclassobj).getTime() );}
else{
return new CLDCinstance( ((java.util.Calendar)obj).getTime() );
}
}
else if((methodname+":"+discry).equals("getTimeZone:()Ljava/util/TimeZone;")){

if(obj.getClass().getName().equals("instance")){return new CLDCinstance( ((java.util.Calendar)((instance)obj).sclassobj).getTimeZone() );}
else{
return new CLDCinstance( ((java.util.Calendar)obj).getTimeZone() );
}
}
else if((methodname+":"+discry).equals("set:(II)V")){
in[0]=((Integer)args[1]).intValue();
in[1]=((Integer)args[2]).intValue();

if(obj.getClass().getName().equals("instance")){ ((java.util.Calendar)((instance)obj).sclassobj).set(in[0],in[1]) ;return null;}
else{
((java.util.Calendar)obj).set(in[0],in[1]) ;return null;
}
}
else if((methodname+":"+discry).equals("setTime:(Ljava/util/Date;)V")){
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}

if(obj.getClass().getName().equals("instance")){ ((java.util.Calendar)((instance)obj).sclassobj).setTime((java.util.Date)o[0]) ;return null;}
else{
((java.util.Calendar)obj).setTime((java.util.Date)o[0]) ;return null;
}
}
else if((methodname+":"+discry).equals("setTimeZone:(Ljava/util/TimeZone;)V")){
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}

if(obj.getClass().getName().equals("instance")){ ((java.util.Calendar)((instance)obj).sclassobj).setTimeZone((java.util.TimeZone)o[0]) ;return null;}
else{
((java.util.Calendar)obj).setTimeZone((java.util.TimeZone)o[0]) ;return null;
}
}
}
//Character//java.lang.Character
if(Class.forName("java.lang.Character").isAssignableFrom(Class.forName(classname.replace('/','.')))){
//constructor_summary
if(methodname.equals("<init>")&&classname.replace('/','.').equals("java.lang.Character")){
if ((methodname+":"+discry).equals("<init>:(C)V")){
c[0]=(char)((Integer)args[1]).intValue();
if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.lang.Character(c[0]);return null;}
else{
((CLDCinstance)obj).cldcobj=new java.lang.Character(c[0]) ;return null;}
}

}
//Method Summary
else if((methodname+":"+discry).equals("charValue:()C")){

if(obj.getClass().getName().equals("instance")){return new Integer((int) ((java.lang.Character)((instance)obj).sclassobj).charValue() );}
else{
return new Integer((int) ((java.lang.Character)obj).charValue() );
}
}
else if((methodname+":"+discry).equals("digit:(CI)I")){
c[0]=(char)((Integer)args[0]).intValue();in[0]=((Integer)args[1]).intValue();



return new Integer( java.lang.Character.digit(c[0],in[0]) );
}

else if((methodname+":"+discry).equals("equals:(Ljava/lang/Object;)Z")){
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}

if(obj.getClass().getName().equals("instance")){return ( ((java.lang.Character)((instance)obj).sclassobj).equals((java.lang.Object)o[0]) )?new Integer(1):new Integer(0);}
else{
return ( ((java.lang.Character)obj).equals((java.lang.Object)o[0]) )?new Integer(1):new Integer(0);
}
}
else if((methodname+":"+discry).equals("hashCode:()I")){

if(obj.getClass().getName().equals("instance")){return new Integer( ((java.lang.Character)((instance)obj).sclassobj).hashCode() );}
else{
return new Integer( ((java.lang.Character)obj).hashCode() );
}
}
else if((methodname+":"+discry).equals("isDigit:(C)Z")){
c[0]=(char)((Integer)args[0]).intValue();


return ( java.lang.Character.isDigit(c[0]) )?new Integer(1):new Integer(0);
}

else if((methodname+":"+discry).equals("isLowerCase:(C)Z")){
c[0]=(char)((Integer)args[0]).intValue();


return ( java.lang.Character.isLowerCase(c[0]) )?new Integer(1):new Integer(0);
}

else if((methodname+":"+discry).equals("isUpperCase:(C)Z")){
c[0]=(char)((Integer)args[0]).intValue();


return ( java.lang.Character.isUpperCase(c[0]) )?new Integer(1):new Integer(0);
}

else if((methodname+":"+discry).equals("toLowerCase:(C)C")){
c[0]=(char)((Integer)args[0]).intValue();


return new Integer((int) java.lang.Character.toLowerCase(c[0]) );
}

else if((methodname+":"+discry).equals("toString:()Ljava/lang/String;")){

if(obj.getClass().getName().equals("instance")){return new CLDCinstance( ((java.lang.Character)((instance)obj).sclassobj).toString() );}
else{
return new CLDCinstance( ((java.lang.Character)obj).toString() );
}
}
else if((methodname+":"+discry).equals("toUpperCase:(C)C")){
c[0]=(char)((Integer)args[0]).intValue();


return new Integer((int) java.lang.Character.toUpperCase(c[0]) );
}

}
//Class//java.lang.Class
if(Class.forName("java.lang.Class").isAssignableFrom(Class.forName(classname.replace('/','.')))){
//Method Summary
if((methodname+":"+discry).equals("forName:(Ljava/lang/String;)Ljava/lang/Class;")){
if(args[0].getClass().getName().equals("instance")){
o[0]=((instance)args[0]).sclassobj;
}
else if(args[0].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[0]).cldcobj;
}



return new CLDCinstance( java.lang.Class.forName((java.lang.String)o[0]) );
}

else if((methodname+":"+discry).equals("getName:()Ljava/lang/String;")){

if(obj.getClass().getName().equals("instance")){return new CLDCinstance( ((java.lang.Class)((instance)obj).sclassobj).getName() );}
else{
return new CLDCinstance( ((java.lang.Class)obj).getName() );
}
}
else if((methodname+":"+discry).equals("getResourceAsStream:(Ljava/lang/String;)Ljava/io/InputStream;")){
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}

if(obj.getClass().getName().equals("instance")){return new CLDCinstance( ((java.lang.Class)((instance)obj).sclassobj).getResourceAsStream((java.lang.String)o[0]) );}
else{
return new CLDCinstance( ((java.lang.Class)obj).getResourceAsStream((java.lang.String)o[0]) );
}
}
else if((methodname+":"+discry).equals("isArray:()Z")){

if(obj.getClass().getName().equals("instance")){return ( ((java.lang.Class)((instance)obj).sclassobj).isArray() )?new Integer(1):new Integer(0);}
else{
return ( ((java.lang.Class)obj).isArray() )?new Integer(1):new Integer(0);
}
}
else if((methodname+":"+discry).equals("isAssignableFrom:(Ljava/lang/Class;)Z")){
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}

if(obj.getClass().getName().equals("instance")){return ( ((java.lang.Class)((instance)obj).sclassobj).isAssignableFrom((java.lang.Class)o[0]) )?new Integer(1):new Integer(0);}
else{
return ( ((java.lang.Class)obj).isAssignableFrom((java.lang.Class)o[0]) )?new Integer(1):new Integer(0);
}
}
else if((methodname+":"+discry).equals("isInstance:(Ljava/lang/Object;)Z")){
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}

if(obj.getClass().getName().equals("instance")){return ( ((java.lang.Class)((instance)obj).sclassobj).isInstance((java.lang.Object)o[0]) )?new Integer(1):new Integer(0);}
else{
return ( ((java.lang.Class)obj).isInstance((java.lang.Object)o[0]) )?new Integer(1):new Integer(0);
}
}
else if((methodname+":"+discry).equals("isInterface:()Z")){

if(obj.getClass().getName().equals("instance")){return ( ((java.lang.Class)((instance)obj).sclassobj).isInterface() )?new Integer(1):new Integer(0);}
else{
return ( ((java.lang.Class)obj).isInterface() )?new Integer(1):new Integer(0);
}
}
else if((methodname+":"+discry).equals("newInstance:()Ljava/lang/Object;")){

if(obj.getClass().getName().equals("instance")){return new CLDCinstance( ((java.lang.Class)((instance)obj).sclassobj).newInstance() );}
else{
return new CLDCinstance( ((java.lang.Class)obj).newInstance() );
}
}
else if((methodname+":"+discry).equals("toString:()Ljava/lang/String;")){

if(obj.getClass().getName().equals("instance")){return new CLDCinstance( ((java.lang.Class)((instance)obj).sclassobj).toString() );}
else{
return new CLDCinstance( ((java.lang.Class)obj).toString() );
}
}
}
//ClassCastException//java.lang.ClassCastException
if(Class.forName("java.lang.ClassCastException").isAssignableFrom(Class.forName(classname.replace('/','.')))){
//constructor_summary
if(methodname.equals("<init>")&&classname.replace('/','.').equals("java.lang.ClassCastException")){
if ((methodname+":"+discry).equals("<init>:()V")){

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.lang.ClassCastException();return null;}
else{
((CLDCinstance)obj).cldcobj=new java.lang.ClassCastException() ;return null;}
}

else if ((methodname+":"+discry).equals("<init>:(Ljava/lang/String;)V")){
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.lang.ClassCastException((java.lang.String)o[0]);return null;}
else{
((CLDCinstance)obj).cldcobj=new java.lang.ClassCastException((java.lang.String)o[0]) ;return null;}
}

}
}
//ClassNotFoundException//java.lang.ClassNotFoundException
if(Class.forName("java.lang.ClassNotFoundException").isAssignableFrom(Class.forName(classname.replace('/','.')))){
//constructor_summary
if(methodname.equals("<init>")&&classname.replace('/','.').equals("java.lang.ClassNotFoundException")){
if ((methodname+":"+discry).equals("<init>:()V")){

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.lang.ClassNotFoundException();return null;}
else{
((CLDCinstance)obj).cldcobj=new java.lang.ClassNotFoundException() ;return null;}
}

else if ((methodname+":"+discry).equals("<init>:(Ljava/lang/String;)V")){
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.lang.ClassNotFoundException((java.lang.String)o[0]);return null;}
else{
((CLDCinstance)obj).cldcobj=new java.lang.ClassNotFoundException((java.lang.String)o[0]) ;return null;}
}

}
}
//Connection//abstract or interface class
//Method Summary

return doMethodbyName2(classname,methodname,discry,args,obj,mode);
}
public static Object doMethodbyName2(String classname,String methodname,String discry,Object[] args,Object obj,int mode)throws Exception{
boolean[] bl=new boolean[args.length];
double[] d=new double[args.length];
byte[] b=new byte[args.length];
short[] s=new short[args.length];
float[] f=new float[args.length];
long[] l=new long[args.length];
int[] in=new int[args.length];
char[] c=new char[args.length];
Object[] o=new Object[args.length];
//ConnectionNotFoundException//javax.microedition.io.ConnectionNotFoundException

//Connector//javax.microedition.io.Connector
if("javax.microedition.io.Connector".equals(classname.replace('/','.'))){
//Method Summary
if((methodname+":"+discry).equals("open:(Ljava/lang/String;)Ljavax/microedition/io/Connection;")){
if(args[0].getClass().getName().equals("instance")){
o[0]=((instance)args[0]).sclassobj;
}
else if(args[0].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[0]).cldcobj;
}



//return new CLDCinstance( javax.microedition.io.Connector.open((java.lang.String)o[0]) );
}

else if((methodname+":"+discry).equals("open:(Ljava/lang/String;I)Ljavax/microedition/io/Connection;")){
if(args[0].getClass().getName().equals("instance")){
o[0]=((instance)args[0]).sclassobj;
}
else if(args[0].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[0]).cldcobj;
}
in[0]=((Integer)args[1]).intValue();



//return new CLDCinstance( javax.microedition.io.Connector.open((java.lang.String)o[0],in[0]) );
}

else if((methodname+":"+discry).equals("open:(Ljava/lang/String;IZ)Ljavax/microedition/io/Connection;")){
if(args[0].getClass().getName().equals("instance")){
o[0]=((instance)args[0]).sclassobj;
}
else if(args[0].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[0]).cldcobj;
}
in[0]=((Integer)args[1]).intValue();
bl[0]=(((Integer)args[2]).intValue()==0)?false:true;



//return new CLDCinstance( javax.microedition.io.Connector.open((java.lang.String)o[0],in[0],bl[0]) );
}

else if((methodname+":"+discry).equals("openDataInputStream:(Ljava/lang/String;)Ljava/io/DataInputStream;")){
if(args[0].getClass().getName().equals("instance")){
o[0]=((instance)args[0]).sclassobj;
}
else if(args[0].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[0]).cldcobj;
}



return new CLDCinstance( new DataInputStream(new FileInputStream((java.lang.String)o[0])));
}

else if((methodname+":"+discry).equals("openDataOutputStream:(Ljava/lang/String;)Ljava/io/DataOutputStream;")){
if(args[0].getClass().getName().equals("instance")){
o[0]=((instance)args[0]).sclassobj;
}
else if(args[0].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[0]).cldcobj;
}



return new CLDCinstance( new DataOutputStream(new FileOutputStream((java.lang.String)o[0])));
}

else if((methodname+":"+discry).equals("openInputStream:(Ljava/lang/String;)Ljava/io/InputStream;")){
if(args[0].getClass().getName().equals("instance")){
o[0]=((instance)args[0]).sclassobj;
}
else if(args[0].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[0]).cldcobj;
}



return new CLDCinstance( new DataInputStream(new FileInputStream((java.lang.String)o[0])));
}

else if((methodname+":"+discry).equals("openOutputStream:(Ljava/lang/String;)Ljava/io/OutputStream;")){
if(args[0].getClass().getName().equals("instance")){
o[0]=((instance)args[0]).sclassobj;
}
else if(args[0].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[0]).cldcobj;
}



return new CLDCinstance( new DataOutputStream(new FileOutputStream((java.lang.String)o[0])));
}

}
//ContentConnection//abstract or interface class
//Method Summary
//Datagram//abstract or interface class
//Method Summary
//DatagramConnection//abstract or interface class
//Method Summary
//DataInput//abstract or interface class
//Method Summary
//DataInputStream//java.io.DataInputStream
if(Class.forName("java.io.DataInputStream").isAssignableFrom(Class.forName(classname.replace('/','.')))){
//constructor_summary
if(methodname.equals("<init>")&&classname.replace('/','.').equals("java.io.DataInputStream")){
if ((methodname+":"+discry).equals("<init>:(Ljava/io/InputStream;)V")){
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.io.DataInputStream((java.io.InputStream)o[0]);return null;}
else{
((CLDCinstance)obj).cldcobj=new java.io.DataInputStream((java.io.InputStream)o[0]) ;return null;}
}

}
//Method Summary
else if((methodname+":"+discry).equals("available:()I")){

if(obj.getClass().getName().equals("instance")){return new Integer( ((java.io.DataInputStream)((instance)obj).sclassobj).available() );}
else{
return new Integer( ((java.io.DataInputStream)obj).available() );
}
}
else if((methodname+":"+discry).equals("close:()V")){

if(obj.getClass().getName().equals("instance")){ ((java.io.DataInputStream)((instance)obj).sclassobj).close() ;return null;}
else{
((java.io.DataInputStream)obj).close() ;return null;
}
}
else if((methodname+":"+discry).equals("mark:(I)V")){
in[0]=((Integer)args[1]).intValue();

if(obj.getClass().getName().equals("instance")){ ((java.io.DataInputStream)((instance)obj).sclassobj).mark(in[0]) ;return null;}
else{
((java.io.DataInputStream)obj).mark(in[0]) ;return null;
}
}
else if((methodname+":"+discry).equals("markSupported:()Z")){

if(obj.getClass().getName().equals("instance")){return ( ((java.io.DataInputStream)((instance)obj).sclassobj).markSupported() )?new Integer(1):new Integer(0);}
else{
return ( ((java.io.DataInputStream)obj).markSupported() )?new Integer(1):new Integer(0);
}
}
else if((methodname+":"+discry).equals("read:()I")){

if(obj.getClass().getName().equals("instance")){return new Integer( ((java.io.DataInputStream)((instance)obj).sclassobj).read() );}
else{
return new Integer( ((java.io.DataInputStream)obj).read() );
}
}
else if((methodname+":"+discry).equals("read:([B)I")){

if(obj.getClass().getName().equals("instance")){return new Integer( ((java.io.DataInputStream)((instance)obj).sclassobj).read((byte[])args[1]) );}
else{
return new Integer( ((java.io.DataInputStream)obj).read((byte[])args[1]) );
}
}
else if((methodname+":"+discry).equals("read:([BII)I")){
in[0]=((Integer)args[2]).intValue();
in[1]=((Integer)args[3]).intValue();

if(obj.getClass().getName().equals("instance")){return new Integer( ((java.io.DataInputStream)((instance)obj).sclassobj).read((byte[])args[1],in[0],in[1]) );}
else{
return new Integer( ((java.io.DataInputStream)obj).read((byte[])args[1],in[0],in[1]) );
}
}
else if((methodname+":"+discry).equals("readBoolean:()Z")){

if(obj.getClass().getName().equals("instance")){return ( ((java.io.DataInputStream)((instance)obj).sclassobj).readBoolean() )?new Integer(1):new Integer(0);}
else{
return ( ((java.io.DataInputStream)obj).readBoolean() )?new Integer(1):new Integer(0);
}
}
else if((methodname+":"+discry).equals("readByte:()B")){

if(obj.getClass().getName().equals("instance")){return new Integer( ((java.io.DataInputStream)((instance)obj).sclassobj).readByte() );}
else{
return new Integer( ((java.io.DataInputStream)obj).readByte() );
}
}
else if((methodname+":"+discry).equals("readChar:()C")){

if(obj.getClass().getName().equals("instance")){return new Integer((int) ((java.io.DataInputStream)((instance)obj).sclassobj).readChar() );}
else{
return new Integer((int) ((java.io.DataInputStream)obj).readChar() );
}
}
else if((methodname+":"+discry).equals("readDouble:()D")){

if(obj.getClass().getName().equals("instance")){return new Double( ((java.io.DataInputStream)((instance)obj).sclassobj).readDouble() );}
else{
return new Double( ((java.io.DataInputStream)obj).readDouble() );
}
}
else if((methodname+":"+discry).equals("readFloat:()F")){

if(obj.getClass().getName().equals("instance")){return new Float( ((java.io.DataInputStream)((instance)obj).sclassobj).readFloat() );}
else{
return new Float( ((java.io.DataInputStream)obj).readFloat() );
}
}
else if((methodname+":"+discry).equals("readFully:([B)V")){

if(obj.getClass().getName().equals("instance")){ ((java.io.DataInputStream)((instance)obj).sclassobj).readFully((byte[])args[1]) ;return null;}
else{
((java.io.DataInputStream)obj).readFully((byte[])args[1]) ;return null;
}
}
else if((methodname+":"+discry).equals("readFully:([BII)V")){
in[0]=((Integer)args[2]).intValue();
in[1]=((Integer)args[3]).intValue();

if(obj.getClass().getName().equals("instance")){ ((java.io.DataInputStream)((instance)obj).sclassobj).readFully((byte[])args[1],in[0],in[1]) ;return null;}
else{
((java.io.DataInputStream)obj).readFully((byte[])args[1],in[0],in[1]) ;return null;
}
}
else if((methodname+":"+discry).equals("readInt:()I")){

if(obj.getClass().getName().equals("instance")){return new Integer( ((java.io.DataInputStream)((instance)obj).sclassobj).readInt() );}
else{
return new Integer( ((java.io.DataInputStream)obj).readInt() );
}
}
else if((methodname+":"+discry).equals("readLong:()J")){

if(obj.getClass().getName().equals("instance")){return new Long( ((java.io.DataInputStream)((instance)obj).sclassobj).readLong() );}
else{
return new Long( ((java.io.DataInputStream)obj).readLong() );
}
}
else if((methodname+":"+discry).equals("readShort:()S")){

if(obj.getClass().getName().equals("instance")){return new Integer( ((java.io.DataInputStream)((instance)obj).sclassobj).readShort() );}
else{
return new Integer( ((java.io.DataInputStream)obj).readShort() );
}
}
else if((methodname+":"+discry).equals("readUnsignedByte:()I")){

if(obj.getClass().getName().equals("instance")){return new Integer( ((java.io.DataInputStream)((instance)obj).sclassobj).readUnsignedByte() );}
else{
return new Integer( ((java.io.DataInputStream)obj).readUnsignedByte() );
}
}
else if((methodname+":"+discry).equals("readUnsignedShort:()I")){

if(obj.getClass().getName().equals("instance")){return new Integer( ((java.io.DataInputStream)((instance)obj).sclassobj).readUnsignedShort() );}
else{
return new Integer( ((java.io.DataInputStream)obj).readUnsignedShort() );
}
}
else if((methodname+":"+discry).equals("readUTF:()Ljava/lang/String;")){

if(obj.getClass().getName().equals("instance")){return new CLDCinstance( ((java.io.DataInputStream)((instance)obj).sclassobj).readUTF() );}
else{
return new CLDCinstance( ((java.io.DataInputStream)obj).readUTF() );
}
}
else if((methodname+":"+discry).equals("readUTF:(Ljava/io/DataInput;)Ljava/lang/String;")){
if(args[0].getClass().getName().equals("instance")){
o[0]=((instance)args[0]).sclassobj;
}
else if(args[0].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[0]).cldcobj;
}



return new CLDCinstance( java.io.DataInputStream.readUTF((java.io.DataInput)o[0]) );
}

else if((methodname+":"+discry).equals("reset:()V")){

if(obj.getClass().getName().equals("instance")){ ((java.io.DataInputStream)((instance)obj).sclassobj).reset() ;return null;}
else{
((java.io.DataInputStream)obj).reset() ;return null;
}
}
else if((methodname+":"+discry).equals("skip:(J)J")){
l[0]=((Long)args[1]).longValue();
if(obj.getClass().getName().equals("instance")){return new Long( ((java.io.DataInputStream)((instance)obj).sclassobj).skip(l[0]) );}
else{
return new Long( ((java.io.DataInputStream)obj).skip(l[0]) );
}
}
else if((methodname+":"+discry).equals("skipBytes:(I)I")){
in[0]=((Integer)args[1]).intValue();

if(obj.getClass().getName().equals("instance")){return new Integer( ((java.io.DataInputStream)((instance)obj).sclassobj).skipBytes(in[0]) );}
else{
return new Integer( ((java.io.DataInputStream)obj).skipBytes(in[0]) );
}
}
}
//DataOutput//abstract or interface class
//Method Summary
//DataOutputStream//java.io.DataOutputStream
if(Class.forName("java.io.DataOutputStream").isAssignableFrom(Class.forName(classname.replace('/','.')))){
//constructor_summary
if(methodname.equals("<init>")&&classname.replace('/','.').equals("java.io.DataOutputStream")){
if ((methodname+":"+discry).equals("<init>:(Ljava/io/OutputStream;)V")){
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.io.DataOutputStream((java.io.OutputStream)o[0]);return null;}
else{
((CLDCinstance)obj).cldcobj=new java.io.DataOutputStream((java.io.OutputStream)o[0]) ;return null;}
}

}
//Method Summary
else if((methodname+":"+discry).equals("close:()V")){

if(obj.getClass().getName().equals("instance")){ ((java.io.DataOutputStream)((instance)obj).sclassobj).close() ;return null;}
else{
((java.io.DataOutputStream)obj).close() ;return null;
}
}
else if((methodname+":"+discry).equals("flush:()V")){

if(obj.getClass().getName().equals("instance")){ ((java.io.DataOutputStream)((instance)obj).sclassobj).flush() ;return null;}
else{
((java.io.DataOutputStream)obj).flush() ;return null;
}
}
else if((methodname+":"+discry).equals("write:([BII)V")){
in[0]=((Integer)args[2]).intValue();
in[1]=((Integer)args[3]).intValue();

if(obj.getClass().getName().equals("instance")){ ((java.io.DataOutputStream)((instance)obj).sclassobj).write((byte[])args[1],in[0],in[1]) ;return null;}
else{
((java.io.DataOutputStream)obj).write((byte[])args[1],in[0],in[1]) ;return null;
}
}
else if((methodname+":"+discry).equals("write:(I)V")){
in[0]=((Integer)args[1]).intValue();

if(obj.getClass().getName().equals("instance")){ ((java.io.DataOutputStream)((instance)obj).sclassobj).write(in[0]) ;return null;}
else{
((java.io.DataOutputStream)obj).write(in[0]) ;return null;
}
}
else if((methodname+":"+discry).equals("writeBoolean:(Z)V")){
bl[0]=(((Integer)args[1]).intValue()==0)?false:true;

if(obj.getClass().getName().equals("instance")){ ((java.io.DataOutputStream)((instance)obj).sclassobj).writeBoolean(bl[0]) ;return null;}
else{
((java.io.DataOutputStream)obj).writeBoolean(bl[0]) ;return null;
}
}
else if((methodname+":"+discry).equals("writeByte:(I)V")){
in[0]=((Integer)args[1]).intValue();

if(obj.getClass().getName().equals("instance")){ ((java.io.DataOutputStream)((instance)obj).sclassobj).writeByte(in[0]) ;return null;}
else{
((java.io.DataOutputStream)obj).writeByte(in[0]) ;return null;
}
}
else if((methodname+":"+discry).equals("writeChar:(I)V")){
in[0]=((Integer)args[1]).intValue();

if(obj.getClass().getName().equals("instance")){ ((java.io.DataOutputStream)((instance)obj).sclassobj).writeChar(in[0]) ;return null;}
else{
((java.io.DataOutputStream)obj).writeChar(in[0]) ;return null;
}
}
else if((methodname+":"+discry).equals("writeChars:(Ljava/lang/String;)V")){
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}

if(obj.getClass().getName().equals("instance")){ ((java.io.DataOutputStream)((instance)obj).sclassobj).writeChars((java.lang.String)o[0]) ;return null;}
else{
((java.io.DataOutputStream)obj).writeChars((java.lang.String)o[0]) ;return null;
}
}
else if((methodname+":"+discry).equals("writeDouble:(D)V")){
d[0]=((Double)args[1]).doubleValue();
if(obj.getClass().getName().equals("instance")){ ((java.io.DataOutputStream)((instance)obj).sclassobj).writeDouble(d[0]) ;return null;}
else{
((java.io.DataOutputStream)obj).writeDouble(d[0]) ;return null;
}
}
else if((methodname+":"+discry).equals("writeFloat:(F)V")){
f[0]=((Float)args[1]).floatValue();
if(obj.getClass().getName().equals("instance")){ ((java.io.DataOutputStream)((instance)obj).sclassobj).writeFloat(f[0]) ;return null;}
else{
((java.io.DataOutputStream)obj).writeFloat(f[0]) ;return null;
}
}
else if((methodname+":"+discry).equals("writeInt:(I)V")){
in[0]=((Integer)args[1]).intValue();

if(obj.getClass().getName().equals("instance")){ ((java.io.DataOutputStream)((instance)obj).sclassobj).writeInt(in[0]) ;return null;}
else{
((java.io.DataOutputStream)obj).writeInt(in[0]) ;return null;
}
}
else if((methodname+":"+discry).equals("writeLong:(J)V")){
l[0]=((Long)args[1]).longValue();
if(obj.getClass().getName().equals("instance")){ ((java.io.DataOutputStream)((instance)obj).sclassobj).writeLong(l[0]) ;return null;}
else{
((java.io.DataOutputStream)obj).writeLong(l[0]) ;return null;
}
}
else if((methodname+":"+discry).equals("writeShort:(I)V")){
in[0]=((Integer)args[1]).intValue();

if(obj.getClass().getName().equals("instance")){ ((java.io.DataOutputStream)((instance)obj).sclassobj).writeShort(in[0]) ;return null;}
else{
((java.io.DataOutputStream)obj).writeShort(in[0]) ;return null;
}
}
else if((methodname+":"+discry).equals("writeUTF:(Ljava/lang/String;)V")){
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}

if(obj.getClass().getName().equals("instance")){ ((java.io.DataOutputStream)((instance)obj).sclassobj).writeUTF((java.lang.String)o[0]) ;return null;}
else{
((java.io.DataOutputStream)obj).writeUTF((java.lang.String)o[0]) ;return null;
}
}
}
//Date//java.util.Date
if(Class.forName("java.util.Date").isAssignableFrom(Class.forName(classname.replace('/','.')))){
//constructor_summary
if(methodname.equals("<init>")&&classname.replace('/','.').equals("java.util.Date")){
if ((methodname+":"+discry).equals("<init>:()V")){

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.util.Date();return null;}
else{
((CLDCinstance)obj).cldcobj=new java.util.Date() ;return null;}
}

else if ((methodname+":"+discry).equals("<init>:(J)V")){
l[0]=((Long)args[1]).longValue();
if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.util.Date(l[0]);return null;}
else{
((CLDCinstance)obj).cldcobj=new java.util.Date(l[0]) ;return null;}
}

}
//Method Summary
else if((methodname+":"+discry).equals("equals:(Ljava/lang/Object;)Z")){
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}

if(obj.getClass().getName().equals("instance")){return ( ((java.util.Date)((instance)obj).sclassobj).equals((java.lang.Object)o[0]) )?new Integer(1):new Integer(0);}
else{
return ( ((java.util.Date)obj).equals((java.lang.Object)o[0]) )?new Integer(1):new Integer(0);
}
}
else if((methodname+":"+discry).equals("getTime:()J")){

if(obj.getClass().getName().equals("instance")){return new Long( ((java.util.Date)((instance)obj).sclassobj).getTime() );}
else{
return new Long( ((java.util.Date)obj).getTime() );
}
}
else if((methodname+":"+discry).equals("hashCode:()I")){

if(obj.getClass().getName().equals("instance")){return new Integer( ((java.util.Date)((instance)obj).sclassobj).hashCode() );}
else{
return new Integer( ((java.util.Date)obj).hashCode() );
}
}
else if((methodname+":"+discry).equals("setTime:(J)V")){
l[0]=((Long)args[1]).longValue();
if(obj.getClass().getName().equals("instance")){ ((java.util.Date)((instance)obj).sclassobj).setTime(l[0]) ;return null;}
else{
((java.util.Date)obj).setTime(l[0]) ;return null;
}
}
else if((methodname+":"+discry).equals("toString:()Ljava/lang/String;")){

if(obj.getClass().getName().equals("instance")){return new CLDCinstance( ((java.util.Date)((instance)obj).sclassobj).toString() );}
else{
return new CLDCinstance( ((java.util.Date)obj).toString() );
}
}
}
//EmptyStackException//java.util.EmptyStackException
if(Class.forName("java.util.EmptyStackException").isAssignableFrom(Class.forName(classname.replace('/','.')))){
//constructor_summary
if(methodname.equals("<init>")&&classname.replace('/','.').equals("java.util.EmptyStackException")){
if ((methodname+":"+discry).equals("<init>:()V")){

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.util.EmptyStackException();return null;}
else{
((CLDCinstance)obj).cldcobj=new java.util.EmptyStackException() ;return null;}
}

}
}
//Enumeration//abstract or interface class
//Method Summary
//EOFException//java.io.EOFException
if(Class.forName("java.io.EOFException").isAssignableFrom(Class.forName(classname.replace('/','.')))){
//constructor_summary
if(methodname.equals("<init>")&&classname.replace('/','.').equals("java.io.EOFException")){
if ((methodname+":"+discry).equals("<init>:()V")){

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.io.EOFException();return null;}
else{
((CLDCinstance)obj).cldcobj=new java.io.EOFException() ;return null;}
}

else if ((methodname+":"+discry).equals("<init>:(Ljava/lang/String;)V")){
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.io.EOFException((java.lang.String)o[0]);return null;}
else{
((CLDCinstance)obj).cldcobj=new java.io.EOFException((java.lang.String)o[0]) ;return null;}
}

}
}
//Error//java.lang.Error
if(Class.forName("java.lang.Error").isAssignableFrom(Class.forName(classname.replace('/','.')))){
//constructor_summary
if(methodname.equals("<init>")&&classname.replace('/','.').equals("java.lang.Error")){
if ((methodname+":"+discry).equals("<init>:()V")){

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.lang.Error();return null;}
else{
((CLDCinstance)obj).cldcobj=new java.lang.Error() ;return null;}
}

else if ((methodname+":"+discry).equals("<init>:(Ljava/lang/String;)V")){
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.lang.Error((java.lang.String)o[0]);return null;}
else{
((CLDCinstance)obj).cldcobj=new java.lang.Error((java.lang.String)o[0]) ;return null;}
}

}
}

return doMethodbyName3(classname,methodname,discry,args,obj,mode);
}
public static Object doMethodbyName3(String classname,String methodname,String discry,Object[] args,Object obj,int mode)throws Exception{
boolean[] bl=new boolean[args.length];
double[] d=new double[args.length];
byte[] b=new byte[args.length];
short[] s=new short[args.length];
float[] f=new float[args.length];
long[] l=new long[args.length];
int[] in=new int[args.length];
char[] c=new char[args.length];
Object[] o=new Object[args.length];
//Exception//java.lang.Exception
if(Class.forName("java.lang.Exception").isAssignableFrom(Class.forName(classname.replace('/','.')))){
//constructor_summary
if(methodname.equals("<init>")&&classname.replace('/','.').equals("java.lang.Exception")){
if ((methodname+":"+discry).equals("<init>:()V")){

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.lang.Exception();return null;}
else{
((CLDCinstance)obj).cldcobj=new java.lang.Exception() ;return null;}
}

else if ((methodname+":"+discry).equals("<init>:(Ljava/lang/String;)V")){
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.lang.Exception((java.lang.String)o[0]);return null;}
else{
((CLDCinstance)obj).cldcobj=new java.lang.Exception((java.lang.String)o[0]) ;return null;}
}

}
}
//Hashtable//java.util.Hashtable
if(Class.forName("java.util.Hashtable").isAssignableFrom(Class.forName(classname.replace('/','.')))){
//constructor_summary
if(methodname.equals("<init>")&&classname.replace('/','.').equals("java.util.Hashtable")){
if ((methodname+":"+discry).equals("<init>:()V")){

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.util.Hashtable();return null;}
else{
((CLDCinstance)obj).cldcobj=new java.util.Hashtable() ;return null;}
}

else if ((methodname+":"+discry).equals("<init>:(I)V")){
in[0]=((Integer)args[1]).intValue();

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.util.Hashtable(in[0]);return null;}
else{
((CLDCinstance)obj).cldcobj=new java.util.Hashtable(in[0]) ;return null;}
}

}
//Method Summary
else if((methodname+":"+discry).equals("clear:()V")){

if(obj.getClass().getName().equals("instance")){ ((java.util.Hashtable)((instance)obj).sclassobj).clear() ;return null;}
else{
((java.util.Hashtable)obj).clear() ;return null;
}
}
else if((methodname+":"+discry).equals("contains:(Ljava/lang/Object;)Z")){
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}

if(obj.getClass().getName().equals("instance")){return ( ((java.util.Hashtable)((instance)obj).sclassobj).contains((java.lang.Object)o[0]) )?new Integer(1):new Integer(0);}
else{
return ( ((java.util.Hashtable)obj).contains((java.lang.Object)o[0]) )?new Integer(1):new Integer(0);
}
}
else if((methodname+":"+discry).equals("containsKey:(Ljava/lang/Object;)Z")){
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}

if(obj.getClass().getName().equals("instance")){return ( ((java.util.Hashtable)((instance)obj).sclassobj).containsKey((java.lang.Object)o[0]) )?new Integer(1):new Integer(0);}
else{
return ( ((java.util.Hashtable)obj).containsKey((java.lang.Object)o[0]) )?new Integer(1):new Integer(0);
}
}
else if((methodname+":"+discry).equals("elements:()Ljava/util/Enumeration;")){

if(obj.getClass().getName().equals("instance")){return new CLDCinstance( ((java.util.Hashtable)((instance)obj).sclassobj).elements() );}
else{
return new CLDCinstance( ((java.util.Hashtable)obj).elements() );
}
}
else if((methodname+":"+discry).equals("get:(Ljava/lang/Object;)Ljava/lang/Object;")){
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}

if(obj.getClass().getName().equals("instance")){return new CLDCinstance( ((java.util.Hashtable)((instance)obj).sclassobj).get((java.lang.Object)o[0]) );}
else{
return new CLDCinstance( ((java.util.Hashtable)obj).get((java.lang.Object)o[0]) );
}
}
else if((methodname+":"+discry).equals("isEmpty:()Z")){

if(obj.getClass().getName().equals("instance")){return ( ((java.util.Hashtable)((instance)obj).sclassobj).isEmpty() )?new Integer(1):new Integer(0);}
else{
return ( ((java.util.Hashtable)obj).isEmpty() )?new Integer(1):new Integer(0);
}
}
else if((methodname+":"+discry).equals("keys:()Ljava/util/Enumeration;")){

if(obj.getClass().getName().equals("instance")){return new CLDCinstance( ((java.util.Hashtable)((instance)obj).sclassobj).keys() );}
else{
return new CLDCinstance( ((java.util.Hashtable)obj).keys() );
}
}
else if((methodname+":"+discry).equals("put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;")){
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}
if(args[2].getClass().getName().equals("instance")){
o[1]=((instance)args[2]).sclassobj;
}
else if(args[2].getClass().getName().equals("CLDCinstance")){
o[1]=((CLDCinstance)args[2]).cldcobj;
}

if(obj.getClass().getName().equals("instance")){return new CLDCinstance( ((java.util.Hashtable)((instance)obj).sclassobj).put((java.lang.Object)o[0],(java.lang.Object)o[1]) );}
else{
return new CLDCinstance( ((java.util.Hashtable)obj).put((java.lang.Object)o[0],(java.lang.Object)o[1]) );
}
}
else if((methodname+":"+discry).equals("remove:(Ljava/lang/Object;)Ljava/lang/Object;")){
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}

if(obj.getClass().getName().equals("instance")){return new CLDCinstance( ((java.util.Hashtable)((instance)obj).sclassobj).remove((java.lang.Object)o[0]) );}
else{
return new CLDCinstance( ((java.util.Hashtable)obj).remove((java.lang.Object)o[0]) );
}
}
else if((methodname+":"+discry).equals("size:()I")){

if(obj.getClass().getName().equals("instance")){return new Integer( ((java.util.Hashtable)((instance)obj).sclassobj).size() );}
else{
return new Integer( ((java.util.Hashtable)obj).size() );
}
}
else if((methodname+":"+discry).equals("toString:()Ljava/lang/String;")){

if(obj.getClass().getName().equals("instance")){return new CLDCinstance( ((java.util.Hashtable)((instance)obj).sclassobj).toString() );}
else{
return new CLDCinstance( ((java.util.Hashtable)obj).toString() );
}
}
}
//IllegalAccessException//java.lang.IllegalAccessException
if(Class.forName("java.lang.IllegalAccessException").isAssignableFrom(Class.forName(classname.replace('/','.')))){
//constructor_summary
if(methodname.equals("<init>")&&classname.replace('/','.').equals("java.lang.IllegalAccessException")){
if ((methodname+":"+discry).equals("<init>:()V")){

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.lang.IllegalAccessException();return null;}
else{
((CLDCinstance)obj).cldcobj=new java.lang.IllegalAccessException() ;return null;}
}

else if ((methodname+":"+discry).equals("<init>:(Ljava/lang/String;)V")){
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.lang.IllegalAccessException((java.lang.String)o[0]);return null;}
else{
((CLDCinstance)obj).cldcobj=new java.lang.IllegalAccessException((java.lang.String)o[0]) ;return null;}
}

}
}
//IllegalArgumentException//java.lang.IllegalArgumentException
if(Class.forName("java.lang.IllegalArgumentException").isAssignableFrom(Class.forName(classname.replace('/','.')))){
//constructor_summary
if(methodname.equals("<init>")&&classname.replace('/','.').equals("java.lang.IllegalArgumentException")){
if ((methodname+":"+discry).equals("<init>:()V")){

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.lang.IllegalArgumentException();return null;}
else{
((CLDCinstance)obj).cldcobj=new java.lang.IllegalArgumentException() ;return null;}
}

else if ((methodname+":"+discry).equals("<init>:(Ljava/lang/String;)V")){
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.lang.IllegalArgumentException((java.lang.String)o[0]);return null;}
else{
((CLDCinstance)obj).cldcobj=new java.lang.IllegalArgumentException((java.lang.String)o[0]) ;return null;}
}

}
}
//IllegalMonitorStateException//java.lang.IllegalMonitorStateException
if(Class.forName("java.lang.IllegalMonitorStateException").isAssignableFrom(Class.forName(classname.replace('/','.')))){
//constructor_summary
if(methodname.equals("<init>")&&classname.replace('/','.').equals("java.lang.IllegalMonitorStateException")){
if ((methodname+":"+discry).equals("<init>:()V")){

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.lang.IllegalMonitorStateException();return null;}
else{
((CLDCinstance)obj).cldcobj=new java.lang.IllegalMonitorStateException() ;return null;}
}

else if ((methodname+":"+discry).equals("<init>:(Ljava/lang/String;)V")){
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.lang.IllegalMonitorStateException((java.lang.String)o[0]);return null;}
else{
((CLDCinstance)obj).cldcobj=new java.lang.IllegalMonitorStateException((java.lang.String)o[0]) ;return null;}
}

}
}
//IllegalThreadStateException//java.lang.IllegalThreadStateException
if(Class.forName("java.lang.IllegalThreadStateException").isAssignableFrom(Class.forName(classname.replace('/','.')))){
//constructor_summary
if(methodname.equals("<init>")&&classname.replace('/','.').equals("java.lang.IllegalThreadStateException")){
if ((methodname+":"+discry).equals("<init>:()V")){

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.lang.IllegalThreadStateException();return null;}
else{
((CLDCinstance)obj).cldcobj=new java.lang.IllegalThreadStateException() ;return null;}
}

else if ((methodname+":"+discry).equals("<init>:(Ljava/lang/String;)V")){
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.lang.IllegalThreadStateException((java.lang.String)o[0]);return null;}
else{
((CLDCinstance)obj).cldcobj=new java.lang.IllegalThreadStateException((java.lang.String)o[0]) ;return null;}
}

}
}
//IndexOutOfBoundsException//java.lang.IndexOutOfBoundsException
if(Class.forName("java.lang.IndexOutOfBoundsException").isAssignableFrom(Class.forName(classname.replace('/','.')))){
//constructor_summary
if(methodname.equals("<init>")&&classname.replace('/','.').equals("java.lang.IndexOutOfBoundsException")){
if ((methodname+":"+discry).equals("<init>:()V")){

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.lang.IndexOutOfBoundsException();return null;}
else{
((CLDCinstance)obj).cldcobj=new java.lang.IndexOutOfBoundsException() ;return null;}
}

else if ((methodname+":"+discry).equals("<init>:(Ljava/lang/String;)V")){
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.lang.IndexOutOfBoundsException((java.lang.String)o[0]);return null;}
else{
((CLDCinstance)obj).cldcobj=new java.lang.IndexOutOfBoundsException((java.lang.String)o[0]) ;return null;}
}

}
}
//InputConnection//abstract or interface class
//Method Summary
//InputStream//java.io.InputStream
if(Class.forName("java.io.InputStream").isAssignableFrom(Class.forName(classname.replace('/','.')))){
//print this is abstract class
//constructor_summary
if(methodname.equals("<init>")&&classname.replace('/','.').equals("java.io.InputStream")){
}
//Method Summary
if((methodname+":"+discry).equals("available:()I")){

if(obj.getClass().getName().equals("instance")){return new Integer( ((java.io.InputStream)((instance)obj).sclassobj).available() );}
else{
return new Integer( ((java.io.InputStream)obj).available() );
}
}
else if((methodname+":"+discry).equals("close:()V")){

if(obj.getClass().getName().equals("instance")){ ((java.io.InputStream)((instance)obj).sclassobj).close() ;return null;}
else{
((java.io.InputStream)obj).close() ;return null;
}
}
else if((methodname+":"+discry).equals("mark:(I)V")){
in[0]=((Integer)args[1]).intValue();

if(obj.getClass().getName().equals("instance")){ ((java.io.InputStream)((instance)obj).sclassobj).mark(in[0]) ;return null;}
else{
((java.io.InputStream)obj).mark(in[0]) ;return null;
}
}
else if((methodname+":"+discry).equals("markSupported:()Z")){

if(obj.getClass().getName().equals("instance")){return ( ((java.io.InputStream)((instance)obj).sclassobj).markSupported() )?new Integer(1):new Integer(0);}
else{
return ( ((java.io.InputStream)obj).markSupported() )?new Integer(1):new Integer(0);
}
}
else if((methodname+":"+discry).equals("read:()I")){

if(obj.getClass().getName().equals("instance")){return new Integer( ((java.io.InputStream)((instance)obj).sclassobj).read() );}
else{
return new Integer( ((java.io.InputStream)obj).read() );
}
}
else if((methodname+":"+discry).equals("read:([B)I")){

if(obj.getClass().getName().equals("instance")){return new Integer( ((java.io.InputStream)((instance)obj).sclassobj).read((byte[])args[1]) );}
else{
return new Integer( ((java.io.InputStream)obj).read((byte[])args[1]) );
}
}
else if((methodname+":"+discry).equals("read:([BII)I")){
in[0]=((Integer)args[2]).intValue();
in[1]=((Integer)args[3]).intValue();

if(obj.getClass().getName().equals("instance")){return new Integer( ((java.io.InputStream)((instance)obj).sclassobj).read((byte[])args[1],in[0],in[1]) );}
else{
return new Integer( ((java.io.InputStream)obj).read((byte[])args[1],in[0],in[1]) );
}
}
else if((methodname+":"+discry).equals("reset:()V")){

if(obj.getClass().getName().equals("instance")){ ((java.io.InputStream)((instance)obj).sclassobj).reset() ;return null;}
else{
((java.io.InputStream)obj).reset() ;return null;
}
}
else if((methodname+":"+discry).equals("skip:(J)J")){
l[0]=((Long)args[1]).longValue();
if(obj.getClass().getName().equals("instance")){return new Long( ((java.io.InputStream)((instance)obj).sclassobj).skip(l[0]) );}
else{
return new Long( ((java.io.InputStream)obj).skip(l[0]) );
}
}
}
//InputStreamReader//java.io.InputStreamReader
if(Class.forName("java.io.InputStreamReader").isAssignableFrom(Class.forName(classname.replace('/','.')))){
//constructor_summary
if(methodname.equals("<init>")&&classname.replace('/','.').equals("java.io.InputStreamReader")){
if ((methodname+":"+discry).equals("<init>:(Ljava/io/InputStream;)V")){
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.io.InputStreamReader((java.io.InputStream)o[0]);return null;}
else{
((CLDCinstance)obj).cldcobj=new java.io.InputStreamReader((java.io.InputStream)o[0]) ;return null;}
}

else if ((methodname+":"+discry).equals("<init>:(Ljava/io/InputStream;Ljava/lang/String;)V")){
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}
if(args[2].getClass().getName().equals("instance")){
o[1]=((instance)args[2]).sclassobj;
}
else if(args[2].getClass().getName().equals("CLDCinstance")){
o[1]=((CLDCinstance)args[2]).cldcobj;
}

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.io.InputStreamReader((java.io.InputStream)o[0],(java.lang.String)o[1]);return null;}
else{
((CLDCinstance)obj).cldcobj=new java.io.InputStreamReader((java.io.InputStream)o[0],(java.lang.String)o[1]) ;return null;}
}

}
//Method Summary
else if((methodname+":"+discry).equals("close:()V")){

if(obj.getClass().getName().equals("instance")){ ((java.io.InputStreamReader)((instance)obj).sclassobj).close() ;return null;}
else{
((java.io.InputStreamReader)obj).close() ;return null;
}
}
else if((methodname+":"+discry).equals("mark:(I)V")){
in[0]=((Integer)args[1]).intValue();

if(obj.getClass().getName().equals("instance")){ ((java.io.InputStreamReader)((instance)obj).sclassobj).mark(in[0]) ;return null;}
else{
((java.io.InputStreamReader)obj).mark(in[0]) ;return null;
}
}
else if((methodname+":"+discry).equals("markSupported:()Z")){

if(obj.getClass().getName().equals("instance")){return ( ((java.io.InputStreamReader)((instance)obj).sclassobj).markSupported() )?new Integer(1):new Integer(0);}
else{
return ( ((java.io.InputStreamReader)obj).markSupported() )?new Integer(1):new Integer(0);
}
}
else if((methodname+":"+discry).equals("read:()I")){

if(obj.getClass().getName().equals("instance")){return new Integer( ((java.io.InputStreamReader)((instance)obj).sclassobj).read() );}
else{
return new Integer( ((java.io.InputStreamReader)obj).read() );
}
}
else if((methodname+":"+discry).equals("read:([CII)I")){
in[0]=((Integer)args[2]).intValue();
in[1]=((Integer)args[3]).intValue();

if(obj.getClass().getName().equals("instance")){return new Integer( ((java.io.InputStreamReader)((instance)obj).sclassobj).read((char[])args[1],in[0],in[1]) );}
else{
return new Integer( ((java.io.InputStreamReader)obj).read((char[])args[1],in[0],in[1]) );
}
}
else if((methodname+":"+discry).equals("ready:()Z")){

if(obj.getClass().getName().equals("instance")){return ( ((java.io.InputStreamReader)((instance)obj).sclassobj).ready() )?new Integer(1):new Integer(0);}
else{
return ( ((java.io.InputStreamReader)obj).ready() )?new Integer(1):new Integer(0);
}
}
else if((methodname+":"+discry).equals("reset:()V")){

if(obj.getClass().getName().equals("instance")){ ((java.io.InputStreamReader)((instance)obj).sclassobj).reset() ;return null;}
else{
((java.io.InputStreamReader)obj).reset() ;return null;
}
}
else if((methodname+":"+discry).equals("skip:(J)J")){
l[0]=((Long)args[1]).longValue();
if(obj.getClass().getName().equals("instance")){return new Long( ((java.io.InputStreamReader)((instance)obj).sclassobj).skip(l[0]) );}
else{
return new Long( ((java.io.InputStreamReader)obj).skip(l[0]) );
}
}
}
//InstantiationException//java.lang.InstantiationException
if(Class.forName("java.lang.InstantiationException").isAssignableFrom(Class.forName(classname.replace('/','.')))){
//constructor_summary
if(methodname.equals("<init>")&&classname.replace('/','.').equals("java.lang.InstantiationException")){
if ((methodname+":"+discry).equals("<init>:()V")){

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.lang.InstantiationException();return null;}
else{
((CLDCinstance)obj).cldcobj=new java.lang.InstantiationException() ;return null;}
}

else if ((methodname+":"+discry).equals("<init>:(Ljava/lang/String;)V")){
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.lang.InstantiationException((java.lang.String)o[0]);return null;}
else{
((CLDCinstance)obj).cldcobj=new java.lang.InstantiationException((java.lang.String)o[0]) ;return null;}
}

}
}
//Integer//java.lang.Integer
if(Class.forName("java.lang.Integer").isAssignableFrom(Class.forName(classname.replace('/','.')))){
//constructor_summary
if(methodname.equals("<init>")&&classname.replace('/','.').equals("java.lang.Integer")){
if ((methodname+":"+discry).equals("<init>:(I)V")){
in[0]=((Integer)args[1]).intValue();

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.lang.Integer(in[0]);return null;}
else{
((CLDCinstance)obj).cldcobj=new java.lang.Integer(in[0]) ;return null;}
}

}
//Method Summary
else if((methodname+":"+discry).equals("byteValue:()B")){

if(obj.getClass().getName().equals("instance")){return new Integer( ((java.lang.Integer)((instance)obj).sclassobj).byteValue() );}
else{
return new Integer( ((java.lang.Integer)obj).byteValue() );
}
}
else if((methodname+":"+discry).equals("doubleValue:()D")){

if(obj.getClass().getName().equals("instance")){return new Double( ((java.lang.Integer)((instance)obj).sclassobj).doubleValue() );}
else{
return new Double( ((java.lang.Integer)obj).doubleValue() );
}
}
else if((methodname+":"+discry).equals("equals:(Ljava/lang/Object;)Z")){
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}

if(obj.getClass().getName().equals("instance")){return ( ((java.lang.Integer)((instance)obj).sclassobj).equals((java.lang.Object)o[0]) )?new Integer(1):new Integer(0);}
else{
return ( ((java.lang.Integer)obj).equals((java.lang.Object)o[0]) )?new Integer(1):new Integer(0);
}
}
else if((methodname+":"+discry).equals("floatValue:()F")){

if(obj.getClass().getName().equals("instance")){return new Float( ((java.lang.Integer)((instance)obj).sclassobj).floatValue() );}
else{
return new Float( ((java.lang.Integer)obj).floatValue() );
}
}
else if((methodname+":"+discry).equals("hashCode:()I")){

if(obj.getClass().getName().equals("instance")){return new Integer( ((java.lang.Integer)((instance)obj).sclassobj).hashCode() );}
else{
return new Integer( ((java.lang.Integer)obj).hashCode() );
}
}
else if((methodname+":"+discry).equals("intValue:()I")){

if(obj.getClass().getName().equals("instance")){return new Integer( ((java.lang.Integer)((instance)obj).sclassobj).intValue() );}
else{
return new Integer( ((java.lang.Integer)obj).intValue() );
}
}
else if((methodname+":"+discry).equals("longValue:()J")){

if(obj.getClass().getName().equals("instance")){return new Long( ((java.lang.Integer)((instance)obj).sclassobj).longValue() );}
else{
return new Long( ((java.lang.Integer)obj).longValue() );
}
}
else if((methodname+":"+discry).equals("parseInt:(Ljava/lang/String;)I")){
if(args[0].getClass().getName().equals("instance")){
o[0]=((instance)args[0]).sclassobj;
}
else if(args[0].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[0]).cldcobj;
}



return new Integer( java.lang.Integer.parseInt((java.lang.String)o[0]) );
}

else if((methodname+":"+discry).equals("parseInt:(Ljava/lang/String;I)I")){
if(args[0].getClass().getName().equals("instance")){
o[0]=((instance)args[0]).sclassobj;
}
else if(args[0].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[0]).cldcobj;
}
in[0]=((Integer)args[1]).intValue();



return new Integer( java.lang.Integer.parseInt((java.lang.String)o[0],in[0]) );
}

else if((methodname+":"+discry).equals("shortValue:()S")){

if(obj.getClass().getName().equals("instance")){return new Integer( ((java.lang.Integer)((instance)obj).sclassobj).shortValue() );}
else{
return new Integer( ((java.lang.Integer)obj).shortValue() );
}
}
else if((methodname+":"+discry).equals("toBinaryString:(I)Ljava/lang/String;")){
in[0]=((Integer)args[0]).intValue();



return new CLDCinstance( java.lang.Integer.toBinaryString(in[0]) );
}

else if((methodname+":"+discry).equals("toHexString:(I)Ljava/lang/String;")){
in[0]=((Integer)args[0]).intValue();



return new CLDCinstance( java.lang.Integer.toHexString(in[0]) );
}

else if((methodname+":"+discry).equals("toOctalString:(I)Ljava/lang/String;")){
in[0]=((Integer)args[0]).intValue();



return new CLDCinstance( java.lang.Integer.toOctalString(in[0]) );
}

else if((methodname+":"+discry).equals("toString:()Ljava/lang/String;")){

if(obj.getClass().getName().equals("instance")){return new CLDCinstance( ((java.lang.Integer)((instance)obj).sclassobj).toString() );}
else{
return new CLDCinstance( ((java.lang.Integer)obj).toString() );
}
}
else if((methodname+":"+discry).equals("toString:(I)Ljava/lang/String;")){
in[0]=((Integer)args[0]).intValue();



return new CLDCinstance( java.lang.Integer.toString(in[0]) );
}

else if((methodname+":"+discry).equals("toString:(II)Ljava/lang/String;")){
in[0]=((Integer)args[0]).intValue();
in[1]=((Integer)args[1]).intValue();



return new CLDCinstance( java.lang.Integer.toString(in[0],in[1]) );
}

else if((methodname+":"+discry).equals("valueOf:(Ljava/lang/String;)Ljava/lang/Integer;")){
if(args[0].getClass().getName().equals("instance")){
o[0]=((instance)args[0]).sclassobj;
}
else if(args[0].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[0]).cldcobj;
}



return new CLDCinstance( java.lang.Integer.valueOf((java.lang.String)o[0]) );
}

else if((methodname+":"+discry).equals("valueOf:(Ljava/lang/String;I)Ljava/lang/Integer;")){
if(args[0].getClass().getName().equals("instance")){
o[0]=((instance)args[0]).sclassobj;
}
else if(args[0].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[0]).cldcobj;
}
in[0]=((Integer)args[1]).intValue();



return new CLDCinstance( java.lang.Integer.valueOf((java.lang.String)o[0],in[0]) );
}

}
//InterruptedException//java.lang.InterruptedException
if(Class.forName("java.lang.InterruptedException").isAssignableFrom(Class.forName(classname.replace('/','.')))){
//constructor_summary
if(methodname.equals("<init>")&&classname.replace('/','.').equals("java.lang.InterruptedException")){
if ((methodname+":"+discry).equals("<init>:()V")){

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.lang.InterruptedException();return null;}
else{
((CLDCinstance)obj).cldcobj=new java.lang.InterruptedException() ;return null;}
}

else if ((methodname+":"+discry).equals("<init>:(Ljava/lang/String;)V")){
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.lang.InterruptedException((java.lang.String)o[0]);return null;}
else{
((CLDCinstance)obj).cldcobj=new java.lang.InterruptedException((java.lang.String)o[0]) ;return null;}
}

}
}
//InterruptedIOException//java.io.InterruptedIOException
if(Class.forName("java.io.InterruptedIOException").isAssignableFrom(Class.forName(classname.replace('/','.')))){
//constructor_summary
if(methodname.equals("<init>")&&classname.replace('/','.').equals("java.io.InterruptedIOException")){
if ((methodname+":"+discry).equals("<init>:()V")){

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.io.InterruptedIOException();return null;}
else{
((CLDCinstance)obj).cldcobj=new java.io.InterruptedIOException() ;return null;}
}

else if ((methodname+":"+discry).equals("<init>:(Ljava/lang/String;)V")){
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.io.InterruptedIOException((java.lang.String)o[0]);return null;}
else{
((CLDCinstance)obj).cldcobj=new java.io.InterruptedIOException((java.lang.String)o[0]) ;return null;}
}

}
}

return doMethodbyName4(classname,methodname,discry,args,obj,mode);
}
public static Object doMethodbyName4(String classname,String methodname,String discry,Object[] args,Object obj,int mode)throws Exception{
boolean[] bl=new boolean[args.length];
double[] d=new double[args.length];
byte[] b=new byte[args.length];
short[] s=new short[args.length];
float[] f=new float[args.length];
long[] l=new long[args.length];
int[] in=new int[args.length];
char[] c=new char[args.length];
Object[] o=new Object[args.length];
//IOException//java.io.IOException
if(Class.forName("java.io.IOException").isAssignableFrom(Class.forName(classname.replace('/','.')))){
//constructor_summary
if(methodname.equals("<init>")&&classname.replace('/','.').equals("java.io.IOException")){
if ((methodname+":"+discry).equals("<init>:()V")){

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.io.IOException();return null;}
else{
((CLDCinstance)obj).cldcobj=new java.io.IOException() ;return null;}
}

else if ((methodname+":"+discry).equals("<init>:(Ljava/lang/String;)V")){
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.io.IOException((java.lang.String)o[0]);return null;}
else{
((CLDCinstance)obj).cldcobj=new java.io.IOException((java.lang.String)o[0]) ;return null;}
}

}
}
//Long//java.lang.Long
if(Class.forName("java.lang.Long").isAssignableFrom(Class.forName(classname.replace('/','.')))){
//constructor_summary
if(methodname.equals("<init>")&&classname.replace('/','.').equals("java.lang.Long")){
if ((methodname+":"+discry).equals("<init>:(J)V")){
l[0]=((Long)args[1]).longValue();
if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.lang.Long(l[0]);return null;}
else{
((CLDCinstance)obj).cldcobj=new java.lang.Long(l[0]) ;return null;}
}

}
//Method Summary
else if((methodname+":"+discry).equals("doubleValue:()D")){

if(obj.getClass().getName().equals("instance")){return new Double( ((java.lang.Long)((instance)obj).sclassobj).doubleValue() );}
else{
return new Double( ((java.lang.Long)obj).doubleValue() );
}
}
else if((methodname+":"+discry).equals("equals:(Ljava/lang/Object;)Z")){
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}

if(obj.getClass().getName().equals("instance")){return ( ((java.lang.Long)((instance)obj).sclassobj).equals((java.lang.Object)o[0]) )?new Integer(1):new Integer(0);}
else{
return ( ((java.lang.Long)obj).equals((java.lang.Object)o[0]) )?new Integer(1):new Integer(0);
}
}
else if((methodname+":"+discry).equals("floatValue:()F")){

if(obj.getClass().getName().equals("instance")){return new Float( ((java.lang.Long)((instance)obj).sclassobj).floatValue() );}
else{
return new Float( ((java.lang.Long)obj).floatValue() );
}
}
else if((methodname+":"+discry).equals("hashCode:()I")){

if(obj.getClass().getName().equals("instance")){return new Integer( ((java.lang.Long)((instance)obj).sclassobj).hashCode() );}
else{
return new Integer( ((java.lang.Long)obj).hashCode() );
}
}
else if((methodname+":"+discry).equals("longValue:()J")){

if(obj.getClass().getName().equals("instance")){return new Long( ((java.lang.Long)((instance)obj).sclassobj).longValue() );}
else{
return new Long( ((java.lang.Long)obj).longValue() );
}
}
else if((methodname+":"+discry).equals("parseLong:(Ljava/lang/String;)J")){
if(args[0].getClass().getName().equals("instance")){
o[0]=((instance)args[0]).sclassobj;
}
else if(args[0].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[0]).cldcobj;
}



return new Long( java.lang.Long.parseLong((java.lang.String)o[0]) );
}

else if((methodname+":"+discry).equals("parseLong:(Ljava/lang/String;I)J")){
if(args[0].getClass().getName().equals("instance")){
o[0]=((instance)args[0]).sclassobj;
}
else if(args[0].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[0]).cldcobj;
}
in[0]=((Integer)args[1]).intValue();



return new Long( java.lang.Long.parseLong((java.lang.String)o[0],in[0]) );
}

else if((methodname+":"+discry).equals("toString:()Ljava/lang/String;")){

if(obj.getClass().getName().equals("instance")){return new CLDCinstance( ((java.lang.Long)((instance)obj).sclassobj).toString() );}
else{
return new CLDCinstance( ((java.lang.Long)obj).toString() );
}
}
else if((methodname+":"+discry).equals("toString:(J)Ljava/lang/String;")){
l[0]=((Long)args[0]).longValue();


return new CLDCinstance( java.lang.Long.toString(l[0]) );
}

else if((methodname+":"+discry).equals("toString:(JI)Ljava/lang/String;")){
l[0]=((Long)args[0]).longValue();in[0]=((Integer)args[1]).intValue();



return new CLDCinstance( java.lang.Long.toString(l[0],in[0]) );
}

}
//Math//java.lang.Math
if(Class.forName("java.lang.Math").isAssignableFrom(Class.forName(classname.replace('/','.')))){
//Method Summary
if((methodname+":"+discry).equals("abs:(D)D")){
d[0]=((Double)args[0]).doubleValue();


return new Double( java.lang.Math.abs(d[0]) );
}

else if((methodname+":"+discry).equals("abs:(F)F")){
f[0]=((Float)args[0]).floatValue();


return new Float( java.lang.Math.abs(f[0]) );
}

else if((methodname+":"+discry).equals("abs:(I)I")){
in[0]=((Integer)args[0]).intValue();



return new Integer( java.lang.Math.abs(in[0]) );
}

else if((methodname+":"+discry).equals("abs:(J)J")){
l[0]=((Long)args[0]).longValue();


return new Long( java.lang.Math.abs(l[0]) );
}

else if((methodname+":"+discry).equals("ceil:(D)D")){
d[0]=((Double)args[0]).doubleValue();


return new Double( java.lang.Math.ceil(d[0]) );
}

else if((methodname+":"+discry).equals("cos:(D)D")){
d[0]=((Double)args[0]).doubleValue();


return new Double( java.lang.Math.cos(d[0]) );
}

else if((methodname+":"+discry).equals("floor:(D)D")){
d[0]=((Double)args[0]).doubleValue();


return new Double( java.lang.Math.floor(d[0]) );
}

else if((methodname+":"+discry).equals("max:(DD)D")){
d[0]=((Double)args[0]).doubleValue();d[1]=((Double)args[2]).doubleValue();


return new Double( java.lang.Math.max(d[0],d[1]) );
}

else if((methodname+":"+discry).equals("max:(FF)F")){
f[0]=((Float)args[0]).floatValue();f[1]=((Float)args[1]).floatValue();


return new Float( java.lang.Math.max(f[0],f[1]) );
}

else if((methodname+":"+discry).equals("max:(II)I")){
in[0]=((Integer)args[0]).intValue();
in[1]=((Integer)args[1]).intValue();



return new Integer( java.lang.Math.max(in[0],in[1]) );
}

else if((methodname+":"+discry).equals("max:(JJ)J")){
l[0]=((Long)args[0]).longValue();l[1]=((Long)args[1]).longValue();


return new Long( java.lang.Math.max(l[0],l[1]) );
}

else if((methodname+":"+discry).equals("min:(DD)D")){
d[0]=((Double)args[0]).doubleValue();d[1]=((Double)args[2]).doubleValue();


return new Double( java.lang.Math.min(d[0],d[1]) );
}

else if((methodname+":"+discry).equals("min:(FF)F")){
f[0]=((Float)args[0]).floatValue();f[1]=((Float)args[1]).floatValue();


return new Float( java.lang.Math.min(f[0],f[1]) );
}

else if((methodname+":"+discry).equals("min:(II)I")){
in[0]=((Integer)args[0]).intValue();
in[1]=((Integer)args[1]).intValue();



return new Integer( java.lang.Math.min(in[0],in[1]) );
}

else if((methodname+":"+discry).equals("min:(JJ)J")){
l[0]=((Long)args[0]).longValue();l[1]=((Long)args[1]).longValue();


return new Long( java.lang.Math.min(l[0],l[1]) );
}

else if((methodname+":"+discry).equals("sin:(D)D")){
d[0]=((Double)args[0]).doubleValue();


return new Double( java.lang.Math.sin(d[0]) );
}

else if((methodname+":"+discry).equals("sqrt:(D)D")){
d[0]=((Double)args[0]).doubleValue();


return new Double( java.lang.Math.sqrt(d[0]) );
}

else if((methodname+":"+discry).equals("tan:(D)D")){
d[0]=((Double)args[0]).doubleValue();


return new Double( java.lang.Math.tan(d[0]) );
}

else if((methodname+":"+discry).equals("toDegrees:(D)D")){
d[0]=((Double)args[0]).doubleValue();


return new Double( java.lang.Math.toDegrees(d[0]) );
}

else if((methodname+":"+discry).equals("toRadians:(D)D")){
d[0]=((Double)args[0]).doubleValue();


return new Double( java.lang.Math.toRadians(d[0]) );
}

}
//NegativeArraySizeException//java.lang.NegativeArraySizeException
if(Class.forName("java.lang.NegativeArraySizeException").isAssignableFrom(Class.forName(classname.replace('/','.')))){
//constructor_summary
if(methodname.equals("<init>")&&classname.replace('/','.').equals("java.lang.NegativeArraySizeException")){
if ((methodname+":"+discry).equals("<init>:()V")){

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.lang.NegativeArraySizeException();return null;}
else{
((CLDCinstance)obj).cldcobj=new java.lang.NegativeArraySizeException() ;return null;}
}

else if ((methodname+":"+discry).equals("<init>:(Ljava/lang/String;)V")){
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.lang.NegativeArraySizeException((java.lang.String)o[0]);return null;}
else{
((CLDCinstance)obj).cldcobj=new java.lang.NegativeArraySizeException((java.lang.String)o[0]) ;return null;}
}

}
}
//NoSuchElementException//java.util.NoSuchElementException
if(Class.forName("java.util.NoSuchElementException").isAssignableFrom(Class.forName(classname.replace('/','.')))){
//constructor_summary
if(methodname.equals("<init>")&&classname.replace('/','.').equals("java.util.NoSuchElementException")){
if ((methodname+":"+discry).equals("<init>:()V")){

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.util.NoSuchElementException();return null;}
else{
((CLDCinstance)obj).cldcobj=new java.util.NoSuchElementException() ;return null;}
}

else if ((methodname+":"+discry).equals("<init>:(Ljava/lang/String;)V")){
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.util.NoSuchElementException((java.lang.String)o[0]);return null;}
else{
((CLDCinstance)obj).cldcobj=new java.util.NoSuchElementException((java.lang.String)o[0]) ;return null;}
}

}
}
//NullPointerException//java.lang.NullPointerException
if(Class.forName("java.lang.NullPointerException").isAssignableFrom(Class.forName(classname.replace('/','.')))){
//constructor_summary
if(methodname.equals("<init>")&&classname.replace('/','.').equals("java.lang.NullPointerException")){
if ((methodname+":"+discry).equals("<init>:()V")){

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.lang.NullPointerException();return null;}
else{
((CLDCinstance)obj).cldcobj=new java.lang.NullPointerException() ;return null;}
}

else if ((methodname+":"+discry).equals("<init>:(Ljava/lang/String;)V")){
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.lang.NullPointerException((java.lang.String)o[0]);return null;}
else{
((CLDCinstance)obj).cldcobj=new java.lang.NullPointerException((java.lang.String)o[0]) ;return null;}
}

}
}
//NumberFormatException//java.lang.NumberFormatException
if(Class.forName("java.lang.NumberFormatException").isAssignableFrom(Class.forName(classname.replace('/','.')))){
//constructor_summary
if(methodname.equals("<init>")&&classname.replace('/','.').equals("java.lang.NumberFormatException")){
if ((methodname+":"+discry).equals("<init>:()V")){

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.lang.NumberFormatException();return null;}
else{
((CLDCinstance)obj).cldcobj=new java.lang.NumberFormatException() ;return null;}
}

else if ((methodname+":"+discry).equals("<init>:(Ljava/lang/String;)V")){
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.lang.NumberFormatException((java.lang.String)o[0]);return null;}
else{
((CLDCinstance)obj).cldcobj=new java.lang.NumberFormatException((java.lang.String)o[0]) ;return null;}
}

}
}
//Object//java.lang.Object
if(Class.forName("java.lang.Object").isAssignableFrom(Class.forName(classname.replace('/','.')))){
//constructor_summary
if(methodname.equals("<init>")&&classname.replace('/','.').equals("java.lang.Object")){
if ((methodname+":"+discry).equals("<init>:()V")){

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.lang.Object();return null;}
else{
((CLDCinstance)obj).cldcobj=new java.lang.Object() ;return null;}
}

}
//Method Summary
else if((methodname+":"+discry).equals("equals:(Ljava/lang/Object;)Z")){
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}

if(obj.getClass().getName().equals("instance")){return ( ((java.lang.Object)((instance)obj).sclassobj).equals((java.lang.Object)o[0]) )?new Integer(1):new Integer(0);}
else{
return ( ((java.lang.Object)obj).equals((java.lang.Object)o[0]) )?new Integer(1):new Integer(0);
}
}
else if((methodname+":"+discry).equals("getClass:()Ljava/lang/Class;")){

if(obj.getClass().getName().equals("instance")){return new CLDCinstance( ((java.lang.Object)((instance)obj).sclassobj).getClass() );}
else{
return new CLDCinstance( ((java.lang.Object)obj).getClass() );
}
}
else if((methodname+":"+discry).equals("hashCode:()I")){

if(obj.getClass().getName().equals("instance")){return new Integer( ((java.lang.Object)((instance)obj).sclassobj).hashCode() );}
else{
return new Integer( ((java.lang.Object)obj).hashCode() );
}
}
else if((methodname+":"+discry).equals("notify:()V")){

if(obj.getClass().getName().equals("instance")){ ((java.lang.Object)((instance)obj).sclassobj).notify() ;return null;}
else{
((java.lang.Object)obj).notify() ;return null;
}
}
else if((methodname+":"+discry).equals("notifyAll:()V")){

if(obj.getClass().getName().equals("instance")){ ((java.lang.Object)((instance)obj).sclassobj).notifyAll() ;return null;}
else{
((java.lang.Object)obj).notifyAll() ;return null;
}
}
else if((methodname+":"+discry).equals("toString:()Ljava/lang/String;")){

if(obj.getClass().getName().equals("instance")){return new CLDCinstance( ((java.lang.Object)((instance)obj).sclassobj).toString() );}
else{
return new CLDCinstance( ((java.lang.Object)obj).toString() );
}
}
else if((methodname+":"+discry).equals("wait:()V")){

if(obj.getClass().getName().equals("instance")){ ((java.lang.Object)((instance)obj).sclassobj).wait() ;return null;}
else{
((java.lang.Object)obj).wait() ;return null;
}
}
else if((methodname+":"+discry).equals("notifyAll:(Ljava/lang/Object;)V")){

if(obj.getClass().getName().equals("instance")){((java.lang.Object)((instance)obj).sclassobj).notifyAll();}
else{
 ((java.lang.Object)obj).notifyAll();
}
}
else if((methodname+":"+discry).equals("wait:(J)V")){
l[0]=((Long)args[1]).longValue();
if(obj.getClass().getName().equals("instance")){ ((java.lang.Object)((instance)obj).sclassobj).wait(l[0]) ;return null;}
else{
((java.lang.Object)obj).wait(l[0]) ;return null;
}
}
else if((methodname+":"+discry).equals("notifyAll:(Ljava/lang/Object;)V")){

if(obj.getClass().getName().equals("instance")){ ((java.lang.Object)((instance)obj).sclassobj).notifyAll();}
else{
 ((java.lang.Object)obj).notifyAll();
}
}
else if((methodname+":"+discry).equals("wait:(JI)V")){
l[0]=((Long)args[1]).longValue();in[0]=((Integer)args[2]).intValue();

if(obj.getClass().getName().equals("instance")){ ((java.lang.Object)((instance)obj).sclassobj).wait(l[0],in[0]) ;return null;}
else{
((java.lang.Object)obj).wait(l[0],in[0]) ;return null;
}
}
else if((methodname+":"+discry).equals("notifyAll:(Ljava/lang/Object;)V")){

if(obj.getClass().getName().equals("instance")) {((java.lang.Object)((instance)obj).sclassobj).notifyAll(); }
else{
 ((java.lang.Object)obj).notifyAll() ;
}
}
}
//OutOfMemoryError//java.lang.OutOfMemoryError
if(Class.forName("java.lang.OutOfMemoryError").isAssignableFrom(Class.forName(classname.replace('/','.')))){
//constructor_summary
if(methodname.equals("<init>")&&classname.replace('/','.').equals("java.lang.OutOfMemoryError")){
if ((methodname+":"+discry).equals("<init>:()V")){

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.lang.OutOfMemoryError();return null;}
else{
((CLDCinstance)obj).cldcobj=new java.lang.OutOfMemoryError() ;return null;}
}

else if ((methodname+":"+discry).equals("<init>:(Ljava/lang/String;)V")){
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.lang.OutOfMemoryError((java.lang.String)o[0]);return null;}
else{
((CLDCinstance)obj).cldcobj=new java.lang.OutOfMemoryError((java.lang.String)o[0]) ;return null;}
}

}
}
//OutputConnection//abstract or interface class
//Method Summary
//OutputStream//java.io.OutputStream
if(Class.forName("java.io.OutputStream").isAssignableFrom(Class.forName(classname.replace('/','.')))){
//print this is abstract class
//constructor_summary
if(methodname.equals("<init>")&&classname.replace('/','.').equals("java.io.OutputStream")){
}
//Method Summary
if((methodname+":"+discry).equals("close:()V")){

if(obj.getClass().getName().equals("instance")){ ((java.io.OutputStream)((instance)obj).sclassobj).close() ;return null;}
else{
((java.io.OutputStream)obj).close() ;return null;
}
}
else if((methodname+":"+discry).equals("flush:()V")){

if(obj.getClass().getName().equals("instance")){ ((java.io.OutputStream)((instance)obj).sclassobj).flush() ;return null;}
else{
((java.io.OutputStream)obj).flush() ;return null;
}
}
else if((methodname+":"+discry).equals("write:([B)V")){

if(obj.getClass().getName().equals("instance")){ ((java.io.OutputStream)((instance)obj).sclassobj).write((byte[])args[1]) ;return null;}
else{
((java.io.OutputStream)obj).write((byte[])args[1]) ;return null;
}
}
else if((methodname+":"+discry).equals("write:([BII)V")){
in[0]=((Integer)args[2]).intValue();
in[1]=((Integer)args[3]).intValue();

if(obj.getClass().getName().equals("instance")){ ((java.io.OutputStream)((instance)obj).sclassobj).write((byte[])args[1],in[0],in[1]) ;return null;}
else{
((java.io.OutputStream)obj).write((byte[])args[1],in[0],in[1]) ;return null;
}
}
else if((methodname+":"+discry).equals("write:(I)V")){
in[0]=((Integer)args[1]).intValue();

if(obj.getClass().getName().equals("instance")){ ((java.io.OutputStream)((instance)obj).sclassobj).write(in[0]) ;return null;}
else{
((java.io.OutputStream)obj).write(in[0]) ;return null;
}
}
}
//OutputStreamWriter//java.io.OutputStreamWriter
if(Class.forName("java.io.OutputStreamWriter").isAssignableFrom(Class.forName(classname.replace('/','.')))){
//constructor_summary
if(methodname.equals("<init>")&&classname.replace('/','.').equals("java.io.OutputStreamWriter")){
if ((methodname+":"+discry).equals("<init>:(Ljava/io/OutputStream;)V")){
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.io.OutputStreamWriter((java.io.OutputStream)o[0]);return null;}
else{
((CLDCinstance)obj).cldcobj=new java.io.OutputStreamWriter((java.io.OutputStream)o[0]) ;return null;}
}

else if ((methodname+":"+discry).equals("<init>:(Ljava/io/OutputStream;Ljava/lang/String;)V")){
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}
if(args[2].getClass().getName().equals("instance")){
o[1]=((instance)args[2]).sclassobj;
}
else if(args[2].getClass().getName().equals("CLDCinstance")){
o[1]=((CLDCinstance)args[2]).cldcobj;
}

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.io.OutputStreamWriter((java.io.OutputStream)o[0],(java.lang.String)o[1]);return null;}
else{
((CLDCinstance)obj).cldcobj=new java.io.OutputStreamWriter((java.io.OutputStream)o[0],(java.lang.String)o[1]) ;return null;}
}

}
//Method Summary
else if((methodname+":"+discry).equals("close:()V")){

if(obj.getClass().getName().equals("instance")){ ((java.io.OutputStreamWriter)((instance)obj).sclassobj).close() ;return null;}
else{
((java.io.OutputStreamWriter)obj).close() ;return null;
}
}
else if((methodname+":"+discry).equals("flush:()V")){

if(obj.getClass().getName().equals("instance")){ ((java.io.OutputStreamWriter)((instance)obj).sclassobj).flush() ;return null;}
else{
((java.io.OutputStreamWriter)obj).flush() ;return null;
}
}
else if((methodname+":"+discry).equals("write:([CII)V")){
in[0]=((Integer)args[2]).intValue();
in[1]=((Integer)args[3]).intValue();

if(obj.getClass().getName().equals("instance")){ ((java.io.OutputStreamWriter)((instance)obj).sclassobj).write((char[])args[1],in[0],in[1]) ;return null;}
else{
((java.io.OutputStreamWriter)obj).write((char[])args[1],in[0],in[1]) ;return null;
}
}
else if((methodname+":"+discry).equals("write:(I)V")){
in[0]=((Integer)args[1]).intValue();

if(obj.getClass().getName().equals("instance")){ ((java.io.OutputStreamWriter)((instance)obj).sclassobj).write(in[0]) ;return null;}
else{
((java.io.OutputStreamWriter)obj).write(in[0]) ;return null;
}
}
else if((methodname+":"+discry).equals("write:(Ljava/lang/String;II)V")){
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}
in[0]=((Integer)args[2]).intValue();
in[1]=((Integer)args[3]).intValue();

if(obj.getClass().getName().equals("instance")){ ((java.io.OutputStreamWriter)((instance)obj).sclassobj).write((java.lang.String)o[0],in[0],in[1]) ;return null;}
else{
((java.io.OutputStreamWriter)obj).write((java.lang.String)o[0],in[0],in[1]) ;return null;
}
}
}
//PrintStream//java.io.PrintStream
if(Class.forName("java.io.PrintStream").isAssignableFrom(Class.forName(classname.replace('/','.')))){
//constructor_summary
if(methodname.equals("<init>")&&classname.replace('/','.').equals("java.io.PrintStream")){
if ((methodname+":"+discry).equals("<init>:(Ljava/io/OutputStream;)V")){
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.io.PrintStream((java.io.OutputStream)o[0]);return null;}
else{
((CLDCinstance)obj).cldcobj=new java.io.PrintStream((java.io.OutputStream)o[0]) ;return null;}
}

}
//Method Summary
else if((methodname+":"+discry).equals("checkError:()Z")){

if(obj.getClass().getName().equals("instance")){return ( ((java.io.PrintStream)((instance)obj).sclassobj).checkError() )?new Integer(1):new Integer(0);}
else{
return ( ((java.io.PrintStream)obj).checkError() )?new Integer(1):new Integer(0);
}
}
else if((methodname+":"+discry).equals("close:()V")){

if(obj.getClass().getName().equals("instance")){ ((java.io.PrintStream)((instance)obj).sclassobj).close() ;return null;}
else{
((java.io.PrintStream)obj).close() ;return null;
}
}
else if((methodname+":"+discry).equals("flush:()V")){

if(obj.getClass().getName().equals("instance")){ ((java.io.PrintStream)((instance)obj).sclassobj).flush() ;return null;}
else{
((java.io.PrintStream)obj).flush() ;return null;
}
}
else if((methodname+":"+discry).equals("print:(Z)V")){
bl[0]=(((Integer)args[1]).intValue()==0)?false:true;

if(obj.getClass().getName().equals("instance")){ ((java.io.PrintStream)((instance)obj).sclassobj).print(bl[0]) ;return null;}
else{
((java.io.PrintStream)obj).print(bl[0]) ;return null;
}
}
else if((methodname+":"+discry).equals("print:(C)V")){
c[0]=(char)((Integer)args[1]).intValue();
if(obj.getClass().getName().equals("instance")){ ((java.io.PrintStream)((instance)obj).sclassobj).print(c[0]) ;return null;}
else{
((java.io.PrintStream)obj).print(c[0]) ;return null;
}
}
else if((methodname+":"+discry).equals("print:([C)V")){

if(obj.getClass().getName().equals("instance")){ ((java.io.PrintStream)((instance)obj).sclassobj).print((char[])args[1]) ;return null;}
else{
((java.io.PrintStream)obj).print((char[])args[1]) ;return null;
}
}
else if((methodname+":"+discry).equals("print:(D)V")){
d[0]=((Double)args[1]).doubleValue();
if(obj.getClass().getName().equals("instance")){ ((java.io.PrintStream)((instance)obj).sclassobj).print(d[0]) ;return null;}
else{
((java.io.PrintStream)obj).print(d[0]) ;return null;
}
}
else if((methodname+":"+discry).equals("print:(F)V")){
f[0]=((Float)args[1]).floatValue();
if(obj.getClass().getName().equals("instance")){ ((java.io.PrintStream)((instance)obj).sclassobj).print(f[0]) ;return null;}
else{
((java.io.PrintStream)obj).print(f[0]) ;return null;
}
}
else if((methodname+":"+discry).equals("print:(I)V")){
in[0]=((Integer)args[1]).intValue();

if(obj.getClass().getName().equals("instance")){ ((java.io.PrintStream)((instance)obj).sclassobj).print(in[0]) ;return null;}
else{
((java.io.PrintStream)obj).print(in[0]) ;return null;
}
}
else if((methodname+":"+discry).equals("print:(J)V")){
l[0]=((Long)args[1]).longValue();
if(obj.getClass().getName().equals("instance")){ ((java.io.PrintStream)((instance)obj).sclassobj).print(l[0]) ;return null;}
else{
((java.io.PrintStream)obj).print(l[0]) ;return null;
}
}
else if((methodname+":"+discry).equals("print:(Ljava/lang/Object;)V")){
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}

if(obj.getClass().getName().equals("instance")){ ((java.io.PrintStream)((instance)obj).sclassobj).print((java.lang.Object)o[0]) ;return null;}
else{
((java.io.PrintStream)obj).print((java.lang.Object)o[0]) ;return null;
}
}
else if((methodname+":"+discry).equals("print:(Ljava/lang/String;)V")){
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}

if(obj.getClass().getName().equals("instance")){ ((java.io.PrintStream)((instance)obj).sclassobj).print((java.lang.String)o[0]) ;return null;}
else{
((java.io.PrintStream)obj).print((java.lang.String)o[0]) ;return null;
}
}
else if((methodname+":"+discry).equals("println:()V")){

if(obj.getClass().getName().equals("instance")){ ((java.io.PrintStream)((instance)obj).sclassobj).println() ;return null;}
else{
((java.io.PrintStream)obj).println() ;return null;
}
}
else if((methodname+":"+discry).equals("println:(Z)V")){
bl[0]=(((Integer)args[1]).intValue()==0)?false:true;

if(obj.getClass().getName().equals("instance")){ ((java.io.PrintStream)((instance)obj).sclassobj).println(bl[0]) ;return null;}
else{
((java.io.PrintStream)obj).println(bl[0]) ;return null;
}
}
else if((methodname+":"+discry).equals("println:(C)V")){
c[0]=(char)((Integer)args[1]).intValue();
if(obj.getClass().getName().equals("instance")){ ((java.io.PrintStream)((instance)obj).sclassobj).println(c[0]) ;return null;}
else{
((java.io.PrintStream)obj).println(c[0]) ;return null;
}
}
else if((methodname+":"+discry).equals("println:([C)V")){

if(obj.getClass().getName().equals("instance")){ ((java.io.PrintStream)((instance)obj).sclassobj).println((char[])args[1]) ;return null;}
else{
((java.io.PrintStream)obj).println((char[])args[1]) ;return null;
}
}
else if((methodname+":"+discry).equals("println:(D)V")){
d[0]=((Double)args[1]).doubleValue();
if(obj.getClass().getName().equals("instance")){ ((java.io.PrintStream)((instance)obj).sclassobj).println(d[0]) ;return null;}
else{
((java.io.PrintStream)obj).println(d[0]) ;return null;
}
}
else if((methodname+":"+discry).equals("println:(F)V")){
f[0]=((Float)args[1]).floatValue();
if(obj.getClass().getName().equals("instance")){ ((java.io.PrintStream)((instance)obj).sclassobj).println(f[0]) ;return null;}
else{
((java.io.PrintStream)obj).println(f[0]) ;return null;
}
}
else if((methodname+":"+discry).equals("println:(I)V")){
in[0]=((Integer)args[1]).intValue();

if(obj.getClass().getName().equals("instance")){ ((java.io.PrintStream)((instance)obj).sclassobj).println(in[0]) ;return null;}
else{
((java.io.PrintStream)obj).println(in[0]) ;return null;
}
}
else if((methodname+":"+discry).equals("println:(J)V")){
l[0]=((Long)args[1]).longValue();
if(obj.getClass().getName().equals("instance")){ ((java.io.PrintStream)((instance)obj).sclassobj).println(l[0]) ;return null;}
else{
((java.io.PrintStream)obj).println(l[0]) ;return null;
}
}
else if((methodname+":"+discry).equals("println:(Ljava/lang/Object;)V")){
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}

if(obj.getClass().getName().equals("instance")){ ((java.io.PrintStream)((instance)obj).sclassobj).println((java.lang.Object)o[0]) ;return null;}
else{
((java.io.PrintStream)obj).println((java.lang.Object)o[0]) ;return null;
}
}
else if((methodname+":"+discry).equals("println:(Ljava/lang/String;)V")){
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}

if(obj.getClass().getName().equals("instance")){ ((java.io.PrintStream)((instance)obj).sclassobj).println((java.lang.String)o[0]) ;return null;}
else{
((java.io.PrintStream)obj).println((java.lang.String)o[0]) ;return null;
}
}
else if((methodname+":"+discry).equals("write:([BII)V")){
in[0]=((Integer)args[2]).intValue();
in[1]=((Integer)args[3]).intValue();

if(obj.getClass().getName().equals("instance")){ ((java.io.PrintStream)((instance)obj).sclassobj).write((byte[])args[1],in[0],in[1]) ;return null;}
else{
((java.io.PrintStream)obj).write((byte[])args[1],in[0],in[1]) ;return null;
}
}
else if((methodname+":"+discry).equals("write:(I)V")){
in[0]=((Integer)args[1]).intValue();

if(obj.getClass().getName().equals("instance")){ ((java.io.PrintStream)((instance)obj).sclassobj).write(in[0]) ;return null;}
else{
((java.io.PrintStream)obj).write(in[0]) ;return null;
}
}
}
//Random//java.util.Random
if(Class.forName("java.util.Random").isAssignableFrom(Class.forName(classname.replace('/','.')))){
//constructor_summary
if(methodname.equals("<init>")&&classname.replace('/','.').equals("java.util.Random")){
if ((methodname+":"+discry).equals("<init>:()V")){

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.util.Random();return null;}
else{
((CLDCinstance)obj).cldcobj=new java.util.Random() ;return null;}
}

else if ((methodname+":"+discry).equals("<init>:(J)V")){
l[0]=((Long)args[1]).longValue();
if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.util.Random(l[0]);return null;}
else{
((CLDCinstance)obj).cldcobj=new java.util.Random(l[0]) ;return null;}
}

}
//Method Summary
else if((methodname+":"+discry).equals("nextDouble:()D")){

if(obj.getClass().getName().equals("instance")){return new Double( ((java.util.Random)((instance)obj).sclassobj).nextDouble() );}
else{
return new Double( ((java.util.Random)obj).nextDouble() );
}
}
else if((methodname+":"+discry).equals("nextFloat:()F")){

if(obj.getClass().getName().equals("instance")){return new Float( ((java.util.Random)((instance)obj).sclassobj).nextFloat() );}
else{
return new Float( ((java.util.Random)obj).nextFloat() );
}
}
else if((methodname+":"+discry).equals("nextInt:()I")){

if(obj.getClass().getName().equals("instance")){return new Integer( ((java.util.Random)((instance)obj).sclassobj).nextInt() );}
else{
return new Integer( ((java.util.Random)obj).nextInt() );
}
}
else if((methodname+":"+discry).equals("nextInt:(I)I")){
in[0]=((Integer)args[1]).intValue();

if(obj.getClass().getName().equals("instance")){return new Integer( ((java.util.Random)((instance)obj).sclassobj).nextInt(in[0]) );}
else{
return new Integer( ((java.util.Random)obj).nextInt(in[0]) );
}
}
else if((methodname+":"+discry).equals("nextLong:()J")){

if(obj.getClass().getName().equals("instance")){return new Long( ((java.util.Random)((instance)obj).sclassobj).nextLong() );}
else{
return new Long( ((java.util.Random)obj).nextLong() );
}
}
else if((methodname+":"+discry).equals("setSeed:(J)V")){
l[0]=((Long)args[1]).longValue();
if(obj.getClass().getName().equals("instance")){ ((java.util.Random)((instance)obj).sclassobj).setSeed(l[0]) ;return null;}
else{
((java.util.Random)obj).setSeed(l[0]) ;return null;
}
}
}

return doMethodbyName5(classname,methodname,discry,args,obj,mode);
}
public static Object doMethodbyName5(String classname,String methodname,String discry,Object[] args,Object obj,int mode)throws Exception{
boolean[] bl=new boolean[args.length];
double[] d=new double[args.length];
byte[] b=new byte[args.length];
short[] s=new short[args.length];
float[] f=new float[args.length];
long[] l=new long[args.length];
int[] in=new int[args.length];
char[] c=new char[args.length];
Object[] o=new Object[args.length];
//Reader//java.io.Reader
if(Class.forName("java.io.Reader").isAssignableFrom(Class.forName(classname.replace('/','.')))){
//print this is abstract class
//constructor_summary
if(methodname.equals("<init>")&&classname.replace('/','.').equals("java.io.Reader")){
}
//Method Summary
if((methodname+":"+discry).equals("close:()V")){

if(obj.getClass().getName().equals("instance")){ ((java.io.Reader)((instance)obj).sclassobj).close() ;return null;}
else{
((java.io.Reader)obj).close() ;return null;
}
}
else if((methodname+":"+discry).equals("mark:(I)V")){
in[0]=((Integer)args[1]).intValue();

if(obj.getClass().getName().equals("instance")){ ((java.io.Reader)((instance)obj).sclassobj).mark(in[0]) ;return null;}
else{
((java.io.Reader)obj).mark(in[0]) ;return null;
}
}
else if((methodname+":"+discry).equals("markSupported:()Z")){

if(obj.getClass().getName().equals("instance")){return ( ((java.io.Reader)((instance)obj).sclassobj).markSupported() )?new Integer(1):new Integer(0);}
else{
return ( ((java.io.Reader)obj).markSupported() )?new Integer(1):new Integer(0);
}
}
else if((methodname+":"+discry).equals("read:()I")){

if(obj.getClass().getName().equals("instance")){return new Integer( ((java.io.Reader)((instance)obj).sclassobj).read() );}
else{
return new Integer( ((java.io.Reader)obj).read() );
}
}
else if((methodname+":"+discry).equals("read:([C)I")){

if(obj.getClass().getName().equals("instance")){return new Integer( ((java.io.Reader)((instance)obj).sclassobj).read((char[])args[1]) );}
else{
return new Integer( ((java.io.Reader)obj).read((char[])args[1]) );
}
}
else if((methodname+":"+discry).equals("read:([CII)I")){
in[0]=((Integer)args[2]).intValue();
in[1]=((Integer)args[3]).intValue();

if(obj.getClass().getName().equals("instance")){return new Integer( ((java.io.Reader)((instance)obj).sclassobj).read((char[])args[1],in[0],in[1]) );}
else{
return new Integer( ((java.io.Reader)obj).read((char[])args[1],in[0],in[1]) );
}
}
else if((methodname+":"+discry).equals("ready:()Z")){

if(obj.getClass().getName().equals("instance")){return ( ((java.io.Reader)((instance)obj).sclassobj).ready() )?new Integer(1):new Integer(0);}
else{
return ( ((java.io.Reader)obj).ready() )?new Integer(1):new Integer(0);
}
}
else if((methodname+":"+discry).equals("reset:()V")){

if(obj.getClass().getName().equals("instance")){ ((java.io.Reader)((instance)obj).sclassobj).reset() ;return null;}
else{
((java.io.Reader)obj).reset() ;return null;
}
}
else if((methodname+":"+discry).equals("skip:(J)J")){
l[0]=((Long)args[1]).longValue();
if(obj.getClass().getName().equals("instance")){return new Long( ((java.io.Reader)((instance)obj).sclassobj).skip(l[0]) );}
else{
return new Long( ((java.io.Reader)obj).skip(l[0]) );
}
}
}
//Runnable//abstract or interface class
//Method Summary
//Runtime//java.lang.Runtime
if(Class.forName("java.lang.Runtime").isAssignableFrom(Class.forName(classname.replace('/','.')))){
//Method Summary
if((methodname+":"+discry).equals("exit:(I)V")){
in[0]=((Integer)args[1]).intValue();

if(obj.getClass().getName().equals("instance")){ ((java.lang.Runtime)((instance)obj).sclassobj).exit(in[0]) ;return null;}
else{
((java.lang.Runtime)obj).exit(in[0]) ;return null;
}
}
else if((methodname+":"+discry).equals("freeMemory:()J")){

if(obj.getClass().getName().equals("instance")){return new Long( ((java.lang.Runtime)((instance)obj).sclassobj).freeMemory() );}
else{
return new Long( ((java.lang.Runtime)obj).freeMemory() );
}
}
else if((methodname+":"+discry).equals("gc:()V")){

if(obj.getClass().getName().equals("instance")){ ((java.lang.Runtime)((instance)obj).sclassobj).gc() ;return null;}
else{
((java.lang.Runtime)obj).gc() ;return null;
}
}
else if((methodname+":"+discry).equals("getRuntime:()Ljava/lang/Runtime;")){



return new CLDCinstance( java.lang.Runtime.getRuntime() );
}

else if((methodname+":"+discry).equals("totalMemory:()J")){

if(obj.getClass().getName().equals("instance")){return new Long( ((java.lang.Runtime)((instance)obj).sclassobj).totalMemory() );}
else{
return new Long( ((java.lang.Runtime)obj).totalMemory() );
}
}
}
//RuntimeException//java.lang.RuntimeException
if(Class.forName("java.lang.RuntimeException").isAssignableFrom(Class.forName(classname.replace('/','.')))){
//constructor_summary
if(methodname.equals("<init>")&&classname.replace('/','.').equals("java.lang.RuntimeException")){
if ((methodname+":"+discry).equals("<init>:()V")){

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.lang.RuntimeException();return null;}
else{
((CLDCinstance)obj).cldcobj=new java.lang.RuntimeException() ;return null;}
}

else if ((methodname+":"+discry).equals("<init>:(Ljava/lang/String;)V")){
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.lang.RuntimeException((java.lang.String)o[0]);return null;}
else{
((CLDCinstance)obj).cldcobj=new java.lang.RuntimeException((java.lang.String)o[0]) ;return null;}
}

}
}
//SecurityException//java.lang.SecurityException
if(Class.forName("java.lang.SecurityException").isAssignableFrom(Class.forName(classname.replace('/','.')))){
//constructor_summary
if(methodname.equals("<init>")&&classname.replace('/','.').equals("java.lang.SecurityException")){
if ((methodname+":"+discry).equals("<init>:()V")){

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.lang.SecurityException();return null;}
else{
((CLDCinstance)obj).cldcobj=new java.lang.SecurityException() ;return null;}
}

else if ((methodname+":"+discry).equals("<init>:(Ljava/lang/String;)V")){
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.lang.SecurityException((java.lang.String)o[0]);return null;}
else{
((CLDCinstance)obj).cldcobj=new java.lang.SecurityException((java.lang.String)o[0]) ;return null;}
}

}
}
//Short//java.lang.Short
if(Class.forName("java.lang.Short").isAssignableFrom(Class.forName(classname.replace('/','.')))){
//constructor_summary
if(methodname.equals("<init>")&&classname.replace('/','.').equals("java.lang.Short")){
if ((methodname+":"+discry).equals("<init>:(S)V")){
s[0]=((Integer)args[1]).shortValue();
if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.lang.Short(s[0]);return null;}
else{
((CLDCinstance)obj).cldcobj=new java.lang.Short(s[0]) ;return null;}
}

}
//Method Summary
else if((methodname+":"+discry).equals("equals:(Ljava/lang/Object;)Z")){
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}

if(obj.getClass().getName().equals("instance")){return ( ((java.lang.Short)((instance)obj).sclassobj).equals((java.lang.Object)o[0]) )?new Integer(1):new Integer(0);}
else{
return ( ((java.lang.Short)obj).equals((java.lang.Object)o[0]) )?new Integer(1):new Integer(0);
}
}
else if((methodname+":"+discry).equals("hashCode:()I")){

if(obj.getClass().getName().equals("instance")){return new Integer( ((java.lang.Short)((instance)obj).sclassobj).hashCode() );}
else{
return new Integer( ((java.lang.Short)obj).hashCode() );
}
}
else if((methodname+":"+discry).equals("parseShort:(Ljava/lang/String;)S")){
if(args[0].getClass().getName().equals("instance")){
o[0]=((instance)args[0]).sclassobj;
}
else if(args[0].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[0]).cldcobj;
}



return new Integer( java.lang.Short.parseShort((java.lang.String)o[0]) );
}

else if((methodname+":"+discry).equals("parseShort:(Ljava/lang/String;I)S")){
if(args[0].getClass().getName().equals("instance")){
o[0]=((instance)args[0]).sclassobj;
}
else if(args[0].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[0]).cldcobj;
}
in[0]=((Integer)args[1]).intValue();



return new Integer( java.lang.Short.parseShort((java.lang.String)o[0],in[0]) );
}

else if((methodname+":"+discry).equals("shortValue:()S")){

if(obj.getClass().getName().equals("instance")){return new Integer( ((java.lang.Short)((instance)obj).sclassobj).shortValue() );}
else{
return new Integer( ((java.lang.Short)obj).shortValue() );
}
}
else if((methodname+":"+discry).equals("toString:()Ljava/lang/String;")){

if(obj.getClass().getName().equals("instance")){return new CLDCinstance( ((java.lang.Short)((instance)obj).sclassobj).toString() );}
else{
return new CLDCinstance( ((java.lang.Short)obj).toString() );
}
}
}
//Stack//java.util.Stack
if(Class.forName("java.util.Stack").isAssignableFrom(Class.forName(classname.replace('/','.')))){
//constructor_summary
if(methodname.equals("<init>")&&classname.replace('/','.').equals("java.util.Stack")){
if ((methodname+":"+discry).equals("<init>:()V")){

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.util.Stack();return null;}
else{
((CLDCinstance)obj).cldcobj=new java.util.Stack() ;return null;}
}

}
//Method Summary
else if((methodname+":"+discry).equals("empty:()Z")){

if(obj.getClass().getName().equals("instance")){return ( ((java.util.Stack)((instance)obj).sclassobj).empty() )?new Integer(1):new Integer(0);}
else{
return ( ((java.util.Stack)obj).empty() )?new Integer(1):new Integer(0);
}
}
else if((methodname+":"+discry).equals("peek:()Ljava/lang/Object;")){

if(obj.getClass().getName().equals("instance")){return new CLDCinstance( ((java.util.Stack)((instance)obj).sclassobj).peek() );}
else{
return new CLDCinstance( ((java.util.Stack)obj).peek() );
}
}
else if((methodname+":"+discry).equals("pop:()Ljava/lang/Object;")){

if(obj.getClass().getName().equals("instance")){return new CLDCinstance( ((java.util.Stack)((instance)obj).sclassobj).pop() );}
else{
return new CLDCinstance( ((java.util.Stack)obj).pop() );
}
}
else if((methodname+":"+discry).equals("push:(Ljava/lang/Object;)Ljava/lang/Object;")){
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}

if(obj.getClass().getName().equals("instance")){return new CLDCinstance( ((java.util.Stack)((instance)obj).sclassobj).push((java.lang.Object)o[0]) );}
else{
return new CLDCinstance( ((java.util.Stack)obj).push((java.lang.Object)o[0]) );
}
}
else if((methodname+":"+discry).equals("search:(Ljava/lang/Object;)I")){
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}

if(obj.getClass().getName().equals("instance")){return new Integer( ((java.util.Stack)((instance)obj).sclassobj).search((java.lang.Object)o[0]) );}
else{
return new Integer( ((java.util.Stack)obj).search((java.lang.Object)o[0]) );
}
}
}
//StreamConnection//abstract or interface class
//StreamConnectionNotifier//abstract or interface class
//Method Summary
//String//java.lang.String
if(Class.forName("java.lang.String").isAssignableFrom(Class.forName(classname.replace('/','.')))){
//constructor_summary
if(methodname.equals("<init>")&&classname.replace('/','.').equals("java.lang.String")){
if ((methodname+":"+discry).equals("<init>:()V")){

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.lang.String();return null;}
else{
((CLDCinstance)obj).cldcobj=new java.lang.String() ;return null;}
}

else if ((methodname+":"+discry).equals("<init>:([B)V")){

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.lang.String((byte[])args[1]);return null;}
else{
((CLDCinstance)obj).cldcobj=new java.lang.String((byte[])args[1]) ;return null;}
}

else if ((methodname+":"+discry).equals("<init>:([BII)V")){
in[0]=((Integer)args[2]).intValue();
in[1]=((Integer)args[3]).intValue();

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.lang.String((byte[])args[1],in[0],in[1]);return null;}
else{
((CLDCinstance)obj).cldcobj=new java.lang.String((byte[])args[1],in[0],in[1]) ;return null;}
}

else if ((methodname+":"+discry).equals("<init>:([BIILjava/lang/String;)V")){
in[0]=((Integer)args[2]).intValue();
in[1]=((Integer)args[3]).intValue();
if(args[4].getClass().getName().equals("instance")){
o[0]=((instance)args[4]).sclassobj;
}
else if(args[4].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[4]).cldcobj;
}

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.lang.String((byte[])args[1],in[0],in[1],(java.lang.String)o[0]);return null;}
else{
((CLDCinstance)obj).cldcobj=new java.lang.String((byte[])args[1],in[0],in[1],(java.lang.String)o[0]) ;return null;}
}

else if ((methodname+":"+discry).equals("<init>:([BLjava/lang/String;)V")){
if(args[2].getClass().getName().equals("instance")){
o[0]=((instance)args[2]).sclassobj;
}
else if(args[2].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[2]).cldcobj;
}

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.lang.String((byte[])args[1],(java.lang.String)o[0]);return null;}
else{
((CLDCinstance)obj).cldcobj=new java.lang.String((byte[])args[1],(java.lang.String)o[0]) ;return null;}
}

else if ((methodname+":"+discry).equals("<init>:([C)V")){

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.lang.String((char[])args[1]);return null;}
else{
((CLDCinstance)obj).cldcobj=new java.lang.String((char[])args[1]) ;return null;}
}

else if ((methodname+":"+discry).equals("<init>:([CII)V")){
in[0]=((Integer)args[2]).intValue();
in[1]=((Integer)args[3]).intValue();

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.lang.String((char[])args[1],in[0],in[1]);return null;}
else{
((CLDCinstance)obj).cldcobj=new java.lang.String((char[])args[1],in[0],in[1]) ;return null;}
}

else if ((methodname+":"+discry).equals("<init>:(Ljava/lang/String;)V")){
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.lang.String((java.lang.String)o[0]);return null;}
else{
((CLDCinstance)obj).cldcobj=new java.lang.String((java.lang.String)o[0]) ;return null;}
}

else if ((methodname+":"+discry).equals("<init>:(Ljava/lang/StringBuffer;)V")){
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.lang.String((java.lang.StringBuffer)o[0]);return null;}
else{
((CLDCinstance)obj).cldcobj=new java.lang.String((java.lang.StringBuffer)o[0]) ;return null;}
}

}
//Method Summary
else if((methodname+":"+discry).equals("charAt:(I)C")){
in[0]=((Integer)args[1]).intValue();

if(obj.getClass().getName().equals("instance")){return new Integer((int) ((java.lang.String)((instance)obj).sclassobj).charAt(in[0]) );}
else{
return new Integer((int) ((java.lang.String)obj).charAt(in[0]) );
}
}
else if((methodname+":"+discry).equals("compareTo:(Ljava/lang/String;)I")){
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}

if(obj.getClass().getName().equals("instance")){return new Integer( ((java.lang.String)((instance)obj).sclassobj).compareTo((java.lang.String)o[0]) );}
else{
return new Integer( ((java.lang.String)obj).compareTo((java.lang.String)o[0]) );
}
}
else if((methodname+":"+discry).equals("concat:(Ljava/lang/String;)Ljava/lang/String;")){
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}

if(obj.getClass().getName().equals("instance")){return new CLDCinstance( ((java.lang.String)((instance)obj).sclassobj).concat((java.lang.String)o[0]) );}
else{
return new CLDCinstance( ((java.lang.String)obj).concat((java.lang.String)o[0]) );
}
}
else if((methodname+":"+discry).equals("endsWith:(Ljava/lang/String;)Z")){
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}

if(obj.getClass().getName().equals("instance")){return ( ((java.lang.String)((instance)obj).sclassobj).endsWith((java.lang.String)o[0]) )?new Integer(1):new Integer(0);}
else{
return ( ((java.lang.String)obj).endsWith((java.lang.String)o[0]) )?new Integer(1):new Integer(0);
}
}
else if((methodname+":"+discry).equals("equals:(Ljava/lang/Object;)Z")){
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}

if(obj.getClass().getName().equals("instance")){return ( ((java.lang.String)((instance)obj).sclassobj).equals((java.lang.Object)o[0]) )?new Integer(1):new Integer(0);}
else{
return ( ((java.lang.String)obj).equals((java.lang.Object)o[0]) )?new Integer(1):new Integer(0);
}
}
else if((methodname+":"+discry).equals("equalsIgnoreCase:(Ljava/lang/String;)Z")){
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}

if(obj.getClass().getName().equals("instance")){return ( ((java.lang.String)((instance)obj).sclassobj).equalsIgnoreCase((java.lang.String)o[0]) )?new Integer(1):new Integer(0);}
else{
return ( ((java.lang.String)obj).equalsIgnoreCase((java.lang.String)o[0]) )?new Integer(1):new Integer(0);
}
}
else if((methodname+":"+discry).equals("getBytes:()[B")){

if(obj.getClass().getName().equals("instance")){return ((java.lang.String)((instance)obj).sclassobj).getBytes() ;}
else{
return ((java.lang.String)obj).getBytes() ;
}
}
else if((methodname+":"+discry).equals("getBytes:(Ljava/lang/String;)[B")){
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}

if(obj.getClass().getName().equals("instance")){return ((java.lang.String)((instance)obj).sclassobj).getBytes((java.lang.String)o[0]) ;}
else{
return ((java.lang.String)obj).getBytes((java.lang.String)o[0]) ;
}
}
else if((methodname+":"+discry).equals("getChars:(II[CI)V")){
in[0]=((Integer)args[1]).intValue();
in[1]=((Integer)args[2]).intValue();
in[2]=((Integer)args[4]).intValue();

if(obj.getClass().getName().equals("instance")){ ((java.lang.String)((instance)obj).sclassobj).getChars(in[0],in[1],(char[])args[3],in[2]) ;return null;}
else{
((java.lang.String)obj).getChars(in[0],in[1],(char[])args[3],in[2]) ;return null;
}
}
else if((methodname+":"+discry).equals("hashCode:()I")){

if(obj.getClass().getName().equals("instance")){return new Integer( ((java.lang.String)((instance)obj).sclassobj).hashCode() );}
else{
return new Integer( ((java.lang.String)obj).hashCode() );
}
}
else if((methodname+":"+discry).equals("indexOf:(I)I")){
in[0]=((Integer)args[1]).intValue();

if(obj.getClass().getName().equals("instance")){return new Integer( ((java.lang.String)((instance)obj).sclassobj).indexOf(in[0]) );}
else{
return new Integer( ((java.lang.String)obj).indexOf(in[0]) );
}
}
else if((methodname+":"+discry).equals("indexOf:(II)I")){
in[0]=((Integer)args[1]).intValue();
in[1]=((Integer)args[2]).intValue();

if(obj.getClass().getName().equals("instance")){return new Integer( ((java.lang.String)((instance)obj).sclassobj).indexOf(in[0],in[1]) );}
else{
return new Integer( ((java.lang.String)obj).indexOf(in[0],in[1]) );
}
}
else if((methodname+":"+discry).equals("indexOf:(Ljava/lang/String;)I")){
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}

if(obj.getClass().getName().equals("instance")){return new Integer( ((java.lang.String)((instance)obj).sclassobj).indexOf((java.lang.String)o[0]) );}
else{
return new Integer( ((java.lang.String)obj).indexOf((java.lang.String)o[0]) );
}
}
else if((methodname+":"+discry).equals("indexOf:(Ljava/lang/String;I)I")){
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}
in[0]=((Integer)args[2]).intValue();

if(obj.getClass().getName().equals("instance")){return new Integer( ((java.lang.String)((instance)obj).sclassobj).indexOf((java.lang.String)o[0],in[0]) );}
else{
return new Integer( ((java.lang.String)obj).indexOf((java.lang.String)o[0],in[0]) );
}
}
else if((methodname+":"+discry).equals("intern:()Ljava/lang/String;")){

if(obj.getClass().getName().equals("instance")){return new CLDCinstance( ((java.lang.String)((instance)obj).sclassobj).intern() );}
else{
return new CLDCinstance( ((java.lang.String)obj).intern() );
}
}
else if((methodname+":"+discry).equals("lastIndexOf:(I)I")){
in[0]=((Integer)args[1]).intValue();

if(obj.getClass().getName().equals("instance")){return new Integer( ((java.lang.String)((instance)obj).sclassobj).lastIndexOf(in[0]) );}
else{
return new Integer( ((java.lang.String)obj).lastIndexOf(in[0]) );
}
}
else if((methodname+":"+discry).equals("lastIndexOf:(II)I")){
in[0]=((Integer)args[1]).intValue();
in[1]=((Integer)args[2]).intValue();

if(obj.getClass().getName().equals("instance")){return new Integer( ((java.lang.String)((instance)obj).sclassobj).lastIndexOf(in[0],in[1]) );}
else{
return new Integer( ((java.lang.String)obj).lastIndexOf(in[0],in[1]) );
}
}
else if((methodname+":"+discry).equals("length:()I")){

if(obj.getClass().getName().equals("instance")){return new Integer( ((java.lang.String)((instance)obj).sclassobj).length() );}
else{
return new Integer( ((java.lang.String)obj).length() );
}
}
else if((methodname+":"+discry).equals("regionMatches:(ZILjava/lang/String;II)Z")){
bl[0]=(((Integer)args[1]).intValue()==0)?false:true;
in[0]=((Integer)args[2]).intValue();
if(args[3].getClass().getName().equals("instance")){
o[0]=((instance)args[3]).sclassobj;
}
else if(args[3].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[3]).cldcobj;
}
in[1]=((Integer)args[4]).intValue();
in[2]=((Integer)args[5]).intValue();

if(obj.getClass().getName().equals("instance")){return ( ((java.lang.String)((instance)obj).sclassobj).regionMatches(bl[0],in[0],(java.lang.String)o[0],in[1],in[2]) )?new Integer(1):new Integer(0);}
else{
return ( ((java.lang.String)obj).regionMatches(bl[0],in[0],(java.lang.String)o[0],in[1],in[2]) )?new Integer(1):new Integer(0);
}
}
else if((methodname+":"+discry).equals("replace:(CC)Ljava/lang/String;")){
c[0]=(char)((Integer)args[1]).intValue();c[1]=(char)((Integer)args[2]).intValue();
if(obj.getClass().getName().equals("instance")){return new CLDCinstance( ((java.lang.String)((instance)obj).sclassobj).replace(c[0],c[1]) );}
else{
return new CLDCinstance( ((java.lang.String)obj).replace(c[0],c[1]) );
}
}
else if((methodname+":"+discry).equals("startsWith:(Ljava/lang/String;)Z")){
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}

if(obj.getClass().getName().equals("instance")){return ( ((java.lang.String)((instance)obj).sclassobj).startsWith((java.lang.String)o[0]) )?new Integer(1):new Integer(0);}
else{
return ( ((java.lang.String)obj).startsWith((java.lang.String)o[0]) )?new Integer(1):new Integer(0);
}
}
else if((methodname+":"+discry).equals("startsWith:(Ljava/lang/String;I)Z")){
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}
in[0]=((Integer)args[2]).intValue();

if(obj.getClass().getName().equals("instance")){return ( ((java.lang.String)((instance)obj).sclassobj).startsWith((java.lang.String)o[0],in[0]) )?new Integer(1):new Integer(0);}
else{
return ( ((java.lang.String)obj).startsWith((java.lang.String)o[0],in[0]) )?new Integer(1):new Integer(0);
}
}
else if((methodname+":"+discry).equals("substring:(I)Ljava/lang/String;")){
in[0]=((Integer)args[1]).intValue();

if(obj.getClass().getName().equals("instance")){return new CLDCinstance( ((java.lang.String)((instance)obj).sclassobj).substring(in[0]) );}
else{
return new CLDCinstance( ((java.lang.String)obj).substring(in[0]) );
}
}
else if((methodname+":"+discry).equals("substring:(II)Ljava/lang/String;")){
in[0]=((Integer)args[1]).intValue();
in[1]=((Integer)args[2]).intValue();

if(obj.getClass().getName().equals("instance")){return new CLDCinstance( ((java.lang.String)((instance)obj).sclassobj).substring(in[0],in[1]) );}
else{
return new CLDCinstance( ((java.lang.String)obj).substring(in[0],in[1]) );
}
}
else if((methodname+":"+discry).equals("toCharArray:()[C")){

if(obj.getClass().getName().equals("instance")){return ((java.lang.String)((instance)obj).sclassobj).toCharArray() ;}
else{
return ((java.lang.String)obj).toCharArray() ;
}
}
else if((methodname+":"+discry).equals("toLowerCase:()Ljava/lang/String;")){

if(obj.getClass().getName().equals("instance")){return new CLDCinstance( ((java.lang.String)((instance)obj).sclassobj).toLowerCase() );}
else{
return new CLDCinstance( ((java.lang.String)obj).toLowerCase() );
}
}
else if((methodname+":"+discry).equals("toString:()Ljava/lang/String;")){

if(obj.getClass().getName().equals("instance")){return new CLDCinstance( ((java.lang.String)((instance)obj).sclassobj).toString() );}
else{
return new CLDCinstance( ((java.lang.String)obj).toString() );
}
}
else if((methodname+":"+discry).equals("toUpperCase:()Ljava/lang/String;")){

if(obj.getClass().getName().equals("instance")){return new CLDCinstance( ((java.lang.String)((instance)obj).sclassobj).toUpperCase() );}
else{
return new CLDCinstance( ((java.lang.String)obj).toUpperCase() );
}
}
else if((methodname+":"+discry).equals("trim:()Ljava/lang/String;")){

if(obj.getClass().getName().equals("instance")){return new CLDCinstance( ((java.lang.String)((instance)obj).sclassobj).trim() );}
else{
return new CLDCinstance( ((java.lang.String)obj).trim() );
}
}
else if((methodname+":"+discry).equals("valueOf:(Z)Ljava/lang/String;")){
bl[0]=(((Integer)args[0]).intValue()==0)?false:true;



return new CLDCinstance( java.lang.String.valueOf(bl[0]) );
}

else if((methodname+":"+discry).equals("valueOf:(C)Ljava/lang/String;")){
c[0]=(char)((Integer)args[0]).intValue();


return new CLDCinstance( java.lang.String.valueOf(c[0]) );
}

else if((methodname+":"+discry).equals("valueOf:([C)Ljava/lang/String;")){



return new CLDCinstance( java.lang.String.valueOf((char[])args[0]) );
}

else if((methodname+":"+discry).equals("valueOf:([CII)Ljava/lang/String;")){
in[0]=((Integer)args[1]).intValue();
in[1]=((Integer)args[2]).intValue();



return new CLDCinstance( java.lang.String.valueOf((char[])args[0],in[0],in[1]) );
}

else if((methodname+":"+discry).equals("valueOf:(D)Ljava/lang/String;")){
d[0]=((Double)args[0]).doubleValue();


return new CLDCinstance( java.lang.String.valueOf(d[0]) );
}

else if((methodname+":"+discry).equals("valueOf:(F)Ljava/lang/String;")){
f[0]=((Float)args[0]).floatValue();


return new CLDCinstance( java.lang.String.valueOf(f[0]) );
}

else if((methodname+":"+discry).equals("valueOf:(I)Ljava/lang/String;")){
in[0]=((Integer)args[0]).intValue();



return new CLDCinstance( java.lang.String.valueOf(in[0]) );
}

else if((methodname+":"+discry).equals("valueOf:(J)Ljava/lang/String;")){
l[0]=((Long)args[0]).longValue();


return new CLDCinstance( java.lang.String.valueOf(l[0]) );
}

else if((methodname+":"+discry).equals("valueOf:(Ljava/lang/Object;)Ljava/lang/String;")){
if(args[0].getClass().getName().equals("instance")){
o[0]=((instance)args[0]).sclassobj;
}
else if(args[0].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[0]).cldcobj;
}



return new CLDCinstance( java.lang.String.valueOf((java.lang.Object)o[0]) );
}

}
//StringBuffer//java.lang.StringBuffer
if(Class.forName("java.lang.StringBuffer").isAssignableFrom(Class.forName(classname.replace('/','.')))){
//constructor_summary
if(methodname.equals("<init>")&&classname.replace('/','.').equals("java.lang.StringBuffer")){
if ((methodname+":"+discry).equals("<init>:()V")){

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.lang.StringBuffer();return null;}
else{
((CLDCinstance)obj).cldcobj=new java.lang.StringBuffer() ;return null;}
}

else if ((methodname+":"+discry).equals("<init>:(I)V")){
in[0]=((Integer)args[1]).intValue();

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.lang.StringBuffer(in[0]);return null;}
else{
((CLDCinstance)obj).cldcobj=new java.lang.StringBuffer(in[0]) ;return null;}
}

else if ((methodname+":"+discry).equals("<init>:(Ljava/lang/String;)V")){
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.lang.StringBuffer((java.lang.String)o[0]);return null;}
else{
((CLDCinstance)obj).cldcobj=new java.lang.StringBuffer((java.lang.String)o[0]) ;return null;}
}

}
//Method Summary
else if((methodname+":"+discry).equals("append:(Z)Ljava/lang/StringBuffer;")){
bl[0]=(((Integer)args[1]).intValue()==0)?false:true;

if(obj.getClass().getName().equals("instance")){return new CLDCinstance( ((java.lang.StringBuffer)((instance)obj).sclassobj).append(bl[0]) );}
else{
return new CLDCinstance( ((java.lang.StringBuffer)obj).append(bl[0]) );
}
}
else if((methodname+":"+discry).equals("append:(C)Ljava/lang/StringBuffer;")){
c[0]=(char)((Integer)args[1]).intValue();
if(obj.getClass().getName().equals("instance")){return new CLDCinstance( ((java.lang.StringBuffer)((instance)obj).sclassobj).append(c[0]) );}
else{
return new CLDCinstance( ((java.lang.StringBuffer)obj).append(c[0]) );
}
}
else if((methodname+":"+discry).equals("append:([C)Ljava/lang/StringBuffer;")){

if(obj.getClass().getName().equals("instance")){return new CLDCinstance( ((java.lang.StringBuffer)((instance)obj).sclassobj).append((char[])args[1]) );}
else{
return new CLDCinstance( ((java.lang.StringBuffer)obj).append((char[])args[1]) );
}
}
else if((methodname+":"+discry).equals("append:([CII)Ljava/lang/StringBuffer;")){
in[0]=((Integer)args[2]).intValue();
in[1]=((Integer)args[3]).intValue();

if(obj.getClass().getName().equals("instance")){return new CLDCinstance( ((java.lang.StringBuffer)((instance)obj).sclassobj).append((char[])args[1],in[0],in[1]) );}
else{
return new CLDCinstance( ((java.lang.StringBuffer)obj).append((char[])args[1],in[0],in[1]) );
}
}
else if((methodname+":"+discry).equals("append:(D)Ljava/lang/StringBuffer;")){
d[0]=((Double)args[1]).doubleValue();
if(obj.getClass().getName().equals("instance")){return new CLDCinstance( ((java.lang.StringBuffer)((instance)obj).sclassobj).append(d[0]) );}
else{
return new CLDCinstance( ((java.lang.StringBuffer)obj).append(d[0]) );
}
}
else if((methodname+":"+discry).equals("append:(F)Ljava/lang/StringBuffer;")){
f[0]=((Float)args[1]).floatValue();
if(obj.getClass().getName().equals("instance")){return new CLDCinstance( ((java.lang.StringBuffer)((instance)obj).sclassobj).append(f[0]) );}
else{
return new CLDCinstance( ((java.lang.StringBuffer)obj).append(f[0]) );
}
}
else if((methodname+":"+discry).equals("append:(I)Ljava/lang/StringBuffer;")){
in[0]=((Integer)args[1]).intValue();

if(obj.getClass().getName().equals("instance")){return new CLDCinstance( ((java.lang.StringBuffer)((instance)obj).sclassobj).append(in[0]) );}
else{
return new CLDCinstance( ((java.lang.StringBuffer)obj).append(in[0]) );
}
}
else if((methodname+":"+discry).equals("append:(J)Ljava/lang/StringBuffer;")){
l[0]=((Long)args[1]).longValue();
if(obj.getClass().getName().equals("instance")){return new CLDCinstance( ((java.lang.StringBuffer)((instance)obj).sclassobj).append(l[0]) );}
else{
return new CLDCinstance( ((java.lang.StringBuffer)obj).append(l[0]) );
}
}
else if((methodname+":"+discry).equals("append:(Ljava/lang/Object;)Ljava/lang/StringBuffer;")){
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}

if(obj.getClass().getName().equals("instance")){return new CLDCinstance( ((java.lang.StringBuffer)((instance)obj).sclassobj).append((java.lang.Object)o[0]) );}
else{
return new CLDCinstance( ((java.lang.StringBuffer)obj).append((java.lang.Object)o[0]) );
}
}
else if((methodname+":"+discry).equals("append:(Ljava/lang/String;)Ljava/lang/StringBuffer;")){
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}

if(obj.getClass().getName().equals("instance")){return new CLDCinstance( ((java.lang.StringBuffer)((instance)obj).sclassobj).append((java.lang.String)o[0]) );}
else{
return new CLDCinstance( ((java.lang.StringBuffer)obj).append((java.lang.String)o[0]) );
}
}
else if((methodname+":"+discry).equals("capacity:()I")){

if(obj.getClass().getName().equals("instance")){return new Integer( ((java.lang.StringBuffer)((instance)obj).sclassobj).capacity() );}
else{
return new Integer( ((java.lang.StringBuffer)obj).capacity() );
}
}
else if((methodname+":"+discry).equals("charAt:(I)C")){
in[0]=((Integer)args[1]).intValue();

if(obj.getClass().getName().equals("instance")){return new Integer((int) ((java.lang.StringBuffer)((instance)obj).sclassobj).charAt(in[0]) );}
else{
return new Integer((int) ((java.lang.StringBuffer)obj).charAt(in[0]) );
}
}
else if((methodname+":"+discry).equals("delete:(II)Ljava/lang/StringBuffer;")){
in[0]=((Integer)args[1]).intValue();
in[1]=((Integer)args[2]).intValue();

if(obj.getClass().getName().equals("instance")){return new CLDCinstance( ((java.lang.StringBuffer)((instance)obj).sclassobj).delete(in[0],in[1]) );}
else{
return new CLDCinstance( ((java.lang.StringBuffer)obj).delete(in[0],in[1]) );
}
}
else if((methodname+":"+discry).equals("deleteCharAt:(I)Ljava/lang/StringBuffer;")){
in[0]=((Integer)args[1]).intValue();

if(obj.getClass().getName().equals("instance")){return new CLDCinstance( ((java.lang.StringBuffer)((instance)obj).sclassobj).deleteCharAt(in[0]) );}
else{
return new CLDCinstance( ((java.lang.StringBuffer)obj).deleteCharAt(in[0]) );
}
}
else if((methodname+":"+discry).equals("ensureCapacity:(I)V")){
in[0]=((Integer)args[1]).intValue();

if(obj.getClass().getName().equals("instance")){ ((java.lang.StringBuffer)((instance)obj).sclassobj).ensureCapacity(in[0]) ;return null;}
else{
((java.lang.StringBuffer)obj).ensureCapacity(in[0]) ;return null;
}
}
else if((methodname+":"+discry).equals("getChars:(II[CI)V")){
in[0]=((Integer)args[1]).intValue();
in[1]=((Integer)args[2]).intValue();
in[2]=((Integer)args[4]).intValue();

if(obj.getClass().getName().equals("instance")){ ((java.lang.StringBuffer)((instance)obj).sclassobj).getChars(in[0],in[1],(char[])args[3],in[2]) ;return null;}
else{
((java.lang.StringBuffer)obj).getChars(in[0],in[1],(char[])args[3],in[2]) ;return null;
}
}
else if((methodname+":"+discry).equals("insert:(IZ)Ljava/lang/StringBuffer;")){
in[0]=((Integer)args[1]).intValue();
bl[0]=(((Integer)args[2]).intValue()==0)?false:true;

if(obj.getClass().getName().equals("instance")){return new CLDCinstance( ((java.lang.StringBuffer)((instance)obj).sclassobj).insert(in[0],bl[0]) );}
else{
return new CLDCinstance( ((java.lang.StringBuffer)obj).insert(in[0],bl[0]) );
}
}
else if((methodname+":"+discry).equals("insert:(IC)Ljava/lang/StringBuffer;")){
in[0]=((Integer)args[1]).intValue();
c[0]=(char)((Integer)args[2]).intValue();
if(obj.getClass().getName().equals("instance")){return new CLDCinstance( ((java.lang.StringBuffer)((instance)obj).sclassobj).insert(in[0],c[0]) );}
else{
return new CLDCinstance( ((java.lang.StringBuffer)obj).insert(in[0],c[0]) );
}
}
else if((methodname+":"+discry).equals("insert:(I[C)Ljava/lang/StringBuffer;")){
in[0]=((Integer)args[1]).intValue();

if(obj.getClass().getName().equals("instance")){return new CLDCinstance( ((java.lang.StringBuffer)((instance)obj).sclassobj).insert(in[0],(char[])args[2]) );}
else{
return new CLDCinstance( ((java.lang.StringBuffer)obj).insert(in[0],(char[])args[2]) );
}
}
else if((methodname+":"+discry).equals("insert:(ID)Ljava/lang/StringBuffer;")){
in[0]=((Integer)args[1]).intValue();
d[0]=((Double)args[2]).doubleValue();
if(obj.getClass().getName().equals("instance")){return new CLDCinstance( ((java.lang.StringBuffer)((instance)obj).sclassobj).insert(in[0],d[0]) );}
else{
return new CLDCinstance( ((java.lang.StringBuffer)obj).insert(in[0],d[0]) );
}
}
else if((methodname+":"+discry).equals("insert:(IF)Ljava/lang/StringBuffer;")){
in[0]=((Integer)args[1]).intValue();
f[0]=((Float)args[2]).floatValue();
if(obj.getClass().getName().equals("instance")){return new CLDCinstance( ((java.lang.StringBuffer)((instance)obj).sclassobj).insert(in[0],f[0]) );}
else{
return new CLDCinstance( ((java.lang.StringBuffer)obj).insert(in[0],f[0]) );
}
}
else if((methodname+":"+discry).equals("insert:(II)Ljava/lang/StringBuffer;")){
in[0]=((Integer)args[1]).intValue();
in[1]=((Integer)args[2]).intValue();

if(obj.getClass().getName().equals("instance")){return new CLDCinstance( ((java.lang.StringBuffer)((instance)obj).sclassobj).insert(in[0],in[1]) );}
else{
return new CLDCinstance( ((java.lang.StringBuffer)obj).insert(in[0],in[1]) );
}
}
else if((methodname+":"+discry).equals("insert:(IJ)Ljava/lang/StringBuffer;")){
in[0]=((Integer)args[1]).intValue();
l[0]=((Long)args[2]).longValue();
if(obj.getClass().getName().equals("instance")){return new CLDCinstance( ((java.lang.StringBuffer)((instance)obj).sclassobj).insert(in[0],l[0]) );}
else{
return new CLDCinstance( ((java.lang.StringBuffer)obj).insert(in[0],l[0]) );
}
}
else if((methodname+":"+discry).equals("insert:(ILjava/lang/Object;)Ljava/lang/StringBuffer;")){
in[0]=((Integer)args[1]).intValue();
if(args[2].getClass().getName().equals("instance")){
o[0]=((instance)args[2]).sclassobj;
}
else if(args[2].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[2]).cldcobj;
}

if(obj.getClass().getName().equals("instance")){return new CLDCinstance( ((java.lang.StringBuffer)((instance)obj).sclassobj).insert(in[0],(java.lang.Object)o[0]) );}
else{
return new CLDCinstance( ((java.lang.StringBuffer)obj).insert(in[0],(java.lang.Object)o[0]) );
}
}
else if((methodname+":"+discry).equals("insert:(ILjava/lang/String;)Ljava/lang/StringBuffer;")){
in[0]=((Integer)args[1]).intValue();
if(args[2].getClass().getName().equals("instance")){
o[0]=((instance)args[2]).sclassobj;
}
else if(args[2].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[2]).cldcobj;
}

if(obj.getClass().getName().equals("instance")){return new CLDCinstance( ((java.lang.StringBuffer)((instance)obj).sclassobj).insert(in[0],(java.lang.String)o[0]) );}
else{
return new CLDCinstance( ((java.lang.StringBuffer)obj).insert(in[0],(java.lang.String)o[0]) );
}
}
else if((methodname+":"+discry).equals("length:()I")){

if(obj.getClass().getName().equals("instance")){return new Integer( ((java.lang.StringBuffer)((instance)obj).sclassobj).length() );}
else{
return new Integer( ((java.lang.StringBuffer)obj).length() );
}
}
else if((methodname+":"+discry).equals("reverse:()Ljava/lang/StringBuffer;")){

if(obj.getClass().getName().equals("instance")){return new CLDCinstance( ((java.lang.StringBuffer)((instance)obj).sclassobj).reverse() );}
else{
return new CLDCinstance( ((java.lang.StringBuffer)obj).reverse() );
}
}
else if((methodname+":"+discry).equals("setCharAt:(IC)V")){
in[0]=((Integer)args[1]).intValue();
c[0]=(char)((Integer)args[2]).intValue();
if(obj.getClass().getName().equals("instance")){ ((java.lang.StringBuffer)((instance)obj).sclassobj).setCharAt(in[0],c[0]) ;return null;}
else{
((java.lang.StringBuffer)obj).setCharAt(in[0],c[0]) ;return null;
}
}
else if((methodname+":"+discry).equals("setLength:(I)V")){
in[0]=((Integer)args[1]).intValue();

if(obj.getClass().getName().equals("instance")){ ((java.lang.StringBuffer)((instance)obj).sclassobj).setLength(in[0]) ;return null;}
else{
((java.lang.StringBuffer)obj).setLength(in[0]) ;return null;
}
}
else if((methodname+":"+discry).equals("toString:()Ljava/lang/String;")){

if(obj.getClass().getName().equals("instance")){return new CLDCinstance( ((java.lang.StringBuffer)((instance)obj).sclassobj).toString() );}
else{
return new CLDCinstance( ((java.lang.StringBuffer)obj).toString() );
}
}
}
//StringIndexOutOfBoundsException//java.lang.StringIndexOutOfBoundsException
if(Class.forName("java.lang.StringIndexOutOfBoundsException").isAssignableFrom(Class.forName(classname.replace('/','.')))){
//constructor_summary
if(methodname.equals("<init>")&&classname.replace('/','.').equals("java.lang.StringIndexOutOfBoundsException")){
if ((methodname+":"+discry).equals("<init>:()V")){

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.lang.StringIndexOutOfBoundsException();return null;}
else{
((CLDCinstance)obj).cldcobj=new java.lang.StringIndexOutOfBoundsException() ;return null;}
}

else if ((methodname+":"+discry).equals("<init>:(I)V")){
in[0]=((Integer)args[1]).intValue();

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.lang.StringIndexOutOfBoundsException(in[0]);return null;}
else{
((CLDCinstance)obj).cldcobj=new java.lang.StringIndexOutOfBoundsException(in[0]) ;return null;}
}

else if ((methodname+":"+discry).equals("<init>:(Ljava/lang/String;)V")){
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.lang.StringIndexOutOfBoundsException((java.lang.String)o[0]);return null;}
else{
((CLDCinstance)obj).cldcobj=new java.lang.StringIndexOutOfBoundsException((java.lang.String)o[0]) ;return null;}
}

}
}
//System//java.lang.System
if(Class.forName("java.lang.System").isAssignableFrom(Class.forName(classname.replace('/','.')))){
//Method Summary
if((methodname+":"+discry).equals("arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V")){
if(args[0].getClass().getName().equals("instance")){
o[0]=((instance)args[0]).sclassobj;
}
else if(args[0].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[0]).cldcobj;
}
in[0]=((Integer)args[1]).intValue();
if(args[2].getClass().getName().equals("instance")){
o[1]=((instance)args[2]).sclassobj;
}
else if(args[2].getClass().getName().equals("CLDCinstance")){
o[1]=((CLDCinstance)args[2]).cldcobj;
}
in[1]=((Integer)args[3]).intValue();
in[2]=((Integer)args[4]).intValue();



java.lang.System.arraycopy((java.lang.Object)o[0],in[0],(java.lang.Object)o[1],in[1],in[2]) ;
}

else if((methodname+":"+discry).equals("currentTimeMillis:()J")){



return new Long( java.lang.System.currentTimeMillis() );
}

else if((methodname+":"+discry).equals("exit:(I)V")){
in[0]=((Integer)args[0]).intValue();



java.lang.System.exit(in[0]) ;
}

else if((methodname+":"+discry).equals("gc:()V")){



java.lang.System.gc() ;
}

else if((methodname+":"+discry).equals("getProperty:(Ljava/lang/String;)Ljava/lang/String;")){
if(args[0].getClass().getName().equals("instance")){
o[0]=((instance)args[0]).sclassobj;
}
else if(args[0].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[0]).cldcobj;
}



return new CLDCinstance( java.lang.System.getProperty((java.lang.String)o[0]) );
}

else if((methodname+":"+discry).equals("identityHashCode:(Ljava/lang/Object;)I")){
if(args[0].getClass().getName().equals("instance")){
o[0]=((instance)args[0]).sclassobj;
}
else if(args[0].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[0]).cldcobj;
}



return new Integer( java.lang.System.identityHashCode((java.lang.Object)o[0]) );
}

}
//Thread//java.lang.Thread
if(Class.forName("java.lang.Thread").isAssignableFrom(Class.forName(classname.replace('/','.')))){
//constructor_summary
if(methodname.equals("<init>")&&classname.replace('/','.').equals("java.lang.Thread")){
if ((methodname+":"+discry).equals("<init>:()V")){

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.lang.Thread();return null;}
else{
((CLDCinstance)obj).cldcobj=new java.lang.Thread() ;return null;}
}

else if ((methodname+":"+discry).equals("<init>:(Ljava/lang/Runnable;)V")){
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.lang.Thread((java.lang.Runnable)o[0]);return null;}
else{
((CLDCinstance)obj).cldcobj=new java.lang.Thread((java.lang.Runnable)o[0]) ;return null;}
}

else if ((methodname+":"+discry).equals("<init>:(Ljava/lang/Runnable;Ljava/lang/String;)V")){
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}
if(args[2].getClass().getName().equals("instance")){
o[1]=((instance)args[2]).sclassobj;
}
else if(args[2].getClass().getName().equals("CLDCinstance")){
o[1]=((CLDCinstance)args[2]).cldcobj;
}

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.lang.Thread((java.lang.Runnable)o[0],(java.lang.String)o[1]);return null;}
else{
((CLDCinstance)obj).cldcobj=new java.lang.Thread((java.lang.Runnable)o[0],(java.lang.String)o[1]) ;return null;}
}

else if ((methodname+":"+discry).equals("<init>:(Ljava/lang/String;)V")){
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.lang.Thread((java.lang.String)o[0]);return null;}
else{
((CLDCinstance)obj).cldcobj=new java.lang.Thread((java.lang.String)o[0]) ;return null;}
}

}
//Method Summary
else if((methodname+":"+discry).equals("activeCount:()I")){



return new Integer( java.lang.Thread.activeCount() );
}

else if((methodname+":"+discry).equals("currentThread:()Ljava/lang/Thread;")){



return new CLDCinstance( java.lang.Thread.currentThread() );
}

else if((methodname+":"+discry).equals("getName:()Ljava/lang/String;")){

if(obj.getClass().getName().equals("instance")){return new CLDCinstance( ((java.lang.Thread)((instance)obj).sclassobj).getName() );}
else{
return new CLDCinstance( ((java.lang.Thread)obj).getName() );
}
}
else if((methodname+":"+discry).equals("getPriority:()I")){

if(obj.getClass().getName().equals("instance")){return new Integer( ((java.lang.Thread)((instance)obj).sclassobj).getPriority() );}
else{
return new Integer( ((java.lang.Thread)obj).getPriority() );
}
}
else if((methodname+":"+discry).equals("interrupt:()V")){

if(obj.getClass().getName().equals("instance")){ ((java.lang.Thread)((instance)obj).sclassobj).interrupt() ;return null;}
else{
((java.lang.Thread)obj).interrupt() ;return null;
}
}
else if((methodname+":"+discry).equals("isAlive:()Z")){

if(obj.getClass().getName().equals("instance")){return ( ((java.lang.Thread)((instance)obj).sclassobj).isAlive() )?new Integer(1):new Integer(0);}
else{
return ( ((java.lang.Thread)obj).isAlive() )?new Integer(1):new Integer(0);
}
}
else if((methodname+":"+discry).equals("join:()V")){

if(obj.getClass().getName().equals("instance")){ ((java.lang.Thread)((instance)obj).sclassobj).join() ;return null;}
else{
((java.lang.Thread)obj).join() ;return null;
}
}
else if((methodname+":"+discry).equals("run:()V")){

if(obj.getClass().getName().equals("instance")){ ((java.lang.Thread)((instance)obj).sclassobj).run() ;return null;}
else{
((java.lang.Thread)obj).run() ;return null;
}
}
else if((methodname+":"+discry).equals("setPriority:(I)V")){
in[0]=((Integer)args[1]).intValue();

if(obj.getClass().getName().equals("instance")){ ((java.lang.Thread)((instance)obj).sclassobj).setPriority(in[0]) ;return null;}
else{
((java.lang.Thread)obj).setPriority(in[0]) ;return null;
}
}
else if((methodname+":"+discry).equals("sleep:(J)V")){
l[0]=((Long)args[0]).longValue();


java.lang.Thread.sleep(l[0]) ;
}

else if((methodname+":"+discry).equals("start:()V")){

if(obj.getClass().getName().equals("instance")){ ((java.lang.Thread)((instance)obj).sclassobj).start() ;return null;}
else{
((java.lang.Thread)obj).start() ;return null;
}
}
else if((methodname+":"+discry).equals("toString:()Ljava/lang/String;")){

if(obj.getClass().getName().equals("instance")){return new CLDCinstance( ((java.lang.Thread)((instance)obj).sclassobj).toString() );}
else{
return new CLDCinstance( ((java.lang.Thread)obj).toString() );
}
}
else if((methodname+":"+discry).equals("yield:()V")){



java.lang.Thread.yield() ;
}

}

return doMethodbyName6(classname,methodname,discry,args,obj,mode);
}
public static Object doMethodbyName6(String classname,String methodname,String discry,Object[] args,Object obj,int mode)throws Exception{
boolean[] bl=new boolean[args.length];
double[] d=new double[args.length];
byte[] b=new byte[args.length];
short[] s=new short[args.length];
float[] f=new float[args.length];
long[] l=new long[args.length];
int[] in=new int[args.length];
char[] c=new char[args.length];
Object[] o=new Object[args.length];
//Throwable//java.lang.Throwable
if(Class.forName("java.lang.Throwable").isAssignableFrom(Class.forName(classname.replace('/','.')))){
//constructor_summary
if(methodname.equals("<init>")&&classname.replace('/','.').equals("java.lang.Throwable")){
if ((methodname+":"+discry).equals("<init>:()V")){

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.lang.Throwable();return null;}
else{
((CLDCinstance)obj).cldcobj=new java.lang.Throwable() ;return null;}
}

else if ((methodname+":"+discry).equals("<init>:(Ljava/lang/String;)V")){
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.lang.Throwable((java.lang.String)o[0]);return null;}
else{
((CLDCinstance)obj).cldcobj=new java.lang.Throwable((java.lang.String)o[0]) ;return null;}
}

}
//Method Summary
else if((methodname+":"+discry).equals("getMessage:()Ljava/lang/String;")){

if(obj.getClass().getName().equals("instance")){return new CLDCinstance( ((java.lang.Throwable)((instance)obj).sclassobj).getMessage() );}
else{
return new CLDCinstance( ((java.lang.Throwable)obj).getMessage() );
}
}
else if((methodname+":"+discry).equals("printStackTrace:()V")){

if(obj.getClass().getName().equals("instance")){ ((java.lang.Throwable)((instance)obj).sclassobj).printStackTrace() ;return null;}
else{
((java.lang.Throwable)obj).printStackTrace() ;return null;
}
}
else if((methodname+":"+discry).equals("toString:()Ljava/lang/String;")){

if(obj.getClass().getName().equals("instance")){return new CLDCinstance( ((java.lang.Throwable)((instance)obj).sclassobj).toString() );}
else{
return new CLDCinstance( ((java.lang.Throwable)obj).toString() );
}
}
}
//TimeZone//java.util.TimeZone
if(Class.forName("java.util.TimeZone").isAssignableFrom(Class.forName(classname.replace('/','.')))){
//print this is abstract class
//constructor_summary
if(methodname.equals("<init>")&&classname.replace('/','.').equals("java.util.TimeZone")){
}
//Method Summary
if((methodname+":"+discry).equals("getAvailableIDs:()Ljava/lang/String;[")){



return java.util.TimeZone.getAvailableIDs() ;
}

else if((methodname+":"+discry).equals("getDefault:()Ljava/util/TimeZone;")){



return new CLDCinstance( java.util.TimeZone.getDefault() );
}

else if((methodname+":"+discry).equals("getID:()Ljava/lang/String;")){

if(obj.getClass().getName().equals("instance")){return new CLDCinstance( ((java.util.TimeZone)((instance)obj).sclassobj).getID() );}
else{
return new CLDCinstance( ((java.util.TimeZone)obj).getID() );
}
}
else if((methodname+":"+discry).equals("getOffset:(IIIIII)I")){
in[0]=((Integer)args[1]).intValue();
in[1]=((Integer)args[2]).intValue();
in[2]=((Integer)args[3]).intValue();
in[3]=((Integer)args[4]).intValue();
in[4]=((Integer)args[5]).intValue();
in[5]=((Integer)args[6]).intValue();

if(obj.getClass().getName().equals("instance")){return new Integer( ((java.util.TimeZone)((instance)obj).sclassobj).getOffset(in[0],in[1],in[2],in[3],in[4],in[5]) );}
else{
return new Integer( ((java.util.TimeZone)obj).getOffset(in[0],in[1],in[2],in[3],in[4],in[5]) );
}
}
else if((methodname+":"+discry).equals("getRawOffset:()I")){

if(obj.getClass().getName().equals("instance")){return new Integer( ((java.util.TimeZone)((instance)obj).sclassobj).getRawOffset() );}
else{
return new Integer( ((java.util.TimeZone)obj).getRawOffset() );
}
}
else if((methodname+":"+discry).equals("getTimeZone:(Ljava/lang/String;)Ljava/util/TimeZone;")){
if(args[0].getClass().getName().equals("instance")){
o[0]=((instance)args[0]).sclassobj;
}
else if(args[0].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[0]).cldcobj;
}



return new CLDCinstance( java.util.TimeZone.getTimeZone((java.lang.String)o[0]) );
}

else if((methodname+":"+discry).equals("useDaylightTime:()Z")){

if(obj.getClass().getName().equals("instance")){return ( ((java.util.TimeZone)((instance)obj).sclassobj).useDaylightTime() )?new Integer(1):new Integer(0);}
else{
return ( ((java.util.TimeZone)obj).useDaylightTime() )?new Integer(1):new Integer(0);
}
}
}
//UnsupportedEncodingException//java.io.UnsupportedEncodingException
if(Class.forName("java.io.UnsupportedEncodingException").isAssignableFrom(Class.forName(classname.replace('/','.')))){
//constructor_summary
if(methodname.equals("<init>")&&classname.replace('/','.').equals("java.io.UnsupportedEncodingException")){
if ((methodname+":"+discry).equals("<init>:()V")){

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.io.UnsupportedEncodingException();return null;}
else{
((CLDCinstance)obj).cldcobj=new java.io.UnsupportedEncodingException() ;return null;}
}

else if ((methodname+":"+discry).equals("<init>:(Ljava/lang/String;)V")){
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.io.UnsupportedEncodingException((java.lang.String)o[0]);return null;}
else{
((CLDCinstance)obj).cldcobj=new java.io.UnsupportedEncodingException((java.lang.String)o[0]) ;return null;}
}

}
}
//UTFDataFormatException//java.io.UTFDataFormatException
if(Class.forName("java.io.UTFDataFormatException").isAssignableFrom(Class.forName(classname.replace('/','.')))){
//constructor_summary
if(methodname.equals("<init>")&&classname.replace('/','.').equals("java.io.UTFDataFormatException")){
if ((methodname+":"+discry).equals("<init>:()V")){

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.io.UTFDataFormatException();return null;}
else{
((CLDCinstance)obj).cldcobj=new java.io.UTFDataFormatException() ;return null;}
}

else if ((methodname+":"+discry).equals("<init>:(Ljava/lang/String;)V")){
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.io.UTFDataFormatException((java.lang.String)o[0]);return null;}
else{
((CLDCinstance)obj).cldcobj=new java.io.UTFDataFormatException((java.lang.String)o[0]) ;return null;}
}

}
}
//Vector//java.util.Vector
if(Class.forName("java.util.Vector").isAssignableFrom(Class.forName(classname.replace('/','.')))){
//constructor_summary
if(methodname.equals("<init>")&&classname.replace('/','.').equals("java.util.Vector")){
if ((methodname+":"+discry).equals("<init>:()V")){

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.util.Vector();return null;}
else{
((CLDCinstance)obj).cldcobj=new java.util.Vector() ;return null;}
}

else if ((methodname+":"+discry).equals("<init>:(I)V")){
in[0]=((Integer)args[1]).intValue();

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.util.Vector(in[0]);return null;}
else{
((CLDCinstance)obj).cldcobj=new java.util.Vector(in[0]) ;return null;}
}

else if ((methodname+":"+discry).equals("<init>:(II)V")){
in[0]=((Integer)args[1]).intValue();
in[1]=((Integer)args[2]).intValue();

if(obj.getClass().getName().equals("instance")){((instance)obj).sclassobj=new java.util.Vector(in[0],in[1]);return null;}
else{
((CLDCinstance)obj).cldcobj=new java.util.Vector(in[0],in[1]) ;return null;}
}

}
//Method Summary
else if((methodname+":"+discry).equals("addElement:(Ljava/lang/Object;)V")){
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}

if(obj.getClass().getName().equals("instance")){ ((java.util.Vector)((instance)obj).sclassobj).addElement((java.lang.Object)o[0]) ;return null;}
else{
((java.util.Vector)obj).addElement((java.lang.Object)o[0]) ;return null;
}
}
else if((methodname+":"+discry).equals("capacity:()I")){

if(obj.getClass().getName().equals("instance")){return new Integer( ((java.util.Vector)((instance)obj).sclassobj).capacity() );}
else{
return new Integer( ((java.util.Vector)obj).capacity() );
}
}
else if((methodname+":"+discry).equals("contains:(Ljava/lang/Object;)Z")){
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}

if(obj.getClass().getName().equals("instance")){return ( ((java.util.Vector)((instance)obj).sclassobj).contains((java.lang.Object)o[0]) )?new Integer(1):new Integer(0);}
else{
return ( ((java.util.Vector)obj).contains((java.lang.Object)o[0]) )?new Integer(1):new Integer(0);
}
}
else if((methodname+":"+discry).equals("copyInto:([Ljava/lang/Object;)V")){

if(obj.getClass().getName().equals("instance")){ ((java.util.Vector)((instance)obj).sclassobj).copyInto((java.lang.Object[])args[1]) ;return null;}
else{
((java.util.Vector)obj).copyInto((java.lang.Object[])args[1]) ;return null;
}
}
else if((methodname+":"+discry).equals("elementAt:(I)Ljava/lang/Object;")){
in[0]=((Integer)args[1]).intValue();

if(obj.getClass().getName().equals("instance")){return new CLDCinstance( ((java.util.Vector)((instance)obj).sclassobj).elementAt(in[0]) );}
else{
return new CLDCinstance( ((java.util.Vector)obj).elementAt(in[0]) );
}
}
else if((methodname+":"+discry).equals("elements:()Ljava/util/Enumeration;")){

if(obj.getClass().getName().equals("instance")){return new CLDCinstance( ((java.util.Vector)((instance)obj).sclassobj).elements() );}
else{
return new CLDCinstance( ((java.util.Vector)obj).elements() );
}
}
else if((methodname+":"+discry).equals("ensureCapacity:(I)V")){
in[0]=((Integer)args[1]).intValue();

if(obj.getClass().getName().equals("instance")){ ((java.util.Vector)((instance)obj).sclassobj).ensureCapacity(in[0]) ;return null;}
else{
((java.util.Vector)obj).ensureCapacity(in[0]) ;return null;
}
}
else if((methodname+":"+discry).equals("firstElement:()Ljava/lang/Object;")){

if(obj.getClass().getName().equals("instance")){return new CLDCinstance( ((java.util.Vector)((instance)obj).sclassobj).firstElement() );}
else{
return new CLDCinstance( ((java.util.Vector)obj).firstElement() );
}
}
else if((methodname+":"+discry).equals("indexOf:(Ljava/lang/Object;)I")){
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}

if(obj.getClass().getName().equals("instance")){return new Integer( ((java.util.Vector)((instance)obj).sclassobj).indexOf((java.lang.Object)o[0]) );}
else{
return new Integer( ((java.util.Vector)obj).indexOf((java.lang.Object)o[0]) );
}
}
else if((methodname+":"+discry).equals("indexOf:(Ljava/lang/Object;I)I")){
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}
in[0]=((Integer)args[2]).intValue();

if(obj.getClass().getName().equals("instance")){return new Integer( ((java.util.Vector)((instance)obj).sclassobj).indexOf((java.lang.Object)o[0],in[0]) );}
else{
return new Integer( ((java.util.Vector)obj).indexOf((java.lang.Object)o[0],in[0]) );
}
}
else if((methodname+":"+discry).equals("insertElementAt:(Ljava/lang/Object;I)V")){
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}
in[0]=((Integer)args[2]).intValue();

if(obj.getClass().getName().equals("instance")){ ((java.util.Vector)((instance)obj).sclassobj).insertElementAt((java.lang.Object)o[0],in[0]) ;return null;}
else{
((java.util.Vector)obj).insertElementAt((java.lang.Object)o[0],in[0]) ;return null;
}
}
else if((methodname+":"+discry).equals("isEmpty:()Z")){

if(obj.getClass().getName().equals("instance")){return ( ((java.util.Vector)((instance)obj).sclassobj).isEmpty() )?new Integer(1):new Integer(0);}
else{
return ( ((java.util.Vector)obj).isEmpty() )?new Integer(1):new Integer(0);
}
}
else if((methodname+":"+discry).equals("lastElement:()Ljava/lang/Object;")){

if(obj.getClass().getName().equals("instance")){return new CLDCinstance( ((java.util.Vector)((instance)obj).sclassobj).lastElement() );}
else{
return new CLDCinstance( ((java.util.Vector)obj).lastElement() );
}
}
else if((methodname+":"+discry).equals("lastIndexOf:(Ljava/lang/Object;)I")){
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}

if(obj.getClass().getName().equals("instance")){return new Integer( ((java.util.Vector)((instance)obj).sclassobj).lastIndexOf((java.lang.Object)o[0]) );}
else{
return new Integer( ((java.util.Vector)obj).lastIndexOf((java.lang.Object)o[0]) );
}
}
else if((methodname+":"+discry).equals("lastIndexOf:(Ljava/lang/Object;I)I")){
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}
in[0]=((Integer)args[2]).intValue();

if(obj.getClass().getName().equals("instance")){return new Integer( ((java.util.Vector)((instance)obj).sclassobj).lastIndexOf((java.lang.Object)o[0],in[0]) );}
else{
return new Integer( ((java.util.Vector)obj).lastIndexOf((java.lang.Object)o[0],in[0]) );
}
}
else if((methodname+":"+discry).equals("removeAllElements:()V")){

if(obj.getClass().getName().equals("instance")){ ((java.util.Vector)((instance)obj).sclassobj).removeAllElements() ;return null;}
else{
((java.util.Vector)obj).removeAllElements() ;return null;
}
}
else if((methodname+":"+discry).equals("removeElement:(Ljava/lang/Object;)Z")){
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}

if(obj.getClass().getName().equals("instance")){return ( ((java.util.Vector)((instance)obj).sclassobj).removeElement((java.lang.Object)o[0]) )?new Integer(1):new Integer(0);}
else{
return ( ((java.util.Vector)obj).removeElement((java.lang.Object)o[0]) )?new Integer(1):new Integer(0);
}
}
else if((methodname+":"+discry).equals("removeElementAt:(I)V")){
in[0]=((Integer)args[1]).intValue();

if(obj.getClass().getName().equals("instance")){ ((java.util.Vector)((instance)obj).sclassobj).removeElementAt(in[0]) ;return null;}
else{
((java.util.Vector)obj).removeElementAt(in[0]) ;return null;
}
}
else if((methodname+":"+discry).equals("setElementAt:(Ljava/lang/Object;I)V")){
if(args[1].getClass().getName().equals("instance")){
o[0]=((instance)args[1]).sclassobj;
}
else if(args[1].getClass().getName().equals("CLDCinstance")){
o[0]=((CLDCinstance)args[1]).cldcobj;
}
in[0]=((Integer)args[2]).intValue();

if(obj.getClass().getName().equals("instance")){ ((java.util.Vector)((instance)obj).sclassobj).setElementAt((java.lang.Object)o[0],in[0]) ;return null;}
else{
((java.util.Vector)obj).setElementAt((java.lang.Object)o[0],in[0]) ;return null;
}
}
else if((methodname+":"+discry).equals("setSize:(I)V")){
in[0]=((Integer)args[1]).intValue();

if(obj.getClass().getName().equals("instance")){ ((java.util.Vector)((instance)obj).sclassobj).setSize(in[0]) ;return null;}
else{
((java.util.Vector)obj).setSize(in[0]) ;return null;
}
}
else if((methodname+":"+discry).equals("size:()I")){

if(obj.getClass().getName().equals("instance")){return new Integer( ((java.util.Vector)((instance)obj).sclassobj).size() );}
else{
return new Integer( ((java.util.Vector)obj).size() );
}
}
else if((methodname+":"+discry).equals("toString:()Ljava/lang/String;")){

if(obj.getClass().getName().equals("instance")){return new CLDCinstance( ((java.util.Vector)((instance)obj).sclassobj).toString() );}
else{
return new CLDCinstance( ((java.util.Vector)obj).toString() );
}
}
else if((methodname+":"+discry).equals("trimToSize:()V")){

if(obj.getClass().getName().equals("instance")){ ((java.util.Vector)((instance)obj).sclassobj).trimToSize() ;return null;}
else{
((java.util.Vector)obj).trimToSize() ;return null;
}
}
}
//VirtualMachineError//java.lang.VirtualMachineError
if(Class.forName("java.lang.VirtualMachineError").isAssignableFrom(Class.forName(classname.replace('/','.')))){
//print this is abstract class
//constructor_summary
if(methodname.equals("<init>")&&classname.replace('/','.').equals("java.lang.VirtualMachineError")){
}
}
return null;
}}