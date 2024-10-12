public class Microprocesador {
    private int cacheRAM;
    private long velocidadHz;

    public Microprocesador(int cacheRAM, long velocidadHz) {
        this.cacheRAM = cacheRAM;
        this.velocidadHz = velocidadHz;
    }

    public int getCacheRAM() {
        return cacheRAM;
    }

    public long getVelocidadHz() {
        return velocidadHz;
    }

    @Override
    public String toString() {
        return "Microprocesador [cacheRAM=" + cacheRAM + ", velocidadHz=" + velocidadHz + "]";
    }
}
