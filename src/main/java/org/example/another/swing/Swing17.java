package org.example.another.swing;

import javax.swing.*;
import java.awt.*;

public class Swing17 {
    static JFrame jFrame = getFrame();

    public static void main(String[] args) throws Exception {

        //      jFrame.add(new JButton("one"), BorderLayout.NORTH);
        //      jFrame.add(new JButton("two"), BorderLayout.EAST);
        //     jFrame.add(new JButton("three"), BorderLayout.WEST);
        //     jFrame.add(new JButton("four"), BorderLayout.CENTER);
        //      jFrame.add(new JButton("five"), BorderLayout.SOUTH);
        JPanel jPanel = new JPanel();
        jFrame.add(jPanel);
        jPanel.setLayout(new GridLayout(2,2));
        jPanel.add(new JButton("one"));
        jPanel.add(new JButton("two"));
        jPanel.add(new JButton("three"));
        jPanel.add(new JButton("four"));
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
