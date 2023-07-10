import java.util.Scanner;

// Base class
class Movie {
	protected String rating;
	protected int idNo;
	protected String title;

	// Default constructor
	public Movie() {
	}

	// Constructor
	public Movie(String rating, int idNo, String title) {
		this.rating = rating;
		this.idNo = idNo;
		this.title = title;
	}

	// Setter method for rating
	public void setRating(String rating) {
		this.rating = rating;
	}

	// Getter method for rating
	public String getRating() {
		return rating;
	}

	// Setter method for id
	public void setIdNo(int idNo) {
		this.idNo = idNo;
	}

	// Getter method for id
	public int getIdNo() {
		return idNo;
	}

	// Setter method for title
	public void setTitle(String title) {
		this.title = title;
	}

	// Getter method for title
	public String getTitle() {
		return title;
	}

	// Equals method by operator overloading
	public boolean equals(Movie obj) {
		return this.idNo == obj.idNo;
	}

	// Late fee calculation method
	public float calcLateFees(int daysLate) {
		return 2 * daysLate;
	}
}

// Action class child of Movie
class Action extends Movie {
	// Late fee calculation method for Action movies
	public float calcLateFees(int daysLate) {
		return 3 * daysLate;
	}
}

// Comedy class child of Movie
class Comedy extends Movie {
	// Late fee calculation method for Comedy movies
	public double calcLateFees(double daysLate) {
		return 2.5f * daysLate;
	}
}

// Drama class child of Movie
class Drama extends Movie {
	// Late fee calculation method for Drama movies
	public float calcLateFees(int daysLate) {
		return 2 * daysLate;
	}
}

// Test the classes
public class MoviesDetails {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Create Movie objects
		Action action = new Action();
		Comedy comedy = new Comedy();
		Drama drama = new Drama();
//Details for action movies
		System.out.println("\n-----Enter Action Movie Details-----");
		System.out.print("\nEnter Title: ");
		String actionTitle = scanner.nextLine();
		action.setTitle(actionTitle);
		System.out.print("\nEnter ID No: ");
		int actionId = scanner.nextInt();
		action.setIdNo(actionId);
		scanner.nextLine();
		System.out.print("\nRating: ");
		String actionRating = scanner.nextLine();
		action.setRating(actionRating);
//Details for comedy movies
		System.out.println("\n-----Enter Comedy Movie Details-----");
		System.out.print("\nEnter Title: ");
		String comedyTitle = scanner.nextLine();
		comedy.setTitle(comedyTitle);
		System.out.print("\nEnter ID No: ");
		int comedyId = scanner.nextInt();
		comedy.setIdNo(comedyId);
		scanner.nextLine();
		System.out.print("\nRating: ");
		String comedyRating = scanner.nextLine();
		comedy.setRating(comedyRating);
//Details for drama 
		System.out.println("\n-----Enter Drama Movie Details-----");
		System.out.print("\nEnter Title: ");
		String dramaTitle = scanner.nextLine();
		drama.setTitle(dramaTitle);
		System.out.print("\nEnter ID No: ");
		int dramaId = scanner.nextInt();
		drama.setIdNo(dramaId);
		scanner.nextLine();
		System.out.print("\nRating: ");
		String dramaRating = scanner.nextLine();
		drama.setRating(dramaRating);
		System.out.println("-----Details for All Movies-----");
		System.out.println("\n------Details for Action Movie -------");
		System.out.println("\tTitle    :  " + action.getTitle());
		System.out.println("\tRating   :  " + action.getRating());
		System.out.println("\tID No    :  " + action.getIdNo());
		// Testing equals method
		System.out.println("\tIs Action Movie equal to Comedy ?  :  " + (action.equals(comedy) ? "Yes" : "No"));
		System.out.println("\tIs Action Movie equal to Drama  ?  :  " + (action.equals(drama) ? "Yes" : "No"));
		// Test late fee calculation method
		System.out.println("\tLate fee : " + action.calcLateFees(3));
		System.out.println("\n-------Details for Comedy Movie --------");
		System.out.println("\tTitle    :  " + comedy.getTitle());
		System.out.println("\tRating   :  " + comedy.getRating());
		System.out.println("\tID No    :  " + comedy.getIdNo());
		// Testing equals method
		System.out.println("\tIs Comedy Movie equal to Action  ?  : " + (comedy.equals(action) ? "Yes" : "No"));
		System.out.println("\tIs Comedy Movie equal to Drama   ?  : " + (comedy.equals(drama) ? "Yes" : "No"));
		// Test late fee calculation method
		System.out.println("\tLate fee :  " + comedy.calcLateFees(2.50));

		System.out.println("\n-------Details for Movie 3 ------------");
		System.out.println("\tTitle    :  " + drama.getTitle());
		System.out.println("\tRating   :  " + drama.getRating());
		System.out.println("\tID No    :  " + drama.getIdNo());
		// Testing equals method
		System.out.println("\tIs Drama equal to Action Movie ?  : " + (drama.equals(action) ? "Yes" : "No"));
		System.out.println("\tIs Drama equal to Comedy Movie ?  : " + (drama.equals(comedy) ? "Yes" : "No"));
		// Test late fee calculation method
		System.out.println("\tLate fee : " + drama.calcLateFees(2));
	}
}