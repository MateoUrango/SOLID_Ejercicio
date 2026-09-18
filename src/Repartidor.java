interface PuedeRepartir {
    void repartirPedido();
}

class Repartidor implements PuedeRepartir {
    @Override
    public void repartirPedido() {
        System.out.println("El repartidor entrega el pedido a domicilio.");
    }
}