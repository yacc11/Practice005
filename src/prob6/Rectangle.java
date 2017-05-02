package prob6;

public class Rectangle extends Shape implements Resizable {

	private double num1;
	private double num2;
	private double sum;
	public Rectangle(double i, double j) { //witdt.height
		// TODO Auto-generated constructor stub
		this.num1=i;
		this.num2=j;
	}

	public double getArea(){
		
		return this.num1*this.num2;
	}
	@Override
	public void resize(double d) {
		this.num1=num1*d;
		this.num2=num2*d;
	}
	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		sum=num1*2+num2*2;
		return sum;
	}

}
