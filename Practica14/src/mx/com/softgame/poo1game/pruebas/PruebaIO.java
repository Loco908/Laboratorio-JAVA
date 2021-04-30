package mx.com.softgame.poo1game.pruebas;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import mx.com.softgame.poo1game.personajes.Personaje.*;

public class PruebaIO{
    public static void main(String[] args) {
        String path = System.getProperty("user.home");
        Scanner file = new Scanner(System.in);
        System.out.println("Escriba el archivo:");
        String fli = file.nextLine();

        //Quita los espacio que tiene de mas.
        File.trim();
        path += System.getProperty("file.separator") + fli.trim();

        File myfFile = new File(path);
        System.out.println(path);
        
        if(myFile.exists()) {
            System.out.println("Si Existe");
            ArrayList <Personaje> personajes = new ArrayList<Personaje>();   
        }
    }
}