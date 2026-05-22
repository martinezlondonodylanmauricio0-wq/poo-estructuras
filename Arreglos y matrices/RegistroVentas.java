import java.util.Scanner;

public class RegistroVentas{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 4 Sucursales (Filas) x 3 Productos (Columnas)
        int[][] ventas = new int[4][3];

        // Llenar la matriz
        System.out.println("--- Ingreso de registro de ventas ---");
        for (int f = 0; f < 4; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.print("Sucursal " + (f + 1) + ", Producto " + (c + 1) + ": $ ");
                ventas[f][c] = sc.nextInt();
            }
        }

        // Variables para la venta más alta
        int ventaMasAlta = ventas[0][0];
        int sucursalAlta = 0;
        int productoAlto = 0;

        // Calcular e imprimir ventas por sucursal (Suma de Filas)
        System.out.println("\n--- Ventas por sucursal ---");
        for (int f = 0; f < 4; f++) {
            int totalSucursal = 0;
            for (int c = 0; c < 3; c++) {
                totalSucursal += ventas[f][c];

                // Evaluar venta más alta general
                if (ventas[f][c] > ventaMasAlta) {
                    ventaMasAlta = ventas[f][c];
                    sucursalAlta = f;
                    productoAlto = c;
                }
            }
            System.out.println("Sucursal " + (f + 1) + ": $ " + totalSucursal);
        }

        // Calcular e imprimir ventas por producto (Suma de Columnas)
        System.out.println("\n--- Ventas por producto ---");
        for (int c = 0; c < 3; c++) {
            int totalProducto = 0;
            for (int f = 0; f < 4; f++) {
                totalProducto += ventas[f][c];
            }
            System.out.println("Producto " + (c + 1) + ": $ " + totalProducto);
        }

        System.out.println("\n-------------------------------------------");
        System.out.println("Venta más alta: $ " + ventaMasAlta + " (Sucursal " + (sucursalAlta + 1) + ", Producto " + (productoAlto + 1) + ")");

        sc.close();
    }
}