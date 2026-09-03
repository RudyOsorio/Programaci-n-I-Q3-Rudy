/* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template */
package restauratemicasita;

/* @author UserCP */
public class Mesa{
    /* atributos */
    private int numero;
    private int capacidad;
    private boolean ocupada;
    
    /* comportamiento */
    public Mesa(int numero, int capacidad /*boolean ocupada*/){
        this.numero = numero;
        this.capacidad = capacidad;
        this.ocupada = false;
        /* this.ocupada = ocupada; */
    }
    
    /**/
    public int getNumero(){return numero;}
    public boolean isOcupada(){return ocupada;}
    
    /**/
    public void reservar(){
        this.ocupada = true;
    }
    public void liberar(){
        this.ocupada = false;
    }
    
    /**/
    @Override
    public String toString(){
        return "Mesa # " + numero + " (Capacidad: " + capacidad + " personas) - " + (ocupada ? "Ocupada" : "Disponible");
    }
}
