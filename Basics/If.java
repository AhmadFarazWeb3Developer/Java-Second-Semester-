
import java.util.*;

public class If {

	public static void main(String[] args) {

//		making scan object 

		Scanner scan;

		scan = new Scanner(System.in);

		System.out.println("Enter First number : ");
		int num1 = scan.nextInt();

		System.out.println("Enter Second numbe : ");

		int num2 = scan.nextInt();

		if (num1 > num2)

			System.out.println("a is greater then b");
		else {
			System.out.println("b is greater than a");

		}
		scan.close();

	}

}


//import java.util.*;: This line imports the java.util package, which contains the Scanner class among others.
//scan.close();: This closes the Scanner object to release any resources associated with it and prevent resource leaks.
