
import java.awt.*;

public class flag extends Frame{
    flag(){
        setSize(500, 500);
        setVisible(true);

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);


        g.drawLine(50, 50, 50, 400);

        g.drawLine(50, 50, 150, 150);
        g.setColor(Color.RED);
        g.drawLine(80, 150, 150, 150);
        g.drawLine(80,150, 150, 300);
        g.drawLine(50,300, 150, 300);


    }

        public static void main(String[] args){
            new flag();
        }
    }

