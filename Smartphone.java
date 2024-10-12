public class Smartphone extends DispositivoElectronicoDeConsumo {
    private Sensor sensorDeHuella;
    private Pantalla pantalla;

    public Smartphone(String fabricante, String numeroSerie, String marca, String nombre, float costo, Sensor sensorDeHuella, Pantalla pantalla) {
        super(fabricante, numeroSerie, marca, nombre, costo);
        this.sensorDeHuella = sensorDeHuella;
        this.pantalla = pantalla;
    }

    public Sensor getSensorDeHuella() {
        return sensorDeHuella;
    }

    public Pantalla getPantalla() {
        return pantalla;
    }

    @Override
    public String toString() {
        return super.toString() + ", sensorDeHuella=" + sensorDeHuella + ", pantalla=" + pantalla;
    }
}
