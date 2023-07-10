import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Counter {
    // Count Variable
    private int Count;
    private JFrame frame;
    private JLabel label;
    private JPanel panel;
    // text field for result of count
    private JTextField txt;
    // declaring buttons
    private JButton Cnt_Up_btn, Cnt_Down_btn, Cnt_Reset_btn;

    // Default Constructor
    Counter() {
        Count = 0;
        frame = new JFrame("Counter");
        label = new JLabel("Counter");
        panel = new JPanel();
        panel.setLayout(new FlowLayout());
        txt = new JTextField(String.valueOf(Count));
        txt.setPreferredSize(new Dimension(40, 28));
        Cnt_Up_btn = new JButton("Count Up");
        Cnt_Down_btn = new JButton("Count Down");
        Cnt_Reset_btn = new JButton("Reset");
        panel.add(label);
        panel.add(txt);
// disabling focusable property on the buttons
        Cnt_Up_btn.setFocusable(false);
        Cnt_Down_btn.setFocusable(false);
        Cnt_Reset_btn.setFocusable(false);
// disabling auto cursor on the txt field
        txt.setEditable(false);
        panel.add(Cnt_Up_btn);
        panel.add(Cnt_Down_btn);
        panel.add(Cnt_Reset_btn);
        frame.add(panel);
// Adding an Action Listener for Count Up Button
        Cnt_Up_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
// Incrementing the count variable and updating the text field
                Count++;
                txt.setText(String.valueOf(Count));
            }
        });
// Adding an Action Listener for Count Down Button
        Cnt_Down_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
// Decrementing the count variable and updating the text field
                Count--;
                txt.setText(String.valueOf(Count));
            }
        });
// Adding an Event for Reset Button
        Cnt_Reset_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
// Resetting the count variable and updating the text field
                Count = 0;
                txt.setText(String.valueOf(Count));
            }
        });
        frame.setBounds(500, 250, 400, 100);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}