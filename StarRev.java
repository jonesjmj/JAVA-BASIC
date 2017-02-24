
public class StarRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n2 = 3;
		
		for ( int i = 1; i <= n2; i++)
		{
			for (int j = n2 - i; j <= n2; j++)
			{
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++)
			{
				System.out.print(" *"); 
			}
			
			System.out.println();
		}

	}

}
