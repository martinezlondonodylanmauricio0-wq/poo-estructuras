import java.util.Scanner;

public class TablaMultiplicar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un número entero positivo 7: ");
        int n = sc.nextInt();

        if (n <= 0) {

            System.out.println("Por favor ingresa un número entero positivo.");

        } else {

            System.out.println("\n--- Tabla del " + n + " del 1 al 12 ---");

            for (int i = 1; i <= 12; i++) {

                System.out.printf("%d x %d = %d\n", n, i, (n * i));

            }

            System.out.println("\n--- Cuadrícula de tablas de multiplicar ---");

            for (int i = 1; i <= n; i++) {

                for (int j = 1; j <= 12; j++) {

                    System.out.printf("%4d", (i * j));

                }

                System.out.println();
            }
        }

        sc.close();
    }
}