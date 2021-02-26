package com.duckysoft.guassap.animales;

//Constructor
public class Animal {
    private String nombre;
    private int raza;
    private float precio;

    //Metodo
    public Animal(String nombre, int raza, float precio){
        this.nombre = nombre;
        this.raza = raza;
        this.precio = precio;
    }
    //Otro metodo
    public float getPrecio(){
        boolean inbox = true;
        if(inbox){
            return precio;
        }
        return 0.0;
    }
    public void setPrecio(float precio){
        boolean duenio = true;
        if(duenio){
            this.precio = precio;
        }
    }
}
