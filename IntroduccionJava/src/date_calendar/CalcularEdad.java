package date_calendar;

import java.io.StringReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CalcularEdad {

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);

        String fechaNacimiento;
        System.out.print("Ingrese su fecha de nacimiento (dd/MM/yyyy): ");
        fechaNacimiento = scanner.next();

        DateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");

        Date fecha = formatoFecha.parse(fechaNacimiento);
        Date fechaActual = new Date();

        formatoFecha = new SimpleDateFormat("yyyyMMdd");
        int desde = Integer.parseInt(formatoFecha.format(fecha));
        int hasta = Integer.parseInt(formatoFecha.format(fechaActual));
        int edad = (hasta - desde) / 10000; // Dividir por 10000 para obtener la edad en años
        System.out.println("Su edad es: " + edad + " años.");

    }

}
