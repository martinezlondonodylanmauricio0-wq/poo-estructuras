import java.util.Scanner;

public class TarifaParqueadero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Seleccione el tipo de vehículo:");
        System.out.println("1 = Moto");
        System.out.println("2 = Carro");
        System.out.println("3 = Camioneta");
        System.out.print("Opción: ");
        int tipo = sc.nextInt();

        System.out.print("Ingresa las horas de permanencia: ");
        int horas = sc.nextInt();

        if (horas <= 0) {
            System.out.println("Error: El número de horas debe ser mayor a 0.");
        } else {
            int tarifaPrimeraHora = 0;
            int tarifaHoraAdicional = 0;
            boolean opcionValida = true;

            switch (tipo) {
                case 1:
                    tarifaPrimeraHora = 2000;
                    tarifaHoraAdicional = 1500;
                    break;
                case 2:
                    tarifaPrimeraHora = 4000;
                    tarifaHoraAdicional = 3000;
                    break;
                case 3:
                    tarifaPrimeraHora = 5000;
                    tarifaHoraAdicional = 4000;
                    break;
                default:
                    opcionValida = false;
                    System.out.println("Opción de vehículo no es válida.");
                    break;
            }

            if (opcionValida) {
                int totalAPagar = tarifaPrimeraHora + (horas - 1) * tarifaHoraAdicional;
                System.out.println("El valor total a pagar es: $ " + totalAPagar);
            }
        }

        sc.close();
    }
}