import java.util.Scanner;

public class AdivinaNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroSecreto = (int) (Math.random() * 100) + 1;
        int intentos = 0;
        int intentoUsuario = 0;

        System.out.println("Adivina el número (entre 1 y 100):");

        while (intentoUsuario != numeroSecreto) {
            intentos++;
            System.out.print("Intento " + intentos + ": ");
            intentoUsuario = sc.nextInt();

            if (intentoUsuario < numeroSecreto) {
                System.out.println("→ El número es mayor.");
            } else if (intentoUsuario > numeroSecreto) {
                System.out.println("→ El número es menor.");
            } else {
                System.out.println("¡Correcto! Lo lograste en " + intentos + " intentos.");
            }
        }

        sc.close();
    }
}