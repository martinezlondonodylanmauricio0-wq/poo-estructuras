import java.util.Locale;
import java.util.Scanner;

public class CalculoNomina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Ingresa el nombre del empleado: ");
        String nombre = sc.nextLine();

        System.out.print("Ingresa las horas trabajadas en la semana: ");
        double horasTrabajadas = sc.nextDouble();

        System.out.print("Ingresa el valor de la hora: ");
        double valorHora = sc.nextDouble();

        double salarioBruto = horasTrabajadas * valorHora;
        double descuentoSS = salarioBruto * 0.08;
        double retencion = salarioBruto * 0.05;
        double salarioNeto = salarioBruto - descuentoSS - retencion;

        System.out.println("\n--- Resumen de Nómina ---");
        System.out.println("Empleado:           " + nombre);
        System.out.printf(Locale.US, "Horas trabajadas:   %.1f\n", horasTrabajadas);
        System.out.printf(Locale.US, "Salario bruto:      $ %.2f\n", salarioBruto);
        System.out.printf(Locale.US, "Descuento SS (8%):  $  %.2f\n", descuentoSS);
        System.out.printf(Locale.US, "Retención (5%):     $  %.2f\n", retencion);
        System.out.printf(Locale.US, "Salario neto:       $ %.2f\n", salarioNeto);

        sc.close();
    }
} 
    

