package org.example.practice.practice3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CinemaMainPage implements GenericStorage{
    private JPanel panel1;
    private JButton Login;
    private JButton Registration;
    private JList list1;



    public CinemaMainPage() {
        Registration.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Hello World!");
            }
        });
        Login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    private void createUIComponents() {

    }

    public static void main(String[] args) {
        JFrame cinemaFrame = new JFrame("Кінотеатр Коваленки");
        cinemaFrame.setContentPane(new CinemaMainPage().panel1);
        cinemaFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        cinemaFrame.pack();
        cinemaFrame.setVisible(true);
    }
}
