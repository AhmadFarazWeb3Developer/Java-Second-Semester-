	
 class StudentDetails {
	String FirstName;
	String LastName;
	int RollNo;
	String Class;
	float Marks;
	String Grade;

	StudentDetails() {
		FirstName = "Ahmad";
		LastName = "Faraz";
		RollNo = 215154;
		Class = "BSCS-II";
		Marks = 844;
		Grade = "A";
	}

	StudentDetails(String fName, String lName, int rollNo, String className, float marks, String grade) {
		FirstName = fName;
		LastName = lName;
		RollNo = rollNo;
		Class = className;
		Marks = marks;
		Grade = grade;
	}
	

	public void PrintData() {
		System.out.println("Roll Number : " + RollNo);
		System.out.println("First Name  : " + FirstName);
		System.out.println("Last Name   : " + LastName);
		System.out.println("Class       : "  + Class);
		System.out.println("Marks       : " + Marks);
		System.out.println("Grade       : " + Grade);
	}

	public static void main(String[] args) {
		StudentDetails student = new StudentDetails("Ahmad", "Hassan", 205154, "BSCS-IV", 750, "B+");
		student.PrintData();
	}
 }
