import javax.swing.*;
import java.awt.*;

public class DeleteDonor {
    JFrame frame;
    JLabel label, lbl1, lbl2, lbl3, lbl4;
    JTextField txt1, txt2, txt3, txt4;
    JButton deleteDoner_btn;
    Table table;

    DeleteDonor() {
        frame = new JFrame(); // Initialize the JFrame object
        table = new Table();
        label = new JLabel("Enter All Required Details");
        label.setBounds(90, 5, 300, 50);
        label.setFont(new Font("Arial", Font.PLAIN, 20));
        lbl1 = new JLabel("Name");
        lbl1.setBounds(90, 70, 200, 30);
        txt1 = new JTextField();
        txt1.setBounds(90, 100, 200, 30);


        lbl2 = new JLabel("City");
        lbl2.setBounds(90, 150, 200, 30);
        txt2 = new JTextField();
        txt2.setBounds(90, 180, 200, 30);

        lbl3 = new JLabel("Contact");
        lbl3.setBounds(90, 230, 200, 30);
        txt3 = new JTextField();
        txt3.setBounds(90, 260, 200, 30);


        lbl4 = new JLabel("Blood Group");
        lbl4.setBounds(90, 310, 200, 30);
        txt4 = new JTextField();
        txt4.setBounds(90, 340, 200, 30);


        deleteDoner_btn = new JButton("Delete Donor Record");
        deleteDoner_btn.setBounds(100, 410, 170, 30);
        deleteDoner_btn.setFocusPainted(false);

        frame.add(label);
        frame.add(lbl1);
        frame.add(txt1);

        frame.add(lbl2);
        frame.add(txt2);

        frame.add(lbl3);
        frame.add(txt3);

        frame.add(lbl4);
        frame.add(txt4);
        frame.add(deleteDoner_btn);

//
        frame.setBounds(250, 50, 400, 500);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new MainMenu();
    }
}