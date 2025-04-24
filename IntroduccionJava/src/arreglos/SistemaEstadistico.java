import java.util.Scanner;

public class SistemaEstadistico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[7];
        double sumaPositivos = 0;
        double sumaNegativos = 0;

        int contadorPositivos = 0;
        int contadorNegativos = 0;

        int numeroDeCeros = 0;

        double promedioPositivos = 0;
        double promedioNegativos = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();

            if (numeros[i] > 0) {
                sumaPositivos += numeros[i];
                contadorPositivos++;
            } else if (numeros[i] < 0) {
                sumaNegativos += numeros[i];
                contadorNegativos++;
            } else {
                numeroDeCeros++;
            }
        }

        promedioPositivos = sumaPositivos / contadorPositivos;
        promedioNegativos = sumaNegativos / contadorNegativos;

        System.out.println("El total de números positivos es: " + contadorPositivos);
        System.out.println("Promedio de números positivos: " + promedioPositivos);
        System.out.println("El total de números negativos es: " + contadorNegativos);
        System.out.println("Promedio de números negativos: " + promedioNegativos);

        System.out.println("El total de números cero es: " + numeroDeCeros);
    }
}
