package sample;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fact();

	}
	
	public static void fact()
	{
		int i, n, fact=1;
		n=5;
		for ( i = 1; i <= n; i++)
			fact = fact * i;
		System.out.println("Factorial " + fact);
	}

}
