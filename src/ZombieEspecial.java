import javax.imageio.ImageIO;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

public class ZombieEspecial extends Objeto {
    public BufferedImage zombieTierra;

    public ZombieEspecial(Mover m, int y, int x, float s){
        movimiento = m;
        posicionY = y;
        posicionX = x;
        direccionY = s;
    }

    public void Update(){
        posicionY += direccionY;



    }





    public void Draw(Graphics g){




            try{
                zombieTierra = ImageIO.read(new File("C:/Users/Raquel/Desktop/Tareas/USAC/IPC1/NuevoProyecto/Images/zombieTierra.jpg"));
            } catch(IOException ie){
                System.out.print("No Zombie");
            }





        g.drawImage(zombieTierra,posicionX,posicionY,null);

        if(posicionY == 450){
            posicionY = 0;




        }



    }


}

