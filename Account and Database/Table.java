import javax.swing.plaf.SliderUI;

public class Table {

    private String Name, City, Bloodgroup;
    private int Contact;

    Table() {
        Name = "No Value";
        City = "No City";
        Contact = 0;
        Bloodgroup = "A+";
    }

    public void setName(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setCity(String city) {
        City = city;
    }

    ;

    public String getCity() {
        return City;
    }

    public void setContact(int contact) {
        Contact = contact;
    }

    public int getContact() {
        return Contact;
    }

    public void setBloodgroup(String bloodgroup) {
        Bloodgroup = bloodgroup;
    }

    public String getBloodgroup() {
        return Bloodgroup;
    }
}