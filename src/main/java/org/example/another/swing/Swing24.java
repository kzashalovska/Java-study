package org.example.another.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class Swing24 {
    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();
// сторення діалогового вікна для відкриття файлів
    public static void main(String[] args) throws Exception {
        jFrame.add(jPanel);
        JButton jButton = new JButton("show file dialog");
        jPanel.add(jButton);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();

                //fileChooser.setFileView(); // не реализован, помагает создать свой диалог
                //fileChooser.setMultiSelectionEnabled(true);

                //fileChooser.setCurrentDirectory(new File("."));
                //fileChooser.setSelectedFile(new File("."));
                //fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
                /*fileChooser.setFileFilter(new FileFilter() {
                    @Override
                    public boolean accept(File f) {
                        if(f.getName().endsWith("pdf")){
                            return true;
                        }
                    return false;
                    }

                    @Override
                    public String getDescription() {
                        return "only gif files";
                    }
                });*/

                /*TextField textField = new TextField("text_field", 50);
                fileChooser.add(textField);// Не понятное добавление елементу в діалог

                fileChooser.addPropertyChangeListener(new PropertyChangeListener() {
                    @Override
                    public void propertyChange(PropertyChangeEvent evt) {
                        textField.setText(evt.getNewValue().toString());
                    }
                });*/

                int i = fileChooser.showDialog(jPanel, "save us");//дав ім'я кнопці
                System.out.println(i);//вертає 0 або 1, в залежності від успіху

                File file = fileChooser.getSelectedFile();
                System.out.println(file.getName());//повертає назву файлу
            }
        });
        jPanel.revalidate();
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
