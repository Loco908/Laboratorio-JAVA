package mx.com.softgame.poo1game.pruebas;
import mx.com.softgame.poo1game.personajes.Personaje;
import mx.com.softgame.poo1game.personajes.buenos.Planta;
import mx.com.softgame.poo1game.personajes.malos.Zombie;
import mx.com.softgame.poo1game.utils.Tablero;
import mx.com.softgame.poo1game.utils.TheException;

public class PruebaTableroE {
    public static void main(String[]args){
        Personaje[] arr ={new Planta("Giovana",50), new Zombie("Miguel",false),
        new Zombie("Karen",true), new Planta("Leonardo",99), new Planta("Sebastian",30),
        new Zombie("Hanna"),new  Planta("oscar"),new Zombie("Brian",false),
        new Planta("Lesly",9),new Planta("Vania", 10), new Zombie("Erick", 20, false),
        new Planta("Aline", 40)
        };
    
        
        for(Personaje p : arr){
            try {
                Tablero.addPersonaje(p);
            }catch (TheException te) {
                System.out.println(te+""+te.getPoss());
            }
                
        }
            
    
        try {
            Tablero.delPersonaje(arr[2]);
        } catch (TheException e) {
            System.out.println(e.getMessage()+e.getPoss());
        }

        
        Tablero.showAll();
       
        
         

        int k=0;
        for(Personaje p : arr){
            while (k<15) {
                try{
                    Tablero.delPersonaje(p);  
                } catch (TheException te) {
                    System.out.println(te+""+te.getPoss());
                }
                k++;
            }
        }
        
            
                
        
        
    }
    
            
       

      
        
        
            
}
