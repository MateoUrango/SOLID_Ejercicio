public class VipDiscount implements Discount {
    @Override
    public double apply(double subtotal) {
        return subtotal * 0.9; // 10% de descuento
    }
}