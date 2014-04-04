import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Mover extends JPanel implements KeyListener, Runnable{
    int posX = 350;
    BufferedImage jugador;
    BufferedImage fondo;
    Zombie zombie1;

    public Mover(){
        zombie1 = new Zombie(this,0,190,25);
    }



    public void paint(Graphics g){
        update(g);

    }

    public void update(Graphics g){




        try{
            fondo = ImageIO.read(new File("C:/Users/Raquel/Desktop/Tareas/USAC/IPC1/NuevoProyecto/Images/Fondo.jpg"));
        } catch(IOException ie){
            System.out.print("No fondo");
        }

        g.drawImage(fondo,0,0,null);


        if((posX==30)||(posX==670)){
            try{
                jugador = ImageIO.read(new File("C:/Users/Raquel/Desktop/Tareas/USAC/IPC1/NuevoProyecto/Images/JugadorTierra.jpg"));
            } catch(IOException ie){
            System.out.print("No Zombie");
            }
        } else{
            try{
                jugador = ImageIO.read(new File("C:/Users/Raquel/Desktop/Tareas/USAC/IPC1/NuevoProyecto/Images/JugadorCarretera.jpg"));
            } catch(IOException ie){
                System.out.print("No Zombie");
            }
        }


        zombie1.Draw(g);
        g.drawImage(jugador,posX,420,null);
        repaint();

    }

    @Override
    public void keyPressed(KeyEvent flecha){
        if(flecha.getKeyCode()==39){
            if(posX==670){
                posX = 670;
            }else{
                posX = posX + 160;
            }


        } else if(flecha.getKeyCode()==37){
            if(posX==30){
                posX = 30;
            }else{
                posX = posX - 160;
            }
        }

    }

    @Override
    public void keyReleased(KeyEvent flecha){

    }

    @Override
    public void keyTyped(KeyEvent flecha){

    }

    public void run(){




        while(true){
            zombie1.Update();








            try{
                Thread.sleep(90);
            }catch (InterruptedException ie){
                System.out.print("Hola");
            }



        }


    }
}



