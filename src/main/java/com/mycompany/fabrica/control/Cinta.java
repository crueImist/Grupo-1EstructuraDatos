
package com.mycompany.fabrica.control;

import com.mycompany.fabrica.Material;

// Cinta transportadora: cola dinamica con capacidad fija segun la fabrica
// (primera = 3, segunda = 4, tercera = 5)
public class Cinta {
    private Cola materiales;
    private int capacidad;

    public Cinta(int capacidad){
        this.materiales = new Cola();
        this.capacidad = capacidad;
        reponer();
    }

    public int getCapacidad(){
        return capacidad;
    }

    public int getCantidad(){
        return materiales.tamano();
    }

    
    public Material ver(int posicion){
        return materiales.verEn(posicion);
    }

    
    public Material tomar(int posicion){
        Material material = materiales.extraer(posicion);
        reponer();
        return material;
    }

    // Aca se rellena
    private void reponer(){
        if(materiales.tamano() <= 3){
            while(materiales.tamano() < capacidad){
                materiales.encolar(Material.aleatorio());
            }
        }
    }
}
