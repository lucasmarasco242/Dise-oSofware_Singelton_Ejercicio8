public class ServicioCompra {
    private PasarelaPago pasarela;

    public ServicioCompra(PasarelaPago pasarela) {
        this.pasarela = pasarela;
    }

    public void realizarCompra(double monto) {
        System.out.println("Iniciando proceso de compra...");
        pasarela.procesarPago(monto);
    }
}