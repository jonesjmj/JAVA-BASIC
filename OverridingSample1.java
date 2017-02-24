package sample;

class A2
{
	void read()
	{
		System.out.println("A2 read method is invoked");
	}
}

class B2 extends A2
{
	void read()
	{
		//super.read();
		System.out.println("B2 Read method is invoked");
		//super.read();
	}
}


public class OverridingSample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B2 b = new B2();
		b.read();

	}

}
