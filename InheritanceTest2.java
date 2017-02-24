package sample;

class A1
{
	void write()
	{
		System.out.println("Write method is invoked");
	}
}

class B1 extends A1
{
	void read()
	{
		//super.write();
		System.out.println("Read method is invoked");
	}
}

class C1 extends B1
{
	void read1()
	{
		super.write();
		System.out.println("Read method is invoked");
	}
}


public class InheritanceTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		C1 b = new C1();
		b.read1();
	}
}
