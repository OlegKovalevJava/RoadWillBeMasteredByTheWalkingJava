package skill.swing;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setSize(400, 300);
        jf.setVisible(true);

        SimpleMouseListener mouseListener = new SimpleMouseListener();
        jf.addMouseListener(mouseListener);
    }
}