import java.util.Scanner;

public class SumaSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el número de términos : ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("El número debe ser mayor a 0.");
        } else {
            long sumaNaturales = 0;
            long sumaPares = 0;
            long sumaCuadrados = 0;

            for (int i = 1; i <= n; i++) {
                sumaNaturales += i;
                sumaPares += (2 * i);
                sumaCuadrados += (long) i * i;
            }

            // Fórmulas matemáticas cerradas correspondientes
            long formulaNaturales = (long) n * (n + 1) / 2;
            long formulaPares = (long) n * (n + 1);
            long formulaCuadrados = (long) n * (n + 1) * (2 * n + 1) / 6;

            System.out.println("\n1. Serie Naturales:");
            System.out.println("   Resultado ciclo:  " + sumaNaturales);
            System.out.println("   Fórmula [n(n+1)/2]: " + formulaNaturales);

            System.out.println("2. Serie Pares:");
            System.out.println("   Resultado ciclo:  " + sumaPares);
            System.out.println("   Fórmula [n(n+1)]:   " + formulaPares);

            System.out.println("3. Serie Cuadrados Perfectos:");
            System.out.println("   Resultado ciclo:  " + sumaCuadrados);
            System.out.println("   Fórmula [n(n+1)(2n+1)/6]: " + formulaCuadrados);
        }

        sc.close();
    }
}