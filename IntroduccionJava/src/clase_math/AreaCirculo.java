import javax.swing.JOptionPane;

public class AreaCirculo {

    public static void main(String[] args) {

        double radio = 0; // Radio del círculo
        radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio del círculo: "));

        double area = Math.PI * Math.pow(radio, 2); // Cálculo del área

        JOptionPane.showMessageDialog(null, "El área del círculo es: " + area + "cm2", "Área del Círculo", JOptionPane.INFORMATION_MESSAGE);


    }

}
