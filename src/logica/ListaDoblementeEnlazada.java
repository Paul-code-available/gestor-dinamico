package logica;

public class ListaDoblementeEnlazada {

    private Nodo cabeza;
    private Nodo cola;
    private int tamaño;

    public ListaDoblementeEnlazada() {
        cabeza = null;
        cola = null;
    }

    public void insertarPosicion(int posicion, int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        // si la lista esta vacia
        if (cabeza == null) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
            tamaño++;
            return;
        }
        // si la posicion es la cabeza
        if (posicion == 0) {
            cabeza.setAnterior(nuevoNodo);
            nuevoNodo.setSiguiente(cabeza);
            cabeza = nuevoNodo;
            tamaño++;
            return;
        }
        // si la posicion es la cola
        if (posicion == tamaño) {
            cola.setSiguiente(nuevoNodo);
            nuevoNodo.setAnterior(cola);
            cola = nuevoNodo;
            tamaño++;
            return;
        }
        // si esta entre la cabeza y la cola
        Nodo nodo = cabeza;
        int numeroNodo = 0;
        while (numeroNodo < posicion) {
            nodo = nodo.getSiguiente();
        }
        // conectando con el nodo anterior
        nodo.setSiguiente(nuevoNodo);
        nuevoNodo.setAnterior(nodo);
        // conectando con el nodo siguiente
        nuevoNodo.setSiguiente(nodo.getSiguiente());
        nodo.getSiguiente().setAnterior(nuevoNodo);
        tamaño++;

    }

    public int eliminar(int dato) {
        if (isEmpty()) {
            throw new IllegalStateException("No hay elementos para eliminar.");
        }
        // si la cabeza es el dato que se quiere eliminar
        if (cabeza.getDato() == dato) {
            cabeza = cabeza.getSiguiente();
            if (cabeza == null) {
                cola = null;
            } else {
                cabeza.setAnterior(null);
            }
            tamaño--;
            return dato;
        }
        // si es la cola el dato a eliminar
        if (cola.getDato() == dato) {
            cola = cola.getAnterior();
            if (cola == null) {
                cabeza = null;
            } else {
                cola.setAnterior(null);
            }
            tamaño--;
            return dato;
        }
        // si esta entre la cabeza y la cola
        Nodo nodo = cabeza;
        while (nodo.getSiguiente() != null && nodo.getSiguiente().getDato() != dato) {
            nodo = nodo.getSiguiente();
        }

        Nodo nodoEliminar = nodo.getSiguiente();
        nodo.setSiguiente(nodoEliminar.getSiguiente());
        // si no hay siguiente del nodo a eliminar actualizamos la cola es el nodo
        if (nodoEliminar.getSiguiente() == null) {
            cola = nodo;
        } else {
            nodoEliminar.getSiguiente().setAnterior(nodo);
        }
        tamaño--;
        return dato;
    }

    public void vaciar() {
        cabeza = null;
        cola = null;
    }

    public void mostrarAdelante() {
        Nodo nodo = cabeza;
        while (nodo != null) {
            System.out.println(nodo.getDato());
            nodo = nodo.getSiguiente();
        }
    }

    public void mostrarAtras() {
        if (isEmpty()) {
            throw new IllegalStateException("La lista esta vacia.");
        }
        Nodo nodo = cola;
        while (nodo != null) {
            System.out.println(nodo.getDato());
            nodo = nodo.getAnterior();
        }
    }

    public boolean isEmpty() {
        return (cabeza == null);
    }

    public int size() {
        return tamaño;
    }
}
