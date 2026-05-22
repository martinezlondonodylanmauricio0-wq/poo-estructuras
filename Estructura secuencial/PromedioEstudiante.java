import java.util.Locale;
import java.util.Scanner;

public class PromedioEstudiante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Ingresa la nota del primer parcial (30%): ");
        double parcial1 = sc.nextDouble();

        System.out.print("Ingresa la nota del segundo parcial (30%): ");
        double parcial2 = sc.nextDouble();

        System.out.print("Ingresa la nota del examen final (40%): ");
        double examenFinal = sc.nextDouble();

        double notaDefinitiva = (parcial1 * 0.30) + (parcial2 * 0.30) + (examenFinal * 0.40);

        // Uso del operador ternario para determinar la condición sin usar estructuras 'if'
        String estado = (notaDefinitiva >= 3.0) ? "APROBADO" : "REPROBADO";

        System.out.printf(Locale.US, "\nNota definitiva: %.2f\n", notaDefinitiva);
        System.out.println("Estado del estudiante: " + estado);

        sc.close();
    }
}