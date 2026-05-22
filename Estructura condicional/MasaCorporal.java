import java.util.Locale;
import java.util.Scanner;

public class MasaCorporal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Ingresa el peso en kilogramos: ");
        double peso = sc.nextDouble();

        System.out.print("Ingresa la estatura en metros: ");
        double estatura = sc.nextDouble();

        double imc = peso / Math.pow(estatura, 2);
        String categoria;

        if (imc < 18.5) {
            categoria = "Bajo peso";
        } else if (imc >= 18.5 && imc <= 24.9) {
            categoria = "Peso normal";
        } else if (imc >= 25.0 && imc <= 29.9) {
            categoria = "Sobrepeso";
        } else {
            categoria = "Obesidad";
        }

        System.out.printf(Locale.US, "\nTu IMC es: %.2f\n", imc);
        System.out.println("Categoría: " + categoria);

        sc.close();
    }
}