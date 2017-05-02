package prob3;

public class Prob2 {
	public static void main(String[] args) {
		Bird bird01 = new Duck();
		bird01.setName( "²Ð²ÐÀÌ" );
		bird01.fly();
		bird01.sing();
		System.out.println( bird01 );
		
		Bird bird02 = new Sparrow();
		bird02.setName( "Â±Â±" );
		bird02.fly();
		bird02.sing();
		System.out.println( bird02 );
	}
}
