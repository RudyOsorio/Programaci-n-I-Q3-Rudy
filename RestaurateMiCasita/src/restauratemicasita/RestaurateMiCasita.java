/* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template */
/* @author UserCP */

package restauratemicasita;
import java.util.Scanner;
import java.util.ArrayList;

public class RestaurateMiCasita {
    
    // Listas acumuladoras para el pedido y sus costos
    private static ArrayList<String> productosSeleccionados = new ArrayList<>();
    private static ArrayList<Double> preciosSeleccionados = new ArrayList<>();

    /* @param args the command line arguments*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Constantes y Variables
        final String NOMBRE_SISTEMA = "RESTAURANTE MI CASITA";
        int opcionPrincipal = 0;
        
        while(opcionPrincipal != 5){
            System.out.println("===========================================");
            System.out.println("====       " + NOMBRE_SISTEMA + "       ====");
            System.out.println("===========================================");
            System.out.println("...........................................");
            System.out.println(".  Seleccione una opcion                  .");
            System.out.println(".  ----------------------                 .");
            System.out.println(".  1. Ver Menu                            .");
            System.out.println(".  2. Reservar Mesa                       .");
            System.out.println(".  3. Asignar Mesero                      .");
            System.out.println(".  4. Imprimir Factura                    .");
            System.out.println(".  5. Salir                               .");
            System.out.println("...........................................");
            if(scan.hasNextInt()){
                opcionPrincipal = scan.nextInt();
                switch(opcionPrincipal){
                    case 1:
                        mostrarSubmenuMenu(scan);
                    break;
                    case 2:
                        System.out.println("\n[Módulo de Reserva de Mesas]");
                    break;
                    case 3:
                        System.out.println("\n[Módulo de Asignación de Mesero Exclusivo]");
                    break;
                    case 4:
                        imprimirFactura();
                    break;
                    case 5:
                        System.out.println(".  Gracias por preferirnos!               .");
                    break;
                    default:
                        System.out.println(".  Opcion no valida. Intente de nuevo.    .");
                }
            }else{
                System.out.println(".  Entrada invalida. Seleccione un numero .");
                scan.next();
            }
        }
        scan.close();
    }// fin main
    
    private static void mostrarSubmenuMenu(Scanner scanner){
        int opcionCategoria = 0;
        while(opcionCategoria != 4){
            System.out.println("...........................................");
            System.out.println(".  Menu | Seleccione una opcion           .");
            System.out.println(".  -------------------------------        .");
            System.out.println(".  1. Entradas:                           .");
            System.out.println(".  2. Platillos fuertes:                  .");
            System.out.println(".  3. Especialidad de la casa:            .");
            System.out.println(".  4. Volver al menu principal            .");
            System.out.println("...........................................");
            
            if(scanner.hasNextInt()){
                opcionCategoria = scanner.nextInt();
                switch(opcionCategoria){
                    case 1:
                        mostrarEntradas(scanner);
                        break;
                    case 2:
                        mostrarPlatillosFuertes(scanner);
                        break;
                    case 3:
                        mostrarEspecialidades(scanner);
                        break;
                    case 4:
                        System.out.println(".  Regresando...                          .");
                        break;
                    default:
                        System.out.println(".  Opción no valida.                      .");
                }
            }else{
                System.out.println(".  Entrada invalida. Seleccione un numero .");
                scanner.next();
            }
        }
    }//fin sub menu
    
    private static void mostrarEntradas(Scanner scanner){
        System.out.println(".......................................................");
        System.out.println(".  Menu de Entradas | Seleccione una opcion           .");
        System.out.println(".  ----------------------------------------           .");
        System.out.println(".  1. Sopa de Tomate Rustica:                 L 70.00 .");
        System.out.println(".  2. Bruschetta Clasica de Queso y Tomate:   L 90.00 .");
        System.out.println(".  3. Calamares Crujientes con Salsa Tartara: L190.00 .");
        System.out.println(".  4. Tabla de Embutidos y Quesos:            L210.00 .");
        System.out.println(".  5. Ensalada Cesar Individual:              L150.00 .");
        System.out.println(".......................................................");
        if(scanner.hasNextInt()){
            int entradaSeleccionada = scanner.nextInt();
            switch(entradaSeleccionada) {
                case 1:
                    agregarProducto("Sopa de Tomate Rustica", 70.00);
                    break;
                case 2:
                    agregarProducto("Bruschetta Clasica de Queso y Tomate", 90.00);
                    break;
                case 3:
                    agregarProducto("Calamares Crujientes con Salsa Tartara", 190.00);
                    break;
                case 4:
                    agregarProducto("Tabla de Embutidos y Quesos", 210.00);
                    break;
                case 5:
                    agregarProducto("Ensalada Cesar Individual", 150.00);
                    break;
                default:
                    System.out.println(".  Opcion de entrada fuera de rango.      .");
            }
        }else{
            System.out.println(".  Entrada invalida.                      .");
            scanner.next();
        }
    }// fin mostrar entradas
    
    private static void mostrarPlatillosFuertes(Scanner scanner){
        System.out.println(".......................................................");
        System.out.println(".  Menu Platillos Fuertes | Seleccione una opcion     .");
        System.out.println(".  ----------------------------------------           .");
        System.out.println(".  1. Filete Mignon:                          L240.00 .");
        System.out.println(".  2. Salmon a la Plancha:                    L350.00 .");
        System.out.println(".  3. Lasagna:                                L220.00 .");
        System.out.println(".  4. Risoto:                                 L180.00 .");
        System.out.println(".  5. Tacos gourmet:                          L140.00 .");
        System.out.println(".......................................................");
        if(scanner.hasNextInt()){
            int entradaSeleccionada = scanner.nextInt();
            switch(entradaSeleccionada) {
                case 1:
                    agregarProducto("Filete Mignon", 240.00);
                    break;
                case 2:
                    agregarProducto("Salmon a la Plancha", 350.00);
                    break;
                case 3:
                    agregarProducto("Lasagna", 220.00);
                    break;
                case 4:
                    agregarProducto("Risoto", 180.00);
                    break;
                case 5:
                    agregarProducto("Tacos gourmet", 140.00);
                    break;
                default:
                    System.out.println(".  Opcion de entrada fuera de rango.      .");
            }
        }else{
            System.out.println(".  Entrada invalida.                      .");
            scanner.next();
        }
    }// fin mostrar platillos fuertes
    
    private static void mostrarEspecialidades(Scanner scanner){
        System.out.println(".......................................................");
        System.out.println(".  Menu Especialidades | Seleccione una opcion        .");
        System.out.println(".  ----------------------------------------           .");
        System.out.println(".  1. Parrillada al carbon:                   L900.00 .");
        System.out.println(".  2. Sopa de caracol:                        L170.00 .");
        System.out.println(".  3. Plato tipico combinado:                 L220.00 .");
        System.out.println(".  4. Costilla de cerdo en salsa BBQ:         L180.00 .");
        System.out.println(".  5. Frijoles, chismol y carne en anafre:    L180.00 .");
        System.out.println(".......................................................");
        if(scanner.hasNextInt()){
            int entradaSeleccionada = scanner.nextInt();
            switch(entradaSeleccionada) {
                case 1:
                    agregarProducto("Parrillada al carbon", 900.00);
                    break;
                case 2:
                    agregarProducto("Sopa de caracol", 170.00);
                    break;
                case 3:
                    agregarProducto("Plato tipico combinado", 220.00);
                    break;
                case 4:
                    agregarProducto("Costilla de cerdo en salsa BBQ", 180.00);
                    break;
                case 5:
                    agregarProducto("Frijoles, chismol y carne en anafre", 180.00);
                    break;
                default:
                    System.out.println(".  Opcion de entrada fuera de rango.      .");
            }
        }else{
            System.out.println(".  Entrada invalida.                      .");
            scanner.next();
        }
    }// fin mostrar especialidades

    private static void agregarProducto(String nombre, double precio) {
        productosSeleccionados.add(nombre);
        preciosSeleccionados.add(precio);
        System.out.println(".  -> " + nombre + " agregado a la orden.");
    }

    private static void imprimirFactura() {
        System.out.println("\n===============================================");
        System.out.println("====          FACTURA DE CONSUMO           ====");
        System.out.println("===============================================");
        
        if (productosSeleccionados.isEmpty()) {
            System.out.println(".  No hay productos consumidos aun.       .");
            System.out.println("===========================================\n");
            return;
        }

        double subtotal = 0.0;
        for (int i = 0; i < productosSeleccionados.size(); i++) {
            String nombre = productosSeleccionados.get(i);
            double precio = preciosSeleccionados.get(i);
            System.out.printf(". %-35s L%7.2f .\n", nombre, precio);
            subtotal += precio;
        }

        // Cálculos de ISV y Propina
        double isv = subtotal * 0.15;
        double propinaSugerida = subtotal * 0.10;
        double totalGeneral = subtotal + isv + propinaSugerida;

        System.out.println("...............................................");
        System.out.printf(". SUBTOTAL:                           L%7.2f .\n", subtotal);
        System.out.printf(". ISV (15%%):                          L%7.2f .\n", isv);
        System.out.printf(". PROPINA SUGERIDA (10%%):             L%7.2f .\n", propinaSugerida);
        System.out.println("...............................................");
        System.out.printf(". TOTAL A PAGAR:                     L%7.2f .\n", totalGeneral);
        System.out.println("===============================================\n");
    }
    
}//fin restaurante