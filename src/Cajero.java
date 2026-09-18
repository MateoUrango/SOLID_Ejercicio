interface PuedeCobrar {
    void cobrarEnCaja();
}

class Cajero implements PuedeCobrar {
    @Override
    public void cobrarEnCaja() {
        System.out.println("El cajero cobra en caja.");
    }
}