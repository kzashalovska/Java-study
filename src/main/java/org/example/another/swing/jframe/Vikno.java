package org.example.another.swing.jframe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

public class Vikno extends JFrame {
    private JLabel jLabel;
    private JButton btn1, btn2;

    public Vikno() {
        setLayout(new FlowLayout());
        jLabel = new JLabel("");
        add(jLabel);
        btn1 = new JButton("Vstanovyty");
        add(btn1);
        btn2 = new JButton("Vyterty");
        add(btn2);
        obrobnykPodiy op = new obrobnykPodiy();
        btn1.addActionListener(op);
        btn2.addActionListener(op);
    }

    public class obrobnykPodiy implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent podiya) {
            if (podiya.getSource() == btn1) {
                Calendar calendar = Calendar.getInstance();
                jLabel.setText("кнопку натиснули в: " + calendar.getTime());
            } else if (podiya.getSource() == btn2) {
                jLabel.setText("");
            }
        }
    }
}
