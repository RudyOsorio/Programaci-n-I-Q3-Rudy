/* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template */
package restauratemicasita;

/* @author UserCP */
public class PruebaSistema {
    public static void main(String[] args) {
        // 1. Crear Mesa y Mesero
        Mesa mesa1 = new Mesa(1, 4);
        //Mesa mesa1 = new Mesa(1, 4, false);
        Mesero meseroCarlos = new Mesero("M-02", "Carlos Gómez");

        // 2. Crear Pedido para la Mesa 1
        Pedido pedido = new Pedido(mesa1, meseroCarlos);

        // 3. Agregar platillos de ENTRADAS
        pedido.agregarProducto(new Producto("Sopa de Tomate Rústica", 6.50, "Entrada"));
        pedido.agregarProducto(new Producto("Bruschetta Clásica", 7.00, "Entrada"));

        // 4. Agregar PLATILLOS FUERTES
        pedido.agregarProducto(new Producto("Lomo de Cerdo a la Miel", 16.00, "Platillo Fuerte"));
        pedido.agregarProducto(new Producto("Pasta Fettuccine Alfredo", 14.50, "Platillo Fuerte"));

        // 5. Agregar ESPECIALIDAD DE LA CASA
        pedido.agregarProducto(new Producto("Corte Filete Mignon Especial", 25.00, "Especialidad"));

        // 6. Generar Factura con 10% de propina
        Cuenta factura = new Cuenta(pedido, 0.10);
        
        // Imprimir el estado de cuenta a pagar
        factura.imprimirTicket();
    }
}
