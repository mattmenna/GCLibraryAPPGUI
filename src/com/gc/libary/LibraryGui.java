package com.gc.libary;

import javax.swing.*;

/**
 * Created by Matt on 7/7/2017.
 */
public class LibraryGui {
    private JPanel base;
    private JLabel logo;
    private JLabel titleText;
    private JList bookList;
    private JButton displayBtn;
    private JButton searchByAuthBtn;
    private JButton searchByTitleBtn;
    private JButton exitButton;
    private JButton addBookButton;
    private JButton saveBookButton;

    public static void main(String[] args) {
        JFrame frame = new JFrame("LibraryGui");
        frame.setContentPane(new LibraryGui().base);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        ImageIcon logoImg = new ImageIcon("img/Grand-Rapids-logo.png");
        logo = new JLabel(logoImg);

    }
}
