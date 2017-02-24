package sample;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 2;
		
		switch(a)
		{
			case 1:
				fact();
				break;
			case 2:
				fibo();
				break;
			default:
				System.out.println("Your Choice is Wrong");
		}

	}
	
	public static void fact()
	{
		int i, n, fact=1;
		n=5;
		for ( i = 1; i <= n; i++)
			fact = fact * i;
		System.out.println("Factorial " + fact);
	}
	
	public static void fibo()
	{
		 int a = 0, b = 1, c, n=10;    
		 System.out.print(a);  
		 System.out.print(" "+b);
		    
		 for(int i = 2; i < n; i++)    
		 {    
		  c = a + b;    
		  System.out.print(" "+ c);  
		  a = b;
		  b = c;    
		 }  
	}
}
