package org.example.another.swing;

import javax.swing.*;
import java.awt.*;

public class Swing12 {
    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();

    //СЛАЙДЕР   ПО ТИПУ ЗВУКА В КОЛОНКАХ
    public static void main(String[] args) throws Exception {
        jFrame.add(jPanel);
        JSlider jSlider = new JSlider(JSlider.VERTICAL, 0 , 100, 50);
        jPanel.add(jSlider);
        jSlider.setMinorTickSpacing(10);//мелкие полоски
        jSlider.setMajorTickSpacing(20);//крупніе полски
        jSlider.setPaintTicks(true);//отобразить
        jSlider.setSnapToTicks(true);//закрепить на полопсочке
        jSlider.setPaintLabels(true);//цифри
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
