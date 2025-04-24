import java.util.Scanner;

public class NumeroMenorMultiplesValores {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int cantidadNumeros = 0;
        int numeroMenor = 0;

        System.out.println("ingresa la cantidad de numeros a comparar, minimo 10 valores: ");
        cantidadNumeros = scanner.nextInt();

        System.out.println("ingresa el primer numero: ");
        numeroMenor = scanner.nextInt();

        for (int i = 1; i < cantidadNumeros; i++) {
            System.out.println("ingresa el siguiente numero: ");
            int numeroActual = scanner.nextInt();
            if (numeroActual < numeroMenor) {
                numeroMenor = numeroActual;
            }
        }

    
        System.out.println("El menor de los " + cantidadNumeros + " numeros es: " + numeroMenor);

        if (numeroMenor < 10) {
            System.out.println("el numero menor es menor que 10");            
        } else {
            System.out.println("el numero menor es igual o mayor que 10");            
        }


    }
}
