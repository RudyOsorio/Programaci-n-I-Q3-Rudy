/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package donaciondesangre;

import java.util.Scanner;

/**
 *
 * @author UserCP
 */
public class DonacionDeSangre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
            * Desarrollar un algoritmo que permita determinar si
            * el usuario puede donar sangre o no, basandose en su edad (18 - 65)
            * y peso (Mas de 110 lbs).
            * 
            * Si se llega a cumplir los criterios antes expuestos, solo
            * se podra donar sangre si ha comido.
            * 
            * Otro elemento que se tiene que considerar para poder donar sangre
            * es tener el nivel de hierro/hemoglobina en la sangre en los 
            * niveles adecuados.
            * Para los hombres tiene que ser mas de 14 y las mujeres mas de 12
        **/
        
        //Declaracion de Variables:
        Scanner input = new Scanner(System.in);
        int edad = 0;
        int peso = 0;
        boolean desayuno = true;
        char respuesta = '0';
        int hierro = 0;
        String genero = "Masculino";
        
        System.out.println("Ingrese su edad:");
        edad = input.nextInt();
        
        System.out.println("Ingrese su peso en libras:");
        peso = input.nextInt();
        
        if(edad >= 18 && edad <= 65 && peso >= 110){
            /* Limpiamos buffer */
            input.nextLine();
            System.out.println("Si puede donar sangre! :) ");
            System.out.println("Ha desayunado? Si | No ");
            respuesta = input.nextLine().charAt(0);
            if(respuesta == 'S' || respuesta == 's'){
                System.out.println("Si puede donar sangre sin problemas! :) ");
            }else{
                System.out.println("Es necesario que desayunes, no puedes donar sangre! :( ");
            }
        }else{
            System.out.println("Lo sentimos... No puede donar sangre :( ");
        }
        
        /* Evaluando los niveles de hierro en sangre */
        System.out.println("Ingrese su nivel de hierro en sangre:");
        hierro = input.nextInt();
        input.nextLine();/* Limpiamos buffer */
        System.out.println("Ingrese su Genero:");
        genero = input.nextLine().toUpperCase();
        if((hierro >= 14 && genero.equals("MASCULINO")) || (hierro >= 12 && genero.equals("FEMENINO"))){
            System.out.println("Si puede donar sangre:");
        }else{
            System.out.println("No, no puede donar sangre:");
        }
        
    }
    
}
