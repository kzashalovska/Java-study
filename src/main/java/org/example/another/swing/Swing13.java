package org.example.another.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swing13 {
    static JFrame jFrame = getFrame();

    //MeNu, как на панеле управления вверху
    public static void main(String[] args) throws Exception {
        JMenuBar jMenuBar = new JMenuBar();

        JMenu file = new JMenu("File");
        JMenu edit = new JMenu("Edit");
        jMenuBar.add(file);
        jMenuBar.add(edit);

        file.add(new JMenuItem("Open", new ImageIcon("")));
        JMenuItem save = file.add(new JMenuItem("Save", 'S'));
        save.setEnabled(false);
        file.addSeparator();
        JMenuItem exit = file.add(new JMenuItem("Exit"));
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        exit.setAccelerator(KeyStroke.getKeyStroke("ctrl E"));
        edit.add(new JMenuItem("Cut"));
        edit.add(new JMenuItem("Copy"));
        JMenu options = new JMenu("Options");
        edit.add(options);
        options.add("one");
        options.add("two");

        edit.add(new JCheckBoxMenuItem("checkBox"));
        ButtonGroup buttonGroup = new ButtonGroup();
        JRadioButtonMenuItem radioButtonMenuItem1 = new JRadioButtonMenuItem("Radio1");
        JRadioButtonMenuItem radioButtonMenuItem2 = new JRadioButtonMenuItem("Radio2");

        buttonGroup.add(radioButtonMenuItem1);
        buttonGroup.add(radioButtonMenuItem2);
        edit.add(radioButtonMenuItem1);
        edit.add(radioButtonMenuItem2);

        jFrame.setJMenuBar(jMenuBar);
        jFrame.revalidate();

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
