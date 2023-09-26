package org.example;

public class Perro extends Animal {

    public Perro() {
    }

    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println("guau guau");
    }
}
