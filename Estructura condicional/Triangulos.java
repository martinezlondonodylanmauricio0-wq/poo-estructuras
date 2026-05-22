import java.util.Locale;
import java.util.Scanner;

public class Triangulos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Ingresa el lado 1: ");
        double l1 = sc.nextDouble();
        System.out.print("Ingresa el lado 2: ");
        double l2 = sc.nextDouble();
        System.out.print("Ingresa el lado 3: ");
        double l3 = sc.nextDouble();

        // 1. Validar si forman un triángulo
        if ((l1 + l2 > l3) && (l1 + l3 > l2) && (l2 + l3 > l1)) {
            System.out.print("El triángulo es válido y su tipo es: ");
            
            // 2. Clasificar
            if (l1 == l2 && l2 == l3) {
                System.out.println("Equilátero");
            } else if (l1 == l2 || l1 == l3 || l2 == l3) {
                System.out.println("Isósceles");
            } else {
                System.out.println("Escaleno");
            }
        } else {
            System.out.println("Los lados ingresados no forman un triángulo válido.");
        }

        sc.close();
    }
}