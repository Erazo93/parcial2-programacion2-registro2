public class ComisionPersonalizada implements EstrategiaComision {
    private final int porcentaje;

    public ComisionPersonalizada(String primerNombre) {
        this.porcentaje = 5 + primerNombre.length();
    }

    @Override
    public double calcularComision(double montoVenta) {
        return montoVenta * porcentaje / 100.0;
    }
}
