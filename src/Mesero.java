interface PuedeAtenderMesa {
    void atenderMesa();
}

class Mesero implements PuedeAtenderMesa {
    @Override
    public void atenderMesa() {
        System.out.println("El mesero atiende la mesa.");
    }
}