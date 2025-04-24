
/*El desafío es un programa que pida dos números y los muestre ordenados de mayor a menor.
Podría ser utilizando operador ternario. */

import java.util.Scanner;

public class NumerosOrdenados {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();

        // Usando operador ternario para ordenar los números
        String resultado = (numero1 > numero2) ? "Los números ordenados de mayor a menor son: " + numero1 + ", " + numero2
                : "Los números ordenados de mayor a menor son: " + numero2 + ", " + numero1;

        System.out.println(resultado);

    }
}
