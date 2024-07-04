
import java.awt.*;

public class abcd extends Frame{
    abcd(){
        setSize(500, 500);
        setVisible(true);

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        char[] alp = {'a', 'b', 'c', 'd','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

        g.setFont(new Font(Font.MONOSPACED, Font.BOLD,20));


        g.drawChars(alp, 0, 5, 100,100);

        g.drawChars(alp, 5, 5, 100,130);
        g.drawChars(alp, 10, 5, 100,160);
        g.drawChars(alp, 15, 5, 100,190);
        g.drawChars(alp, 20, 5, 100,220);
        g.drawChars(alp, 25, 1, 100,250);


    }
        public static void main(String[] args){
            new abcd();
        }





    }