public class CalculadoraTotal {
    // Recibe la estrategia ya seleccionada
    public double calcularTotal(PedidoRestaurante pedido, Descuento descuento) {
        double subtotal = 0;
        for (double precio : pedido.getPrecios()) {
            subtotal += precio;
        }
        // Aplica el descuento sin saber si es VIP, Regular o Empleado
        return descuento.aplicar(subtotal);
    }
}
