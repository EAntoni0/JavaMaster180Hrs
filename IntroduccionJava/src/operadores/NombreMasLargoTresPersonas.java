import java.util.Scanner;

import javax.swing.JOptionPane;

public class NombreMasLargoTresPersonas {
    public static void main(String[] args) throws Exception {


        String nombre1, nombre2, nombre3;

        nombre1 = JOptionPane.showInputDialog("Ingrese el primer nombre: ");
        nombre2 = JOptionPane.showInputDialog("Ingrese el segundo nombre: ");
        nombre3 = JOptionPane.showInputDialog("Ingrese el tercer nombre: ");


        String max = nombre1.split(" ")[0].length() < nombre2.split(" ")[0].length() ? nombre2 : nombre1;
        max = (nombre3.split(" ")[0].length() < max.split(" ")[0].length()) ? max: nombre3;

        JOptionPane.showMessageDialog(null, "El nombre más largo es: " + max);
        
    }
}
