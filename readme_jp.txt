VM on KVM

���̃v���O������GPL���C�Z���X���ł��B

���������F
	���̃v���O������javaStack.StartVM(String class_name, String method_name, Object[] args, String scheme,boolean isInitializeStaticFields)
	����N�����܂��B
	���̃��\�b�h��method_name�Ŏw�肳�ꂽ���\�b�h�̎��s���ʂ�Object�^�ŕԂ��܂��B�w�肳�ꂽ���\�b�h��void�̏ꍇ��null��Ԃ��܂��B
	isInitializeStaticFields��true�̏ꍇ�̓��[�h���ꂽ�N���X�̏��Ȃǂ����������܂��B
	scheme�Ƀt�@�C���V�X�e���Ŏg�p�����X�L�[����ݒ肵�Ă��������Bex)file://, resource://  
	���s�Ώۂ̃N���X�t�@�C���͊g���q��.class����.clas(vmonkvm_for_pc.jar�����s����ꍇ�͕ς��Ȃ��Ă����v�ł�)
	�ɕύX����K�v������܂��B
	
	
	�T���v��:
		public class testClass{
		
		public static void main(String[] args){
			System.out.println(args[0]);
		}
		
		}
		
		��L�̃R�[�h���R���p�C�����ă��l�[�����Ă��������B
		
		public class test{
		
		public static void main(String[] args){
			String[] arg=new String[]{"Hello World"};
			
			javaStack.StartVM("testClass", "main([Ljava/lang/String;)V", "file://",new Object[]{arg}, true);
		
		}
		}
		
		�W���o�͂�"Hello World"�ƕ\�������͂��ł��B
		
TODO:
	monitorexit, monitorenter�C���X�g���N�V�����R�[�h�̃T�|�[�g�B
	
	
J2SE�p�̃f����bin�ɂ���܂��B
	java -jar vmonkvm_for_pc.jar �N���X��
	�Ŏ��s���Ă��������B
	
�����R�����g����Ɗ������ł��B https://sourceforge.jp/projects/vmonkvm/simple

written by Yuki Kawana
	