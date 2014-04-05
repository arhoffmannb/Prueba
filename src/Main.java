import javax.swing.*;
import java.awt.image.BufferedImage;

/**
 * Created by Raquel on 1/04/14.
 */
public class Main {


    public Main(){

    }

    public static void main(String[] argu){




        JFrame jFrame = new JFrame();
        jFrame.setSize(850,545);



        Mover mover = new Mover();
        jFrame.add(mover);
        jFrame.setVisible(true);
        jFrame.addKeyListener(mover);

        Thread t1Zombies = new Thread(mover, "Zombies 1");
        t1Zombies.start();



    }
}
