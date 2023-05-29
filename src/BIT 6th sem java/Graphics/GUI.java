
import javax.swing.JFrame;

public class GUI{
    JFrame frame = new JFrame();

    Box box = new Box();

    void gameArea(){
        // windows form
        frame.setSize(400, 400);
        frame.add(box);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setLayout(null);
        frame.setResizable(false);
        frame.setTitle("Graphics Learning");
        frame.setVisible(true);
    }
}
