/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package avance1;

/**
 *
 * @author alejandromc
 */
public class ColaMaterial {
    private Material frente;
    private Material fin;

    public ColaMaterial() {
        this.frente = null;
        this.fin = null;
    }
    
    public void encolar(String material, int valor){
        Material nuevo = new Material(material, valor);
        
        if (fin != null) {
            fin.setSiguiente(nuevo);
        }
        fin = nuevo;
        
        if (frente == null) {
            frente = nuevo;
        }
    }
    
    public Material desencolar(){
        if (frente == null) {
            System.out.println("Cola vacia");      
        }
        
        Material dato = frente;
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
        Material actual = frente;
        System.out.println("Contenido de cola");
        while (actual != null)  {            
            System.out.println(actual.toString());
            actual = actual.getSiguiente();
        }
    }
    
}
