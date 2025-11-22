package logica;

public class Nodo {

    private Nodo siguiente;
    private Nodo anterior;
    private int dato;

    public Nodo(int dato) {
        this.dato = dato;
        siguiente = null;
        anterior = null;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }
}
