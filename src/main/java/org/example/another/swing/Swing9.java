package org.example.another.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
// показує координати мишки на фреймі
public class Swing9 {
    static JFrame jFrame = getFrame();
    public static void main(String[] args) throws Exception {
        JComponent jComponent = new MyComponent();
        jFrame.add(jComponent);
        jFrame.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                super.mouseMoved(e);
                MyComponent.xCoord = e.getX();
                MyComponent.yCoord = e.getY();
                jComponent.repaint();
            }
        });
    }
    static class MyComponent extends JComponent{
        public static int xCoord;
        public static int yCoord;
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
            ((Graphics2D)g).drawString("Coordinates x:" + xCoord + "y:" + yCoord,50,50);
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
