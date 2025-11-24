package logica;

import java.util.NoSuchElementException;

public class Cola {

    private Nodo frente;
    private Nodo fin;
    private int tamaño;

    public Cola() {
        this.frente = null;
        this.fin = null;
        tamaño = 0;
    }

    public void encolar(int dato) {
        Nodo nuevoNodo = new Nodo(dato);

        if (fin == null) {
            frente = nuevoNodo;
            fin = nuevoNodo;
            tamaño++;
            return;
        }

        fin.setSiguiente(nuevoNodo);
        fin = nuevoNodo;
        tamaño++;
    }

    public int desencolar() {
        if (isEmpty()) {
            throw new IllegalStateException("No hay elementos para desencolar.");
        }

        int temporal = frente.getDato();
        frente = frente.getSiguiente();
        tamaño--;

        if (frente == null) {
            fin = null;
        }

        return temporal;
    }

    public int peek () {
        if (isEmpty()) {
            throw new NoSuchElementException("No hay elementos para ver.");
        }
        return frente.getDato();
    }

    public boolean isEmpty() {
        if (tamaño == 0) {
            return true;
        }
        return false;
    }

    public int size() {
        return tamaño;
    }

    public void vaciar() {
        if (isEmpty()) {
            throw new IllegalStateException("No hay elementos para vaciar.");
        }
        frente = null;
        fin = null;
        tamaño = 0;
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
