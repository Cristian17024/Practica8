public class Computadora extends DispositivoElectronicoDeConsumo {
    private long cpu;
    private long microprocesador;
    private long ramMB;

    public Computadora(String fabricante, String numeroSerie, String marca, String nombre, float costo,
                       long cpu, long microprocesador, long ramMB) {
        super(fabricante, numeroSerie, marca, nombre, costo);
        this.cpu = cpu;
        this.microprocesador = microprocesador;
        this.ramMB = ramMB;
    }

    public long getCpu() {
        return cpu;
    }

    public void setCpu(long cpu) {
        this.cpu = cpu;
    }

    public long getMicroprocesador() {
        return microprocesador;
    }

    public void setMicroprocesador(long microprocesador) {
        this.microprocesador = microprocesador;
    }

    public long getRamMB() {
        return ramMB;
    }

    public void setRamMB(long ramMB) {
        this.ramMB = ramMB;
    }

    @Override
    public String toString() {
        return super.toString() + ", cpu=" + cpu + ", microprocesador=" + microprocesador + ", ramMB=" + ramMB;
    }
}
