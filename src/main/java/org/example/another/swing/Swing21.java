package org.example.another.swing;

import javax.swing.*;
import java.awt.*;
//фокусб віделение кнопок после запуска, переключается табом
public class Swing21 {
    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();

    public static void main(String[] args) throws Exception {
        jFrame.add(jPanel);
        jPanel.add(new JButton("submit1"));
        jPanel.add(new JButton("submit2"));
        jPanel.add(new JButton("submit3")).requestFocusInWindow();
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
