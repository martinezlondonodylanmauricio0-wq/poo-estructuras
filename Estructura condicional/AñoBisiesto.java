import java.util.Scanner;

public class AñoBisiesto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Parte 1: Evaluación del año bisiesto
        System.out.print("Ingresa un año (entero positivo): ");
        int anio = sc.nextInt();

        if (anio <= 0) {
            System.out.println("Error: El año debe ser un número entero positivo.");
        } else {
            if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
                System.out.println("El año " + anio + " ES bisiesto.");
            } else {
                System.out.println("El año " + anio + " NO es bisiesto.");
            }
        }

        System.out.println();

        // Parte 2: Conversión del día de la semana
        System.out.print("Ingresa un número del 1 al 7 para determinar el día: ");
        int diaNumero = sc.nextInt();
        String nombreDia;

        switch (diaNumero) {
            case 1: nombreDia = "lunes"; break;
            case 2: nombreDia = "martes"; break;
            case 3: nombreDia = "miércoles"; break;
            case 4: nombreDia = "jueves"; break;
            case 5: nombreDia = "viernes"; break;
            case 6: nombreDia = "sábado"; break;
            case 7: nombreDia = "domingo"; break;
            default: nombreDia = "Error: Número fuera de rango."; break;
        }

        System.out.println("Resultado día de la semana: " + nombreDia);

        sc.close();
    }
}