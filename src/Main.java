public class Main {
    public static void main(String[] args) {
        Empleado vendedor = new Vendedor("Roberto", 2000);
        vendedor.cambiarEstrategia(new ComisionEstandar()); // comision estandar por defecto
        vendedor.mostrarDetalle();
    }
}
