
class Student {

	private String Name;
	private int ID;
	private String Location;

	Student() {
	}

	Student(String name, int id, String location) {
		Name = name;
		ID = id;
		Location = location;
	}

	public void setRecord(String name, int id, String location) {

		Name = name;
		ID = id;
		Location = location;
	}

	public void getRecord() {
		System.out.println("Your Name  :  " + Name);
		System.out.println("Your ID    :  " + ID);
		System.out.println("Location   :  " + Location);
	}

}
