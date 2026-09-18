interface PuedeCobrar {
    void cobrarEnCaja();
}

public class Cajero implements PuedeCobrar {
    @Override
    public void cobrarEnCaja() {
        System.out.println("El cajero cobra en caja.");
    }
}
