import java.util.Scanner;

public class Silla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el valor de n: ");
        int n = scanner.nextInt();

        if (n == 0) {
            System.out.println("ERROR");
            return;
        }

        for (int fila = 0; fila < n; fila++) {
            for (int columna = 0; columna < n; columna++) {
                // Primera columna
                if (columna == 0) {
                    System.out.print("1");
                }
                // Fila central
                else if (fila == n / 2) {
                    System.out.print("1");
                }
                // Parte derecha (última columna) desde fila central + 1 en adelante
                else if (columna == n - 1 && fila > n / 2) {
                    System.out.print("1");
                }
                // Espacios
                else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
