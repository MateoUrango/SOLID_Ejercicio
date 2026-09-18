import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class PedidoRestaurante {
    private String cliente;
    private String tipoCliente; // "REGULAR", "VIP", "EMPLEADO"
    private List<String> platos;
    private List<Double> precios;

    public PedidoRestaurante(String cliente, String tipoCliente) {
        this.cliente = cliente;
        this.tipoCliente = tipoCliente;
        this.platos = new ArrayList<>();
        this.precios = new ArrayList<>();
    }

    public void agregarPlato(String nombre, double precio) {
        platos.add(nombre);
        precios.add(precio);
    }

    // Solo getters para que otras clases puedan leer los datos
    public String getCliente() { return cliente; }
    public String getTipoCliente() { return tipoCliente; }
    public List<String> getPlatos() { return Collections.unmodifiableList(platos); }
    public List<Double> getPrecios() { return Collections.unmodifiableList(precios); }
}
