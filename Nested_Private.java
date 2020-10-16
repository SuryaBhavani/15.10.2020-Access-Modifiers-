class Outer{
	private int num1=10;
	private class inner{
		void display() {
			System.out.println(num1);
		}
		
	}
			
}
public class Nested_Private {
	public static void main (String[]args) {
		Outer obj=new Outer();
		Outer.inner obj1=obj.new inner();
		obj1.display();
	}
	

}
