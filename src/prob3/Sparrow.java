package prob3;

public class Sparrow extends Bird {
	private String name;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void fly(){
		System.out.println("����("+name+")�� ���� �ٴմϴ�.");
	}
	public void sing(){
		System.out.println("����("+name+")�� �Ҹ����� ��ϴ�.");
	}
	public String toString(){
		System.out.print("������ �̸��� ");
		return (name+" �Դϴ�");
	}
}
