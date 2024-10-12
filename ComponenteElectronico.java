public class ComponenteElectronico {
    private DispositivoElectronico dispositivo;
    private String tipoComponente;

    public ComponenteElectronico(String tipoComponente) {
        this.tipoComponente = tipoComponente;
    }

    public DispositivoElectronico getDispositivo() {
        return dispositivo;
    }

    public void setDispositivo(DispositivoElectronico dispositivo) {
        this.dispositivo = dispositivo;
    }

    public String getTipoComponente() {
        return tipoComponente;
    }

    @Override
    public String toString() {
        return "ComponenteElectronico [tipo=" + tipoComponente + ", dispositivo=" 
                + (dispositivo != null ? dispositivo.getNombre() : "No tiene") + "]";
    }
}
