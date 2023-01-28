package org.example.another.swing;

import javax.swing.*;
import java.awt.*;


public class Swing10 {
    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();


    public static void main(String[] args) throws Exception {
        jFrame.add(jPanel);
        jPanel.add(new JLabel("This is label"));
        jPanel.add(new JTextField("default",20));
        JTextField jTextField = new JTextField();
        jTextField.getText();
        jPanel.add(new JPasswordField(20));
        JTextArea jTextArea = new JTextArea(2, 20);// текстове поле
        jTextArea.setLineWrap(true);
        JScrollPane jScrollPane = new JScrollPane(jTextArea);//ScrolBar
        jPanel.add(jScrollPane);
        jPanel.revalidate(); // нужно візівать
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
