package avance1;

/**
 * Nodo de la pila de materiales de una linea de produccion
 */
public class NodoMaterial {

    private String dato;
    private NodoMaterial siguiente;

    public NodoMaterial(String dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public NodoMaterial getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoMaterial siguiente) {
        this.siguiente = siguiente;
    }
}
