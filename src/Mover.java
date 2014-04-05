import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.*;
import javax.imageio.ImageIO;
import javax.swing.JPanel;



public class Mover extends JPanel implements  Runnable, KeyListener{
    int posX = 350;
    BufferedImage jugador;
    BufferedImage fondo;
    Zombie zombie1, zombie2, zombie3, zombie4, zombie5, zombie6;
    ZombieEspecial zombieEspecial1, zombieEspecial2;
    int velocidad = 60;






    public Mover(){
        zombie1 = new Zombie(this,0,190,25);
        zombie2 = new Zombie(this,0,350,12);
        zombie3 = new Zombie(this,0,510,18);
        zombie4 = new Zombie(this,0,190,23);
        zombie5 = new Zombie(this,0,350,20);
        zombie6 = new Zombie(this,0,510,15);
        zombieEspecial1 = new ZombieEspecial(this,0,30,10);
        zombieEspecial2 = new ZombieEspecial(this,0,670,5);



        repaint();


    }


    public void run(){

        while(true){
            zombie1.Update();
            zombie2.Update();
            zombie3.Update();
            zombie4.Update();
            zombie5.Update();
            zombie6.Update();
            zombieEspecial1.Update();
            zombieEspecial2.Update();





            try{
                Thread.sleep(velocidad);
            }catch (InterruptedException ie){
                System.out.print("Hola");
            }







        }
    }




    public void paint(Graphics g){
        update(g);

    }

    public void update(Graphics g){


        g.setColor(Color.black);
        g.fillRect(0,0,850,550);




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
        zombie2.Draw(g);
        zombie3.Draw(g);
        zombie4.Draw(g);
        zombie5.Draw(g);
        zombie6.Draw(g);
        zombieEspecial1.Draw(g);
        zombieEspecial2.Draw(g);

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
        } else if(flecha.getKeyCode()==38){
            velocidad = 100;
        } else if(flecha.getKeyCode()==40){
            velocidad = 60;
        }


    }

    @Override
    public void keyReleased(KeyEvent flecha){

    }

    @Override
    public void keyTyped(KeyEvent flecha){

    }







    }








