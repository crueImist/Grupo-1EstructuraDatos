package avance1;

/**
 * Pila dinamica con los materiales que ya se colocaron en el auto
 * de una linea de produccion. Cada material nuevo queda en la cima.
 */
public class PilaMaterial {

    private NodoMaterial cima;
    private int tamano;

    public PilaMaterial() {
        this.cima = null;
        this.tamano = 0;
    }

    public boolean esVacia() {
        return cima == null;
    }

    public void push(String material) {
        NodoMaterial nuevoNodo = new NodoMaterial(material);
        nuevoNodo.setSiguiente(cima);
        cima = nuevoNodo;
        tamano++;
    }

    public String pop() {
        if (esVacia()) {
            return "";
        }
        String dato = cima.getDato();
        cima = cima.getSiguiente();
        tamano--;
        return dato;
    }

    public int getTamano() {
        return tamano;
    }


    public boolean contiene(String material) {
        NodoMaterial actual = cima;
        while (actual != null) {
            if (actual.getDato().equals(material)) {
                return true;
            }
            actual = actual.getSiguiente();
        }
        return false;
    }


    public void vaciar() {
        cima = null;
        tamano = 0;
    }
}
