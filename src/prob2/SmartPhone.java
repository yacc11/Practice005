package prob2;

public class SmartPhone extends MusicPhone {
	public void playMusic(){
		System.out.println("´Ù¿î·ÎµåÇØ¼­ À½¾ÇÀç»ý");
	}
	public void execute(String string){ //***
		if ( string.equals("¾Û") ) {
			playApp();
			return;
		}
		super.execute( string );
	}
	public void playApp(){
		System.out.println("¾Û½ÇÇà");
	}
}
