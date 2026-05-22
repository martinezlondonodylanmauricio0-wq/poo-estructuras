import java.util.Scanner;

public class TresenRaya {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char[][] tablero = new char[3][3];
        
        // Inicializar el tablero con espacios vacíos
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                tablero[f][c] = ' ';
            }
        }
        
        char jugadorActual = 'X';
        boolean juegoTerminado = false;
        int movimientosTotales = 0;

        System.out.println("¡Bienvenidos al juego de Tres en Raya!");

        while (!juegoTerminado) {
            // Mostrar tablero actual
            System.out.println("\nTablero:");
            for (int f = 0; f < 3; f++) {
                System.out.printf(" %c | %c | %c \n", tablero[f][0], tablero[f][1], tablero[f][2]);
                if (f < 2) {
                    System.out.println("-----------");
                }
            }

            // Solicitar coordenadas al jugador activo
            System.out.println("\nTurno del Jugador (" + jugadorActual + ")");
            System.out.print("Ingresa fila (0-2): ");
            int fila = sc.nextInt();
            System.out.print("Ingresa columna (0-2): ");
            int col = sc.nextInt();

            // 1. Validar rangos y celda disponible
            if (fila < 0 || fila > 2 || col < 0 || col > 2) {
                System.out.println("Coordenadas fuera del tablero. ¡Prueba de nuevo!");
                continue;
            }

            if (tablero[fila][col] != ' ') {
                System.out.println("Esa casilla ya está ocupada. ¡Elige otra!");
                continue;
            }

            // Realizar jugada
            tablero[fila][col] = jugadorActual;
            movimientosTotales++;

            // 3. Verificar si el jugador actual ganó
            boolean ganador = false;

            // Revisar filas y columnas
            for (int i = 0; i < 3; i++) {
                if ((tablero[i][0] == jugadorActual && tablero[i][1] == jugadorActual && tablero[i][2] == jugadorActual) ||
                    (tablero[0][i] == jugadorActual && tablero[1][i] == jugadorActual && tablero[2][i] == jugadorActual)) {
                    ganador = true;
                }
            }

            // Revisar diagonales
            if ((tablero[0][0] == jugadorActual && tablero[1][1] == jugadorActual && tablero[2][2] == jugadorActual) ||
                (tablero[0][2] == jugadorActual && tablero[1][1] == jugadorActual && tablero[2][0] == jugadorActual)) {
                ganador = true;
            }

            if (ganador) {
                System.out.println("\n--- ¡FIN DEL JUEGO! ---");
                System.out.println("El Jugador '" + jugadorActual + "' ha ganado la partida.");
                juegoTerminado = true;
            } else if (movimientosTotales == 9) { // 4. Comprobar si hay empate
                System.out.println("\n--- ¡FIN DEL JUEGO! ---");
                System.out.println("El tablero está lleno. Ha sido un Empate.");
                juegoTerminado = true;
            } else {
                // Alternar jugador
                jugadorActual = (jugadorActual == 'X') ? 'O' : 'X';
            }
        }

        // Mostrar tablero final en pantalla
        System.out.println("\nTablero Final:");
        for (int f = 0; f < 3; f++) {
            System.out.printf(" %c | %c | %c \n", tablero[f][0], tablero[f][1], tablero[f][2]);
            if (f < 2) System.out.println("-----------");
        }
        
        sc.close();
    }
}