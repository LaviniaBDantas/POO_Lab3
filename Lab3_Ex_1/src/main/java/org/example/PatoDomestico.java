package org.example;

public class PatoDomestico implements IPato {

    @Override
    public void grasnar() {
        System.out.println("Pato Domestico grasnando");
    }

    @Override
    public void voar() {
        System.out.println("Pato domestico voando");
    }
}
