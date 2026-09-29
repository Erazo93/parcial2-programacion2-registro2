public class Vendedor extends Empleado {

    public Vendedor(String nombre, double ventasMes) {
        super(nombre, ventasMes, new ComisionEstandar());
    }

    @Override
    public void mostrarDetalle() {
        System.out.println("Empleado: " + nombre);
        System.out.println("Venta total: " + ventasMes);
        System.out.println("Comision obtenida: " + estrategia.calcularComision(ventasMes));
    }
}
