import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setTitle("Swing Component");
        frame.setSize(1000, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setBackground(Color.RED);
        frame.getContentPane().setBackground(Color.BLUE);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setVisible(true);

        JButton button = new JButton("Click Me");
        frame.add(button);
        button.setBounds(50, 50, 120, 25);
        frame.setVisible(true);
    }
}
