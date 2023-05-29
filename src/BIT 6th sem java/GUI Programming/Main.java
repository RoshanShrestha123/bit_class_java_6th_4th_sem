import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Main{
    public static void main(String[] args) {
        JFrame frame = new JFrame("GUI Programming");


        // Adding text/label
        JLabel label = new JLabel("Java is fun");
        frame.add(label);
        frame.setVisible(true);
        frame.pack();

        // Adding textfield
        JTextField textField = new JTextField(" ");
        frame.add(textField);
        frame.setVisible(true);
        textField.setBounds(50, 50, 150, 25);

        // Adding buttons
        JButton button = new JButton("Click Here");
        button.setBounds(50, 90, 150, 25);
        frame.add(button);

        // Windows forms
        frame.setSize(400, 500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}