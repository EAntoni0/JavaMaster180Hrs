
import javax.swing.JOptionPane;

public class OrdenarNumerosUltimoPrimero {
    public static void main(String[] args) {
        int[] numeros = new int[10]; // Arreglo para almacenar los números

        for (int i = 0; i < numeros.length; i++) {
            
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número " + (i + 1) + ": ")); // Leer el número desde la consola
        }

        System.out.println("Números en orden normal: ");
        for (int i = 0; i < numeros.length; i++) {
           System.out.println("Número " + (i + 1) + ": " + numeros[i]);     // Mostrar los números en orden normal
        }
        System.out.println(); // Línea en blanco para separar la salida
        System.out.println("Números en orden inverso: ");
 
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println("Número " + (i + 1) + ": " + numeros[i]);     // Mostrar los números en orden inverso
        }
    }
}
