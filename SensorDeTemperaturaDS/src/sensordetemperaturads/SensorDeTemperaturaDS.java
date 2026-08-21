/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sensordetemperaturads;

import java.util.InputMismatchException;
import java.util.Scanner;

/* @author UserCP */
public class SensorDeTemperaturaDS {
// Constantes del sistema
    private static final String NOMBRE_SISTEMA = "SENSOR | REGISTRO DE TEMPERATURA";
    private static final double CERO_ABSOLUTO = -273.15;
    private static final double CENTINELA = 999.0;

    public static void main(String[] args) {
        // Uso de try-with-resources para garantizar la liberación del Scanner
        try (Scanner scanner = new Scanner(System.in)) {
            
            // Variables de acumulación y control
            double sumaTemperaturas = 0;
            int contadorValidos = 0;
            double tempMaxima = Double.NEGATIVE_INFINITY;
            double tempMinima = Double.POSITIVE_INFINITY;

            // Mensajes iniciales e instrucciones
            mostrarEncabezado();

            // Ciclo de lectura con centinela
            while (true) {
                System.out.print("- temperatura: ");
                
                double lectura;
                try {
                    lectura = scanner.nextDouble();
                } catch (InputMismatchException e) {
                    System.out.println("-> [ERROR]: Debe ingresar un valor numérico válido.");
                    scanner.next(); // Limpia el buffer de entrada no válido
                    continue;
                }

                // Evaluación del centinela para salir del ciclo
                if (lectura == CENTINELA) {
                    break;
                }

                // Validaciones y procesamiento
                if (lectura < CERO_ABSOLUTO) {
                    System.out.println("-> [ERROR]: Temperatura no valida...");
                    System.out.println("-> [ERROR]: No se pueden hacer registros menor al cero absoluto (-273.15 Grados C).");
                    System.out.println("-> [ERROR]: Intente de nuevo por favor.");
                } else {
                    sumaTemperaturas += lectura;
                    contadorValidos++;

                    // Funciones integradas Math para optimizar legibilidad
                    tempMaxima = Math.max(tempMaxima, lectura);
                    tempMinima = Math.min(tempMinima, lectura);
                }
            }

            // Impresión de resultados
            mostrarResultados(contadorValidos, sumaTemperaturas, tempMaxima, tempMinima);
        }
    }

    private static void mostrarEncabezado() {
        System.out.println("=====================================");
        System.out.println("= " + NOMBRE_SISTEMA + " =");
        System.out.println("=====================================");
        System.out.println("- Bienvenido usuario -");
        System.out.println("- Favor tomar nota de lo siguiente:");
        System.out.println("- Las temperaturas a ingresar deben ser en grados centigrados.");
        System.out.println("- Para guardar cada temperatura presione la tecla enter.");
        System.out.println("- Para finalizar e imprimir el registro ingrese 999.");
        System.out.println();
    }

    private static void mostrarResultados(int contadorValidos, double sumaTemperaturas, double tempMaxima, double tempMinima) {
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
    }
}