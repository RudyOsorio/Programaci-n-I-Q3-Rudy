/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
*/

package holamundoq3;

/*  @author UserCP */

public class HolaMundoQ3 {
    // Comentario con doble pleca
    /* Comentario con pleca y asterisco */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Todo el código debe de ir aquí.
        /*
        Objetivos:
        1. Imprimir en pantalla
            a. Diferentes formas para poder imprimir en pantalla.
            b. Caracteres de escape.
        2. Captura de Datos por parte del usuario
        */
        
        System.out.println("Hola... Saludos");
        System.out.println("Este es mi primer programa!");
        System.out.println("Yujuuuu... estoy con Java!");
        
        System.out.println("");
        System.out.println("");
        
        System.out.print("Rudy Adalid Osorio Sosa");
        System.out.print("Soy alumno de la clase de Programacion I");
        System.out.print("Un placer");
        
        System.out.println("");
        System.out.println("");
        
        System.out.printf("Esto es la clase de %S \n","programacion");
        //System.out.println("");
        
        System.out.printf("Esto es %S la clase de\n","programacion");
        //System.out.println("");
        
        System.out.printf("%S Esto es la clase de\n","programacion");
        //System.out.println("");
        
        System.out.println("");
        
        System.out.printf("Hola \n como \n estas \n en la clase de %s \n?","\n programacion");
        //System.out.println("");
        
        System.out.println("");
        
        System.out.printf("Hola \t como \t estas \t en la clase de %s \t?","\t programacion");
        //System.out.println("");
        
        // Variables
        int tiempo; // tipo entero %d
        double promedio; // tipo decimal
        String nombre; // tipo cadena %s
        char inicial; // tipo caracter - letra - digito numerico - caracter especial %c
        boolean estado; // tipo boleano (true - false) %b
        
        System.out.println("");
        System.out.println("");
        
        tiempo = 3;
        nombre = "Rudy";
        inicial = 'R';
        
        System.out.printf("Mi nombre es: %s \n", nombre);
        System.out.printf("%d veces a la semana recibo la clase \n", tiempo);
        System.out.printf("Te llamare %c inicial \n", inicial);

    }// Llave del fin de la función main
    
}// Llave del fin de la Class HolaMundoQ3
