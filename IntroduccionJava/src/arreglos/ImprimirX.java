import java.util.Scanner;

public class ImprimirX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el valor de n: ");
        int n = scanner.nextInt();

        if (n == 0) {
            System.out.println("ERROR");
            return; // Finaliza el programa
        }

        for (int fila = 0; fila < n; fila++) {
            for (int columna = 0; columna < n; columna++) {
                if (columna == fila || columna == (n - fila - 1)) {
                    System.out.print("X");
                } else {
                    System.out.print("_");
                }
            }
            System.out.println();
        }
    }
}
