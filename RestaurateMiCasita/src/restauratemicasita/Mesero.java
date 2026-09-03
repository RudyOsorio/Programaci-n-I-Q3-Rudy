/* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template */
package restauratemicasita;

/* @author UserCP */
public class Mesero {
    /* atributos */
    private String id;
    private String nombre;
    
    /* comportamiento */
    public Mesero(String id, String nombre){
        this.id = id;
        this.nombre = nombre;
    }
    
    /**/
    public String getId(){return id;}
    public String getNombre(){return nombre;}
    
    /**/
    @Override
    public String toString(){
        return "Mesero: " + nombre + " (ID: " + id + ")";
    }
}
