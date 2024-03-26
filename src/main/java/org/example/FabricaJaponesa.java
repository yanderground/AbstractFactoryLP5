package org.example;

public class FabricaJaponesa implements FabricaAbstrata{
    @Override
    public Comida createComida() {

        return new ComidaJaponesa();
    }

    @Override
    public Bebida createBebida() {

        return new BebidaJaponesa();
    }
}
