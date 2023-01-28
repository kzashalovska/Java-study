package org.example.another.swing;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
//вікна з галочкою, випадаючий список, вибір одного варіанта із декількох
public class Swing11 {
    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();


    public static void main(String[] args) throws Exception {
        jFrame.add(jPanel);
        jPanel.add(new JCheckBox("choise: "));
        JRadioButton jRadioButton1 = new JRadioButton("one");
        JRadioButton jRadioButton2 = new JRadioButton("two");
        jRadioButton2.setSelected(true);
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(jRadioButton1);
        buttonGroup.add(jRadioButton2);
        jPanel.add(jRadioButton1);
        jPanel.add(jRadioButton2);
        Border border = BorderFactory.createEtchedBorder();
        Border border1 = BorderFactory.createTitledBorder(border, "title");


        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.addItem("one");
        comboBox.addItem("two");
        comboBox.addItem("three");
        jPanel.add(comboBox);
        jPanel.setBorder(border1);
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
