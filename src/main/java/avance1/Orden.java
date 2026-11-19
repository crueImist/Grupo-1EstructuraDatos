/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package avance1;

/**
 *
 * @author Manny
 */
public class Orden {
    private String numero;
    private String nombre;
    private Orden siguiente;
    private String estado;
    private int ganancia;

    public Orden(String nombre, String numero) {
        this.nombre = nombre;
        this.numero = numero;
        this.siguiente = null;
        this.estado = "Pendiente";
        

        if (nombre.equals("Sedan de Lujo")) {
            this.ganancia = 5000;
        } else if (nombre.equals("Pickup de Lujo")) {
            this.ganancia = 12000;
        } else if (nombre.equals("Maquinaria")) {
            this.ganancia = 17500;
        } else if (nombre.equals("Super Deportivo")) {
            this.ganancia = 20000;
        } else {
            this.ganancia = 0;
        }
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getGanancia() {
        return ganancia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Orden getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Orden siguiente) {
        this.siguiente = siguiente;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Orden{");
        sb.append("numero=").append(numero);
        sb.append(", nombre=").append(nombre);
        sb.append('}');
        return sb.toString();
    }
    
    
}
