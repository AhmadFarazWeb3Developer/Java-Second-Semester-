import java.util.Scanner;

public class WorkerEfficency {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("How much time you taken to compelete the task : ");

		int time = scan.nextInt();

		if (time >= 2 && time <= 3) {

			System.out.println("Highly Efficient");
		}

		else if (time >= 3 && time < 4) {

			System.out.print("Improve Speed ");
		} else if (time >= 4 && time <= 5) {

			System.out.println("Training is required to improve Speed");
		} else if (time > 5) {

			System.out.println("Leave the Company");
		}

		else {

			System.out.println("You time is : " + time + " Its an Ideal case");
		}
	}

}
