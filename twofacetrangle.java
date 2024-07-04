
import java.awt.*;

public class twofacetrangle extends Frame{
    twofacetrangle(){
        setSize(500, 500);
        setVisible(true);

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D graphics2D =(Graphics2D) g;
        g.setColor(Color.DARK_GRAY);
        graphics2D.setStroke(new BasicStroke(4));
        g.fillArc(10,50,100,100,20,300);




        int xValues[]={30,145,30,145,30};
        int yValues[]={30,30,145,145,30};

        int points =5;
        g.drawPolygon(xValues,yValues,points);
// or

//        g.drawLine(50,50,100,50);
//        g.drawLine(50,50,80,75);
//        g.drawLine(100,50,80,75);
//
//        g.drawLine(80,75,50,100);
//        g.drawLine(80,75,100,100);
//        g.drawLine(50,100,100,100);










    }

    public static void main(String[] args){
        new twofacetrangle();
    }




}