package org.example;


//Para utilizar o padrão Wrapper, criei uma classe "AdaptadorCalculadora"
// que implementa a Interface ICalculadoraBinaria. Ao chamar os métodos Somar e Subtrair dela
// a partir de uma instância de ICalculadoraBinaria construída com o Adaptador , há o resultado dessas operações em binário.
// Mas se chamar os métodos somar, multiplicar e subtrair
// de uma instancia direta de NovaCalculadora, esses métodos serão para as novas operações decimais.

public class Main {
    public static void main(String[] args) {
        System.out.println("Lab 3- Ex2!");
        NovaCalculadora novaCalculadora= new NovaCalculadora();
        ICalculadoraBinaria novaCalculadoraBinaria = new AdaptadorCalculadora(novaCalculadora);
        System.out.println("Soma Decimal. Resultado: ");
        System.out.println(novaCalculadora.somar(10,11));
        System.out.println("Mult Decimal. Resultado: ");
        System.out.println(novaCalculadora.multiplicar(10,11));
        System.out.println("Sub Decimal. Resultado: ");
        System.out.println(novaCalculadora.subtrair(10,11));
        System.out.println("Soma Binária. Resultado: ");
        System.out.println(novaCalculadoraBinaria.somar("10","11"));
        System.out.println("Sub Binária. Resultado: ");
        System.out.println(novaCalculadoraBinaria.subtrair("10","11"));

    }

}