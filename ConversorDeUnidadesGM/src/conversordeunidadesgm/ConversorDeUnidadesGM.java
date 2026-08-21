/* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template */
package conversordeunidadesgm;
import java.util.Scanner;
/* @author UserCP */
public class ConversorDeUnidadesGM {
    /* @param args the command line arguments */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        final String NOMBRE_SISTEMA = "CONVERSOR DE UNIDADES";
        int opcion = 0;
        double valor;

        do{
            System.out.println("\n=== " + NOMBRE_SISTEMA + " ===");
            System.out.println("1. Metros a Pies");
            System.out.println("2. Kilogramos a Libras");
            System.out.println("3. CentImetros a Pulgadas");
            System.out.println("4. Salir");
            System.out.print("-Ingrese una opcion: ");

            // Validación de entrada para evitar fallos si se ingresa texto
            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                if (opcion >= 1 && opcion <= 3) {
                    valor = pedirMagnitudValida(scanner);
                    // Procesamiento con constantes para mayor claridad
                    switch (opcion){
                        case 1 -> System.out.printf("-%.2f metros es: %.2f pies.%n", valor, valor * 3.28084);
                        case 2 -> System.out.printf("-%.2f kilogramos es: %.2f libras.%n", valor, valor * 2.20462);
                        case 3 -> System.out.printf("-%.2f centimetros es: %.2f pulgadas.%n", valor, valor * 0.393701);
                    }
                } else if (opcion != 4) {
                    System.out.println("-Error: Opcion fuera de rango (1-4). Intente nuevamente.");
                }
            } else {
                System.out.println("-Error: Debe ingresar un numero entero valido.");
                scanner.next(); // Limpia el búfer del scanner
            }

        } while (opcion != 4);

        System.out.println("........................................");
        System.out.println("-Fin de la ejecucion. Muchas gracias!");
        System.out.println("........................................");
        scanner.close();
    }

    // Función auxiliar para validar la magnitud y reutilizar código
    private static double pedirMagnitudValida(Scanner scanner) {
        double valor = -1;
        do {
            System.out.print("-Ingrese la magnitud a convertir (debe ser >= 0): ");
            if (scanner.hasNextDouble()) {
                valor = scanner.nextDouble();
                if (valor < 0) {
                    System.out.println("-Error: La magnitud no puede ser negativa.");
                }
            } else {
                System.out.println("-Error: Ingrese un valor numérico válido (ej. 10.5).");
                scanner.next(); // Limpia el valor no válido del búfer
            }
        } while (valor < 0);
        return valor;
    }
}