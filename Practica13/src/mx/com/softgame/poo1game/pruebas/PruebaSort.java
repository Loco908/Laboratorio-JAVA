import java.util.TreeSet;
import java.util.LinkedList;
import java.util.Collections;
import mx.com.softgame.poo1game.personajes.Personaje;
import mx.com.softgame.poo1game.personajes.buenos.Planta;
import mx.com.softgame.poo1game.personajes.malos.Zombie;

public class PruebaSort{
    public static void main(String[] args) {
        TreeSet <Personaje> ts = new TreeSet <Personaje>();

        ts.add(new Planta("Cristian",70));
        ts.add(new Planta("Karen",50));
        ts.add(new Zombie("Hanna",80,false));
        ts.add(new Zombie("Esmeralda",80,false));
        ts.add(new Planta("Miguel", 99));
        ts.add(new Planta("Jaime",50));
        ts.add(new Zombie("Cristian",80,false));
        ts.add(new Zombie("Miguel",80,false));
        ts.add(new Planta("Karen",50));

        for(Personaje p : ts) {
            System.out.println(p);
        }
        
    }
}