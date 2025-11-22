package logica;

import java.util.EmptyStackException;

public class Pila {

    private Nodo tope;
    private int tamaño;

    public Pila() {
        tope = null;
        tamaño = 0;
    }

    public void push(int dato) {
        Nodo nuevoNodo = new Nodo(dato);

        if (tope==null) {
            tope = nuevoNodo;
        } else {
            nuevoNodo.setSiguiente(tope);
            tope = nuevoNodo;
        }

        tamaño++;
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        int temporal = tope.getDato();
        tope = tope.getSiguiente();
        tamaño--;
        return temporal;
    }

    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return tope.getDato();
    }

    public boolean isEmpty() {
        if (tope==null) {
            return true;
        }
        return false;
    }

    public int getTamaño() {
        return tamaño;
    }
}
