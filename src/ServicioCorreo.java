public class ServicioCorreo {
    public void enviarCorreoConfirmacion(PedidoRestaurante pedido) {
        System.out.println("Enviando correo de confirmación a " + pedido.getCliente() + "...");
    }
}
