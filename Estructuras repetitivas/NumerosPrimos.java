import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el límite inferior (a): ");
        int a = sc.nextInt();
        System.out.print("Ingresa el límite superior (b): ");
        int b = sc.nextInt();

        if (a >= b || a <= 0) {
            System.out.println("Asegúrate de que a < b y que ambos sean enteros positivos.");
        } else {
            int cantidadPrimos = 0;
            long sumaPrimos = 0;
            StringBuilder listaPrimos = new StringBuilder();

            for (int i = a; i <= b; i++) {
                if (i <= 1) continue; // El 1 y números menores no son primos

                boolean esPrimo = true;
                int divisor = 2;
                int raiz = (int) Math.sqrt(i);

                // Algoritmo eficiente con ciclo while interno hasta la raíz cuadrada
                while (divisor <= raiz) {
                    if (i % divisor == 0) {
                        esPrimo = false;
                        break;
                    }
                    divisor++;
                }

                if (esPrimo) {
                    cantidadPrimos++;
                    sumaPrimos += i;
                    if (listaPrimos.length() > 0) {
                        listaPrimos.append(", ");
                    }
                    listaPrimos.append(i);
                }
            }

            System.out.println("\nPrimos entre " + a + " y " + b + ": " + listaPrimos);
            System.out.println("Cantidad: " + cantidadPrimos);
            System.out.println("Suma: " + sumaPrimos);
        }

        sc.close();
    }
}