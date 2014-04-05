import javax.imageio.ImageIO;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

public class Zombie extends Objeto{

    public BufferedImage zombie;
    float aleatorio = this.Aleatorio();
    float aleatorio2 = this.Aleatorio2();






    public Zombie(Mover m, int y, int x, float s){
        movimiento = m;
        posicionY = y;
        posicionX = x;
        direccionY = s;
    }

    public void Update(){
        posicionY += direccionY;



    }



    public int Aleatorio() {
        Random random = new Random();
        return random.nextInt(4);
    }

    public int Aleatorio2() {
        Random random = new Random();
        return random.nextInt(3);
    }



    public void Draw(Graphics g){



        if(aleatorio == 0){
            try{
                zombie = ImageIO.read(new File("C:/Users/Raquel/Desktop/Tareas/USAC/IPC1/NuevoProyecto/Images/zombie1.jpg"));
            } catch(IOException ie){
                System.out.print("No Zombie");
            }


        } else if(aleatorio == 1) {
            try{
                zombie = ImageIO.read(new File("C:/Users/Raquel/Desktop/Tareas/USAC/IPC1/NuevoProyecto/Images/zombie2.jpg"));
            } catch(IOException ie){
                System.out.print("No Zombie");
            }
        } else if(aleatorio == 2) {
            try{
                zombie = ImageIO.read(new File("C:/Users/Raquel/Desktop/Tareas/USAC/IPC1/NuevoProyecto/Images/zombie3.jpg"));
            } catch(IOException ie){
                System.out.print("No Zombie");
            }
        } else if(aleatorio == 3) {
            try{
                zombie = ImageIO.read(new File("C:/Users/Raquel/Desktop/Tareas/USAC/IPC1/NuevoProyecto/Images/zombie4.jpg"));
            } catch(IOException ie){
                System.out.print("No Zombie");
            }


        }

        if(aleatorio2 == 0){
            posicionX = 190;
        } else if(aleatorio2 == 1){
            posicionX = 350;
        } else if(aleatorio2 == 2){
            posicionX = 510;
        }

        g.drawImage(zombie,posicionX,posicionY,null);

      if(posicionY == 450){
          posicionY = 0;

          Random random = new Random();
          aleatorio =  random.nextInt(4);

          Random random2 = new Random();
          aleatorio2 = random2.nextInt(3);


      }



    }



}
