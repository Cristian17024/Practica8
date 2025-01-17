public class Sensor {
    private String tipo;
    private String unidadDeMedida;
    private int valor;

    public Sensor(String tipo, String unidadDeMedida, int valor) {
        this.tipo = tipo;
        this.unidadDeMedida = unidadDeMedida;
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public String getUnidadDeMedida() {
        return unidadDeMedida;
    }

    public int getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Sensor [tipo=" + tipo + ", unidadDeMedida=" + unidadDeMedida + ", valor=" + valor + "]";
    }
}
