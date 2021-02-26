//  Hora de inicio: 7:44
//Hora de finalizacion: 
package mx.com.softgame.poo1game.pruebas;
import mx.com.softgame.poo1game.personajes.Personaje;

public class PruebaPersonaje {
  public static void main(String[] args) {
    Personaje p1 = new Personaje("Omar");
    Personaje p2 = new Personaje("Erick");
    Personaje p3 = new Personaje("Wendy");
    Personaje p4 = new Personaje("Lesly");
    
    outfor:
    for(int i = 0 ;i<3 ;i++  ){
      int ed = (int)(Math.random()*250);
      if(p1.setEdad(ed)){
        System.out.println(p1.getDetalle()+"Se modifico la edad");
      }else{
        System.out.println(p1.getDetalle()+"Sin modificacion en edad");
      }

      ed = (int)(Math.random()*250);
      if(p2.setEdad(ed)){
        System.out.println(p2.getDetalle()+"se modifico la edad");
      }
    }

  }  
} 
