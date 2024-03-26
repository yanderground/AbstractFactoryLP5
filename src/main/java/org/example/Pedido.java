package org.example;

public class Pedido {

    private Comida comida;
    private Bebida bebida;

    public Pedido (FabricaAbstrata fabrica) {
        this.comida = fabrica.createComida();
        this.bebida = fabrica.createBebida();
    }

    public String pedirComida() {
        return this.comida.pedir();
    }

    public String pedirBebida() {
        return this.bebida.pedir();
    }
}