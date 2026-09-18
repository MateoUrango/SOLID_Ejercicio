interface PuedeRepartir {
    void repartirPedido();
}

public class Repartidor implements PuedeRepartir {
    @Override
    public void repartirPedido() {
        System.out.println("El repartidor entrega el pedido a domicilio.");
    }
}
