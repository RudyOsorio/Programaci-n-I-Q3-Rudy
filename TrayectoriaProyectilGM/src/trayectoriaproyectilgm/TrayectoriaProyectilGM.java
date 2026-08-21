/* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template */
package trayectoriaproyectilgm;
import java.util.Scanner;
/* @author UserCP */
public class TrayectoriaProyectilGM {
    /* @param args the command line arguments */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String NOMBRE_SISTEMA = "SIMULACION DE LA TRAYECTORIA";
        final double G = 9.81; // Aceleración de la gravedad en m/s^2

        System.out.println("------------------------------------");
        System.out.println("--- " + NOMBRE_SISTEMA + " ---");
        System.out.println("------------------------------------\n");

        // Lectura validada de datos de entrada
        double v0 = leerDoubleValido(scanner, "- Ingrese velocidad inicial del proyectil (m/s): ", 0.0001, Double.MAX_VALUE, "- Error: La velocidad debe ser un numero positivo mayor a 0.");
        double anguloGrados = leerDoubleValido(scanner, "- Ingrese angulo de lanzamiento entre 1 y 89 grados: ", 1, 89, "- Error: El angulo debe ser un numero entre 1 y 89 grados.");

        // Cálculos físicos exactos
        double anguloRadianes = Math.toRadians(anguloGrados);
        double tAlcanceTotal = (2 * v0 * Math.sin(anguloRadianes)) / G;
        double tMaximoTeorico = tAlcanceTotal / 2;
        double alturaMaximaTeorica = Math.pow(v0 * Math.sin(anguloRadianes), 2) / (2 * G);

        System.out.println("\n------------------------------------");
        System.out.printf("Tiempo total de vuelo: %.2f s\n", tAlcanceTotal);
        System.out.printf("Tiempo a altura maxima: %.2f s\n", tMaximoTeorico);
        System.out.printf("Altura maxima alcanzada: %.2f m\n", alturaMaximaTeorica);
        System.out.println("------------------------------------\n");

        // Simulación segundo a segundo dinámica (hasta el impacto real)
        int tMaxIteraciones = (int) Math.ceil(tAlcanceTotal);
        boolean yaIndicoAlturaMaxima = false;

        for (int t = 1; t <= tMaxIteraciones; t++) {
            double altura = (v0 * Math.sin(anguloRadianes) * t) - (0.5 * G * Math.pow(t, 2));
            if (altura < 0) {
                System.out.printf("- Tiempo t = %d s: Impacto en el suelo detectado.\n", t);
                break;
            }
            System.out.printf("- Tiempo t = %d s: Altura = %.2f m", t, altura);
            // Marcador de paso por el punto ápice
            if (!yaIndicoAlturaMaxima && t >= tMaximoTeorico) {
                System.out.print(" -> (Cerca del punto mas alto)");
                yaIndicoAlturaMaxima = true;
            }
            System.out.println();
        }
        scanner.close();
    }
    /* Función auxiliar para capturar números decimales de forma robusta frente a entradas no válidas. */
    private static double leerDoubleValido(Scanner scanner, String mensaje, double min, double max, String errorMensaje) {
        double valor = 0;
        boolean valido = false;

        do {
            System.out.print(mensaje);
            if (scanner.hasNextDouble()) {
                valor = scanner.nextDouble();
                if (valor >= min && valor <= max) {
                    valido = true;
                } else {
                    System.out.println(errorMensaje);
                }
            } else {
                System.out.println("- Error: Debe ingresar un valor numerico valido.");
                scanner.next(); // Limpiar entrada incorrecta del búfer
            }
        } while (!valido);
        return valor;
    }
}