/* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template */
package sensordetemperatura;
import java.util.Scanner;
/* @author UserCP */
public class SensorDeTemperatura {
    /* @param args the command line arguments */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        // Nombre del sistema como constante | No cambia
        final String NOMBRE_SISTEMA = "SENSOR | REGISTRO DE TEMPERATURA";
        // Constantes del sistema | No cambian
        final double CERO_ABSOLUTO = -273.15;
        final double CENTINELA = 999;
        // Variables | Si cambian
        double sumaTemperaturas = 0;
        int contadorValidos = 0;

        // Inicialización para cálculo de máximo y mínimo
        double tempMaxima = Double.NEGATIVE_INFINITY;
        double tempMinima = Double.POSITIVE_INFINITY;
        double lectura = 0;
        
        /* contenido de lectura para el usuario */
        System.out.println("=====================================");
        System.out.println("= " + NOMBRE_SISTEMA + " =");
        System.out.println("=====================================");
        System.out.println("- Bienvenido usuario -");
        System.out.println("- Favor tomar nota de lo siguiente:");
        System.out.println("- Las temperaturas a ingresar deben ser en grados centigrados.");
        System.out.println("- Para guardar cada temperatura presione la tecla enter.");
        System.out.println("- Para finalizar e imprimir el registro ingrese 999.");
        System.out.println();
        
        while (lectura != CENTINELA) { /* cuando lectura no es igual a 999 */
            System.out.print("- temperatura: ");
            lectura = scanner.nextDouble();
            // Validamos
            if(lectura == CENTINELA) {
                // Sentinela detectado, el bucle finalizará en la siguiente evaluación
            }else if(lectura < CERO_ABSOLUTO) {
                System.out.println("-> [ERROR]: Temperatura no valida...");
                System.out.println("-> [ERROR]: No se pueden hacer registros menor al cero absoluto (-273.15 Grados C).");
                System.out.println("-> [ERROR]: Intente de nuevo por favor.");
            }else{
                // Lectura válida: Se procesa en las estadísticas
                sumaTemperaturas += lectura;
                contadorValidos++;
                if (lectura > tempMaxima) {
                    tempMaxima = lectura;
                }
                if (lectura < tempMinima) {
                    tempMinima = lectura;
                }
            }
        }
        // Impresión de resultados
        if (contadorValidos > 0) {
            double promedio = sumaTemperaturas / contadorValidos;
            double diferenciaTermica = tempMaxima - tempMinima;

            System.out.println("\n================ RESUMEN ================");
            System.out.println("Temperaturas registradas: " + contadorValidos);
            System.out.printf("Temperatura promedio: %.2f Grados C\n", promedio);
            System.out.printf("Temperatura mas alta: %.2f Grados C\n", tempMaxima);
            System.out.printf("Temperatura mas baja: %.2f Grados C\n", tempMinima);
            System.out.printf("Diferencia termica (Max - Min): %.2f Grados C\n", diferenciaTermica);
            System.out.println("=========================================");
        } else {
            System.out.println("\nNo existen temperaturas registradas durante este dia.");
            System.out.println(".......................................................");
            System.out.println();
        }
        scanner.close();
    }
}
