import javax.swing.*;
import java.awt.*;

public class Rectangle extends JFrame {
    public static void main(String[] args) {
        new Rectangle();

    }
    public Rectangle(){
        setTitle("Draw k Draw");
        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawRect(100,200,300, 200);
        g.drawOval(100, 200, 300, 200);


    }
}
