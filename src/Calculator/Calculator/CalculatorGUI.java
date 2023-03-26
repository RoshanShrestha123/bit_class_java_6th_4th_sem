package Calculator;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorGUI implements ActionListener {

    JFrame frame =new JFrame("Calculator");
    JTextField t1 =new JTextField();



    JTextField t2 =new JTextField();
    JTextField t3 =new JTextField();

    JButton addBtn =new JButton("ADD");
    JButton mulBtn =new JButton("Mul");
    JButton subBtn =new JButton("Sub");
    JButton divBtn =new JButton("Div");

//    Scanner input =new Scanner(System.in);


    void render()
    {

        t1.setBounds(50,40,200,50);
        frame.add(t1);



        t2.setBounds(50,100,200,50);
        frame.add(t2);

        t3.setBounds(280,40,200,100);
        frame.add(t3);





        //button------------------

        //add
        addBtn.setBounds(90,190,70,50);
        addBtn.addActionListener(this);
        frame.add(addBtn);

        //to multiply
        mulBtn.setBounds(170,190,70,50);
        mulBtn.addActionListener(this);
        frame.add(mulBtn);

        //to subtract
        subBtn.setBounds(250,190,70,50);
        subBtn.addActionListener(this);
        frame.add(subBtn);

        //to divide
        divBtn.setBounds(330,190,70,50);
        divBtn.addActionListener(this);
        frame.add(divBtn);



        frame.setSize(600,450);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);




    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==addBtn){
            int num1= Integer.parseInt(t1.getText());
            int num2= Integer.parseInt(t2.getText());
            int result = num1+num2;
            t3.setText(String.valueOf(result));
        }

        if(e.getSource()==mulBtn){
            int num1= Integer.parseInt(t1.getText());
            int num2= Integer.parseInt(t2.getText());
            int result = num1*num2;
            t3.setText(String.valueOf(result));
        }

        if(e.getSource()==subBtn){
            int num1= Integer.parseInt(t1.getText());
            int num2= Integer.parseInt(t2.getText());
            int result = num1-num2;
            t3.setText(String.valueOf(result));
        }

        if(e.getSource()==divBtn){
            int num1= Integer.parseInt(t1.getText());
            int num2= Integer.parseInt(t2.getText());
            int result = num1/num2;
            t3.setText(String.valueOf(result));
        }




    }



}
