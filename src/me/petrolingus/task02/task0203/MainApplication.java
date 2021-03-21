package me.petrolingus.task02.task0203;

import javax.swing.*;
import java.awt.*;

public class MainApplication extends JFrame {

    private static final int WIDTH = 600;

    private static final int HEIGHT = 400;

    public MainApplication() {
        JFrame frame = new JFrame("Main Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) throws Exception {
        UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        new MainApplication();
    }
}
