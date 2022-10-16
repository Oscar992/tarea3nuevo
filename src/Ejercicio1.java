import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        String opcion;

        do {
            imprimirMenu();

            System.out.print("Ingrese opcion:");
            opcion = scanner.nextLine();

            ejecutarOpcion(opcion);
        } while (!opcion.equals("Despedirse"));

        scanner.close();
    }

    static void imprimirMenu() {
        System.out.println("Saludarme");
        System.out.println("Hora");
        System.out.println("Comida");
        System.out.println("Despedirse");
    }

    static void ejecutarOpcion(String opcion) {
        switch (opcion) {
            case "Saludarme":
                System.out.println("Hola, ¿como estas?");
                break;
            case "Hora":
                System.out.println("Ok, te dire la hora");
                break;
            case "Comida":
                System.out.println("Es hora de comer ");
                break;
            case "Despedirse":
                System.out.println("Adios");
                break;
            default:
                System.out.println("Opcion Incorrecta");
        }
    }
}
