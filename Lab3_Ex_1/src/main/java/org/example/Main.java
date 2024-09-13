package org.example;
//Para utilizar o padrão Wrapper, criamos dois adaptadores, destinado a
// adaptar os novos tipos de objetos.
// Nesse caso, um adaptador para PatoDomestico e outro adaptador para PavaoAzul.
//Em cada um desses adaptadores há um construtor que recebe um objeto do tipo respectivo e chama
//os métodos relacionados à especie genérica(Ave): emitirSom e voar. Cada método vai ser reproduzido
//conforme a adaptação para a nova espécie.
// Por exemplo, pavao não voa, então o método voar() quando chamado, dá apenas um return.
public class Main {
    public static void main(String[] args) {
        System.out.println("Lab 3- Ex1!");
        PatoDomestico pato = new PatoDomestico();
        IAve avePatoDomestico = new AdaptadorPato(pato);
        avePatoDomestico.emitirSom();
        avePatoDomestico.voar();

        PavaoAzul pavao = new PavaoAzul();
        IAve avePavaoAzul=new AdaptadorPavao(pavao);
        avePavaoAzul.emitirSom();
        avePavaoAzul.voar();
    }
}