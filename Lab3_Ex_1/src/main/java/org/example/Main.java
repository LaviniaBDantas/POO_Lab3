package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Lab 3- Ex1!");
        PatoDomestico pato = new PatoDomestico();
//        AdaptadorPato adpPato= new AdaptadorPato(pato);
//        adpPato.emitirSom();
//        adpPato.voar();
        IAve avePatoDomestico = new AdaptadorPato(pato);
        avePatoDomestico.emitirSom();
        avePatoDomestico.voar();

        PavaoAzul pavao = new PavaoAzul();
//        AdaptadorPavao adpPavao=new AdaptadorPavao(pavao);
//        adpPavao.emitirSom();
//        adpPavao.voar();
        IAve avePavaoAzul=new AdaptadorPavao(pavao);
        avePavaoAzul.emitirSom();
        avePavaoAzul.voar();
    }
}