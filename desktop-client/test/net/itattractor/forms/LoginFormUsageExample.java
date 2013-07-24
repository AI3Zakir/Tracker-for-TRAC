package net.itattractor.forms;

import javax.swing.*;

public class LoginFormUsageExample {

    public static void main(String[] args) {
        JFrame frame = new JFrame("login form");

        frame.add(new LoginForm().getContentPanel());
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(320, 240);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
