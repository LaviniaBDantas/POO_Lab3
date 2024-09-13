package org.example;

public class AdaptadorPavao implements IAve{
    private IPavao pavao;

    AdaptadorPavao (IPavao pavao){
        this.pavao=pavao;
    }
    @Override
    public void voar() {
        return;
    }

    @Override
    public void emitirSom() {
        pavao.cantar();
    }
}
