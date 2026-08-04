// Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
//Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template

package libreriamath;
import java.util.Scanner;

/* @author UserCP */
public class LibreriaMath {
    /* @param args the command line arguments */
    public static void main(String[] args) {
        // TODO code application logic here
        /* Calculos para un circulo */
        Scanner input = new Scanner(System.in);
        
        /* Declaramos variables */
        double radio = 0;
        double area = 0;
        double circunferencia = 0;
        
        /* Pedimos al usuario el radio del circulo */
        System.out.print("Ingresa el radio del circulo: ");
        radio = input.nextDouble();
        
        /* Calculamos el area usando Math.PI y Math.pow() donde area = PI*r al cuadrado */
        area = Math.PI * Math.pow(radio, 2);
        
        /* Calculamos la circunferencia donde (perimetro = 2 * PI * r) */
        circunferencia = 2 * Math.PI * radio;
        
        /* Imprimimos resultados */
        System.out.println("\n --- Resultados ---");
        System.out.printf("El area del circulo es: %.2f\n", area);
        System.out.printf("La circunferencia del circulo es: %.2f\n", circunferencia);
        
        input.close();
        
    }
    
}
