package mx.com.softgame.poo1game.pruebas;

import mx.com.softgame.poo1game.personajes.Personaje;
import mx.com.softgame.poo1game.personajes.buenos.Planta;
import mx.com.softgame.poo1game.personajes.malos.Zombie;
import mx.com.softgame.poo1game.utils.TheException;
import mx.com.softgame.poo1game.utils.Tablero;

public class PruebaTableroE {
    public static void main(String[] args) {
        Personaje[] arr = {
            new Planta("Giovanna", 50),
            new Zombie("Miguel", false),
            new Zombie("Karen", true),
            new Planta("Leonardo", 99),
            new Planta("Sebastian", 30),
            new Zombie("Hanna"),
            new Planta("Oscar"),
            new Zombie("Brian", false),
            new Planta("Lesly", 9),
            new Planta("Vania", 10),
            new Zombie("Erick", 20, false),
            new Planta("Aline", 40)
        };

        for(Personaje p : arr){
            if(!Tablero.addPersonaje(p)){
                        
                System.out.println("No pudo ser Insertado");
            }
        }
          
        Tablero.showAll(); 
        System.out.println("................");
        Tablero.delPersonaje(arr[2]);
        Tablero.showAll();
        System.out.println("................");
        
        for(int j = 0; j <=15; ++j){
            if(!Tablero.delPersonaje(arr[2])){
                    System.out.println("No pudo ser eliminado");
            }
        }    
    }
    
}
