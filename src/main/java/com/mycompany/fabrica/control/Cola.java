
package com.mycompany.fabrica.control;
//Idea inicial del manejo de la linea trasportadora
public class Cola {
    private Nodo frente;
    private Nodo fin;
    
    public Cola(){
        this.frente = null;
        this.fin = null;
    }
    
    public void encolar(int dato){
        Nodo nuevo = new Nodo(dato);
        if(fin != null){
            fin.setSiguiente(nuevo);
        }
        fin = nuevo;
        if(frente == null){
            frente = nuevo;
        }
    }
    
    public int desencolar() throws Exception{
        if(frente == null){
            throw new Exception("Cola vacia");
        }
        int dato = frente.getDato();
        frente = frente.getSiguiente();
        if(frente == null){
            fin = null;
        }
        return dato;
    }
    
    public int frente() throws Exception{
        if(frente == null){
            throw new Exception("Cola vacia");
        }
        
        return frente.getDato();
    }
    
    public boolean esVacia(){
        return frente == null;
    }
}
