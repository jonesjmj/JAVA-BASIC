package sample;

public class ObjectSample {
	
	int a, b;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ObjectSample os = new ObjectSample();
		os.add();

	}
	
	public void add()
	{
		a = 5;
		b = 6;
		System.out.println("Addition : " + (a+b));
	}
}
