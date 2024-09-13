package org.example;

public class AdaptadorCalculadora implements ICalculadoraBinaria {
    private NovaCalculadora novaCalculadora;

    AdaptadorCalculadora(NovaCalculadora novaCalculadora){
        this.novaCalculadora=novaCalculadora;
    }
    @Override
    public String somar(String a, String b) {
        int aConvertido= Integer.parseInt(a,2);
        int bConvertido=Integer.parseInt(b, 2);
        return Integer.toBinaryString(novaCalculadora.somar(aConvertido,bConvertido));
    }
    @Override
    public String subtrair(String a, String b) {
        int aConvertido= Integer.parseInt(a,2);
        int bConvertido=Integer.parseInt(b, 2);
        return Integer.toBinaryString(novaCalculadora.subtrair(aConvertido,bConvertido));
    }
}
