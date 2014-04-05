import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.*;

import java.io.File;

public class Reproductor {


   public void musica(){
    try{

        Clip sonido = AudioSystem.getClip();
        sonido.open(AudioSystem.getAudioInputStream(new File("C:/Users/Raquel/Desktop/Tareas/USAC/IPC1/Prueba/Images/musica.wav")));
    } catch(Exception e){
        System.out.println("No sonido");

    }
 }
}
