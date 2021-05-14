package mx.com.softgame.poo1game.utils;
public class Utileria{
    private static int contadorID;
    private Utileria(int contadorID){ //solo se tiene acceso al constructor dentro de la clase  solo se llama por medio de un metodo estatico
        this.contadorID = contadorID;
    }
    public static int getID(){
        return (++contadorID);
    }
}