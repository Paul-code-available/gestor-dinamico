package logica;

import java.util.NoSuchElementException;

public class Cola {

    private Nodo frente;
    private Nodo cola;
    private int tamaño;

    public Cola() {
        this.frente = null;
        this.cola = null;
        tamaño = 0;
    }

    public void enconlar (int dato) {
        Nodo nuevoNodo = new Nodo(dato);

        if (cola == null) {
            frente = nuevoNodo;
            cola = nuevoNodo;
            tamaño++;
            return;
        }

        cola.setSiguiente(nuevoNodo);
        cola = nuevoNodo;
        tamaño++;
    }

    public int desenconlar (int dato) {
        if (isEmpty()) {
            throw new IllegalArgumentException("No hay elementos para desencolar.");
        }

        int temporal = frente.getDato();
        if (frente != null) {
            frente = frente.getSiguiente();
        }
        tamaño--;
        return temporal;
    }

    public int peek () {
        if (isEmpty()) {
            throw new NoSuchElementException("La cola esta vacia");
        }
        return frente.getDato();
    }

    public boolean isEmpty() {
        if (cola == null) {
            return true;
        }
        return false;
    }

    public int size() {
        return tamaño;
    }

    public void vaciar() {
        frente = null;
    }

    public void ver() {
        if (isEmpty()) {
            throw new IllegalStateException("La cola esta vacia.");
        }

        Nodo nodo = frente;
        while (nodo != null) {
            System.out.print(nodo.getDato() + " ");
            nodo = nodo.getSiguiente();
        }
    }

}
