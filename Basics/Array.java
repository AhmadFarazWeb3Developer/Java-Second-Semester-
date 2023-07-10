

import java.util.*;


public class Array {

	public static void main(String[] args) {

//		Array 
		String[] array = { "A", "H", "M", "A", "D", " ", "F", "A", "R", "A", "Z" };
		
		// Initialization of new array
		
		String newArray = "";

		
		for (int i = 0; i < array.length; i++) {
		
//			new array concatenation
			
			newArray = newArray + array[i];
		}

		System.out.println("Your Name is : " + newArray);
	}

}
