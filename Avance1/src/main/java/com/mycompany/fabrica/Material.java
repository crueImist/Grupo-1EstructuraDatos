
package com.mycompany.fabrica;


public class Material {
    //Materiales aletorios
    private String nombre;
    private int valor;

    public Material(String nombre, int valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public int getValor() {
        return valor;
    }

    // Perdida al desechar el material en el basurero: valor * 0.6
    public double getPerdida() {
        return valor * 0.6;
    }

    // Genera un material al azar. Se usa Math.random() (java.lang) para no usar java.util.Random
    public static Material aleatorio() {
        int tipo = (int) (Math.random() * 6);
        if (tipo == 0) {
            return new Material("Motor de lujo", 500);
        } else if (tipo == 1) {
            return new Material("Motor especial deportivo", 2000);
        } else if (tipo == 2) {
            return new Material("Carroceria", 500);
        } else if (tipo == 3) {
            return new Material("Carroceria especial", 800);
        } else if (tipo == 4) {
            return new Material("Llantas deportivas", 2000);
        } else {
            return new Material("Llantas unicas de trabajo", 800);
        }
    }
}
