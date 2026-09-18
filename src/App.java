
public class App {
    public static void main(String[] args) {
        // Pedido y descuento
        PedidoRestaurante pedido = new PedidoRestaurante("Mateo", "VIP");
        pedido.agregarPlato("Hamburguesa", 25000);
        pedido.agregarPlato("Jugo", 5000);

        ControladorDescuentos controladorDescuentos = new ControladorDescuentos();
        Descuento descuento = controladorDescuentos.obtenerDescuento(pedido);
        CalculadoraTotal calculadoraTotal = new CalculadoraTotal();
        double total = calculadoraTotal.calcularTotal(pedido, descuento);
        System.out.println("Total del pedido: $" + total);

        // Base de datos
        ConexionBaseDatos conexionBaseDatos = new ConexionBaseDatos();
        conexionBaseDatos.guardar(pedido);

        // Recibo
        ImpresoraRecibo impresoraRecibo = new ImpresoraRecibo();
        impresoraRecibo.imprimirRecibo(pedido, total);

        // Correo
        ServicioCorreo servicioCorreo = new ServicioCorreo();
        servicioCorreo.enviarCorreoConfirmacion(pedido);

        // Métodos de pago
        MetodoPago pagoTarjeta = new PagoTarjeta();
        MetodoPago pagoEfectivo = new PagoEfectivo();
        MetodoPago pagoPuntos = new PagoPuntosFidelidad();
        pagoTarjeta.cobrar(total);
        pagoEfectivo.cobrar(total);
        pagoPuntos.cobrar(10);

        // Personal del restaurante
        Mesero mesero = new Mesero();
        Cocinero cocinero = new Cocinero();
        Repartidor repartidor = new Repartidor();
        Cajero cajero = new Cajero();

        mesero.atenderMesa();
        cocinero.cocinar();
        repartidor.repartirPedido();
        cajero.cobrarEnCaja();
    }
}
