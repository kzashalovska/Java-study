package org.example.another.swing.jframe.makeConvertor;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CurrencyConverter {
    private JPanel mainPanel;
    private JPanel topPanel;
    private JPanel bottomPanel;
    private JTextField ukrainianField;
    private JComboBox comboBox1;
    private JButton convertButton;
    private JTextField convertedField;
    private JLabel moneyTypeLabel;
public CurrencyConverter() {
    comboBox1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            moneyTypeLabel.setText("" + comboBox1.getSelectedItem());
        }
    });
    convertButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            double [] rates = { 40.6500, 43.9000, 49.8500};
            double selectedRate = rates[comboBox1.getSelectedIndex()];

            double converted = Double.parseDouble(ukrainianField.getText()) * selectedRate;
            convertedField.setText("" + converted + " in " +  comboBox1.getSelectedItem());

        }
    });
}

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ukrainian Currency Converter");
        frame.setContentPane(new CurrencyConverter().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}//end class
