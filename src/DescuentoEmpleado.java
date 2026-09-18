public class DescuentoEmpleado implements Descuento {
    @Override
    public double aplicar(double subtotal) {
        return subtotal * 0.5; // 50% de descuento
    }
}
