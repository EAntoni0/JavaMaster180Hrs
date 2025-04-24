
/*Suponiendo un estanque de gasolina (gas) con capacidad 70 litros, se requiere un programa que pida la medida actual en litros y mostrar el resultado de la forma: Insuficiente, Suficiente, Medio...
La medida o capacidad actual del estanque puede ser en tipo double, para una mejor precisión, pero tambien puede ser del tipo int.
Si la capacidad actual es 70 litros: imprimir Estanque lleno
Si está entre 60 y menor a 70: imprimir Estanque casi lleno
Si está entre 40 y menor a 60: imprimir Estanque  3/4
Si está entre 35 y menor a 40: imprimir Medio Estanque 
Si está entre 20 y menor a 35: imprimir Suficiente
Si está entre 1 y menor a 20: imprimir Insuficiente */

import java.util.Scanner;

public class EstanqueGasolina {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        double capacidadEstanque = 70.0;

        System.out.print("Ingrese la medida actual del estanque en litros: ");
        double medidaActual = scanner.nextDouble();

       if (capacidadEstanque == medidaActual) {
            System.out.println("Estanque lleno");
        } else if (medidaActual >= 60 && medidaActual < 70) {
            System.out.println("Estanque casi lleno");
        } else if (medidaActual >= 40 && medidaActual < 60) {
            System.out.println("Estanque 3/4");
        } else if (medidaActual >= 35 && medidaActual < 40) {
            System.out.println("Medio Estanque");
        } else if (medidaActual >= 20 && medidaActual < 35) {
            System.out.println("Suficiente");
        } else if (medidaActual > 0 && medidaActual < 20) {
            System.out.println("Insuficiente");
        } else {
            System.out.println("Medida no válida. Debe ser entre 0 y " + capacidadEstanque + " litros.");
        }

        scanner.close();
        
    }
}
