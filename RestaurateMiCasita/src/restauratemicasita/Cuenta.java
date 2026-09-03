/* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template */
package restauratemicasita;
import java.util.List;
/* @author UserCP */
public class Cuenta{
    /* atributos */
    final String ESTADO_CUENTA = "ESTADO DE CUENTA";
    private Pedido pedido;
    private double porcentajePropina; /* asignamos le 0.1 para el 10% */
    private static final double IMPUESTO = 0.15; /* 15% ISV / IVA */
    
    /**/
    public Cuenta(Pedido pedido, double porcentajePropina){
        this.pedido = pedido;
        this.porcentajePropina = porcentajePropina;
    }
    
    /**/
    public double calcularSubtotal(){
        double subtotal = 0.0;
        for(Producto p : pedido.getProductos()){
            subtotal += p.getPrecio();
        }
        return subtotal;
    }
    
    /**/
    public double calcularImpuesto(){
        return calcularSubtotal() * IMPUESTO;
    }
    
    /**/
    public double calcularPropina(){
        return calcularSubtotal() * porcentajePropina;
    }
    
    /**/
    public double calcularTotal(){
        return calcularSubtotal() + calcularImpuesto() + calcularPropina();
    }
    
    /**/
    public void imprimirTicket(){
        System.out.println("===========================================");
        System.out.println("====       " + ESTADO_CUENTA + "       ====");
        System.out.println("===========================================");
        System.out.println("...........................................");
        System.out.println(".  Mesa: " + pedido.getMesa().getNumero()) ;
        System.out.println(".  Atendido por: " + pedido.getMesero().getNombre());
        System.out.println("...........................................");
        System.out.println("===========================================");
        System.out.println("====        Detalles de consumo:       ====");
        System.out.println("===========================================");
        /*for(Producto p : pedido.getProductos()){
            System.out.printf(" - %-28s $%.2f%n", p.getNombre(), p.getPrecio());
        }*/
        imprimirCategoria("ENTRADAS", "Entrada");
        imprimirCategoria("PLATILLOS FUERTES", "Platillo Fuerte");
        imprimirCategoria("ESPECIALIDAD DE LA CASA", "Especialidad");
        
        System.out.println("...........................................");
        System.out.printf(".  Subtotal:                 $%7.2f%n",calcularSubtotal());
        System.out.printf(".  Impuesto (15%%):          $%7.2f%n",calcularImpuesto());
        System.out.printf(".  Propina (%.0f%%):         $%7.2f%n",porcentajePropina * 100, calcularPropina());
        System.out.println("===========================================");
        System.out.printf(".  Total a pagar:           $%7.2f%n", calcularTotal());
        System.out.println("===========================================");
    }
    
    /**/
    private void imprimirCategoria(String tituloSeccion, String tipoCategoria){
        List<Producto> productos = pedido.getProductos();
        boolean tieneProductos = false;
        for(Producto p : productos) {
            if(p.getCategoria().equalsIgnoreCase(tipoCategoria)) {
                if(!tieneProductos) {
                    System.out.println("\n--- " + tituloSeccion + " ---");
                    tieneProductos = true;
                }
                System.out.printf("  * %-35s $%6.2f%n", p.getNombre(), p.getPrecio());
            }
        }
    }// fin imprimir categoria
}
