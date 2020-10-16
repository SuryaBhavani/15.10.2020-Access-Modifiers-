class A{
	protected int m=10;
	protected void display() {
		System.out.println("hai");
	}
	
}
public class Protected_Demo {
	public static void main(String []args) {
		A obj=new A();
		obj.display();
		System.out.println(obj.m);
	}

}
