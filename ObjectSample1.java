package sample;

import java.util.Scanner;

public class ObjectSample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ObjectSample1 os = new ObjectSample1();
		int a, b;
		
		Scanner s = new Scanner(System.in);	
		
		System.out.println("Value of a");
		a = s.nextInt();
		System.out.println("\nValue of b");
		b = s.nextInt();
		
		int x = os.fact(a);
		int y = os.fact(b);
		
		os.add(x, y);
		
		s.close();
				
	}
	
	public void add(int a, int b)
	{
		System.out.println("Addition of Factorial : " + (a + b));
	}
	
	public int fact(int f)
	{
		int fact = 1;
		for (int i = 1; i <= f; i++)
		{
			fact = fact * i;
		}
		return fact;
	}

}
