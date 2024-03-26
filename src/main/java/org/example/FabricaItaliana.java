package org.example;

public class FabricaItaliana implements FabricaAbstrata {
    @Override
    public Comida createComida() {
        return new ComidaItaliana();
    }

    @Override
    public Bebida createBebida() {
        return new BebidaItaliana();
    }
}


