/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fabrica.control;

import com.mycompany.fabrica.Material;

/**
 *
 * @author Pablo
 */
public class Nodo {
    private Material dato;
    private Nodo siguiente;

    public Nodo(Material dato){
        this.dato = dato;
        this.siguiente = null;
    }

    public Material getDato() {
        return dato;
    }

    public void setDato(Material dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }


}
