public class PagoPuntosFidelidad extends MetodoPago {
    private double puntosDisponibles=20.0;

    @Override 
    public boolean cobrar(double monto){
        if (monto > puntosDisponibles) {
            System.out.println("Puntos insuficienters para realizar el cobro. ");
            return false;
        }
        puntosDisponibles-=monto;
        System.out.println("Cobrando $ " + monto + " con puntos de fidelidad. ");
        return true;
    }
}
