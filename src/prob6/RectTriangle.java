package prob6;

public class RectTriangle extends Shape  {
	
	private double i;
	private double j;
	private double q;
	public RectTriangle(double i, double j) {
		// TODO Auto-generated constructor stub
		this.i=i;
		this.j=j;
		q=i*i+j*j;
	}
	
	public double getArea(){
		return (this.i*this.j)/2;
	}
	
	@Override
	public double getPerimeter() {
		q=Math.sqrt(q);
		return q;
	}

}
