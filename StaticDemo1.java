
public class StaticDemo1 {
	static int num1=0;
	int num2=0;
	StaticDemo1(){
		num1++;
		num2++;
	}
	static void display() { //Static method
		System.out.println("it doesnt need obj instantiation");
	}
	static { //this is a static block
		System.out.println("hai");
		System.out.println("hello");
		System.out.println("Namastae");
		
	}
	public static void main(String[]args) {
		System.out.println("num1= "+StaticDemo1.num1);
		StaticDemo1 obj1=new StaticDemo1();
		StaticDemo1 obj2=new StaticDemo1();
		StaticDemo1 obj3=new StaticDemo1();
		System.out.println("num1= "+obj2.num1);
		System.out.println("num1= "+obj1.num1);
		System.out.println("num2= "+obj1.num2);
		System.out.println("num1= "+obj2.num1);
		System.out.println("num1= "+obj3.num1);
		System.out.println("num2= "+obj2.num2);
		StaticDemo1.display();
		
		
	}

}

