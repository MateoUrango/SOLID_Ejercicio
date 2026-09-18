public class DataBaseConection {
    public void guardar(Order order) {
        System.out.println("Conectando a la BD...");
        System.out.println("INSERT INTO pedidos VALUES ('" + order.getCliente() + "', ...)");
    }
}
