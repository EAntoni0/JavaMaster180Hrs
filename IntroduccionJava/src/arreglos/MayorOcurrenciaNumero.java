import java.util.Random;

public class MayorOcurrenciaNumero {

    public static void main(String[] args) {
        int[] numeros = new int[10];
        Random random = new Random();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(9 - 1 + 1) + 1; // Genera números aleatorios entre 0 y 9
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println();

        int[] contador = new int[10]; // Contador para cada número del 0 al 9
        for (int i = 0; i < numeros.length; i++) {
            contador[numeros[i]]++; // Incrementa el contador para el número generado
        }

        int numeroMasRepetido = 1; // Variable para almacenar el número con mayor ocurrencia
        int mayorOcurrencia = contador[1]; // Variable para almacenar el número con mayor ocurrencia

        for (int i = 2; i < 9; i++) {
            if (contador[i] > mayorOcurrencia) {
                mayorOcurrencia = contador[i]; // Actualiza la mayor ocurrencia
                numeroMasRepetido = i; // Actualiza el número más repetido
            }
        }

        System.out.println("El número que más se repite es: " + numeroMasRepetido);
        System.out.println("El número de veces que se repite es: " + mayorOcurrencia);

    }

    

}
