/* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template */
package restauratemicasita;

/* @author UserCP*/
public class Producto{
    /* atributos */
    private String nombre;
    private double precio;
    private String categoria; //Aqui es para: Entradas, Platillo Fuerte, Especialidad
    
    /* comportamiento */
    public Producto(String nombre, double precio, String categoria){
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }
    
    /**/
    public String getNombre(){return nombre;}
    public double getPrecio(){return precio;}
    public String getCategoria(){return categoria;}
    
    /**/
    @Override
    public String toString(){
        return String.format("%s (%s) - L%.2f", nombre, categoria, precio);
    }
}
