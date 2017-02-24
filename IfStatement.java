
public class IfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 4, b = 7, c = 3;	
		
		System.out.println("Biggest of Two Numbers A and B");
		if (a > b)
			System.out.println("A is Bigger");
		else
			System.out.println("B is Bigger");
		
		System.out.println("Biggest of Three Numbers A, B and C");
		if (a > b && a > c)
			System.out.println("A is Bigger");
		else if(b > c)
			System.out.println("B is Bigger");
		else
			System.out.println("C is Bigger");

	}

}
