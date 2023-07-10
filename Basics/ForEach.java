
public class ForEach {

	public static void main(String[] args) {

		int[] Array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };

		int[] oddArray = new int[Array.length]; // Create an array to store odd numbers
		int[] evenArray = new int[Array.length]; // Create an array to store even numbers

		int oddNumberIndex = 0;
		int evenNumberIndex = 0;
		for (int i : Array) {

			if (i % 2 != 0) {

				oddArray[oddNumberIndex++] = i;
			}

			if (i % 2 == 0) {

				evenArray[evenNumberIndex++] = i;
			}

		}

		// Convert oddArray to String for printing
		String oddArrayStr = " ";

		for (int i = 0; i < oddNumberIndex; i++) {

			oddArrayStr = oddArrayStr + oddArray[i] + " ";
		}
		System.out.println("Odd Array is : " + oddArrayStr);

//		convert evenArray to String for printing 

		String evenArrayStr = " ";

		for (int i = 0; i < evenNumberIndex; i++) {

			evenArrayStr = evenArrayStr + evenArray[i] + " ";
		}
		System.out.println("Even Array is : " + evenArrayStr);
	}
}
