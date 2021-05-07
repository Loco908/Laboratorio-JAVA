package mx.com.softgame.poo1game.pruebas;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

import mx.com.softgame.poo1game.personajes.Personaje;

public class PruebaOutIO {
    private static String npath = System.getProperty("user.home")+System.getProperty("file.separator")+"pvsz.out";
     public static void main(String[] args) {
        Personaje pe;
        File archivo = new File(npath);
        if (archivo.exists()) {
        try {
            FileInputStream f =new FileInputStream(npath);
            ObjectInputStream s =new ObjectInputStream (f);
            pe= (Personaje)s.readObject();
            while(pe!=null)
                {
                    System.out.println(pe);
                    pe= (Personaje)s.readObject();
                }
            s.close ();
            
        }catch(Exception e) {
           
        }
    }else{
            System.out.println("E archivo no existe");
    }
        
        
    
       
         
        
    }
    
    
}
