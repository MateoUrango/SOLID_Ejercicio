import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class ControladorDescuentos {
    private Map<String, Descuento> descuentos;
    private Descuento descuentoPorDefecto;

    public ControladorDescuentos() {
        this.descuentos = new HashMap<>();
        this.descuentoPorDefecto = new DescuentoRegular();
        registrarDescuento("REGULAR", descuentoPorDefecto);
        registrarDescuento("VIP", new DescuentoVip());
        registrarDescuento("EMPLEADO", new DescuentoEmpleado());
    }

    public void registrarDescuento(String tipoCliente, Descuento descuento) {
        descuentos.put(tipoCliente.toUpperCase(Locale.ROOT), descuento);
    }

    public Descuento obtenerDescuento(PedidoRestaurante pedido) {
        return descuentos.getOrDefault(
            pedido.getTipoCliente().toUpperCase(Locale.ROOT),
            descuentoPorDefecto
        );
    }
}
