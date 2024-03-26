package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {
    @Test
    void devePedirComidaItaliana() {
        FabricaAbstrata fabrica = new FabricaItaliana();
        Pedido pedido = new Pedido(fabrica);
        assertEquals("Pasta", pedido.pedirComida());
    }

    @Test
    void devePedirComidaJaponesa() {
        FabricaAbstrata fabrica = new FabricaJaponesa();
        Pedido pedido = new Pedido(fabrica);
        assertEquals("Lámen", pedido.pedirComida());
    }

    @Test
    void devePedirBebidaItaliana() {
        FabricaAbstrata fabrica = new FabricaItaliana();
        Pedido pedido = new Pedido(fabrica);
        assertEquals("Negroni", pedido.pedirBebida());
    }

    @Test
    void deveEmitirDiplomaPosGraduacao() {
        FabricaAbstrata fabrica = new FabricaJaponesa();
        Pedido pedido = new Pedido(fabrica);
        assertEquals("Shochu", pedido.pedirBebida());
    }

}