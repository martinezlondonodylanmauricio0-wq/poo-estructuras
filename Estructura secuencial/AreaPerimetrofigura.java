import java.util.Locale;
import java.util.Scanner;

public class AreaPerimetrofigura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        // Datos del rectángulo
        System.out.print("Ingresa la base del rectángulo: ");
        double base = sc.nextDouble();
        System.out.print("Ingresa la altura del rectángulo: ");
        double altura = sc.nextDouble();

        // Datos del círculo
        System.out.print("Ingresa el radio del círculo: ");
        double radio = sc.nextDouble();

        // Cálculos del rectángulo
        double areaRectangulo = base * altura;
        double perimetroRectangulo = 2 * (base + altura);

        // Cálculos del círculo
        double areaCirculo = Math.PI * Math.pow(radio, 2);
        double circunferencia = 2 * Math.PI * radio;

        System.out.println("\n--- Resultados Rectángulo ---");
        System.out.printf(Locale.US, "Área:      %.2f\n", areaRectangulo);
        System.out.printf(Locale.US, "Perímetro: %.2f\n", perimetroRectangulo);

        System.out.println("\n--- Resultados Círculo ---");
        System.out.printf(Locale.US, "Área:           %.2f\n", areaCirculo);
        System.out.printf(Locale.US, "Circunferencia: %.2f\n", circunferencia);

        sc.close();
    }
}