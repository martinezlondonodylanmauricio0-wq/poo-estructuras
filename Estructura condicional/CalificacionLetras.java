import java.util.Locale;
import java.util.Scanner;

public class CalificacionLetras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Ingresa la nota numérica (0.0 a 5.0): ");
        double nota = sc.nextDouble();

        if (nota < 0.0 || nota > 5.0) {
            System.out.println("Error: La nota debe estar en el rango de 0.0 a 5.0");
        } else {
            char letra;
            String descripcion;

            if (nota >= 4.6) {
                letra = 'A';
                descripcion = "Excelente";
            } else if (nota >= 4.0) {
                letra = 'B';
                descripcion = "Sobresaliente";
            } else if (nota >= 3.5) {
                letra = 'C';
                descripcion = "Aceptable";
            } else if (nota >= 3.0) {
                letra = 'D';
                descripcion = "Aprobado mínimo";
            } else {
                letra = 'F';
                descripcion = "Reprobado";
            }

            System.out.println("Letra: " + letra + " — " + descripcion);
        }

        sc.close();
    }
}