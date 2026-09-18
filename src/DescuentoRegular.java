public class DescuentoRegular implements Descuento {
    @Override
    public double aplicar(double subtotal) {
        return subtotal; // Sin descuento
    }
}
