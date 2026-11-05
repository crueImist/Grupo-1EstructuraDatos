/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package avance1;

/**
 *
 * @author Manny
 */
public class ColaOrden {
    private Orden frente;
    private Orden fin;

    public ColaOrden() {
        this.frente = null;
        this.fin = null;
    }
    
    public void encolar(String orden){
        Orden nuevo = new Orden(orden);
        
        if (fin != null) {
            fin.setSiguiente(nuevo);
        }
        fin = nuevo;
        
        if (frente == null) {
            
        }
    }
    
    public String desencolar() throws Exception{
        if (frente == null) {
            throw new Exception("Cola vacia");      
        }
        
        String dato = frente.getNombre();
        frente = frente.getSiguiente();
        
        if (frente == null) {
            fin = null;
        }
        return dato;          
    }
    
}

