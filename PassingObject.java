package sample;

public class PassingObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 5;
		PassingObject Obj = new PassingObject();
		add(a, Obj);

	}
	
	static void add(int a, PassingObject c)
	{
		System.out.println("Passing Object");
		c.sub();
	}
	
	void sub()
	{
		System.out.println("Method Object Called");
	}

}
