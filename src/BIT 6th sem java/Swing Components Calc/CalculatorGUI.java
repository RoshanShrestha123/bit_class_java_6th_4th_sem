import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculatorGUI implements ActionListener{
    JFrame frame = new JFrame();
    JTextField t1 = new JTextField();
    JTextField t2 = new JTextField();
    JTextField t3 = new JTextField();
    JButton add = new JButton("Add");

    void renderForm(){
        // Adding textfield and buttons
        t1.setBounds(10, 10, 150, 45);
        t2.setBounds(10, 60, 150, 45);
        t3.setBounds(10, 120, 150, 45);
        // t1.setText("Anoop");
        // System.out.println(t1.getText());
        frame.add(t1);
        frame.add(t2);
        frame.add(t3);

        add.setBounds(10, 200, 150, 30);
        add.addActionListener(this);
        add.setFocusable(false);
        frame.add(add);
    }

    void render(){
        renderForm();
        // Windows form
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setTitle("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
    }

    // over ride
    public void actionPerformed(ActionEvent e){
        // System.out.println("Button Clicked");
        // System.out.println(t1.getText());
        int num1 = Integer.parseInt(t1.getText());
        int num2 = Integer.parseInt(t2.getText());

        int sum = num1 + num2;

        t3.setText(String.valueOf(sum));

    }
}

