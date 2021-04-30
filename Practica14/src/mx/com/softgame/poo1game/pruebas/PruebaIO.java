package mx.com.softgame.poo1game.pruebas;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;

import mx.com.softgame.poo1game.personajes.Personaje;
import mx.com.softgame.poo1game.personajes.malos.Zombie;
import mx.com.softgame.poo1game.personajes.buenos.Planta;

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
                BufferedReader br = new BufferedReader(fr);
                String line = null;
                int count = Integer.parseInt(br.readLine());
                int i=0;
                while(i<count){
                    line=br.readLine();
                    String[] par = line.split(",");
                    if (par[0].equals("Z")) {
                        personajes.add(new Zombie(par[1]));
                    } else {
                        personajes.add(new Planta(par[1]));
                    }
                    i++;
                }
                System.out.println(personajes);
                br.close();

            } catch(IOException e){
                e.printStackTrace();
            }
        }else{
            System.out.println("No existe");
        }
        try {
            //Crea el interfaz dek archivo
            FileOutputStream output = new FileOutputStream(archivo);
            //Para no dañar el original
            ObjectOutputStream bufOutput = new ObjectOutputStream(output);
            fli = sc.nextLine();
            bufOutput.write(fli);
            bufOutput.close();//Se cierra el bufOut y se escibre en el archivo original
        } catch (Exception e) {
            //TODO: handle exception
        }   
    }
}
