/* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template */
package calculadoraaritmetica;
import java.util.Scanner;

public class CalculadoraAritmetica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Lectura de los dos números enteros
        System.out.print("Ingrese el primer numero entero: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo numero entero: ");
        int num2 = scanner.nextInt();

        // Lectura del carácter del operador
        System.out.print("Ingrese el tipo de operacion que desea ejecutar: (+, -, *, /, %): ");
        char operador = scanner.next().charAt(0);

        double resultado = 0;
        boolean valido = true;

        // Estructura de selección
        switch (operador) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    resultado = (double) num1 / num2; // Conversión a decimal
                } else {
                    System.out.println("Error: La Division entre cero no es permitida.");
                    valido = false;
                }
                break;
            case '%':
                if (num2 != 0) {
                    resultado = num1 % num2;
                } else {
                    System.out.println("Error: Modulo entre cero no permitido.");
                    valido = false;
                }
                break;
            default:
                System.out.println("Operador no reconocido");
                valido = false;
                break;
        }

        if(valido){
            System.out.printf("El resultado es: %.2f%n", resultado);
        }
        scanner.close();
    }
}
