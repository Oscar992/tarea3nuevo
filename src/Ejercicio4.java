import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        var lista = crearLista();
        var mapPrecio = crearMapPrecio(lista);
        var mapStock = crearMapStock(lista);
        var scanner = new Scanner(System.in);
        String opcion;

        do {
            imprimirKeysMayusculas(mapStock);

            System.out.print("Ingrese pedido:");
            opcion = scanner.nextLine();

            if (mapPrecio.containsKey(opcion)) {
                System.out.printf("El precio para el item %s es %2f y su stock es %d", opcion,
                        mapPrecio.get(opcion), mapStock.get(opcion));
            }

        } while (mapPrecio.containsKey(opcion));

        scanner.close();
    }

    static ArrayList<String> crearLista() {
        var lista = new ArrayList<String>();

        lista.add("25.12USD,Chompa,3");
        lista.add("741.12USD,Polera,15");
        lista.add("9000.1USD,Casaca,2");
        lista.add("90.00USD,Zapato,1");

        return lista;
    }

    static HashMap<String, Double> crearMapPrecio(ArrayList<String> lista) {
        var map = new HashMap<String, Double>();

        for (var string : lista) {
            var item = Arrays.asList(string.split(","));
            var stringPrice = item.get(0).substring(0, item.get(0).indexOf("U"));
            map.put(item.get(1), Double.parseDouble(stringPrice));
        }

        return map;
    }

    static HashMap<String, Integer> crearMapStock(ArrayList<String> lista) {
        var map = new HashMap<String, Integer>();

        for (var string : lista) {
            var item = Arrays.asList(string.split(","));
            map.put(item.get(1), Integer.parseInt(item.get(2)));
        }

        return map;
    }

    static void imprimirKeysMayusculas(HashMap<String, Integer> map) {
        for (var set : map.entrySet()) {
            System.out.println(set.getKey().toUpperCase());
        }
    }
}
