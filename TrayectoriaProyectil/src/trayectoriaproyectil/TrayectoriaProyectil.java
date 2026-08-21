/* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template */
package trayectoriaproyectil;
import java.util.Scanner;
/* @author UserCP */
public class TrayectoriaProyectil {
    /* @param args the command line arguments */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String NOMBRE_SISTEMA = "SIMULACION DE LA TRAYECTORIA";
        final double G = 9.81; // formula aceleracion gravedad en m/s^2
        double v0 = 0;
        double anguloGrados = 0;

        do{
            System.out.print("-Ingrese velocidad inicial del proyectil (m/s): ");
            v0 = scanner.nextDouble();
            if (v0 <= 0) {
                System.out.println("-Error: La velocidad debe ser mayor a 0.");
            }
        }while(v0 <= 0);
        do{
            System.out.print("-Ingrese angulo de lanzamiento entre 1 y 89 grados: ");
            anguloGrados = scanner.nextDouble();
            if (anguloGrados <= 0 || anguloGrados >= 90) {
                System.out.println("-Error: El angulo debe ser entre 1 y 89 grados.");
            }
        }while(anguloGrados <= 0 || anguloGrados >= 90);
        
        double anguloRadianes = Math.toRadians(anguloGrados);
        double tMaximoTeorico = (v0 * Math.sin(anguloRadianes)) / G;
        System.out.println("------------------------------------");
        System.out.println("--- " + NOMBRE_SISTEMA + " ---");
        System.out.println("------------------------------------");
        double alturaPrevia = 0;
        boolean yaIndicoAlturaMaxima = false;
        
        for(int t = 1; t <= 10; t++){
            double altura = (v0 * Math.sin(anguloRadianes) * t) - (0.5 * G * Math.pow(t, 2));
            if (altura < 0) {
                System.out.printf("-Tiempo t = %d s: Altura = %.2f m -> Impacto en el suelo (...)\n", t, altura);
                break;
            }else{
                System.out.printf("-Tiempo t = %d s: Altura = %.2f m", t, altura);
                if (!yaIndicoAlturaMaxima && (altura < alturaPrevia || t >= Math.round(tMaximoTeorico))) {
                    System.out.print("-Altura maxima estimada cerca de este instante");
                    yaIndicoAlturaMaxima = true;
                }
                System.out.println();
            }
            alturaPrevia = altura;
        }
        scanner.close();
    }
}