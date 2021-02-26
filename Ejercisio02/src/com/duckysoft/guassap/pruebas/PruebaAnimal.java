package com.duckysoft.guassap.pruebas;
import  com.duckysoft.guassap.animales.*;

public class PruebaAnimal {
    public static void main(String[] args) {
        Animal perro  = new Animal("Max",10,3000.0f);
        System.out.println(perro.getPrecio());
    }
    
}
