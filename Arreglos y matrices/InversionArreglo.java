import java.util.Scanner;

public class InversionArreglo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el tamaño del arreglo  (máximo 20): ");
        int n = sc.nextInt();

        if (n <= 0 || n > 20) {
            System.out.println("Tamaño de arreglo fuera de rango válido.");
        } else {
            int[] arreglo = new int[n];

            System.out.println("Ingresa los " + n + " elementos del arreglo:");
            for (int i = 0; i < n; i++) {
                System.out.print("Elemento [" + i + "]: ");
                arreglo[i] = sc.nextInt();
            }

            // Mostrar original
            System.out.print("\nOriginal:  ");
            for (int num : arreglo) {
                System.out.print(num + "  ");
            }
            System.out.println();

            // Inversión in-place (Intercambio en la misma estructura)
            for (int i = 0; i < n / 2; i++) {
                int aux = arreglo[i];
                arreglo[i] = arreglo[n - 1 - i];
                arreglo[n - 1 - i] = aux;
            }

            // Mostrar modificado
            System.out.print("Invertido: ");
            for (int num : arreglo) {
                System.out.print(num + "  ");
            }
            System.out.println();
        }

        sc.close();
    }
}