/* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template */
package ciclofor;
import java.util.Scanner;
/* @author UserCP */
/**
 * Objetivos 1. Utilizar la estructura del repeticion del ciclo for 2. Emplear
 * las constantes en programacion
 */
public class CicloFor {
    /* @param args the command line arguments */

    /**
     * Desarrollar un algoritmo que permita calcular el porcentaje de votantes
     * (varones y mujeres) que hay en una cabina
     */
    public static void main(String[] args) {
        // for de uno en uno
        for (int i = 0; i < 10; i++) {
            System.out.printf("Ciclo %d\n", i);
        }

        System.out.println();

        // for de dos en dos
        for (int i = 2; i < 10; i += 2) {
            System.out.printf("Ciclo %d\n", i);
        }

        Scanner input = new Scanner(System.in);
        int numeroVotantes = 10; // Valor tipo variable
        final int NUMEROVOTANTES = 20; // Valor tipo constante

        int numVarones = 0;
        int numMujeres = 0;
        char seleccion = '1';
        double porcentaje = 0;

        for (int i = 0; i < NUMEROVOTANTES; i++) {
            System.out.println("Genero de Votante");
            System.out.print("V: Varon | M: Mujer");
            seleccion = input.next().toUpperCase().charAt(0);
            switch (seleccion) {
                case 'V':
                    System.out.println("Varon Entrando");
                    System.out.println("a la cabina");
                    numVarones++;
                    break;

                case 'M':
                    System.out.println("Mujer Entrando");
                    System.out.println("a la cabina");
                    numMujeres++;
                    break;
                default:
                    System.out.println("ERROR de ingreso");
            }
        }
        
        porcentaje = (double)numVarones / NUMEROVOTANTES; /* CASTING agregar temporalmente (double)*/
        System.out.printf("Varones: %.2f %% \n",porcentaje*100);
        
        porcentaje = (double)numMujeres / NUMEROVOTANTES;
        System.out.printf("Mujeres: %.2f %% \n",porcentaje*100);
        
        /* se puede pasar de int a double */
        /* no se puede pasar de double a int */
        /* se puede pasar de char a string */
        /* no se puede pasar de string a char */
        /* se puede pasar de int a char */
        /* byte > short > int > long > float > double */
    }
}
