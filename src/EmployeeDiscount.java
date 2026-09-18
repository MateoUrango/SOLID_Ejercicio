public class EmployeeDiscount implements Discount {
    @Override
    public double apply(double subtotal) {
        return subtotal * 0.5; // 50% de descuento
    }
}