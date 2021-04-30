package x.com.softgame.poo1game.pruebas;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import mx.com.softgame.poo1game.personajes.Personaje;


public class PruebaOutIo implements Serializable {
    public static void main(String[] args) {
       String f = System.getProperty("user.home")+System.getProperty("file.separator")+"pvsz.out";
       File sFile = new File(f);

       if(sFile.exists()){
           try {
               FileInputStream input = new FileInputStream(f);
               ObjectInputStream bufInput = new ObjectInputStream(input);
               Personaje personajes = (personajes)bufInput.readObject();
               while(personajes!=null){
                   System.out.println(personajes);
                   personajes = (Personaje) bufInput.readObject();
               }

               bufInput.close();

           } catch (IOException e) {
               e.printStackTrace();
           }
       }else{
           System.out.println("No existe");
       }
    }
}

