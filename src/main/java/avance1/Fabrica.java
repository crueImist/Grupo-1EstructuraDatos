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
    
    int perdidas;

    public Fabrica(int MetaDinero, int DineroAcumulado) {
        this.MetaDinero = MetaDinero;
        this.DineroAcumulado = DineroAcumulado;
        this.perdidas = 0;
        
        // Las 3 lineas de produccion de la fabrica
        linea1 = new LineaProduccion(1);
        linea2 = new LineaProduccion(2);
        linea3 = new LineaProduccion(3);
        
        planoSedanDeLujo = new Auto("Sedan de lujo", "Carroceria", "Motor de Lujo");
        planoDeportivo = new Auto("Super Deportivo", "Carroceria", "Motor Deportivo", "Llantas Deportivas");
        planoMaquinaria = new Auto("Maquinaria", "Carroceria Especial", "Motor Deportivo","Llantas de Trabajo");
    }

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
            
    

    //Seccion de construccion

    public LineaProduccion getLinea(int numero) {
        if (numero == 1) {
            return linea1;
        } else if (numero == 2) {
            return linea2;
        } else {
            return linea3;
        }
    }

    //
    public LineaProduccion lineaLibre() {
        if (linea1.estaLibre()) {
            return linea1;
        } else if (linea2.estaLibre()) {
            return linea2;
        } else if (linea3.estaLibre()) {
            return linea3;
        }
        return null;
    }

    //
    public boolean asignarOrden(Orden orden, int numeroLinea) {
        LineaProduccion linea = getLinea(numeroLinea);
        if (orden == null) {
            linea.setMensaje("Seleccione una orden");
            return false;
        }
        if (!orden.getEstado().equals("Pendiente")) {
            linea.setMensaje("La orden #" + orden.getNumero() + " ya fue tomada");
            return false;
        }
        if (!linea.estaLibre()) {
            linea.setMensaje("Linea ocupada");
            return false;
        }
        linea.asignar(orden);
        linea.setMensaje("Orden #" + orden.getNumero() + " asignada");
        return true;
    }

    // a
    public boolean colocarMaterial(String material, int numeroLinea) {
        LineaProduccion linea = getLinea(numeroLinea);
        if (!linea.colocar(material)) {
            return false;
        }
        if (linea.estaTerminado()) {
            Orden terminada = linea.entregar();
            DineroAcumulado = DineroAcumulado + terminada.getGanancia();
        }
        return true;
    }

    // Material desechado en el basurero: perdida = valor * 0.6
    public void desecharMaterial(int valor) {
        perdidas = perdidas + (int) (valor * 0.6);
    }

    public int getPerdidas() {
        return perdidas;
    }

    // Dinero obtenido = ganancias de los autos - perdidas
    public int getDinero() {
        return DineroAcumulado - perdidas;
    }

    public int getMetaDinero() {
        return MetaDinero;
    }

    public boolean metaCumplida() {
        return getDinero() >= MetaDinero;
    }
}
