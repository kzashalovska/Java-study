package org.example.another.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
// использование класа для описания действия для кнопки
// можно одно действие передавать нескольким кнопкам

public class Swing7 {
    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();

    public static void main(String[] args) {
        jFrame.add(jPanel);
        JButton jButton = new JButton(new MyAction());
        jPanel.add(jButton);
        jButton.setText("submit");

    }

    static class MyAction extends AbstractAction {
        MyAction(){
            putValue(AbstractAction.SHORT_DESCRIPTION, "My small action");
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            jPanel.setBackground(Color.blue);
        }
    }

    static JFrame getFrame() {
        JFrame jFrame = new JFrame() {
        };
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width / 2 - 450, dimension.height / 2 - 400, 900, 800);
        return jFrame;
    }
}
