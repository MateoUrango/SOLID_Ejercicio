public class App {
    public static void main(String[] args) {
        // 1. Creamos el pedido
        Order miPedido = new Order("Juan", "VIP");
        miPedido.agregarPlato("Pizza", 20.0);
        miPedido.agregarPlato("Refresco", 5.0);

        // 2. Calculamos el total
        CalculateTotal calculadora = new CalculateTotal();
        double total = calculadora.calcularTotal(miPedido);

        // 3. Imprimimos el recibo
        ReceiptPrinter impresora = new ReceiptPrinter();
        impresora.imprimirRecibo(miPedido, total);

        // 4. Guardamos en BD
        DataBaseConection repositorio = new DataBaseConection();
        repositorio.guardar(miPedido);

        // 5. Enviamos correo
        EmailService emailService = new EmailService();
        emailService.enviarCorreoConfirmacion(miPedido);
    }
}