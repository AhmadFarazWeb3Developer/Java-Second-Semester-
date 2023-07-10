import javax.lang.model.element.Name;

public class Table {
    private String Name;
    private int Age;


    public void MyName(String name, int age) {
        Name = name;
        Age = age;
    }

    public String GetName() {
        return Name;
    }

    public int Age() {
        return Age;
    }


}