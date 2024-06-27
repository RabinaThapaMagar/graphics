import java.awt.*;

public class dash extends Frame{
    dash(){
        setSize(500, 500);
        setVisible(true);

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        g.drawLine(50,50,100,50);
        g.drawLine(50,80,100,80);
        g.drawLine(50,110,100,110);

        g.drawLine(130,50,180,50);
        g.drawLine(130,80,180,80);
        g.drawLine(130,110,180,110);

        g.drawLine(210,50,260,50);
        g.drawLine(210,80,260,80);
        g.drawLine(210,110,260,110);


















//        g.drawLine(50,50,100,50);//first line first
//        g.drawLine(50,70,100,70);//first middle
//        g.drawLine(50,90,100,90);//first last
//
//
//        g.drawLine(160,50,250,50);//second line first
//
//        g.drawLine(160,70,250,70);//second middle
//        g.drawLine(160,90,250,90);//second last
//
//
//        g.drawLine(250,100,350,50);//third
//        g.drawLine(250,70,350,70);
//        g.drawLine(200,90,350,90);








    }

    public static void main(String[] args){
        new dash();
    }
}
