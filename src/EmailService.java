public class EmailService {
    public void enviarCorreoConfirmacion(Order order) {
        System.out.println("Enviando correo de confirmación a " + order.getCliente() + "...");
    }
}