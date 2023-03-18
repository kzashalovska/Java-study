package org.example.practice.practice3;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class CinemaMainPage implements GenericStorage {
    private JPanel mainPanel;
    private JPanel topPanel;
    private JPanel changeFilmsPanel;
    private JPanel registrationPanel;
    private JButton loginButton;
    private JButton registrationButton;
    private JLabel mainPictures;
    private JButton mainPageButton;
    private JList<Film> listFilms = new JList<>();
    private JSplitPane filmsSplitPane;
    private JLabel infoFilmLabel;
    private JButton changeFilmButton;
    private JPanel informationPanel;
    private JPanel fullInfoFilmsPanel;

    public CinemaMainPage() {
        ArrayList<Film> films = new ArrayList<>();
        films.add(new Film("Terminator", 1, 30, 45, "James Cameron",
                false, 16));
        films.add(new Film("Ring Lord", 2, 20, 0, "Peter Jackson",
                false, 12));
        films.add(new Film("Titanic", 2, 5, 0, "James Cameron",
                false, 12));
        films.add(new Film("Avatar-2", 2, 45, 0, "James Cameron",
                true, 5));
        films.add(new Film("The Lion King", 1, 30, 0, "Roger Allers",
                false, 3));

        DefaultListModel<Film> model = new DefaultListModel<>();
        listFilms.setModel(model);

        model.addElement(films.get(0));
        model.addElement(films.get(1));
        model.addElement(films.get(2));
        model.addElement(films.get(3));
        model.addElement(films.get(4));
        filmsSplitPane.setLeftComponent(new JScrollPane(listFilms));

        listFilms.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                Film f = listFilms.getSelectedValue();
                infoFilmLabel.setText("Name: " + f.getFilmName() + ". " + "Directed by: " + f.getDirectorName() + ". " +
                        " Time: " + f.getTime() + ". " + " Minimal age: " + f.getMinAge() + ".");
            }
        });
        changeFilmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                informationPanel.removeAll();
                informationPanel.add(fullInfoFilmsPanel);
                informationPanel.repaint();
                informationPanel.revalidate();
            }
        });
        mainPageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                informationPanel.removeAll();
                informationPanel.add(changeFilmsPanel);
                informationPanel.repaint();
                informationPanel.revalidate();
            }
        });
    }

    private void createUIComponents() {
        mainPictures = new JLabel();
        ImageIcon logoIcon = new ImageIcon(
                new ImageIcon("image/titlePictures.jpg").
                        getImage().getScaledInstance(700, 394, Image.SCALE_SMOOTH));
        mainPictures.setIcon(logoIcon);

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("CinemaMainPage");
        frame.setContentPane(new CinemaMainPage().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
