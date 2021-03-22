package me.petrolingus.task02.task0203;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainApplication extends JFrame {

    private static final int WIDTH = 600;

    private static final int HEIGHT = 400;

    Container container = new Container(0, 0, WIDTH, HEIGHT);

    Ball ball = new Ball(WIDTH / 2.0f, HEIGHT / 2.0f, 32, 8, 57);

    public MainApplication() {
        add(new Board(WIDTH, HEIGHT, container, ball));
        setResizable(false);
        pack();
        setTitle("Main Application");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static class Board extends JPanel implements ActionListener {


        private final Container container;
        private final Ball ball;

        public Board(int width, int height, Container container, Ball ball) {

            this.container = container;
            this.ball = ball;

            setBackground(Color.BLACK);
            setPreferredSize(new Dimension(width, height));

            int DELAY = 16;
            Timer timer = new Timer(DELAY, this);
            timer.start();
        }

        @Override
        public void paintComponent(Graphics g) {

            super.paintComponent(g);

            g.setColor(Color.WHITE);

            int x = Math.round(ball.getX()) - ball.getRadius();
            int y = Math.round(ball.getY()) - ball.getRadius();
            g.fillOval(x, y, 2 * ball.getRadius(), 2 * ball.getRadius());
            Toolkit.getDefaultToolkit().sync();
        }


        @Override
        public void actionPerformed(ActionEvent e) {

            ball.move();

            if (container.collidesHorizontal(ball)) {
                ball.reflectHorizontal();
            }

            if (container.collidesVertical(ball)) {
                ball.reflectVertical();
            }

            repaint();
        }
    }

    public static void main(String[] args) throws Exception {

        UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());

        EventQueue.invokeLater(() -> {
            MainApplication application = new MainApplication();
            System.out.println(application.container);
            System.out.println(application.ball);
            application.setVisible(true);
        });
    }
}
