import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Mains{
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        // Adding label/text
        JLabel label = new JLabel("Login Page");
        label.setBounds(50, 30, 150, 15);

         // Adding textfield
         JTextField username = new JTextField("Enter username");
         JTextField password = new JTextField("Enter password");

         username.setBounds(50, 50, 150, 35);
         password.setBounds(50, 90, 150, 35);

        //  Adding buttons
        JButton button = new JButton("Click Here");
        button.setBounds(50, 140, 150, 35);

        // Adding Combobox
        String[] peoples = {"Anoop", "Ankit", "Subash"};
        JComboBox dropDown = new JComboBox(peoples);
        dropDown.setBounds(50, 190, 150, 35);

        // Framing work here
        frame.add(username);
        frame.add(password);
        frame.add(button);
        frame.add(label);
        frame.add(dropDown);

        // Windows form
        frame.setTitle("GUI Programming");
        frame.setSize(400, 500);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);

    }
}