import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class MainMenu {

    JFrame frame;
    JLabel label;
    JButton Add_Donor, update_Donor, delete_Donor, show_all_records;
    Table table;

    MainMenu() {
        frame = new JFrame(); // Initialize the JFrame object
        table = new Table();
        label = new JLabel("Blood Donation System for PAC Hospital ");
        label.setBounds(70, 50, 300, 50);
        Add_Donor = new JButton("Add Donor");
        update_Donor = new JButton("Update Donor");
        delete_Donor = new JButton("Delete Donor");
        show_all_records = new JButton("Show ALL Records");

        Add_Donor.setBounds(90, 130, 200, 30);
        update_Donor.setBounds(90, 200, 200, 30);
        delete_Donor.setBounds(90, 270, 200, 30);
        show_all_records.setBounds(90, 340, 200, 30);

        Add_Donor.setFocusPainted(false);
        update_Donor.setFocusPainted(false);
        delete_Donor.setFocusPainted(false);
        show_all_records.setFocusPainted(false);
        frame.add(label);
        frame.add(Add_Donor);
        frame.add(update_Donor);
        frame.add(delete_Donor);
        frame.add(show_all_records);
        frame.setBounds(250, 50, 400, 500);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new MainMenu();
    }
}