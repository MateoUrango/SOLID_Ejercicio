// ==========================================================
// Sistema de gestión de pedidos de un restaurante (versión CON violaciones)
// ==========================================================
/*
import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private String cliente;
    private String tipoCliente; // "REGULAR", "VIP", "EMPLEADO"
    private List<String> platos = new ArrayList<>();
    private List<Double> precios = new ArrayList<>();

    public void agregarPlato(String nombre, double precio) {
        platos.add(nombre);
        precios.add(precio);
    }

    // REVISAR (1): calcula el total Y decide el descuento con un if/else
    // que crece cada vez que el restaurante inventa un tipo de cliente nuevo.
    public double calcularTotal() {
        double subtotal = 0;
        for (double precio : precios) {
            subtotal += precio;
        }

        if (tipoCliente.equals("REGULAR")) {
            return subtotal;
        } else if (tipoCliente.equals("VIP")) {
            return subtotal * 0.9;
        } else if (tipoCliente.equals("EMPLEADO")) {
            return subtotal * 0.5;
        }
        return subtotal;
    }

    // REVISAR (2): Pedido también sabe persistir datos...
    public void guardarEnBaseDeDatos() {
        System.out.println("Conectando a la BD...");
        System.out.println("INSERT INTO pedidos VALUES (...)");
    }

    // REVISAR (2): ...y también sabe imprimir recibos...
    public void imprimirRecibo() {
        ImpresoraTermica impresora = new ImpresoraTermica();
        impresora.imprimir("Recibo de " + cliente + ": $" + calcularTotal());
    }

    // REVISAR (2): ...y también sabe enviar correos. Una sola clase, cuatro trabajos.
    public void enviarCorreoConfirmacion() {
        System.out.println("Enviando correo de confirmación a " + cliente + "...");
    }

    public void setCliente(String cliente) { this.cliente = cliente; }
    public void setTipoCliente(String tipoCliente) { this.tipoCliente = tipoCliente; }
}

class ImpresoraTermica {
    public void imprimir(String texto) {
        System.out.println("[Impresora térmica] " + texto);
    }
}

// --- Métodos de pago ---

abstract class MetodoPago {
    public abstract void cobrar(double monto);
}

class PagoTarjeta extends MetodoPago {
    @Override
    public void cobrar(double monto) {
        System.out.println("Cobrando $" + monto + " con tarjeta.");
    }
}

class PagoEfectivo extends MetodoPago {
    @Override
    public void cobrar(double monto) {
        System.out.println("Cobrando $" + monto + " en efectivo.");
    }
}

// REVISAR (3): esta subclase no puede cumplir lo que promete la superclase.
class PagoPuntosFidelidad extends MetodoPago {
    private double puntosDisponibles = 20.0;

    @Override
    public void cobrar(double monto) {
        if (monto > puntosDisponibles) {
            throw new IllegalStateException("No hay suficientes puntos para cobrar este monto.");
        }
        System.out.println("Cobrando $" + monto + " con puntos de fidelidad.");
    }
}

// --- Personal del restaurante ---

// CORRECCIÓN (4) — ISP: Interface Segregation Principle
// En lugar de una sola interfaz "Empleado" con todos los métodos posibles,
// se define una interfaz pequeña y específica por responsabilidad.
// Cada clase implementa solo las interfaces que corresponden a su rol.
// Así ninguna clase queda obligada a implementar métodos que no le pertenecen.

interface PuedeAtenderMesa {
    void atenderMesa();
}

interface PuedeCocinar {
    void cocinar();
}

interface PuedeRepartir {
    void repartirPedido();
}

interface PuedeCobrar {
    void cobrarEnCaja();
}

// El Mesero solo atiende mesas — implementa únicamente PuedeAtenderMesa.
class Mesero implements PuedeAtenderMesa {
    @Override
    public void atenderMesa() {
        System.out.println("El mesero atiende la mesa.");
    }
}

// El Cocinero solo cocina — implementa únicamente PuedeCocinar.
class Cocinero implements PuedeCocinar {
    @Override
    public void cocinar() {
        System.out.println("El cocinero prepara el plato.");
    }
}

// Un Repartidor solo reparte pedidos — implementa únicamente PuedeRepartir.
class Repartidor implements PuedeRepartir {
    @Override
    public void repartirPedido() {
        System.out.println("El repartidor entrega el pedido a domicilio.");
    }
}

// Un Cajero solo cobra en caja — implementa únicamente PuedeCobrar.
class Cajero implements PuedeCobrar {
    @Override
    public void cobrarEnCaja() {
        System.out.println("El cajero cobra en caja.");
    }
}

*/