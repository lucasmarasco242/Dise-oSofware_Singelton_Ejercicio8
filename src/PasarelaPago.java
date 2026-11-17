public class PasarelaPago {
    private static PasarelaPago instancia;
    private String estado;

    private PasarelaPago() {
        this.estado = "Activa";
    }

    public static PasarelaPago getInstancia() {
        if (instancia == null) {
            instancia = new PasarelaPago();
        }
        return instancia;
    }

    public void procesarPago(double monto) {
        System.out.println("Procesando pago de: $" + monto);
    }
}