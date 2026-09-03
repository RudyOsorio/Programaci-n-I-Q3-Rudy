/* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template */
package restauratemicasita;

import java.util.ArrayList;
import java.util.List;

/* @author UserCP */
public class Pedido{
    /* atributos */
    private Mesa mesa;
    private Mesero mesero;
    private List<Producto> productos;
    
    /**/
    public Pedido(Mesa mesa, Mesero mesero){
        this.mesa = mesa;
        this.mesero = mesero;
        this.productos = new ArrayList<>();
        this.mesa.reservar(); // aqui se ocupa la mesa al iniciar el pedido
    }
    
    /**/
    public void agregarProducto(Producto producto){
        productos.add(producto);
    }
    
    /**/
    public Mesa getMesa(){return mesa;}
    public Mesero getMesero(){return mesero;}
    public List<Producto> getProductos(){return productos;}
}
