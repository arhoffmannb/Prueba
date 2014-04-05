import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;

import java.io.File;
import java.util.Scanner;


public class Main {


    public Main(){



    }

    public static void main(String[] argu){
        Mover mover = new Mover();




        JFrame jFrame = new JFrame();
        jFrame.setSize(900,545);




        jFrame.add(mover);
        jFrame.setVisible(true);
        jFrame.addKeyListener(mover);

        Thread t1Zombies = new Thread(mover, "Zombies 1");
        t1Zombies.start();

        try{

            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File("C:/Users/Raquel/Desktop/Tareas/USAC/IPC1/Prueba/Images/musica.wav")));
            sonido.start();
            Thread.sleep(1000);
            sonido.close();
        } catch(Exception e){
            System.out.println("No sonido");






    }


    }
}


