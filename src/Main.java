public class Main {
    public static void main(String[] args) {
        PasarelaPago pago1 = PasarelaPago.getInstancia();
        PasarelaPago pago2 = PasarelaPago.getInstancia();

        System.out.println("¿Es la misma instancia de pasarela?: " + (pago1 == pago2));

        // Inyección de dependencias por constructor
        ServicioCompra servicio = new ServicioCompra(pago1);
        servicio.realizarCompra(1500.0);
    }
}