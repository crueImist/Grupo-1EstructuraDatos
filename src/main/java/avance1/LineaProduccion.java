/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package avance1;

/**
 * Linea de produccion: construye el auto de una orden.
 * Los materiales que se van colocando se guardan en una pila.
 *
 * @author alejandromc
 */
public class LineaProduccion {

    private int numero;
    private Orden orden;
    private PilaMaterial materiales;
    private String mensaje;

    public LineaProduccion(int numero) {
        this.numero = numero;
        this.orden = null;
        this.materiales = new PilaMaterial();
        this.mensaje = "";
    }

    public int getNumero() {
        return numero;
    }

    public Orden getOrden() {
        return orden;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public boolean estaLibre() {
        return orden == null;
    }


    public void asignar(Orden nuevaOrden) {
        orden = nuevaOrden;
        orden.setEstado("En linea " + numero);
        materiales.vaciar();
    }


    public boolean usaMaterial(String material) {
        if (orden == null) {
            return false;
        }
        String auto = orden.getNombre();
        if (auto.equals("Sedan de Lujo") || auto.equals("Pickup de Lujo")) {
            return material.equals("Motor de Lujo") || material.equals("Carroceria");
        } else if (auto.equals("Maquinaria")) {
            return material.equals("Motor Deportivo") || material.equals("Carroceria especial")
                    || material.equals("Llantas de Trabajo");
        } else if (auto.equals("Super Deportivo")) {
            return material.equals("Motor Deportivo") || material.equals("Carroceria")
                    || material.equals("Llantas deportivas");
        }
        return false;
    }


    public int materialesNecesarios() {
        if (orden == null) {
            return 0;
        }
        if (orden.getNombre().equals("Sedan de Lujo") || orden.getNombre().equals("Pickup de Lujo")) {
            return 2;
        }
        return 3;
    }


    public boolean colocar(String material) {
        if (orden == null) {
            mensaje = "Primero asigne una orden";
            return false;
        }
        if (!usaMaterial(material)) {
            mensaje = orden.getNombre() + " no usa " + material;
            return false;
        }
        if (materiales.contiene(material)) {
            mensaje = "Ya tiene " + material;
            return false;
        }
        materiales.push(material);
        mensaje = material + " colocado";
        return true;
    }

    public boolean estaTerminado() {
        return orden != null && materiales.getTamano() == materialesNecesarios();
    }


    public Orden entregar() {
        Orden terminada = orden;
        terminada.setEstado("Completada");
        orden = null;
        materiales.vaciar();
        mensaje = "Auto #" + terminada.getNumero() + " terminado! +$" + terminada.getGanancia();
        return terminada;
    }


    public String mostrar() {
        String texto = "";
        if (orden == null) {
            texto = "LIBRE\n\nSeleccione una orden\ny presione Asignar\n";
        } else {
            texto = "Orden #" + orden.getNumero() + "\n";
            texto = texto + orden.getNombre() + "\n";
            texto = texto + "Ganancia: $" + orden.getGanancia() + "\n\n";
            texto = texto + "Materiales:\n";
            texto = texto + estadoMaterial("Motor de Lujo");
            texto = texto + estadoMaterial("Motor Deportivo");
            texto = texto + estadoMaterial("Carroceria");
            texto = texto + estadoMaterial("Carroceria especial");
            texto = texto + estadoMaterial("Llantas deportivas");
            texto = texto + estadoMaterial("Llantas de Trabajo");
        }
        texto = texto + "\n" + mensaje;
        return texto;
    }

    private String estadoMaterial(String material) {
        if (!usaMaterial(material)) {
            return "";
        }
        if (materiales.contiene(material)) {
            return " [X] " + material + "\n";
        }
        return " [  ] " + material + "\n";
    }
}
