package org.example;

public class AdaptadorCalculadora implements CalculadoraBinaria{
    private NovaCalculadora novaCalculadora;

    AdaptadorCalculadora(NovaCalculadora novaCalculadora){
        this.novaCalculadora=novaCalculadora;
    }


    @Override
    public String somar(String a, String b) {
       return novaCalculadora.somar(a,b);
    }

    @Override
    public String subtrair(String a, String b) {
        return null;
    }
}
