public class CalculateTotal {
    // Recibe la estrategia ya seleccionada
    public double calcularTotal(Order order, Discount discount) {
        double subtotal = 0;
        for (double precio : order.getPrecios()) {
            subtotal += precio;
        }
        // Aplica el descuento sin saber si es VIP, Regular o Empleado
        return discount.apply(subtotal);
    }
}