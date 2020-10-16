class Demo{
	private int num1=20;
	private int num2=30;
	int num3;
	private int sum() {
		return num1+num2;	
	}
	int product() {
		return num1*num2*num3;
	}
}
public class PrivateDemo {
	public static void main(String[]args) {
		Demo obj=new Demo();
		
		obj.num3=40;
		//System.out.println(obj.sum());
		System.out.println(obj.num3);
	}

}
