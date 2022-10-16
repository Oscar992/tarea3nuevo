import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var lista = crearLista();
        int opcion;

        do {
            imprimirLista(lista);

            System.out.print("Ingrese numero:");
            opcion = scanner.nextInt();

            try {
                System.out.println(lista.get(opcion));
            } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                System.out.println("Index no existe");
            }

        } while (opcion != -1);

        scanner.close();
    }

    static ArrayList<String> crearLista() {
        var lista = new ArrayList<String>();

        lista.add("Hola");
        lista.add("Mundo");
        lista.add("Aloha");
        lista.add("Bota Vieja");

        return lista;
    }

    static void imprimirLista(ArrayList<String> lista) {
        for (String string : lista) {
            System.out.println(lista.indexOf(string) + " " + string);
        }
    }
}
