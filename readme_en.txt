VM on KVM

this program is under GPL licence.

src: source code files of VM on KVM
DemoforComputer: Demo project of VM on KVM modified for J2SE. this demo decompresses the picture which is compressed as LZMA.

How to run program:
	use javaStack.StartVM(String class_name, String method_name, Object[] args, String scheme,boolean isInitializeStaticFields)
	this method returns Object of the result of the method which is specified as method_name.
	if the method specified is void, it returns null. if isInitializedStaticField is true it initializes the interpreter.
	You need to specify the scheme which is used for accessing to ur file system as String scheme in StartVM. ex)file://, resource://  
	
	class files must be renamed .class to .clas.(when you execute vmonkvm_for_pc.jar, you don't need to do this)
	
	
	here is the example:
		public class testClass{
		
		public static void main(String[] args){
			System.out.println(args[0]);
		}
		
		}
		
		you need to compile the source code above and rename it.
		then u need to compile the source code below.
		
		public class test{
		
		public static void main(String[] args){
			String[] arg=new String[]{"Hello World"};
			
			javaStack.StartVM("testClass", "main([Ljava/lang/String;)V", "file://",new Object[]{arg}, true);
		
		}
		}
		
		this shows "Hello World" on your standard output.
		
		
		
TODO:
	to support monitorexit, monitorenter
	
	
	
Demo is in bin folder.
	 java -jar vmonkvm_for_pc.jar classname
	 

	
I really appriciate you if you put some comments on my page https://sourceforge.jp/projects/vmonkvm/simple

written by Yuki Kawana