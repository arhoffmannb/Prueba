import javax.swing.*;

/**
 * Created by Raquel on 1/04/14.
 */
public class Main {

    public Main(){}

    public static void main(String[] argu){
        JFrame jFrame = new JFrame();
        jFrame.setSize(850,550);
        Mover mover = new Mover();
        jFrame.add(mover);
        jFrame.setVisible(true);
        jFrame.addKeyListener(mover);

        Thread t1Zombies;
        t1Zombies = new Thread((Runnable) mover, "Zombies 1");
        t1Zombies.start();
    }
}
