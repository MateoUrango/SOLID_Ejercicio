interface PuedeCocinar {
    void cocinar();
}

public class Cocinero implements PuedeCocinar {
    @Override
    public void cocinar() {
        System.out.println("El cocinero prepara el plato.");
    }
}
