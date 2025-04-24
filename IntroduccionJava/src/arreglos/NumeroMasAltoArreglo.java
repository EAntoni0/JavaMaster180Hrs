import java.util.Random;

public class NumeroMasAltoArreglo {

    public static void main(String[] args) {
        Random random = new Random();
        int[] numeros = new int[7];
        int mayor = Integer.MIN_VALUE; // Inicializar mayor con el valor más bajo posible

        // Llenar el arreglo con números aleatorios entre 11 y 99
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(99 - 11 + 1) + 11; //Genera un número aleatorio entre 11 y 99 (ambos incluidos)
            if (numeros[i] > mayor) {
                mayor = numeros[i]; // Actualizar el número mayor si se encuentra uno más grande
            }
        }

        System.out.println("Los números generados son:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println("\nEl número mayor es: " + mayor); // Imprimir el número mayor encontrado
    }

}
