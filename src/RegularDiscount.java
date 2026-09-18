public class RegularDiscount implements Discount {
    @Override
    public double apply(double subtotal) {
        return subtotal; // Sin descuento
    }
}