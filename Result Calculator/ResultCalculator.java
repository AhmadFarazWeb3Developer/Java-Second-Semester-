import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ResultCalculator {
    private JFrame frame;
    private JLabel label;
    private JTextField Programming, Math, Physics, English, Statistics;
    protected int programmingMarks, mathMarks, physicsMarks, englishMarks, statisticsMarks;
    private JButton Submit_Btn;

    ResultCalculator() {
        frame = new JFrame("Result Card Calculator");

//   creating Label
        label = new JLabel(" Welcome to Marks Calculator");
        label.setBounds(42, 30, 400, 70);
        label.setFont(new Font("Arial", Font.PLAIN, 30));
        Color lblfgColor = new Color(234, 226, 183);
        label.setForeground(lblfgColor);
        // text field
        Programming = new JTextField("Enter Programming Subject Marks");
        Programming.setFocusable(false);
        Programming.setHorizontalAlignment(JTextField.CENTER);
        Color fgColor = new Color(108, 117, 125);
        Programming.setForeground(fgColor);
        Math = new JTextField("Enter Math Marks");
        Math.setFocusable(false);
        Math.setHorizontalAlignment(JTextField.CENTER);
        Math.setForeground(fgColor);
        Physics = new JTextField("Enter Physics Marks");
        Physics.setFocusable(false);
        Physics.setHorizontalAlignment(JTextField.CENTER);
        Physics.setForeground(fgColor);
        English = new JTextField("Enter English Marks");
        English.setFocusable(false);
        English.setHorizontalAlignment(JTextField.CENTER);
        English.setForeground(fgColor);
        Statistics = new JTextField("Enter Statistics Marks");
        Statistics.setFocusable(false);
        Statistics.setHorizontalAlignment(JTextField.CENTER);
        Statistics.setForeground(fgColor);
//        setting properties of text fields
        Programming.setBounds(110, 130, 250, 40);
        Math.setBounds(110, 190, 250, 40);
        Physics.setBounds(110, 250, 250, 40);
        English.setBounds(110, 310, 250, 40);
        Statistics.setBounds(110, 370, 250, 40);
        Programming.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                Programming.setText("");
            }

            @Override
            public void focusLost(FocusEvent e) {

                if (Programming.getText().isEmpty()) {
                    Programming.setText("Enter Programming Subject Marks");
                }
            }
        });
        Programming.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Programming.setFocusable(true);
            }
        });
        Math.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                Math.setText("");
            }

            @Override
            public void focusLost(FocusEvent e) {

                if (Math.getText().isEmpty()) {
                    Math.setText("Enter Math Marks");
                }
            }
        });
        Math.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Math.setFocusable(true);
            }
        });
        Physics.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                Physics.setText("");

            }

            @Override
            public void focusLost(FocusEvent e) {
                if (Physics.getText().isEmpty()) {
                    Physics.setText("Enter Physics Subject Marks");
                }
            }
        });

        Physics.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Physics.setFocusable(true);
            }
        });

        English.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                English.setText("");
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (English.getText().isEmpty()) {
                    English.setText("Enter English Subject Marks");
                }
            }
        });
        English.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                English.setFocusable(true);
            }
        });
        Statistics.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                Statistics.setText("");

            }

            @Override
            public void focusLost(FocusEvent e) {
                if (Statistics.getText().isEmpty()) {
                    Statistics.setText("Enter Statistics Subject Marks");
                }
            }
        });
        Statistics.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Statistics.setFocusable(true);
            }
        });
        Submit_Btn = new JButton("Submit");
        Submit_Btn.setBounds(155, 460, 150, 35);
        Submit_Btn.setFont(new
                Font("Arial", Font.PLAIN, 20));
        Submit_Btn.setFocusable(false);
        Color CntbgColor = new Color(231, 111, 81);
        Submit_Btn.setBackground(CntbgColor);
        Submit_Btn.setForeground(Color.WHITE);
        Submit_Btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                programmingMarks = Integer.parseInt(Programming.getText());
                mathMarks = Integer.parseInt(Math.getText());
                physicsMarks = Integer.parseInt(Physics.getText());
                englishMarks = Integer.parseInt(English.getText());
                statisticsMarks = Integer.parseInt(Statistics.getText());

                ResultSheet resultSheet = new ResultSheet(programmingMarks, mathMarks, physicsMarks, englishMarks, statisticsMarks);
            }
        });
        // Add components to the frame
        frame.add(label);
        frame.add(Programming);
        frame.add(Math);
        frame.add(Physics);
        frame.add(English);
        frame.add(Statistics);
        frame.add(Submit_Btn);
        // Set the frame properties
        frame.setBounds(500, 50, 500, 600);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);
        // Set the background color for the frame
        Color fbg_color = new Color(33, 104, 105);
        frame.getContentPane().setBackground(fbg_color);
        frame.setVisible(true);
    }
}


