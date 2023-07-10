import java.util.Scanner;

abstract class Shape {
	private int NumLines;
	private String PenColor;
	private String FillColor;

	Shape() {
		NumLines = 0;
		PenColor = "Nill";
		FillColor = "Nill";
	}

// constructor 
	Shape(int numLines, String penColor, String fillColor) {
		NumLines = numLines;
		PenColor = penColor;
		FillColor = fillColor;
	}

// setter for number of lines
	public void setNumLine(int numLines) {

		NumLines = numLines;
	}

//getter for number of lines
	public int getNumLines() {
		return NumLines;
	}

//setter for pen color
	public void setPenColor(String penColor) {
		PenColor = penColor;
	}

//getter for pen color
	public String getPenColor() {
		return PenColor;
	}

// setter for fill color
	public void setFillColor(String fillColor) {

		FillColor = fillColor;
	}

//getter for fill color
	public String getFillColor() {
		return FillColor;
	}

	// Abstract method
	public abstract void draw();
}

// circle class inherit from shape
class Circle extends Shape {
	private int radius;

// constructor
	public Circle(int numLines, String penColor, String fillColor, int radius) {
		super(numLines, penColor, fillColor);
		this.radius = radius;
	}

	// overriding of draw method
	public void draw() {
		System.out.println("Circle Radius   : " + radius);
		System.out.println("Pen Color       : " + getPenColor());
		System.out.println("Fill Color      : " + getFillColor());
		System.out.println("Number of Lines : " + getNumLines());
	}
}

// Square class inherit from shape
class Square extends Shape {
	private int sideLength;

// constructor
	public Square(int numLines, String penColor, String fillColor, int sideLength) {
		super(numLines, penColor, fillColor);
		this.sideLength = sideLength;
	}

// overriding of draw method
	public void draw() {
		System.out.println("Square's side length : " + sideLength);
		System.out.println("Pen Color            : " + getPenColor());
		System.out.println("Fill Color           : " + getFillColor());
		System.out.println("Number of Lines      : " + getNumLines());
	}
}

// triangle class inherit from shape
class Triangle extends Shape {
	private int base;
	private int height;

// constructor
	public Triangle(int numLines, String penColor, String fillColor, int base, int height) {
		super(numLines, penColor, fillColor);
		this.base = base;
		this.height = height;
	}

	// overriding of draw method
	public void draw() {
		System.out.println("Triangle with base   : " + base);
		System.out.println("Height               : " + height);
		System.out.println("Pen Color            : " + getPenColor());
		System.out.println("Fill Color           : " + getFillColor());
		System.out.println("Number of Lines      : " + getNumLines());
	}
}
// main class starts from here 

public class ShapesDetails {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Getting Circle details from user
		System.out.println("Enter Circle details:");
		System.out.print("Number of Lines: ");
		int circleNumLines = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Pen Color: ");
		String circlePenColor = scanner.nextLine();
		System.out.print("Fill Color: ");
		String circleFillColor = scanner.nextLine();
		System.out.print("Radius: ");
		int circleRadius = scanner.nextInt();

		// Circle object
		Circle circle = new Circle(circleNumLines, circlePenColor, circleFillColor, circleRadius);

		// Getting Square details from user
		System.out.println("\nEnter Square details:");
		System.out.print("Number of Lines: ");
		int squareNumLines = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Pen Color: ");
		String squarePenColor = scanner.nextLine();
		System.out.print("Fill Color: ");
		String squareFillColor = scanner.nextLine();
		System.out.print("Side Length: ");
		int squareSideLength = scanner.nextInt();

		// Square object
		Square square = new Square(squareNumLines, squarePenColor, squareFillColor, squareSideLength);

		// Getting Triangle details from user
		System.out.println("\nEnter Triangle details:");
		System.out.print("Number of Lines: ");
		int triangleNumLines = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Pen Color: ");
		String trianglePenColor = scanner.nextLine();
		System.out.print("Fill Color: ");
		String triangleFillColor = scanner.nextLine();
		System.out.print("Base: ");
		int triangleBase = scanner.nextInt();
		System.out.print("Height: ");
		int triangleHeight = scanner.nextInt();

		// Triangle object
		Triangle triangle = new Triangle(triangleNumLines, trianglePenColor, triangleFillColor, triangleBase,
				triangleHeight);

		scanner.close();

		// Print the details of all shapes
		System.out.println("\nDetails of created shapes:");
		System.out.println("----------------------------");
		circle.draw();
		System.out.println("----------------------------");
		square.draw();
		System.out.println("----------------------------");
		triangle.draw();
		System.out.println("----------------------------");
	}
}
