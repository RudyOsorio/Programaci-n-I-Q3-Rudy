/* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template */

package descuentoentienda;
import java.util.Scanner;
/* @author UserCP */
public class DescuentoEnTienda {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        final String NOMBRE_SISTEMA = "SISTEMA DE CLASIFICACION DE DESCUENTOS";
        final int MAYORIA_EDAD = 18;
        final int MINORIA_EDAD = 12;
        final int EDAD_DESCUENTO = 65;
        
        final int DESCUENTO_20 = 20;
        final int DESCUENTO_15 = 15;
        final int DESCUENTO_10 = 10;
        
        int edad = 0;
        char membresia_premium = '1';
        double compra = 0.0;
        double factura = 0.0;
        
        System.out.println("==========================================");
        System.out.println("= " + NOMBRE_SISTEMA + " =");
        System.out.println("==========================================");
        
        System.out.println("Ingrese su edad: ");
        edad = input.nextInt();
        System.out.println("---------------------------------------");
        
        System.out.println("Tiene Membresia: S | N ");
        membresia_premium = input.next().toUpperCase().charAt(0);
        System.out.println("---------------------------------------");
        
        System.out.println("Factura a pagar por: ");
        compra = input.nextDouble();
        System.out.println("---------------------------------------");
        
        if(edad >= MAYORIA_EDAD){
            if(edad > EDAD_DESCUENTO || membresia_premium == 'S'){
                System.out.println("*Su factura de compra es de: L" + compra + ".");
                System.out.println("*Usted recibe un 20% de descuento.");
                factura = compra - ((compra * DESCUENTO_20)/100);
                System.out.println("*Valor a pagar: L" + factura + ".");
                System.out.println("---------------------------------------");
            }else{
                System.out.println("*Su factura de compra es de: L" + compra);
                System.out.println("*Usted recibe solo un 10% de descuento.");
                factura = compra - ((compra * DESCUENTO_10)/100);
                System.out.println("*Valor a pagar: L" + factura + ".");
                System.out.println("---------------------------------------");
            }
        }else{
            if(edad > MINORIA_EDAD && membresia_premium == 'S'){
                System.out.println("*Su factura de compra es de: L" + compra);
                System.out.println("*Usted recibe un 15% de descuento.");
                factura = compra - ((compra * DESCUENTO_15)/100);
                System.out.println("*Valor a pagar: L" + factura + ".");
                System.out.println("---------------------------------------");
            }else{
                System.out.println("Su factura de compra es de: L" + compra);
                System.out.println("Usted recibe 0% de descuento.");
                System.out.println("---------------------------------------");
            }
        }
    }
}
