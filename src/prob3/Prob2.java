package prob3;

public class Prob2 {
	public static void main(String[] args) {
		Bird bird01 = new Duck();
		bird01.setName( "�в���" );
		bird01.fly();
		bird01.sing();
		System.out.println( bird01 );
		
		Bird bird02 = new Sparrow();
		bird02.setName( "±±" );
		bird02.fly();
		bird02.sing();
		System.out.println( bird02 );
	}
}
