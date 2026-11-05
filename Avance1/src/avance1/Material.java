/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package avance1;

/**
 *
 * @author Manny
 */
public class Material {

    private String nombre;
    private int valor;
    private Material siguiente;

    public Material(String nombre, int valor) {
        this.nombre = nombre;
        this.valor = valor;
        this.siguiente = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Material getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Material siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Material{");
        sb.append("nombre=").append(nombre);
        sb.append(", valor=").append(valor);
        sb.append('}');
        return sb.toString();
    }
    
    

}


