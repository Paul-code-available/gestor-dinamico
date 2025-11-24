package logica;

public class ListaDoblementeEnlazada {

    private Nodo cabeza;
    private Nodo cola;
    private int tamaño;

    public ListaDoblementeEnlazada() {
        cabeza = null;
        cola = null;
        tamaño = 0;
    }

    public void insertarPosicion(int posicion, int dato) {

        if (posicion < 0 || posicion > tamaño) {
            throw new IndexOutOfBoundsException("Posición inválida.");
        }

        Nodo nuevoNodo = new Nodo(dato);

        // lista vacía
        if (cabeza == null) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
            tamaño++;
            return;
        }

        // insertar al inicio
        if (posicion == 0) {
            nuevoNodo.setSiguiente(cabeza);
            cabeza.setAnterior(nuevoNodo);
            cabeza = nuevoNodo;
            tamaño++;
            return;
        }

        // insertar al final
        if (posicion == tamaño) {
            cola.setSiguiente(nuevoNodo);
            nuevoNodo.setAnterior(cola);
            cola = nuevoNodo;
            tamaño++;
            return;
        }

        // insertar en medio
        Nodo nodo = cabeza;
        int i = 0;

        while (i < posicion) {
            nodo = nodo.getSiguiente();
            i++;
        }

        // nodo es el nodo en la posición actual, insertamos antes de él

        Nodo anterior = nodo.getAnterior();

        anterior.setSiguiente(nuevoNodo);
        nuevoNodo.setAnterior(anterior);

        nuevoNodo.setSiguiente(nodo);
        nodo.setAnterior(nuevoNodo);

        tamaño++;
    }


    public int eliminar(int dato) {
        if (isEmpty()) {
            throw new IllegalStateException("No hay elementos para eliminar.");
        }

        // eliminar cabeza
        if (cabeza.getDato() == dato) {
            int valor = cabeza.getDato();

            cabeza = cabeza.getSiguiente();

            if (cabeza == null) {
                cola = null; // lista quedó vacía
            } else {
                cabeza.setAnterior(null);
            }

            tamaño--;
            return valor;
        }

        // eliminar cola
        if (cola.getDato() == dato) {
            int valor = cola.getDato();

            cola = cola.getAnterior();

            if (cola == null) {
                cabeza = null;
            } else {
                cola.setSiguiente(null);
            }

            tamaño--;
            return valor;
        }

        // eliminar en medio
        Nodo nodo = cabeza;

        while (nodo != null && nodo.getDato() != dato) {
            nodo = nodo.getSiguiente();
        }

        if (nodo == null) {
            throw new IllegalStateException("El elemento no existe en la lista.");
        }

        // Reconectar
        Nodo anterior = nodo.getAnterior();
        Nodo siguiente = nodo.getSiguiente();

        anterior.setSiguiente(siguiente);

        if (siguiente != null) {
            siguiente.setAnterior(anterior);
        } else {
            cola = anterior;
        }

        tamaño--;
        return dato;
    }

    public void buscar(int dato) {
        if (isEmpty()) {
            throw new IllegalStateException("No hay elementos para buscar.");
        }

        Nodo nodo = cabeza;
        while (nodo != null && nodo.getDato() != dato) {
            nodo = nodo.getSiguiente();
        }

        if (nodo == null) {
            throw new IllegalStateException("El elemento no está en la lista.");
        }

        System.out.println("Elemento encontrado: " + dato);
    }


    public void vaciar() {
        cabeza = null;
        cola = null;
        tamaño = 0;
    }


    public void mostrarAdelante() {
        if (isEmpty()) {
            throw new IllegalStateException("La lista esta vacia.");
        }
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
        return tamaño == 0;
    }


    public int size() {
        return tamaño;
    }
}
