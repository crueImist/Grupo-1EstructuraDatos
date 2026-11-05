/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package avance1;

/**
 *
 * @author Manny
 */
public class Orden {
    private String nombre;
    private Orden siguiente;

    public Orden(String nombre) {
        this.nombre = nombre;
        this.siguiente = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Orden getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Orden siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
