package org.example.another.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// діалогові вікна, в яких випадає так.ні.вийти або інше
public class Swing22 {
    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();

    public static void main(String[] args) throws Exception {
        jFrame.add(jPanel);
        JButton jButton = new JButton("show dialog");
        jPanel.add(jButton);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //JOptionPane.showMessageDialog(jPanel,"this my dialog:", "title",JOptionPane.ERROR_MESSAGE);

                //System.out.println(JOptionPane.showConfirmDialog(jPanel, "some message",
                //        "title2", JOptionPane.YES_OPTION));

                //можно вібрать імя кнопок
                //JOptionPane.showOptionDialog(jPanel,"message", "title2",JOptionPane.OK_CANCEL_OPTION,
                  //      JOptionPane.INFORMATION_MESSAGE, null, new Object[]{"one", "two", "three"}, "two");

                System.out.println(JOptionPane.showInputDialog(jPanel, "some message"));
            }
        });

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
