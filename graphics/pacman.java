package graphics;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class pacman extends Frame {
    pacman(){
        setSize(800,800);
        setVisible(true);
    }
    public void paint(Graphics g) {
        super.paint(g);
//
//
        g.fillArc(200, 200, 200, 200, 30, 290);
        g.drawOval(300, 300, 30, 30);
        g.drawOval(400, 300, 30, 30);
        g.drawOval(450, 300, 30, 30);
        g.drawOval(500, 300, 30, 30);
        g.drawOval(550, 300, 30, 30);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

    }
    public static void main(String[] args) {
        new pacman();
    }
}