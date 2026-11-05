package com.mycompany.fabrica;

import com.mycompany.fabrica.control.Cinta;

public class Fabrica {

    public static void main(String[] args) {
        //Prueba01
        Cinta cinta = new Cinta(4);
        System.out.println("Cinta inicial:");
        mostrar(cinta);

        Material m = cinta.tomar(3);
        System.out.println("\nTomado: " + m.getNombre() + " aca se resta " + m.getPerdida());
        mostrar(cinta);

        
    }

    private static void mostrar(Cinta cinta) {
        for (int i = 1; i <= cinta.getCantidad(); i++) {
            System.out.println(i + ""+cinta.ver(i).getNombre()+"$" + cinta.ver(i).getValor()+"");
        }
    }
}
