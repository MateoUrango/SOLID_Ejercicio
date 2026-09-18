interface PuedeAtenderMesa {
    void atenderMesa();
}

public class Mesero implements PuedeAtenderMesa {
    @Override
    public void atenderMesa() {
        System.out.println("El mesero atiende la mesa.");
    }
}
