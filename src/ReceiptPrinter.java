public class ReceiptPrinter {
    private ImpresoraTermica impresora;

    public ReceiptPrinter() {
        this.impresora = new ImpresoraTermica();
    }

    public void imprimirRecibo(Order order, double total) {
        String texto = "Recibo de " + order.getCliente() + ": $" + total;
        impresora.imprimir(texto);
    }
}

// La clase de la impresora se queda aquí abajo, solo la usa el Printer
class ImpresoraTermica {
    public void imprimir(String texto) {
        System.out.println("[Impresora térmica] " + texto);
    }
}
