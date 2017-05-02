package prob5;

public class MyStack {
	private int top;
	private int num;
	
	String[] buffer;// = new String[i];
	
	public MyStack(int i) {
		top=0;
		buffer = new String[i];
	}
	
	// String[] buffer = new String[i]; 말도 안되는 선언
	
	public void push(String string) {
		
		this.buffer[top] = string;
		top++;
	}

	public boolean isEmpty() {
		buffer[0]=null;
		return true;
	}

	public String pop() {
		top--;
		return this.buffer[top];
	}

}
