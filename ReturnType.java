package sample;

public class ReturnType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val = add();
		System.out.println(val);

	}
	
	public static int add()
	{
		int a = 5, b = 6, c;
		c = a + b;
		return c;
	}

}
