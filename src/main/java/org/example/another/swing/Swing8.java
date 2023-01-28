package org.example.another.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
// как сделать двойное нажатие клавиш

public class Swing8 {
    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();

    public static void main(String[] args)throws Exception{
        jFrame.add(jPanel);
        Action myAction = new MyAction();
        JButton jButton = new JButton(myAction);
        jButton.setText("submit");
        jPanel.add(jButton);

        // можно установить фокус, то есть комбинация раотает, только тогда, когда курсор в нужном окне
        KeyStroke keyStroke = KeyStroke.getKeyStroke("ctrl E");
        InputMap inputMap = jPanel.getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
        inputMap.put(keyStroke, "ctrlB");
        ActionMap actionMap = jPanel.getActionMap();
        actionMap.put("ctrlB", myAction);
    }

    static class MyAction extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {
            jPanel.setBackground(Color.red);
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