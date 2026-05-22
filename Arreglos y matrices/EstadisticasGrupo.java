import java.util.Locale;
import java.util.Scanner;

public class EstadisticasGrupo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        double[] notas = new double[10];
        double sumaTotal = 0;

        System.out.println("Ingresa las 10 notas de los estudiantes (0.0 a 5.0):");
        for (int i = 0; i < notas.length; i++) {
            while (true) {
                System.out.print("Estudiante " + (i + 1) + ": ");
                double notaIngresada = sc.nextDouble();
                if (notaIngresada >= 0.0 && notaIngresada <= 5.0) {
                    notas[i] = notaIngresada;
                    sumaTotal += notaIngresada;
                    break;
                }
                System.out.println("Error: Nota inválida, intenta de nuevo.");
            }
        }

        double promedio = sumaTotal / notas.length;
        double notaMasAlta = notas[0];
        int posicionAlta = 0;
        double notaMasBaja = notas[0];
        int posicionBaja = 0;
        int aprobados = 0;
        int reprobados = 0;

        for (int i = 0; i < notas.length; i++) {
            // Evaluar más alta
            if (notas[i] > notaMasAlta) {
                notaMasAlta = notas[i];
                posicionAlta = i;
            }
            // Evaluar más baja
            if (notas[i] < notaMasBaja) {
                notaMasBaja = notas[i];
                posicionBaja = i;
            }
            // Evaluar estado académico
            if (notas[i] >= 3.0) {
                aprobados++;
            } else {
                reprobados++;
            }
        }

        System.out.printf(Locale.US, "\nPromedio del grupo: %.2f\n", promedio);
        System.out.println("Nota más alta: " + notaMasAlta + " (Posición/Índice: " + posicionAlta + ")");
        System.out.println("Nota más baja: " + notaMasBaja + " (Posición/Índice: " + posicionBaja + ")");
        System.out.println("Estudiantes aprobados: " + aprobados);
        System.out.println("Estudiantes reprobados: " + reprobados);

        sc.close();
    }
}