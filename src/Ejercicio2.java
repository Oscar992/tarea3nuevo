import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var map = crearMap();
        int opcion;

        do {
            imprimirKey(map);

            System.out.print("Ingrese numero:");
            opcion = scanner.nextInt();

            if (map.get(opcion) != null) {
                System.out.println(map.get(opcion));
            } else if (opcion != -1) {
                System.out.println("Eso no existe");
            }

        } while (opcion != -1);

        scanner.close();
    }

    static HashMap<Integer, String> crearMap() {
        var map = new HashMap<Integer, String>();

        map.put(1, "Uno");
        map.put(2, "Dos");
        map.put(3, "Tres");
        map.put(4, "Cuatro");
        map.put(5, "Cinco");

        return map;
    }

    static void imprimirKey(HashMap<Integer, String> map) {
        for (var set : map.entrySet()) {
            System.out.println(set.getKey());
        }
    }
}
