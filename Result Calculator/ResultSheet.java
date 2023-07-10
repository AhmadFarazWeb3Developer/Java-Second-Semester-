import javax.swing.*;
import java.awt.*;

public class ResultSheet extends ResultCalculator {
    private JFrame frame;
    private JLabel label ,ProgrammingMarks_lbl, MathMarks_lbl, PhysicsMarks_lbl, EnglishMarks_lbl, StatisticsMarks_lbl, TotalMarks_lbl, Grade_lbl, ObtainedMarks_lbl, AverageMarks_lbl;
    private int totalMarks, obtainedMarks;
    private float averageMarks;
    ResultSheet(int programming,int math,int physics,int english,int statistics) {
        ResultCalculator resultCalculator = new ResultCalculator();
        frame = new JFrame("Marks Sheet");
        label=new JLabel("Check Your Marks Sheet");
        label.setBounds(100,50,300,50);
        Color lblfgColor = new Color(231, 111, 81);
        label.setForeground(lblfgColor);
        label.setFont(new Font("Arial",Font.PLAIN,20));
        ProgrammingMarks_lbl = new JLabel("Programming Marks :  " +programming);
        MathMarks_lbl = new JLabel("Math Marks :  " + math);
        PhysicsMarks_lbl = new JLabel("Physics Marks :  " + physics);
        EnglishMarks_lbl = new JLabel("English Marks :  " + english);
        StatisticsMarks_lbl = new JLabel("Statistics Marks :  " + statistics);
        ProgrammingMarks_lbl.setBounds(150,100,200,50);
        ProgrammingMarks_lbl.setForeground(Color.WHITE);
        MathMarks_lbl.setBounds(150,150,200,50);
        MathMarks_lbl.setForeground(Color.WHITE);
        PhysicsMarks_lbl.setBounds(150,200,200,50);
        PhysicsMarks_lbl.setForeground(Color.WHITE);
        EnglishMarks_lbl.setBounds(150,250,200,50);  EnglishMarks_lbl.setForeground(Color.WHITE);
        StatisticsMarks_lbl.setBounds(150,300,200,50);
        StatisticsMarks_lbl.setForeground(Color.WHITE);
        totalMarks = 500;
        obtainedMarks = programming+ math+ physics + english + statistics;
        averageMarks =  (float) obtainedMarks / 5;
        TotalMarks_lbl = new JLabel("Total Marks  :  " + totalMarks);
        Color fgColor=new Color(255, 196, 61);
        TotalMarks_lbl.setForeground(fgColor);
        ObtainedMarks_lbl = new JLabel("Obtaind Marks :  " + obtainedMarks);
        ObtainedMarks_lbl.setForeground(fgColor);
        AverageMarks_lbl = new JLabel("Average Marks :  " + averageMarks);
        AverageMarks_lbl.setForeground(fgColor);
        TotalMarks_lbl.setBounds(150, 350,200,50);
        ObtainedMarks_lbl.setBounds(150,400,200,50);
        AverageMarks_lbl.setBounds(150,450,200,50);
        Grade_lbl = new JLabel("");
        if (obtainedMarks >= 450 && obtainedMarks <= 500) {
            Grade_lbl.setText("Grade :  A+");
        } else if (obtainedMarks >= 400 && obtainedMarks < 450) {
            Grade_lbl.setText("Grade :  A-");
        } else if (obtainedMarks >= 350 && obtainedMarks < 400) {
            Grade_lbl.setText("Grade :  A");
        } else if (obtainedMarks >= 300 && obtainedMarks < 350) {
            Grade_lbl .setText("Grade :  B");
        }
         else if (obtainedMarks >= 250 && obtainedMarks < 300) {
            Grade_lbl .setText("Grade :  C");
        } else if (obtainedMarks >= 0 && obtainedMarks < 250) {
            Grade_lbl.setText("Grade :  F(Fail)");
        }
         Grade_lbl.setBounds(150,500,200,50);
       Grade_lbl.setForeground(fgColor);
        // adding components to frame
        frame.add(label);
        frame.add(ProgrammingMarks_lbl);
        frame.add(MathMarks_lbl);
        frame.add(PhysicsMarks_lbl);
        frame.add(EnglishMarks_lbl);
        frame.add(StatisticsMarks_lbl);
        frame.add(TotalMarks_lbl);
        frame.add(ObtainedMarks_lbl);
        frame.add(AverageMarks_lbl);
        frame.add(Grade_lbl);
        // Set the frame properties

        frame.setBounds(500, 50, 500, 600);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);
        // Set the background color for the frame
        Color fbg_color = new Color(33, 104, 105);
        frame.getContentPane().setBackground(fbg_color);
        frame.setForeground(Color.WHITE);
        frame.setVisible(true);
    }
}


