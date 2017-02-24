package sample;

public class ConstructorFact {
	
	int a;

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		ConstructorFact c = new ConstructorFact(5);
		int f = c.fact();
		System.out.println("Factorial = : " + f);
		
		int b = new ConstructorFact(6).fact();
		System.out.println("Factorial = : " + b);	
		
		//c.fibo();
		
		new ConstructorFact(6).fibo();
	}
	
	ConstructorFact(int k)
	{
		a = k;
	}
	
	int fact()
	{
		int fact = 1;
		
		for (int i = 1; i <= a; i++)
		{
			fact = fact * i;
		}
		return fact;		
	}
	
	void fibo()
	{
		int f1 = 0, f2 = 1, tot;
		System.out.print(f1 + " " + f2);
		
		for (int i = 2; i <= a; i++)
		{
			tot = f1 + f2;
			f1 = f2;
			f2 = tot;
			System.out.print(" " + tot);
		}
		
		
	}

}
