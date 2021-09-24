package Pinball;

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        JFrame obj = new JFrame();
        obj.setBounds(200, 200, 700, 600);
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
