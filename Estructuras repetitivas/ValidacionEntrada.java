import java.util.Scanner;

public class ValidacionEntrada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int edad = -1;

        // Bucle de validación para obligar la entrada correcta
        while (edad < 1 || edad > 120) {
            System.out.print("Por favor, ingresa tu edad (1 a 120): ");
            edad = sc.nextInt();

            if (edad < 1 || edad > 120) {
                System.out.println("Error: Edad fuera del rango permitido de vida humana.");
            }
        }

        String etapa;
        if (edad <= 12) {
            etapa = "Niñez";
        } else if (edad <= 17) {
            etapa = "Adolescencia";
        } else if (edad <= 25) {
            etapa = "Juventud";
        } else if (edad <= 59) {
            etapa = "Adultez";
        } else {
            etapa = "Tercera edad";
        }

        System.out.println("Clasificación de etapa de vida: " + etapa);

        sc.close();
    }
}