package org.example.another.swing.jframe.makeCalculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator {
    private JPanel MainPanel;
    private JPanel topPanel;
    private JPanel bottomPanel;
    private JTextField num1Field1;
    private JTextField num2Field2;
    private JButton ADDButton;
    private JButton MODButton;
    private JButton CLEARButton;
    private JTextField resultField3;

    public SimpleCalculator() {
        ADDButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num1 = num1Field1.getText().trim();
                String num2 = num2Field2.getText().trim();
                double result = Double.parseDouble(num1) + Double.parseDouble(num2);
                resultField3.setText(result + "");


            }
        });
        MODButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num1 = num1Field1.getText().trim();
                String num2 = num2Field2.getText().trim();
                double result = Double.parseDouble(num1) % Double.parseDouble(num2);
                resultField3.setText(result + "");

            }
        });
        CLEARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1Field1.setText("");
                num2Field2.setText("");
                resultField3.setText("");
            }
        });
    }// end Constructor

    public static void main(String[] args) {
        JFrame frame = new JFrame("SimpleCalculator");
        frame.setContentPane(new SimpleCalculator().MainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}// end SimpleCalculator
