public class Television extends DispositivoElectronicoDeConsumo {
    private int pantalla;

    public Television(String fabricante, String numeroSerie, String marca, String nombre, float costo, int pantalla) {
        super(fabricante, numeroSerie, marca, nombre, costo);
        this.pantalla = pantalla;
    }

    public int getPantalla() {
        return pantalla;
    }

    @Override
    public String toString() {
        return super.toString() + ", pantalla=" + pantalla;
    }
}
