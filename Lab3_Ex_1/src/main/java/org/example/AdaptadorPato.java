package org.example;

public class AdaptadorPato implements IAve{
    private IPato pato;

    AdaptadorPato(IPato pato){
        this.pato=pato;
    }
    @Override
    public void voar() {
        pato.voar();
    }

    @Override
    public void emitirSom() {
        pato.grasnar();
    }
}
