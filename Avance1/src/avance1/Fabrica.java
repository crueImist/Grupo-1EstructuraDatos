/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package avance1;

/**
 *
 * @author Manny
 */
public class Fabrica {
    int MetaDinero;
    int DineroAcumulado;
    Cinta cinta;
    
    LineaProduccion linea1;
    LineaProduccion linea2;
    LineaProduccion linea3;
    
    Auto planoSedanDeLujo;
    Auto planoPickup;
    Auto planoMaquinaria;
    Auto planoDeportivo;

    public Fabrica(int MetaDinero, int DineroAcumulado) {
        this.MetaDinero = MetaDinero;
        this.DineroAcumulado = DineroAcumulado;
        
        planoSedanDeLujo = new Auto("Sedan de lujo", "Carroceria", "Motor de Lujo");
        planoDeportivo = new Auto("Super Deportivo", "Carroceria", "Motor Deportivo", "Llantas Deportivas");
        planoMaquinaria = new Auto("Maquinaria", "Carroceria Especial", "Motor Deportivo","Llantas de Trabajo");
    }
    // Genero una cola aleatoria de ordenes con un max de 15 como parametro
    public ColaOrden ordenesDeFabrica(int max){
        ColaOrden cola = new ColaOrden();
        int contador = 0;
        int numeroOrden = 1;
        String txtNumOrden = "" + numeroOrden;
        while (contador != max) {
            int numeroAleatorio = (int) (Math.random() * 4) + 1;
            switch (numeroAleatorio) {
                case 1:
                    cola.encolar("Sedan de Lujo",txtNumOrden);
                    break;
                case 2:
                    cola.encolar("Pick up",txtNumOrden);
                    break;
                case 3:
                    cola.encolar("Maquinaria",txtNumOrden);
                    break;
                case 4:
                    cola.encolar("Deportivo",txtNumOrden);
                    break;

                default:
                    throw new AssertionError();
            }
            ++contador;
            ++numeroOrden;
            txtNumOrden = ""+numeroOrden;
        }
        return cola;
    }
            
    
}
