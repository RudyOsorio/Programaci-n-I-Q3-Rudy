/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package promediofinalmaterias;
import java.util.Scanner;

/* @author UserCP */
public class PromedioFinalMaterias {
    /* @param args the command line arguments */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        /* Variables */
        String nombre = "Nombre";
        double materiaA = 0;
        double materiaB = 0;
        double promedio = 0;
        final double NOTABASE = 65;
        double suma = 0;
        
        System.out.println("=====================================");
        System.out.println("= SISTEMA DE APROBACION DE MATERIAS =");
        System.out.println("=====================================");
        
        System.out.println("Ingrese su nombre completo: ");
        nombre = input.nextLine();
        System.out.println("---------------------------------------");
        
        System.out.println();
        System.out.println("Ingrese la Nota de Programacion I: ");
        materiaA = input.nextDouble();
        System.out.println("---------------------------------------");
        
        System.out.println();
        System.out.println("Ingrese la Nota de Desarrollo Web: ");
        materiaB = input.nextDouble();
        System.out.println("---------------------------------------");
        
        promedio = (materiaA + materiaB) / 2;
        System.out.println("== Promedio alcanzado: " + promedio + " ==");
        System.out.println("---------------------------------------");
        
        if(promedio >= NOTABASE){
            System.out.println("Aprobado ;) ");
            System.out.println("---------------------------------------");
        }else{
            System.out.println("Reprobado :( ");
        }
        input.close();
    }   
}