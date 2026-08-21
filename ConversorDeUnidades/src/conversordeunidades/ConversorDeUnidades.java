/* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template*/
package conversordeunidades;
import java.util.Scanner;
/* @author UserCP */
public class ConversorDeUnidades{
    /* @param args the command line arguments */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        /* constante y variables de referencia */
        final String NOMBRE_SISTEMA = "CONVERSOR DE UNIDADES";
        int opcion;
        double pies;
        double valor;
        double libras;
        double pulgadas;
        
        /* ejecutamos */
        do{
            System.out.println("==============================");
            System.out.println("=== " + NOMBRE_SISTEMA + " ===");
            System.out.println("==============================");
            System.out.println("1. Metros a Pies");
            System.out.println("2. Kilogramos a Libras");
            System.out.println("3. Centimetros a Pulgadas");
            System.out.println("4. Salir");
            System.out.print("-Ingrese una opcion: ");
       
            opcion = scanner.nextInt();
            if(opcion >= 1 && opcion <= 3){
                do{
                    System.out.print("-Ingrese el valor a convertir: ");
                    valor = scanner.nextDouble();
                    if (valor < 0) {
                        System.out.println("-Error: El valor no puede ser negativo.");
                        System.out.println("-Error: Intente de nuevo por favor.");
                    }
                }while(valor < 0);
                switch(opcion){
                    case 1:
                        pies = valor * 3.28084;
                        System.out.printf("-%.2f metros es: %.2f pies.%n", valor, pies);
                        System.out.println();
                        break;
                    case 2:
                        libras = valor * 2.20462;
                        System.out.printf("-%.2f kilogramos es: %.2f libras.%n", valor, libras);
                        System.out.println();
                        break;
                    case 3:
                        pulgadas = valor * 0.393701;
                        System.out.printf("-%.2f centimetros es: %.2f pulgadas.%n", valor, pulgadas);
                        System.out.println();
                        break;
                }
            }else if(opcion != 4){
                System.out.println("-La opcion no es valida, seleccione un número del 1 al 4.");
                System.out.println();
            }
        }while(opcion != 4);
        System.out.println();
        System.out.println("........................................");
        System.out.println("-Fin de la ejecucion. Muchas gracias!");
        System.out.println("........................................");
        scanner.close();
    }
}