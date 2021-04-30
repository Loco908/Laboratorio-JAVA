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
            try {
                Tablero.addPersonaje(p);
            } catch (TheException e) {
                System.out.println(e+" "+e.getPoss());
            }
        }
        try {
            Tablero.delPersonaje(arr[5]);
        } catch (TheException e) {
            System.out.println(e+" "+e.getPoss());
        }
          
        Tablero.showAll(); 
        
        for(int j = 0; j <15; ++j){
            try {
                Tablero.delPersonaje(arr[j]);
                
            } catch (TheException e) {
                System.out.println(e+" "+e.getPoss());
                
            }
        }    
    }
    
}
