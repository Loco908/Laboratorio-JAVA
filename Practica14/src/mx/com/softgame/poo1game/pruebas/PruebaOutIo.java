package x.com.softgame.poo1game.pruebas;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import mx.com.softgame.poo1game.personajes.Personaje;


public class PruebaOutIo implements Serializable {
    public static void main(String[] args) {
       Personaje p;
       try {
           FileInputStream a = new FileInputStream("pvsz.out");
           ObjectInputStream f = new ObjectInputStream(a);

           while(s.readObjct()!=null){
               p = (Personaje)s.readObject();
               System.out.println(p);
           }
           s.close();
       } catch (Exception e) {
           //TODO: handle exception
       }
    }
}
