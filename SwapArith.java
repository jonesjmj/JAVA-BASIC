
public class SwapArith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5; int b = 3;
		System.out.println("Befor Swapping");
		System.out.println("Value of a : "+a);
		System.out.println("Value of b : "+b);
		a = a - b;
		b = b + a;
		a = b - a;
		System.out.println("After Swapping");
		System.out.println("Value of a : "+a);
		System.out.println("Value of b : "+b);
	}
}
