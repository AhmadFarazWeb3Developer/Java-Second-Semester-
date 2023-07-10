
public class whileLoop {

	public static void main(String[] args) {

		int sum = 0;
		int n = 1;
		while (sum < 100) {

			sum = sum + n*10;

			System.out.println("Sum with  " + n + "  number " + sum);

		}

		System.out.println("Total Sum is : " + sum);
	}

}
