import java.util.Locale;
import java.util.Scanner;

public class Conversióntemperatura {
    public static void main(String[] args) {
        // Se usa Locale.US para asegurar que el separador de decimales sea el punto
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Ingresa la temperatura en grados Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;
        double kelvin = celsius + 273.15;

        System.out.printf(Locale.US, "Celsius:    %.2f °C\n", celsius);
        System.out.printf(Locale.US, "Fahrenheit: %.2f °F\n", fahrenheit);
        System.out.printf(Locale.US, "Kelvin:     %.2f K\n", kelvin);

        sc.close();
    }
}