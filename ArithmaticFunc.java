package sample;

import java.util.Scanner;

public class ArithmaticFunc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArithmaticFunc af = new ArithmaticFunc();
		Scanner s = new Scanner(System.in);
		int ch;
		do
		{
			System.out.println("Enter The Value of A");
			int a = s.nextInt();
			System.out.println("Enter The Value of B");
			int b = s.nextInt();
			System.out.println("ARITHMATIC OPERATIONS\n\n");
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Divition");
			System.out.println("5. Exit\n");
			System.out.println("Please Enter Your Choice : ");
			ch = s.nextInt();
			switch(ch)
			{
			case 1: af.add(a, b);
					break;
			case 2: af.sub(a, b);
					break;
			case 3: af.mul(a, b);
					break;
			case 4: af.div(a, b);
					break;
			//case 5:	return;
			}
			
			
			
		}while(ch != 5);
		
		s.close();
	}
	
	public void add(int x, int y)
	{
		System.out.println("Addition of A and B : " + (x + y));
	}
	
	public void sub(int x, int y)
	{
		System.out.println("Subtraction of A and B : " + (x - y));
	}
	
	public void mul(int x, int y)
	{
		System.out.println("Multiplication of A and B : " + (x * y));
	}
	
	public void div(int x, int y)
	{
		System.out.println("Divition of A and B : " + (x / y));
	}

}
