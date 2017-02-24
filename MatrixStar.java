
public class MatrixStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 3, n2 = 5;
		
		System.out.println("Matix Format");
		for ( int i = 1; i <= n1; i++)
		{
			for (int j = 1; j <= n1; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("Triangle Fromat");
		for ( int i = 1; i <= n2; i++)
		{
			for (int j = 1; j <= i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
