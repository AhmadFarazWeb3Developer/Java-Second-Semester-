import java.util.Scanner;

public class userDefineMethod {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter First number : ");
		int num1 = scan.nextInt();
		System.out.println("Enter Second number : ");
		int num2 = scan.nextInt();

//		Method call

		GreaterNumber(num1, num2);

	}

//	Greater Number Method Definition

	public static void GreaterNumber(int n1, int n2) {
		
		
//		using Conditional Operator  
		
		String result = (n1 > n2) ? "First number is Greater then Second   :   " + n1 + " > " + n2
				: "Second number is Greater then First   :   " + n2 + " > " + n1;
		
		System.out.println(result);

		
// Another way of doing 		
//		  int max = Math.max(n1, n2);
//		    if (n1 == max) {
//		        System.out.println("First number is greater than Second: " + n1 + " > " + n2);
//		    } else {
//		        System.out.println("Second number is greater than First: " + n2 + " > " + n1);
//		    }
		}
	}


