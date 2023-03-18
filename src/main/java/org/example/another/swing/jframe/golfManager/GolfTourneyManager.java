package org.example.another.swing.jframe.golfManager;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GolfTourneyManager {
    private JPanel mainPanel;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JPanel panel5;
    private JTextField textField1;
    private JCheckBox professionalCheckBox;
    private JRadioButton sandpiperRadioButton;
    private JRadioButton mayfairRadioButton;
    private JRadioButton blackHawkRadioButton;
    private JRadioButton theRanchRadioButton;
    private JTextField feeField;
    private JButton REGISTERButton;
    private JSlider slider1;
    private JLabel handLabel;
    private JButton registerNowButton;
    private JPanel TitleBarPanel;
    private JLabel logoLabel;

    public GolfTourneyManager() {
        professionalCheckBox.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {

                if (professionalCheckBox.isSelected()) {
                    feeField.setText("$120");
                } else {
                    feeField.setText("$100");
                }
            }
        });
        slider1.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int handicap = slider1.getValue();
                handLabel.setText("Your Handicap: " + handicap);

            }
        });
        panel1.setVisible(false);
        panel2.setVisible(false);
        panel3.setVisible(false);
        panel4.setVisible(false);
        panel5.setVisible(false);
        registerNowButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel1.setVisible(true);
                panel2.setVisible(true);
                panel3.setVisible(true);
                panel4.setVisible(true);
                panel5.setVisible(true);
            }
        });
    }// end constructor

    public static void main(String[] args) {
        JFrame frame = new JFrame("GolfTourneyManager");
        frame.setContentPane(new GolfTourneyManager().mainPanel);
        frame.setPreferredSize(new Dimension(600, 600));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


    private void createUIComponents() {
        //logoLabel = new JLabel(new ImageIcon("image/normsize.png"));
        logoLabel = new JLabel();
        ImageIcon logoIcon = new ImageIcon(new ImageIcon("image/normsize.png").
                getImage().getScaledInstance(350, 250, Image.SCALE_SMOOTH));
        logoLabel.setIcon(logoIcon);
    }
}//end class
