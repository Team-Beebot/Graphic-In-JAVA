package graphicss;

import javax.swing.*;
import java.awt.*;

public class DrawString extends JFrame {
    public DrawString(){
        setTitle(" Darw Me!");
        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.GREEN);
        g.setFont(new Font("Arial", Font.BOLD, 40));
        g.drawString("Hello World", 100, 100);
        // another string
        g.setColor(Color.YELLOW);
        g.setFont(new Font("Arial", Font.BOLD, 40));
        g.drawString("Hello World", 100, 150);

    }

    public static void main(String[] args) {
        new DrawString();


    }
}
