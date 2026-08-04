/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package claculoderectangulo;
import java.util.Scanner;

/* @author UserCP */
public class ClaculoDeRectangulo {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        /* Declaramos variables */
        int base = 0;
        int altura = 0;
        double area = 0;
        double perimetro = 0;
        
        /* Solicitamos los datos al usuario*/
        System.out.print("Por favor ingrese la base del rectangulo: ");
        base = input.nextInt();
        
        System.out.print("Por favor ingrese la altura del rectangulo: ");
        altura = input.nextInt();
        
        /* Realizamos los calculos */
        area = base * altura;
        perimetro = 2 * (base + altura);
        
        /* Imprimimos resultados */
        System.out.println("\n --- Resultados ---");
        System.out.println("El area del rectangulo es: " + area);
        System.out.println("El perimetro del rectangulo es: " + perimetro);
        
        input.close();
    }
    
}