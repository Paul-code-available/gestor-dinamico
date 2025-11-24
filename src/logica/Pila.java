package logica;

import java.util.NoSuchElementException;

public class Pila {

    private Nodo tope;
    private int tamaño;

    public Pila() {
        tope = null;
        tamaño = 0;
    }

    public void push(int dato) {
        Nodo nuevoNodo = new Nodo(dato);

        if (isEmpty()) {
            tope = nuevoNodo;
        } else {
            nuevoNodo.setSiguiente(tope);
            tope = nuevoNodo;
        }
        tamaño++;
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("No hay elementos para eliminar.");
        }

        int temporal = tope.getDato();
        tope = tope.getSiguiente();
        tamaño--;
        return temporal;
    }

    public int peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("No hay elementos para ver.");
        }
        return tope.getDato();
    }

    public boolean isEmpty() {
        if (tamaño == 0) {
            return true;
        }
        return false;
    }

    public void vaciar() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila ya esta vacia.");
        }
        tope = null;
        tamaño = 0;
    }

    public void ver() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila esta vacia.");
        }
        Nodo nodo = tope;
        while (nodo != null) {
            System.out.print(nodo.getDato() + " ");
            nodo = nodo.getSiguiente();
        }
    }

    public int size() {
        return tamaño;
    }
}
