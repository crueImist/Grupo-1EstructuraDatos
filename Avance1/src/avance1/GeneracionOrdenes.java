/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package avance1;

/**
 *
 * @author Manny
 */
public class GeneracionOrdenes {
    int numeroOrden = 1;
    public ColaOrden ordenAleatorio(int max) {
        ColaOrden orden = new ColaOrden();
        int contador = 0;
        while (contador != max) {
            int numeroAleatorio = (int) (Math.random() * 4) + 1;
            switch (numeroAleatorio) {
                case 1:
                    orden.encolar("" + numeroOrden, "Sedan de Lujo");
                    break;
                case 2:
                    orden.encolar("" + numeroOrden, "Super Deportivo");
                    break;
                case 3:
                    orden.encolar("" + numeroOrden, "Maquinaria");
                    break;
                case 4:
                    orden.encolar("" + numeroOrden, "Pickup de Lujo");
                    break;
                default:
                    throw new AssertionError();
            }
            ++contador;
            ++numeroOrden;
        }
        return orden;

    }
}
