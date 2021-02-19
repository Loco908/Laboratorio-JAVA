package mx.com.softgame.poo1game.pruebas;
import mx.com.softgame.poo1game.personajes.personaje;

public class PruebaPersonaje {
  public static void main(String[] args) {
    Personaje p1 = new Personaje("Aline", 200);
    Personaje p2 = new Personaje("Erick", 10);
    Personaje p3 = new Personaje("Alan", 1);
    Personaje p4 = new Personaje("Lesly", -10);
    Personaje p5 = new Personaje("Brian", 500);

    System.out.println(p1.getDetalle());
    System.out.println(p2.getDetalle());
    System.out.println(p3.getDetalle());
    System.out.println(p4.getDetalle());
    System.out.println(p5.getDetalle());

    Personaje p6 = p5;
    Personaje p7 = p4;
    Personaje p8 = p3;
    Personaje p9 = p2;
    Personaje p10 = p1;

    p6.setNombre("Jorge Eduardo");
    p8.setNombre("Yosselin");
    p10.setNombre("Ana");

    int r = (int) (Math.random() * 1000);

    p7.setEdad(r);
    p9.setEdad(r);

    System.out.println();
    System.out.println(p1.getDetalle());
    System.out.println(p2.getDetalle());
    System.out.println(p3.getDetalle());
    System.out.println(p4.getDetalle());
    System.out.println(p5.getDetalle());
  }  
} 
