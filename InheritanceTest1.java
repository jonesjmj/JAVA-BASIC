package sample;

class A
{
	void write()
	{
		System.out.println("Write method is invoked");
	}
}

class B extends A
{
	void read()
	{
		System.out.println("Read method is invoked");
	}
}

public class InheritanceTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B b = new B();
		b.read();
		b.write();
	}
}
