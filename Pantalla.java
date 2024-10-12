public class Pantalla {
    private int resolucionX;
    private int resolucionY;

    public Pantalla(int resolucionX, int resolucionY) {
        this.resolucionX = resolucionX;
        this.resolucionY = resolucionY;
    }

    public int getResolucionX() {
        return resolucionX;
    }

    public int getResolucionY() {
        return resolucionY;
    }

    @Override
    public String toString() {
        return "Pantalla [resolucionX=" + resolucionX + ", resolucionY=" + resolucionY + "]";
    }
}
