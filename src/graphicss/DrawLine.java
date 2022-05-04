package graphicss;

import javax.swing.*;
import java.awt.*;

public class DrawLine extends JFrame {
    public static void main(String[] args) {
        new DrawLine();
    }
    public DrawLine() {
        setTitle("Draw Me Again!");
        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        //base
        g.setColor(Color.GREEN);
        g.drawLine(100, 300, 400, 300);
        //side length
        g.setColor(Color.RED);
        g.drawLine(100, 300, 300, 100);
        //side length2
        g.setColor(Color.RED);
        g.drawLine(400, 300, 300, 100);





    }
}
