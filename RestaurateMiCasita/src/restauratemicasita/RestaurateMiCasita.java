/* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template */
/* @author UserCP */

package restauratemicasita;
import java.util.Scanner;
import java.util.ArrayList;

public class RestaurateMiCasita{
    
    // Listas acumuladoras para el pedido y sus costos
    private static ArrayList<String> productosSeleccionados = new ArrayList<>();
    private static ArrayList<Double> preciosSeleccionados = new ArrayList<>();
    
    // control de reservacion de mesas
    private static boolean[] mesasReservadas = new boolean[8];
    
    // Arreglo para almacenar el nombre del mesero asignado a cada mesa
    private static String[] meserosAsignados = new String[8];
    
    /* @param args the command line arguments*/
    public static void main(String[] args){
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
                        reservarMesa(scan);
                    break;
                    case 3:
                        asignarMesero(scan);
                    break;
                    case 4:
                        imprimirFactura(scan);
                    break;
                    case 5:
                        System.out.println(".  Gracias por preferirnos!               .");
                        System.out.println(".  Esperamos que vuelva pronto!           .");
                        System.out.println("...........................................");
                        System.out.println("");
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
    
    /* mostra el sub menu de comidas */
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
    
    /* proceso de agragar productos del menu */
    private static void agregarProducto(String nombre, double precio){
        productosSeleccionados.add(nombre);
        preciosSeleccionados.add(precio);
        System.out.println(".  -> " + nombre + " agregado a la orden.");
    }
    
    /* reservacion de mesas */
    private static void reservarMesa(Scanner scanner){
        System.out.println("...........................................");
        System.out.println(".  Reservacion de mesa                    .");
        System.out.println(".  -------------------------------        .");
        System.out.println(".  Estado actual de las mesas:            .");
        
        // Formato para desplegar cada mesa con su área correspondiente
        for(int i = 0; i < mesasReservadas.length; i++){
            int numeroMesa = i + 1;
            String area = obtenerAreaMesa(numeroMesa);
            String estado = mesasReservadas[i] ? "Reservada" : "Disponible";
            System.out.printf(".  Mesa %d (%-10s): %-11s .\n", numeroMesa, area, estado);
        }
        System.out.println("...........................................");
        System.out.println(".  0. Volver al menu principal            .");
        System.out.print(".  Seleccione un numero de mesa:          .");
        
        if(scanner.hasNextInt()){
            int mesaElegida = scanner.nextInt();
            if(mesaElegida == 0){
                System.out.println(".  Regresando al menu principal...         .");
            }else if(mesaElegida >= 1 && mesaElegida <= 8){
                int indice = mesaElegida - 1;
                if (mesasReservadas[indice]) {
                    System.out.println(".  Mesa " + mesaElegida + " Reservada. Seleccione otra.   .");
                }else{
                    mesasReservadas[indice] = true;
                    System.out.println(".  Mesa " + mesaElegida + " (" + obtenerAreaMesa(mesaElegida) + ") reservada exitosamente. .");
                }
            }else{
                System.out.println(".  Numero de mesa fuera de rango (1-8).   .");
            }
        }else{
            System.out.println(".  Entrada invalida. Ingrese un numero.   .");
            scanner.next();
        }
        System.out.println("===========================================\n");
    }// fin de reservacion de mesas
    
    /* mapa de posicion de las mesas */
    private static String obtenerAreaMesa(int numeroMesa){
        switch(numeroMesa){
            case 1: case 2:
                return "Comedor";
            case 3: case 4:
                return "Barra";
            case 5: case 6:
                return "Terraza";
            case 7: case 8:
                return "VIP";
            default:
                return "Desconocida";
        }
    }// fin de mapa de mesas
    
    /* asignacion de mesero */
    private static void asignarMesero(Scanner scanner){
        System.out.println("...........................................");
        System.out.println(".  Asignacion de mesero exclusivo         .");
        System.out.println(".  -------------------------------        .");
        
        // Verificar si existe al menos una mesa reservada
        boolean hayReservas = false;
        for(boolean estado : mesasReservadas){
            if (estado) {
                hayReservas = true;
                break;
            }
        }

        if(!hayReservas){
            System.out.println(".  No hay mesas reservadas actualmente.    .");
            System.out.println(".  Primero debe reservar una mesa.         .");
            System.out.println("===========================================\n");
            return;
        }
        
        System.out.println(".  Mesas reservadas actualmente:           .");
        for(int i = 0; i < mesasReservadas.length; i++){
            if(mesasReservadas[i]){
                int numeroMesa = i + 1;
                String area = obtenerAreaMesa(numeroMesa);
                String mesero = (meserosAsignados[i] != null) ? meserosAsignados[i] : "Sin asignar";
                System.out.printf(".  Mesa %d (%-8s) -> Mesero: %-15s .\n", numeroMesa, area, mesero);
            }
        }
        
        System.out.println("...........................................");
        System.out.println(".  0. Volver al menu principal            .");
        System.out.println("...........................................");
        System.out.print(".  Ingrese el numero de mesa reservada:   .");

        if(scanner.hasNextInt()){
            int mesaElegida = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer de entrada

            if(mesaElegida == 0){
                System.out.println(".  Regresando al menu principal...         .");
            }else if(mesaElegida >= 1 && mesaElegida <= 8){
                int indice = mesaElegida - 1;
                if(!mesasReservadas[indice]){
                    System.out.println(".  La Mesa " + mesaElegida + " no esta reservada. Solo se pueden asignar meseros a mesas reservadas. .");
                }else{
                    System.out.print(".  Ingrese el nombre del mesero asignado: ");
                    String nombreMesero = scanner.nextLine().trim();

                    if(!nombreMesero.isEmpty()){
                        meserosAsignados[indice] = nombreMesero;
                        System.out.println(".  Mesero '" + nombreMesero + "' asignado exitosamente a la Mesa " + mesaElegida + ". .");
                    }else{
                        System.out.println(".  El nombre del mesero no puede estar vacio. .");
                    }
                }
            }else{
                System.out.println(".  Numero de mesa fuera de rango (0-8).   .");
            }
        }else{
            System.out.println(".  Entrada invalida. Ingrese un numero.   .");
            scanner.next();
        }
        System.out.println("===========================================\n");
    }
    
    /* proceso de facturacion */
    private static void imprimirFactura(Scanner scanner) {
        System.out.println("\n===========================================");
        System.out.println("====        FACTURA DE CONSUMO         ====");
        System.out.println("===========================================");
        
        if(productosSeleccionados.isEmpty()) {
            System.out.println(".  No hay productos consumidos aun.       .");
            System.out.println("===========================================\n");
            return;
        }

        System.out.println(".  0. Volver al menu principal            .");
        System.out.println("...........................................");
        System.out.print("Ingrese el numero de mesa para generar la factura (1-8) o 0 para regresar: ");

        if (scanner.hasNextInt()) {
            int mesaElegida = scanner.nextInt();
            
            /* si no se selecciona una mesa, regresamos al menu principal */
            if (mesaElegida == 0) {
                System.out.println(".  Regresando al menu principal...         .");
                System.out.println("===========================================\n");
                return;
            }
            
            /* mesas a elegir entre la 1 y la 8 */
            if (mesaElegida >= 1 && mesaElegida <= 8) {
                int indice = mesaElegida - 1;
                String areaMesa = obtenerAreaMesa(mesaElegida);
                String nombreMesero = (meserosAsignados[indice] != null) ? meserosAsignados[indice] : "Sin asignar";
                String estadoMesa = mesasReservadas[indice] ? "Reservada" : "Sin reservar";

                System.out.println("\n===========================================");
                System.out.println("====       RESTAURANTE MI CASITA       ====");
                System.out.println("===========================================");
                System.out.printf(". Mesa N: %-2d (%-8s)                     .\n", mesaElegida, areaMesa);
                System.out.printf(". Estado: %-12s                        .\n", estadoMesa);
                System.out.printf(". Atendido por: %-25s .\n", nombreMesero);
                System.out.println("...........................................");
                System.out.println(". CONSUMO REALIZADO:                      .");
                
                /* sub total */
                double subtotal = 0.0;
                for (int i = 0; i < productosSeleccionados.size(); i++) {
                    String nombre = productosSeleccionados.get(i);
                    double precio = preciosSeleccionados.get(i);
                    System.out.printf(". %-35s L%7.2f .\n", nombre, precio);
                    subtotal += precio;
                }

                /* Cálculos de ISV y Propina */
                double isv = subtotal * 0.15;
                double propinaSugerida = subtotal * 0.10;
                double totalGeneral = subtotal + isv + propinaSugerida;
                
                /* subtotal impreso, ISV, propina y total */
                System.out.println("...........................................");
                System.out.printf(". SUBTOTAL:                          L%7.2f .\n", subtotal);
                System.out.printf(". ISV (15%%):                         L%7.2f .\n", isv);
                System.out.printf(". PROPINA SUGERIDA (10%%):            L%7.2f .\n", propinaSugerida);
                System.out.println("...........................................");
                System.out.printf(". TOTAL A PAGAR:                     L%7.2f .\n", totalGeneral);
            }else{
                System.out.println(".  Numero de mesa fuera de rango (0-8).   .");
            }
        }else{
            System.out.println(".  Entrada invalida. Ingrese un numero.   .");
            scanner.next();
        }
        System.out.println("===========================================\n");
    }
}//fin restaurante