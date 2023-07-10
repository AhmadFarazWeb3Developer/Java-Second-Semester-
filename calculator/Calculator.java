import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.*;

public class Calculator {
    // instance variables
    private int result, num1, num2;
    private JFrame frame;
    private JLabel First_lbl, Second_lbl, Result_lbl;
    private JTextField txt1, txt2, txt3;
    private JButton Add_btn, Sub_btn, Div_btn, Mul_btn, Mod_btn, Clear_btn;

    // default constructor
    Calculator() {
        // create the frame
        frame = new JFrame("Calculator");
        frame.setLayout(new GridLayout(6, 2, 5, 5));
        // add border to frame
        frame.getRootPane().setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        First_lbl = new JLabel("Enter First Number ");
        Second_lbl = new JLabel("Enter Second Number");
        Result_lbl = new JLabel("Result");
        // text fields
        txt1 = new JTextField();
        txt1.setHorizontalAlignment(JTextField.RIGHT);
        txt2 = new JTextField();
        txt2.setHorizontalAlignment(JTextField.RIGHT);
        txt3 = new JTextField();
        txt3.setEditable(false);
        txt3.setBackground(Color.LIGHT_GRAY);
        // buttons
        Add_btn = new JButton("+");
        Sub_btn = new JButton("-");
        Mul_btn = new JButton("*");
        Div_btn = new JButton("/");
        Mod_btn = new JButton("%");
        Clear_btn = new JButton("Clear");

        // listener for text field txt1
        txt1.addKeyListener(new KeyAdapter() {
            // allows only numbers to be typed in txt1
            @Override
            public void keyTyped(KeyEvent e) {
                if (e.getKeyChar() >= '0' && e.getKeyChar() <= '9') {
                    txt1.setEditable(true);
                } else {
                    txt1.setEditable(false);
                }
            }

            // allows the user to delete digits using the backspace key
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    String text = txt1.getText();
                    if (text.length() > 0) {
                        txt1.setText(text.substring(0, text.length() - 1));
                    }
                }
                char c = e.getKeyChar();
                if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE)) {
                    e.consume();
                }
            }
        });

        // listener for text field txt2
        txt2.addKeyListener(new KeyAdapter() {
            // allows only numbers to be typed in txt2
            @Override
            public void keyTyped(KeyEvent e) {
                if (e.getKeyChar() >= '0' && e.getKeyChar() <= '9') {
                    txt1.setEditable(true);
                } else {
                    txt1.setEditable(false);
                }
                char c = e.getKeyChar();
                if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE)) {
                    e.consume();
                }
            }

            // allows the user to delete digits using the backspace key
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    String text = txt1.getText();
                    if (text.length() > 0) {
                        txt1.setText(text.substring(0, text.length() - 1));
                    }
                }
            }
        });

        // Event Listener for Addition
        Add_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Integer.parseInt(txt1.getText()); // parse first input as integer
                num2 = Integer.parseInt(txt2.getText()); // parse second input as integer
                result = num1 + num2;
                txt3.setText(String.valueOf(result));
            }

        });
//            Event Listener for Subtraction
        Sub_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Integer.parseInt(txt1.getText());
                num2 = Integer.parseInt(txt2.getText());
                result = num1 - num2;
                if (result < 0) {
                    result = -(result);
                    txt3.setText(String.valueOf(result));
                } else {
                    txt3.setText(String.valueOf(result));
                }
            }
        });
//            Event Listener for Multiplication
        Mul_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Integer.parseInt(txt1.getText());
                num2 = Integer.parseInt(txt2.getText());
                result = num1 * num2;
                txt3.setText(String.valueOf(result));
            }
        });
//Event Listener for Division
        Div_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Integer.parseInt(txt1.getText());
                num2 = Integer.parseInt(txt2.getText());
                result = num1 / num2;
                txt3.setText(String.valueOf(result));
            }
        });
        //            Event Listener for Modulus
        Mod_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Integer.parseInt(txt1.getText());
                num2 = Integer.parseInt(txt2.getText());
                result = num1 % num2;
                txt3.setText(String.valueOf(result));
            }
        });
//            Event Listener for Clear Button
        Clear_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Var;
                txt1.setText("");
                txt2.setText("");
                Var = String.valueOf(result);
                Var = "";
                txt3.setText(Var);
            }
        });
//            Adding Components to Frame
        frame.add(First_lbl);
        frame.add(txt1);
        frame.add(Second_lbl);
        frame.add(txt2);
        frame.add(Result_lbl);
        frame.add(txt3);
        frame.add(Add_btn);
        frame.add(Sub_btn);
        frame.add(Mul_btn);
        frame.add(Div_btn);
        frame.add(Mod_btn);
        frame.add(Clear_btn);
        frame.setBounds(500, 250, 500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
