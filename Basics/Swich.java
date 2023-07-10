
import java.util.*;

public class Swich {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Your Grandes : ");
		int grades = scan.nextInt();

		switch (grades) {

		case 50:
			System.out.println("Your Grades are :  " + grades);
			break;

		case 60:
			System.out.println("Your Grades are :  " + grades);
			break;
		case 70:
			System.out.println("Your Grades are :  " + grades);

			break;
		case 80:
			System.out.println("Your Grades are :  " + grades);
			break;
		default:
			System.out.println("Your Grades are :  " + grades);
		}

		scan.close();
		
	}

}
