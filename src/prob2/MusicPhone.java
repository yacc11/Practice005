package prob2;

public class MusicPhone extends Phone {
	
	@Override
	public void execute( String function ) {
		if ( function.equals("����") ) {
			playMusic();
			return;
		}
		
		super.execute( function );
	}

	protected void playMusic() {
		System.out.println("MP3 �÷��̾�� �������");
	}
}
