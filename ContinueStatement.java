
public class ContinueStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 4;
		System.out.println("Continue Statement with For Loop");
		for (int i = 1; i <= n; i++)
		{
			if (i == 2)
				continue;
			System.out.println(i);
		}
		System.out.println("Continue Statement with While Loop");
		int i = 1;
		while (i <= n)
		{
			if (i == 2)
				continue;
			System.out.println(i);
			i++;
		}
	}
}
