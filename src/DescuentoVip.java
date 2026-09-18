public class DescuentoVip implements Descuento {
    @Override
    public double aplicar(double subtotal) {
        return subtotal * 0.9; // 10% de descuento
    }
}
