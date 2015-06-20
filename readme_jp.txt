VM on KVM

このプログラムはGPLライセンス下です。

動かし方：
	このプログラムはjavaStack.StartVM(String class_name, String method_name, Object[] args, String scheme,boolean isInitializeStaticFields)
	から起動します。
	このメソッドはmethod_nameで指定されたメソッドの実行結果をObject型で返します。指定されたメソッドがvoidの場合はnullを返します。
	isInitializeStaticFieldsがtrueの場合はロードされたクラスの情報などを初期化します。
	schemeにファイルシステムで使用されるスキームを設定してください。ex)file://, resource://  
	実行対象のクラスファイルは拡張子を.classから.clas(vmonkvm_for_pc.jarを実行する場合は変えなくても大丈夫です)
	に変更する必要があります。
	
	
	サンプル:
		public class testClass{
		
		public static void main(String[] args){
			System.out.println(args[0]);
		}
		
		}
		
		上記のコードをコンパイルしてリネームしてください。
		
		public class test{
		
		public static void main(String[] args){
			String[] arg=new String[]{"Hello World"};
			
			javaStack.StartVM("testClass", "main([Ljava/lang/String;)V", "file://",new Object[]{arg}, true);
		
		}
		}
		
		標準出力に"Hello World"と表示されるはずです。
		
TODO:
	monitorexit, monitorenterインストラクションコードのサポート。
	
	
J2SE用のデモはbinにあります。
	java -jar vmonkvm_for_pc.jar クラス名
	で実行してください。
	
何かコメントあると嬉しいです。 https://sourceforge.jp/projects/vmonkvm/simple

written by Yuki Kawana
	