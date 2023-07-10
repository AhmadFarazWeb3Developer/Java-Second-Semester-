
public class StudentDetails {

	public static void main(String[] args) {

		Student std1 = new Student();
		Student std2 = new Student();

		std1.setRecord("Ahmad Faraz", 215154, "Swat");
		std2.setRecord("Saad Israr", 225671, "Mardan");

		std1.getRecord();
		std2.getRecord();

	}

}
