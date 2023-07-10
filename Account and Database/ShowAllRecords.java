import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class ShowAllRecords {
    JFrame frame;
    JLabel label, lbl1, lbl2, lbl3, lbl4;
    JTextField txt1, txt2, txt3, txt4;
    JButton showAllDoners_btn;
    Table table;

    ShowAllRecords() {
        frame = new JFrame(); // Initialize the JFrame object
        table = new Table();
        label = new JLabel("Enter All All records are Here");
        label.setBounds(90, 5, 300, 50);
        label.setFont(new Font("Arial", Font.PLAIN, 20));



        showAllDoners_btn = new JButton("Show All Records");
        showAllDoners_btn.setBounds(100, 410, 170, 30);
        showAllDoners_btn.setFocusPainted(false);

        frame.add(label);

        frame.add(showAllDoners_btn);

//
        frame.setBounds(250, 50, 400, 500);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new MainMenu();
    }
}