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
    
    public void encolar(String orden, String numero){
        Orden nuevo = new Orden(orden, numero);
        
        if (fin != null) {
            fin.setSiguiente(nuevo);
        }
        fin = nuevo;
        
        if (frente == null) {
            frente = nuevo;
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
    
    public boolean esVacia(){
        return frente == null;
    }
    
    public void mostrar(){
        if (esVacia()) {
            System.out.println("Cola vacia");
            return;
        }
        Orden actual = frente;
        System.out.println("Contenido de cola");
        while (actual != null)  {            
            System.out.println(actual.toString());
            actual = actual.getSiguiente();
        }
    }
}

