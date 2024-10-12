import java.util.ArrayList;

public class AppDemoHerencia {
    public static void main(String[] args) {
        ArrayList<Smartphone> listaDeSmartphones = new ArrayList<>();
        ArrayList<Television> listaDeTVs = new ArrayList<>();
        ArrayList<Computadora> listaDeComputadoras = new ArrayList<>();

        listaDeSmartphones.add(new Smartphone("Apple", "123", "iPhone", "iPhone 14", 999f, new Sensor("Huella", "digital", 1), new Pantalla(1080, 1920)));
        listaDeSmartphones.add(new Smartphone("Samsung", "456", "Galaxy", "Galaxy S21", 799f, new Sensor("Huella", "digital", 1), new Pantalla(1440, 2560)));

        listaDeTVs.add(new Television("Sony", "789", "sony", "sony", 1499f, 65));
        listaDeTVs.add(new Television("LG", "1010", "LG", "LG", 1199f, 55));

        listaDeComputadoras.add(new Computadora("Dell", "1234", "Inspiron", "Inspiron", 1200f, 6, 4, 16000));
        listaDeComputadoras.add(new Computadora("HP", "4321", "Pavilion", "Pavilio", 1500.75f, 8, 6, 32000));

        System.out.println("Lista de Smartphones:");
        for (Smartphone smartphone : listaDeSmartphones) {
            System.out.println(smartphone);
        }

        System.out.println("\nLista de Televisores:");
        for (Television tv : listaDeTVs) {
            System.out.println(tv);
        }

        System.out.println("\nLista de Computadoras:");
        for (Computadora computadora : listaDeComputadoras) {
            System.out.println(computadora);
        }
    }
}
