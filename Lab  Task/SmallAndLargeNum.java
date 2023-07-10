
import java.util.Scanner;

// Base class
public class SmallAndLargeNum {
//	main class 
	public static void main(String[] args) {
//	scanner object
		Scanner scan = new Scanner(System.in);
// Declaring two arrays
		int[] FirstArray = new int[10];
		int[] SecondArray = new int[10];

		for (int i = 0; i < 10; i++) {
			int num = i + 1;

			System.out.print("Enter " + num + " Number : ");
			FirstArray[i] = scan.nextInt();
			SecondArray[i] = FirstArray[i];
		}

		int smallest = SecondArray[0];

		for (int i = 1; i < 10; i++) {

//			condition for comparing
			if (SecondArray[i] < smallest)
				smallest = SecondArray[i];
		}
		int largest = SecondArray[0];

		for (int i = 1; i < 10; i++) {

//			condition for comparing
			if (SecondArray[i] > largest)
				largest = SecondArray[i];
		}
		System.out.println("Smallest Number = " + smallest);
		System.out.println("Largest Number = " + largest);
	}
}