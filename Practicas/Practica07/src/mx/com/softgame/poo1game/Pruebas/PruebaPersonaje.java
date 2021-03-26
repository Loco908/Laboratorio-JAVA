//  Hora de inicio: 7:44
//Hora de finalizacion: 9:58 
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
        System.out.println(p1.getDetalle()+"Sin modificacion en edad"+" "+ed);
      }

      ed = (int)(Math.random()*250);
      if(p2.setEdad(ed)){
        System.out.println(p2.getDetalle()+"se modifico la edad");
      }else{
        System.out.println(p2.getDetalle()+"Sin modificacion la edad"+" "+ed);
      }

      ed = (int)(Math.random()*250);
      if(p3.setEdad(ed)){
        System.out.println(p3.getDetalle()+"Se modifico la edad");
      }else{
        System.out.println(p3.getDetalle()+"Sin modificacion la edad a"+" "+ed);
      }

      do{
        ed = (int)(Math.random()*250);
        System.out.println(ed);
        if(ed==150){
          System.out.println("*****Bingo 150*****");
          continue outfor;
        }
      }while(!p4.setEdad(ed));
      System.out.println(p4.getDetalle()+"\n");
    }
  }  
} 