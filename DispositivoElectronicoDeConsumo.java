public class DispositivoElectronicoDeConsumo extends DispositivoElectronico {
    private boolean encendido;

    public DispositivoElectronicoDeConsumo(String fabricante, String numeroSerie, String marca, String nombre, float costo) {
        super(fabricante, numeroSerie, marca, nombre, costo);
        this.encendido = false;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void encender() {
        this.encendido = true;
    }

    public void apagar() {
        this.encendido = false;
    }

    @Override
    public String toString() {
        return super.toString() + ", encendido=" + encendido;
    }
}
