
public class NestedFor {

	public static void main(String[] args) {		
		// TODO Auto-generated method stub
		for (int i = 1; i < 5; i++)
		{
			System.out.println(i);
			for (int j = i; j < 5; j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
