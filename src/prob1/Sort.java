package prob1;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[] = { 5, 9, 3, 8, 60, 20, 1 };
		int temp = 0;
		int count =  array.length;
		
		System.out.println( "Before sort." );
		
		for (int i = 0; i < count; i++) {
			System.out.print( array[ i ] + " " );
		}
		System.out.println("");
		//
		for(int i=count;i>0;i--){
			for(int j=0;j<i-1;j++){
				if(array[j]<array[j+1]){
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		//
		System.out.println("");
		System.out.println( "After Sort." );
		
		for (int i = 0; i < count; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
