package org.example.another.swing.jframe;

import javax.swing.*;
import java.awt.*;

public class App {
    public static void main(String[] args) {
        Vikno vikno = new Vikno();
        vikno.setVisible(true);
        vikno.setTitle("2 Knopku");
        vikno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        vikno.setBounds(dimension.width / 2 - 250, dimension.height / 2 - 100, 500, 200);
    }
}
