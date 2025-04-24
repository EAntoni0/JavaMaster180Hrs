import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

public class Menu {
    public static void main(String[] args) throws Exception {
        int opcionIndice = 0;

        // los Map (o mapas) los veremos mas adelante en el curso en profundidad
        // pero son como un arreglo asociativo, asocia un nombre (o indice) a un valor
        // también se les conoce como diccionarios para almacenar datos en base a un
        // nombre.
        Map<String, Integer> opciones = new HashMap();
        opciones.put("Actualizar", 1);
        opciones.put("Eliminar", 2);
        opciones.put("Agregar", 3);
        opciones.put("Listar", 4);
        opciones.put("Salir", 5);

        Object[] opArreglo = opciones.keySet().toArray();

        

        // aca un if o switch para las distintas opciones.
        do {

            Object opcion = JOptionPane.showInputDialog(null,
                "Seleccione un Opción",
                "Mantenedor de Productos",
                JOptionPane.INFORMATION_MESSAGE, null, opArreglo, opArreglo[0]);

            if (opcion == null) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar una operación");
            }

            opcionIndice = opciones.get(opcion.toString());

            switch (opcionIndice) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Producto Actualizado correctamente");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Producto Eliminado correctamente");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Producto Agregado correctamente");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Producto Listado correctamente");
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Has salido del programa");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
            }

        } while (opcionIndice != 5);

    }
}
