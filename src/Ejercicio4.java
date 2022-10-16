import java.util.ArrayList;
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

            if (mapPrecio.get(opcion) != null) {
                System.out.println(String.format("El precio para el item %s es %2f y su stock es %d", opcion,
                        mapPrecio.get(opcion), mapStock.get(opcion)));
            }

        } while (mapPrecio.get(opcion) != null);

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

        for (String string : lista) {
            var item = string.split(",");
            var priceusd = item[0].split("U");
            map.put(item[1], Double.parseDouble(priceusd[0]));
        }

        return map;
    }

    static HashMap<String, Integer> crearMapStock(ArrayList<String> lista) {
        var map = new HashMap<String, Integer>();

        for (String string : lista) {
            var item = string.split(",");
            map.put(item[1], Integer.parseInt(item[2]));
        }
        
        return map;
    }

    static void imprimirKeysMayusculas(HashMap<String, Integer> map) {
        for (var set : map.entrySet()) {
            System.out.println(set.getKey().toUpperCase());
        }
    }
}
