import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Constructor;

public class SelectTasbeeh {
    private JFrame frame;
    private JButton btn1, btn2, btn3, btn4, btn5, btn6, cnt_btn;
    private JLabel label;
    private JTextField txt;
    private int count = 0;
    private int test = 0;
//     Constructor
    SelectTasbeeh() {
        // Creating the frame
        frame = new JFrame("Tabeeh Counter");

        // Creating the buttons
        btn1 = new JButton("<html><div style='text-align:center;'>Tasbih<br>Fatime</div></html>");
        btn2 = new JButton("<html><div style='text-align:center;'>1st Kalima<br>100 Times</div></html>");
        btn3 = new JButton("<html><div style='text-align:center;'>Astghfar<br>100 times</div></html>");
        btn4 = new JButton("<html><div style='text-align:center;'>Darood<br>100 times</div></html>");
        btn5 = new JButton("<html><div style='text-align:center;'>Ayat e Karema<br>100 times</div></html>");
        btn6 = new JButton("<html><div style='text-align;'>Reset</div></html>");

        // Setting the background color for the buttons
        Color bgColor = new Color(222, 226, 230);
        btn1.setBounds(50, 10, 120, 50);
        btn1.setFocusable(false);
        btn1.setBackground(bgColor);
        btn2.setBounds(190, 10, 120,50);
        btn2.setFocusable(false);
        btn2.setBackground(bgColor);
        btn3.setBounds(330, 10, 120, 50);
        btn3.setFocusable(false);
        btn3.setBackground(bgColor);
        btn4.setBounds(50, 80, 120, 50);
        btn4.setFocusable(false);
        btn4.setBackground(bgColor);
        btn5.setBounds(190, 80, 120, 50);
        btn5.setFocusable(false);
        btn5.setBackground(bgColor);
        btn6.setBounds(330, 80, 120, 50);
        btn6.setFocusable(false);
        btn6.setBackground(bgColor);

        // Creating the label
        label = new JLabel("SELECT Any of Tasbeeh");
        label.setBounds(50, 130, 400, 100);
        label.setFont(new Font("Arial", Font.PLAIN, 30));
        label.setForeground(Color.WHITE);

        // Creating the text field
        txt = new JTextField("0");
        txt.setBounds(40, 230, 400, 200);
        txt.setFocusable(false);
        txt.setFont(new Font("Arial", Font.PLAIN, 100));
        txt.setHorizontalAlignment(JTextField.CENTER);
        txt.setAlignmentY(JTextField.CENTER_ALIGNMENT);

        // Setting the background and foreground color for the text field
        Color txtbgColor = new Color(249, 209, 92);
        Color txtfgColor=new Color(42, 157, 143);
        txt.setBackground(txtbgColor);
        txt.setForeground(txtfgColor);

        // Creating the count button
        cnt_btn = new JButton("Count");
        cnt_btn.setBounds(40, 500, 400, 100);
        cnt_btn.setFont(new Font("Arial", Font.PLAIN, 50));
        cnt_btn.setFocusable(false);
        Color CntbgColor = new Color(231, 111, 81);
        cnt_btn.setBackground(CntbgColor);
        cnt_btn.setForeground(Color.WHITE);

        // Adding action listeners to the buttons
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Setting the label text and reset the count for Tasbeeh Fatima
                test = 1;
                label.setText("Tasbeeh Fatima");
                count = 0;
                txt.setText(Integer.toString(count));
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Setting the label text and reset the count for 1st Kalima 100 Times
                test = 1;
                label.setText("1st Kalima 100 Times");
                count = 0;
                txt.setText(Integer.toString(count));
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Setting the label text and reset the count for Astaghfar 100 Times
                test = 1;
                label.setText("Astaghfar 100 Times");
                count = 0;
                txt.setText(Integer.toString(count));
            }
        });
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Setting the label text and reset the count for Darood 100 Times
                test = 1;
                label.setText("Darood 100 Times");
                count = 0;
                txt.setText(Integer.toString(count));
            }
        });
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Setting the label text and reset the count for Ayat e Kareema 100 Times
                test = 1;
                label.setText("Ayat e Kareema 100 Times");
                count = 0;
                txt.setText(Integer.toString(count));
            }
        });
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Resetting the counter and label text
                test = 0;
                label.setText("Counter Reset to 0");
                count = 0;
                txt.setText(Integer.toString(count));
            }
        });

        cnt_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Incrementing the count and update the text field if a tasbeeh is selected
                if (test == 1) {
                    count++;
                    txt.setText(Integer.toString(count));
                } else {
                    // Displaying a message if no tasbeeh is selected
                    label.setText("SELECT any of Tasbeeh");
                }
            }
        });

        // Adding components to the frame
        frame.add(btn1);
        frame.add(btn2);
        frame.add(btn3);
        frame.add(btn4);
        frame.add(btn5);
        frame.add(btn6);
        frame.add(label);
        frame.add(txt);
        frame.add(cnt_btn);

        // Setting the frame properties
        frame.setBounds(500, 50, 500, 700);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Set the background color for the frame
        Color fbg_color = new Color(33, 104, 105);
        frame.getContentPane().setBackground(fbg_color);
        frame.setVisible(true);
    }
}
