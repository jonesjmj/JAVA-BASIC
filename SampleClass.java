package sample;

public class SampleClass {
	
	int a = 10, n;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Addition");
		add();		
	}
	
	public static void add()
	{
		int a = 5, b = 6, c;
		c = a + b;
		System.out.println(c);
		System.out.println(a);
		sub();
	}
	
	public static void sub()
	{
		System.out.println("Subtraction");
		int a = 10, b = 6, c;
		c = a - b;
		System.out.println(c);
		System.out.println(a);
	}

}
