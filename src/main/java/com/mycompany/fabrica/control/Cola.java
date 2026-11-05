
package com.mycompany.fabrica.control;

import com.mycompany.fabrica.Material;

//Idea inicial del manejo de la linea trasportadora
public class Cola {
    private Nodo frente;
    private Nodo fin;
    private int cantidad;

    public Cola(){
        this.frente = null;
        this.fin = null;
        this.cantidad = 0;
    }

    public void encolar(Material dato){
        Nodo nuevo = new Nodo(dato);
        if(fin != null){
            fin.setSiguiente(nuevo);
        }
        fin = nuevo;
        if(frente == null){
            frente = nuevo;
        }
        cantidad++;
    }

    public Material desencolar() throws Exception{
        if(frente == null){
            throw new Exception("Cola vacia");
        }
        return sacarFrente();
    }

    public Material frente() throws Exception{
        if(frente == null){
            throw new Exception("Cola vacia");
        }

        return frente.getDato();
    }

    public boolean esVacia(){
        return frente == null;
    }

    public int tamano(){
        return cantidad;
    }

    // Retorna el material en la posicion indicada (1 = frente) sin alterar la cola.
    // Sirve para dibujar la cinta en la interfaz. Retorna null si no existe.
    public Material verEn(int posicion){
        Nodo actual = frente;
        int i = 1;
        while(actual != null && i < posicion){
            actual = actual.getSiguiente();
            i++;
        }
        if(actual == null || posicion < 1){
            return null;
        }
        return actual.getDato();
    }

    // Saca de la cola el material en la posicion indicada (1 = frente) y lo retorna.
    // Los demas conservan su orden. Si la posicion no existe retorna null y la cola no cambia.
    // Atiende y vuelve a encolar tamano() veces (sin estructuras auxiliares).
    public Material extraer(int posicion){
        Material extraido = null;
        int n = cantidad;
        for(int i = 1; i <= n; i++){
            Material m = sacarFrente();
            if(i == posicion){
                extraido = m;       // no se vuelve a encolar
            } else {
                encolar(m);
            }
        }
        return extraido;
    }

    // Saca el frente sin validar: solo se llama cuando se sabe que la cola no esta vacia
    private Material sacarFrente(){
        Material dato = frente.getDato();
        frente = frente.getSiguiente();
        if(frente == null){
            fin = null;
        }
        cantidad--;
        return dato;
    }
}
