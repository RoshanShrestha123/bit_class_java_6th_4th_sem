import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Box extends JPanel implements ActionListener{

    int Box2X = 250;
    int Box2Y = 10;

    Box(){
        JButton button = new JButton("Move");
        button.addActionListener(this);
        add(button);
        // add(new Button("Click Here"));
    }

    @Override
    protected void paintComponent(Graphics g) {
        // TODO Auto-generated method stub
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.fillRect(10, 10, 100, 100);

        g.setColor(Color.RED);
        g.fillRect(Box2X, Box2Y,100,100);
    }

    public void actionPerformed(ActionEvent e){
        this.Box2X += 10;
        this.repaint();
    }
}
