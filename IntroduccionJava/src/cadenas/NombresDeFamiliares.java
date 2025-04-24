

// DetalleFactura.java
/*La tarea consiste en crear una clase llamada ProgramaManejoDeNombres de la siguiente manera:
Se requiere desarrollar un programa que reciba los nombres de 3 integrantes de tu familia o amigos como argumentos de línea de comandos.
Se pide por cada nombre de la persona una nueva variable del tipo String al tomar el segundo carácter pero convertido en mayúscula y se le concatena un punto y los dos últimos caracteres de la persona. Por ejemplo para Andres debe quedar como N.es
Debe imprimir como resultado los tres nuevos nombres separado con guion bajo (como una única variable).
Ejemplo, un resultado final esperado para los nombres Andres, Maria y Pepe podría ser:
N.es_A.ia_E.pe */

public class NombresDeFamiliares {
    public static void main(String[] args) throws Exception {
        String nombre1 = args[0];
        String nombre2 = args[1];
        String nombre3 = args[2];

        // Obtener el segundo carácter y convertirlo a mayúscula
        // hay q convertir primero a cadena con String.valueOf() y para poder usar el metodo toUpperCase()
        String segundoCaracter1 = String.valueOf(nombre1.charAt(1)).toUpperCase() + "." + nombre1.substring(nombre1.length() - 2); //si la cadena tien e menos de 2 caracteres va dar error
        String segundoCaracter2 = String.valueOf(nombre2.charAt(1)).toUpperCase() + "." + nombre2.substring(nombre2.length() - 2);
        String segundoCaracter3 = String.valueOf(nombre3.charAt(1)).toUpperCase() + "." + nombre3.substring(nombre3.length() - 2);

        // Concatenar los resultados con guion bajo
        System.out.println(segundoCaracter1 + "_" + segundoCaracter2 + "_" + segundoCaracter3);

    }
}
