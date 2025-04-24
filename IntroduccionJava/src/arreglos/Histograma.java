import java.util.Random;

public class Histograma {
    public static void main(String[] args) {
        int[] numeros = new int[12];
        Random random = new Random();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(6 - 1 + 1) + 1; // Genera números aleatorios entre 1 y 6
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println();

        int[] contador = new int[7];
        for (int i = 0; i < numeros.length; i++) {
            contador[numeros[i]]++; // Incrementa el contador para el número generado
        }

        System.out.println("Histograma:");
        for (int i = 1; i < contador.length; i++) {
            System.out.print(i + ": ");
            for (int j = 0; j < contador[i]; j++) {
                System.out.print("*"); // Imprime un asterisco por cada ocurrencia
            }
            System.out.println(" (" + contador[i] + ")"); // Imprimir el número de ocurrencias
        }
    }
}
