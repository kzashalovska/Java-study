package org.example.another.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.net.MalformedURLException;
import java.net.URL;

public class Swing {
    public static void main(String[] args) {
        JFrame jFrame = getFrame();
        jFrame.add(new MyComponent());
    }

    static class MyComponent extends JComponent {
        @Override
        protected void paintComponent(Graphics g) {
            Font font = new Font("Ink Free", Font.BOLD, 20);
            Graphics2D g2 = (Graphics2D) g;
            g2.setFont(font);
            g2.drawString("hello world!", 50, 50);
            Point2D point2D = new Point2D.Double(70, 70);
            Point2D point2D1 = new Point2D.Double(170, 170);
            Line2D line2D = new Line2D.Double(point2D, point2D1);
            g2.draw(line2D);
            Ellipse2D el = new Ellipse2D.Double();
            el.setFrameFromDiagonal(point2D,point2D1);
            g2.setPaint(Color.blue);
            g2.fill(el);
            Rectangle2D r2 = new Rectangle2D.Double();
            r2.setFrameFromDiagonal(point2D,point2D1);
            g2.draw(r2);
            try {
                URL url = new URL("https://cdn-icons-png.flaticon.com/512/311/311357.png");
                Image image = new ImageIcon(url).getImage();
                g2.drawImage(image, 200, 150, null);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }


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
