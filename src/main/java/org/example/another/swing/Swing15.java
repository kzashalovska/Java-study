package org.example.another.swing;

import javax.swing.*;
import java.awt.*;
// тул бар, кнопки как на идеи (запуск. дебагер и тд) подобніе есть в корелДров
public class Swing15 {
    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();
    public static void main(String[] args) throws Exception {
        jFrame.add(jPanel);

        JToolBar jToolBar = new JToolBar("title");
        JButton one = new JButton("one");
        one.setToolTipText("first");
        jToolBar.add(one);
        jToolBar.add(new JButton("two"));
        jToolBar.addSeparator();
        jToolBar.add(new JButton("three"));
        jPanel.add(jToolBar);
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
