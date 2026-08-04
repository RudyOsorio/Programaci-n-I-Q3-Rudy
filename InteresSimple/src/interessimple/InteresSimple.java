/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/* INTERES SIMPLE */

package interessimple;
import java.util.Scanner;

/* @author UserCP */
public class InteresSimple {
    /* @param args the command line arguments */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        /* Declaramos las variables */
        double capital = 0;
        int tasa = 0;
        double tiempo = 0;
        double interes = 0;
        
        /* Solicitamos los datos al usuario */
        System.out.print("Ingrese el capital inicial: ");
        capital = input.nextDouble();
        
        System.out.print("Ingrese la tasa de interes anual en numero entero Ej. 5 : ");
        tasa = input.nextInt();
        
        System.out.print("Ingrese el tiempo en años: ");
        tiempo = input.nextDouble();
        
        /* Aplicamos la formula del interes simple */
        interes = (capital * tasa * tiempo) / 100;
        
        /* Mostramos el resultado en pantalla */
        System.out.printf("El interes generado es: %.2f%n", interes);
        
        input.close();
        
    }
    
}