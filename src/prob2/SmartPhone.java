package prob2;

public class SmartPhone extends MusicPhone {
	public void playMusic(){
		System.out.println("�ٿ�ε��ؼ� �������");
	}
	public void execute(String string){ //***
		if ( string.equals("��") ) {
			playApp();
			return;
		}
		super.execute( string );
	}
	public void playApp(){
		System.out.println("�۽���");
	}
}
