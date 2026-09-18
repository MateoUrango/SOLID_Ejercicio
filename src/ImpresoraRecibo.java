public class ImpresoraRecibo {
    private Impresora impresora;

    public ImpresoraRecibo() {
        this.impresora = new ImpresoraTermica();
    }

    public ImpresoraRecibo(Impresora impresora) {
        this.impresora = impresora;
    }

    public void imprimirRecibo(PedidoRestaurante pedido, double total) {
        String texto = "Recibo de " + pedido.getCliente() + ": $" + total;
        impresora.imprimir(texto);
    }
}

// La clase de la impresora se queda aquí abajo, solo la usa el Printer
interface Impresora {
    void imprimir(String texto);
}

class ImpresoraTermica implements Impresora {
    @Override
    public void imprimir(String texto) {
        System.out.println("[Impresora térmica] " + texto);
    }
}
