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
        return ordenAleatorio(max, 1);
    }


    public ColaOrden ordenAleatorio(int max, int fabrica) {
        ColaOrden orden = new ColaOrden();
        int contador = 0;
        while (contador != max) {
            int numeroAleatorio = (int) (Math.random() * 4) + 1;
            String auto = "";
            switch (numeroAleatorio) {
                case 1:
                    auto = "Sedan de Lujo";
                    break;
                case 2:
                    auto = "Super Deportivo";
                    break;
                case 3:
                    auto = "Maquinaria";
                    break;
                case 4:
                    auto = "Pickup de Lujo";
                    break;
                default:
                    throw new AssertionError();
            }
            if (fabricaProduce(fabrica, auto)) {
                
                orden.encolar(auto, "" + numeroOrden);
                ++contador;
                ++numeroOrden;
            }
        }
        return orden;
    }
 
    public boolean fabricaProduce(int fabrica, String auto) {
        if (fabrica == 1) {
            return auto.equals("Sedan de Lujo") || auto.equals("Pickup de Lujo");
        } else if (fabrica == 2) {
            return !auto.equals("Super Deportivo");
        } else {
            return !auto.equals("Sedan de Lujo");
        }
    }
}
