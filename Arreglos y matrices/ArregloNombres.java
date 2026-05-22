import java.util.Scanner;

public class ArregloNombres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] pacientes = new String[8];

        System.out.println("Ingresa el nombre de los 8 pacientes:");
        for (int i = 0; i < pacientes.length; i++) {
            System.out.print("Paciente " + (i + 1) + ": ");
            pacientes[i] = sc.nextLine();
        }

        System.out.print("\nIngresa el nombre del paciente que deseas buscar: ");
        String nombreBuscar = sc.nextLine();

        boolean encontrado = false;
        int posicionEncontrada = -1;

        for (int i = 0; i < pacientes.length; i++) {
            if (pacientes[i].equalsIgnoreCase(nombreBuscar)) {
                encontrado = true;
                posicionEncontrada = i;
                break; // Detener recorrido una vez hallado
            }
        }

        if (encontrado) {
            System.out.println("El paciente \"" + nombreBuscar + "\" se encuentra en la posición/índice: " + posicionEncontrada);
        } else {
            System.out.println("El paciente \"" + nombreBuscar + "\" no fue encontrado en la base de datos.");
        }

        sc.close();
    }
}