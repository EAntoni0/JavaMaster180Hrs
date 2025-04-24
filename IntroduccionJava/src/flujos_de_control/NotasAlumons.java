import java.util.Scanner;

public class NotasAlumons {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        double sumaNotas = 0;
        double promedioGeneral = 0;

        int notasMayoresA5 = 0;
        int notasMenoresA4 = 0;
        int notasIgualesA1 = 0;

        double sumaNotasMayoresA5 = 0;
        double sumaNotasMenoresA4 = 0;
        double sumaNotasIgualesA1 = 0;

        double promedioNotasMayoresA5 = 0;
        double promedioNotasMenoresA4 = 0;
        double promedioNotasIgualesA1 = 0;

        int cantidadNotas = 20;
        System.out.println("Las notas deben estar en la escala de 1 a 7");
        for (int i = 0; i < cantidadNotas; i++) {
            double nota = 0;
            while (true) {
                System.out.println("Ingresa la nota del alumno #" + (i + 1));
                nota = scanner.nextDouble();
                if (nota >= 1 && nota <= 7) {
                    sumaNotas += nota;
                    break;
                } else {
                    System.out.println("Nota inválida. Debe estar entre 1 y 7, intenta de nuevo:");
                }
            }

            if (nota > 5) {
                notasMayoresA5++;
                sumaNotasMayoresA5 += nota;
            }

            if (nota < 4) {
                notasMenoresA4++;
                sumaNotasMenoresA4 += nota;
            }

            if (nota == 1) {
                notasIgualesA1++;
                sumaNotasIgualesA1 += nota;
            }

        }

        promedioGeneral = sumaNotas / cantidadNotas;
        promedioNotasMayoresA5 = sumaNotasMayoresA5 / notasMayoresA5;
        promedioNotasMenoresA4 = sumaNotasMenoresA4 / notasMenoresA4;
        promedioNotasIgualesA1 = sumaNotasIgualesA1 / notasIgualesA1;

        System.out.println("El promedio general de las notas es: " + promedioGeneral);
        System.out.println("Numero de notas mayores a 5: " + notasMayoresA5
                + ", El promedio de las notas mayores a 5 es: " + promedioNotasMayoresA5);
        System.out.println("Numero de notas menores a 4: " + notasMenoresA4
                + ", El promedio de las notas menores a 4 es: " + promedioNotasMenoresA4);
        System.out.println("Numero de notas iguales a 1: " + notasIgualesA1
                + ", El promedio de las notas iguales a 1 es: " + promedioNotasIgualesA1);
    }
}
