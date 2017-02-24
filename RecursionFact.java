package sample;

public class RecursionFact {
	
	static int n = 5, result, f=1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		result = fact(n);
		System.out.println("Factorial  = " + result );

	}
	
	/* 
	public static int fact(int f)
	{
		System.out.println("Iteration");
		if (f == 0)
			return 1;
		else
			return f * fact(f -1);
	}  
	*/
	
	public static int fact(int n)
	{
		f = f * n;
		//System.out.println(f);
		if (n > 1)
			 fact(n - 1);
		return f;		
	}

}
