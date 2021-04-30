package mx.com.softgame.poo1game.pruebas;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import mx.com.softgame.poo1game.personajes.Personaje;

public class PruebaIO{
    public static void main(String[] args) {
        String path = System.getProperty("user.home");
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba el archivo:");
        String fli = sc.nextLine();
        path += System.getProperty("file.separator") + fli.trim();
        File archivo = new File(path);
        System.out.println(path);

        if(archivo.exists()) {
            System.out.println("Si Existe");
            ArrayList <Personaje> personajes = new ArrayList<Personaje>();
            try{
                FileReader fr = new FileReader(archivo);
                BufferedReader br = new BufferedReader(archivo);
            }   
        }
    }
}