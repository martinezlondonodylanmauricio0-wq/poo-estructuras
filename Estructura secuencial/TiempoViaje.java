import java.util.Scanner;

public class TiempoViaje {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa la cantidad de minutos totales: ");
        int minutosTotales = sc.nextInt();

        int horas = minutosTotales / 60;
        int minutosRestantes = minutosTotales % 60;
        int segundos = 0; // Dado que la entrada inicial está puramente en minutos

        long segundosTotales = (long) minutosTotales * 60;

        System.out.println("\nTiempo ingresado: " + minutosTotales + " minutos");
        System.out.println("Equivale a:       " + horas + " horas, " + minutosRestantes + " minutos, " + segundos + " segundos");
        System.out.println("En segundos:      " + segundosTotales + " segundos");

        sc.close();
    }
}