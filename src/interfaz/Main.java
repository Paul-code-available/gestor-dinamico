package interfaz;

import java.util.NoSuchElementException;
import java.util.Scanner;
import logica.Cola;
import logica.ListaDoblementeEnlazada;
import logica.Pila;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int opcion = 0;
        String opcionElejida;
        do {
            System.out.println("||||||||||MENU||||||||||");
            System.out.println("Que estructura de datos desea crear: ");
            System.out.println("1.- Crear una cola");
            System.out.println("2.- Crear una pila");
            System.out.println("3.- Crear una lista doblemente enlazada");
            System.out.println("4.- Salir del programa");
            opcionElejida = in.nextLine();


            if (!validarEntradaNumeros(opcionElejida)){
                System.out.println("Error. Solo puede ingresar numeros.");
                continue;
            }

            opcion = Integer.parseInt(opcionElejida);

            if (opcion < 1 || opcion > 4) {
                System.out.println("Error. Ingreso un numero de opcion invalido");
                continue;
            }

            int eleccion = 0;
            switch(opcion){
                case 1:
                    Cola cola = new Cola();

                    do {
                        System.out.println("Opciones cola");
                        System.out.println("1.- Encolar (agregar un elemento a la cola)");
                        System.out.println("2.- Desencolar (eliminar el primer elemento de la cola)");
                        System.out.println("3.- Peek (mostrar el primer elemento de la cola sin eliminarlo)");
                        System.out.println("4.- Esta vacia? (Ver si la cola esta vacia)");
                        System.out.println("5.- Ver todos los elementos de la cola");
                        System.out.println("6.- Vaciar toda la estructura de datos");
                        System.out.println("7.- Eliminar la estructura de datos");
                        System.out.println("8.- Mostrar estado del programa");
                        System.out.println("9.- Salir de esta estructura");
                        opcionElejida = in.nextLine();

                        if (!validarEntradaNumeros(opcionElejida)){
                            System.out.println("Error. Solo puede ingresar numeros.");
                            continue;
                        }

                        eleccion = Integer.parseInt(opcionElejida);

                        if (eleccion < 1 || eleccion > 9) {
                            System.out.println("Error. Ingreso un numero de opcion invalido");
                            continue;
                        }

                        int numero;
                        String numeroString;
                        switch (eleccion) {
                            case 1:

                                System.out.println("Ingrese el numero que desea agrgar a la cola: ");
                                numeroString = in.nextLine();

                                if (!validarEntradaNumeros(numeroString)){
                                    System.out.println("Error. Solo puede ingresar numeros");
                                    continue;
                                }

                                numero = Integer.parseInt(numeroString);

                                cola.encolar(numero);
                                System.out.println("El dato se ha agregado a la cola con exito!!");

                                break;
                            case 2:

                                try {
                                    System.out.println(cola.desencolar());
                                    System.out.println("El dato se ha eliminado con éxito de la cola!!");
                                } catch (IllegalStateException error) {
                                    System.out.println("Error: " + error.getMessage());
                                }

                                break;
                            case 3:

                                try {
                                    System.out.println("El frente de la cola es: " + cola.peek());
                                } catch (NoSuchElementException error){
                                    System.out.println("Error: " + error.getMessage());
                                }

                                break;
                            case 4:

                                if (cola.isEmpty()){
                                    System.out.println("La cola si esta vacia.");
                                }
                                else {
                                    System.out.println("La cola no esta vacia");
                                }

                                System.out.println();

                                break;
                            case 5:

                                try {
                                    cola.ver();
                                    System.out.println("\n Los elementos de han mostrado con exito!!");
                                } catch (IllegalStateException error){
                                    System.out.println("Error: " + error.getMessage());
                                }

                                break;
                            case 6:

                                try {
                                    cola.vaciar();
                                    System.out.println("La cola se ha vaciado con exito!!");
                                } catch (IllegalStateException error){
                                    System.out.println("Error: " + error.getMessage());
                                }

                                break;
                            case 7:

                                cola = null;
                                System.out.println("La cola se ha eliminado con exito!!");

                                int eleccionCola;
                                do {
                                    System.out.println("Desea crear otra cola? ");
                                    System.out.println("1) Si");
                                    System.out.println("2) No. Salir de esta estructura de datos");
                                    numeroString = in.nextLine();

                                    if (!validarEntradaNumeros(numeroString)){
                                        System.out.println("Error. Solo puede ingresar numeros");
                                        continue;
                                    }

                                    eleccionCola = Integer.parseInt(numeroString);

                                    if (eleccionCola != 1 && eleccionCola != 2){
                                        System.out.println("Error. Ingreso un numero de opcion invalida");
                                        continue;
                                    }

                                    if (eleccionCola == 1) {
                                        cola = new Cola();
                                        break;
                                    }
                                    else{
                                        eleccion = 9;
                                        break;
                                    }
                                }while(true);

                                break;
                            case 8:

                                System.out.println("Estructura de datos: Cola; Numero de elementos: " + cola.size());

                                break;
                        }
                    }while(eleccion!=9);

                    break;
                case 2:
                    Pila pila = new Pila();
                    do {
                        System.out.println("Opciones pila");
                        System.out.println("1.- Push (agregar un elemento)");
                        System.out.println("2.- Pop (eliminar y devolver el elemento superior)");
                        System.out.println("3.- peek (mostrar sin eliminar el elemento superior)");
                        System.out.println("4.- Esta vacia? (Ver si la pila esta vacia)");
                        System.out.println("5.- Ver todos los elementos de la pila");
                        System.out.println("6.- Vaciar toda la estructura de datos");
                        System.out.println("7.- Eliminar la estructura de datos");
                        System.out.println("8.- Mostrar estado del programa");
                        System.out.println("9.- Salir de esta estructura");
                        opcionElejida = in.nextLine();

                        if (!validarEntradaNumeros(opcionElejida)) {
                            System.out.println("Error. Solo puede ingresar numeros.");
                            continue;
                        }

                        eleccion = Integer.parseInt(opcionElejida);

                        if (eleccion < 1 || eleccion > 9) {
                            System.out.println("Error. Ingreso un numero de opcion invalido");
                            continue;
                        }

                        int numero;
                        String numeroString;
                        switch (eleccion) {
                            case 1:

                                System.out.println("Ingrese el numero que desea agregar a la pila: ");
                                numeroString = in.nextLine();

                                if (!validarEntradaNumeros(numeroString)) {
                                    System.out.println("Error. Solo puede ingresar numeros");
                                    continue;
                                }

                                numero = Integer.parseInt(numeroString);

                                pila.push(numero);
                                System.out.println("El dato se ha agregado a la pila con exito!!");

                                break;
                            case 2:

                                try {
                                    System.out.println("Se ha eliminado el dato: " + pila.pop() + " con exito de la pila!!");
                                } catch (IllegalStateException error) {
                                    System.out.println("Error: " + error.getMessage());
                                }

                                break;
                            case 3:

                                try {
                                    System.out.println("Elemento superior de la pila: " + pila.peek());
                                } catch (NoSuchElementException error) {
                                    System.out.println("Error: " + error.getMessage());
                                }

                                break;
                            case 4:

                                if (pila.isEmpty()) {
                                    System.out.println("La pila esta vacia");
                                }
                                else {
                                    System.out.println("La pila no esta vacia");
                                }

                                System.out.println();

                                break;
                            case 5:

                                try {
                                    pila.ver();
                                    System.out.println(" \n Los elementos se han mostrado con exito!!");
                                } catch (IllegalStateException error) {
                                    System.out.println("Error: " + error.getMessage());
                                }

                                break;
                            case 6:

                                try {
                                    pila.vaciar();
                                    System.out.println("La pila se ha vaciado con exito!!");
                                } catch (IllegalStateException error) {
                                    System.out.println("Error: " + error.getMessage());
                                }

                                break;
                            case 7:

                                pila = null;
                                System.out.println("La pila se ha eliminado con exito!!");

                                int eleccionPila;
                                do {
                                    System.out.println("Desea crear otra pila? ");
                                    System.out.println("1) Si");
                                    System.out.println("2) No. Salir de esta estructura de datos");
                                    numeroString = in.nextLine();

                                    if (!validarEntradaNumeros(numeroString)) {
                                        System.out.println("Error. Solo pueden ingresar numeros");
                                        continue;
                                    }

                                    eleccionPila = Integer.parseInt(numeroString);

                                    if (eleccionPila != 1 && eleccionPila != 2) {
                                        System.out.println("Error. Ingreso un numero de opcion invalido");
                                        continue;
                                    }

                                    if (eleccionPila == 1) {
                                        pila = new Pila();
                                        break;
                                    } else {
                                        eleccion = 9;
                                        break;
                                    }
                                } while (true);

                                break;
                            case 8:

                                System.out.println("Estructura de datos: Pila; Numero de elementos: " + pila.size());

                                break;
                        }
                    }while(eleccion!=9);
                    break;
                case 3:
                    ListaDoblementeEnlazada lista = new ListaDoblementeEnlazada();
                    do {
                        System.out.println("Opciones lista doblemente enlazada");
                        System.out.println("1.- Insertar (agregar un elemento)");
                        System.out.println("2.- Eliminar (eliminar un elemento)");
                        System.out.println("3.- Buscar (Mostrar un elemento)");
                        System.out.println("4.- Mostrar la lista hacia adelante");
                        System.out.println("5.- Mostrar la lista hacia atras");
                        System.out.println("6.- Esta vacia? (Ver si la lista esta vacia)");
                        System.out.println("7.- Vaciar toda la estructura de datos");
                        System.out.println("8.- Eliminar la estructura de datos");
                        System.out.println("9.- Mostrar estado del programa");
                        System.out.println("10.- Salir de esta estructura");
                        opcionElejida = in.nextLine();

                        if (!validarEntradaNumeros(opcionElejida)) {
                            System.out.println("Error. Solo puede ingresar numeros.");
                            continue;
                        }

                        eleccion = Integer.parseInt(opcionElejida);

                        if (eleccion < 1 || eleccion > 10) {
                            System.out.println("Error. Ingreso un numero de opcion invalido");
                            continue;
                        }

                        int dato;
                        String datoString;
                        switch (eleccion) {
                            case 1:

                                System.out.println("Ingrese la posición donde desea insertar el dato:");
                                String posicionString = in.nextLine();

                                if (!validarEntradaNumeros(posicionString)) {
                                    System.out.println("Error. Solo puede ingresar numeros");
                                    continue;
                                }

                                int posicion = Integer.parseInt(posicionString);

                                System.out.println("Ingrese el dato a insertar:");
                                datoString = in.nextLine();

                                if (!validarEntradaNumeros(datoString)) {
                                    System.out.println("Error. Solo números.");
                                    continue;
                                }

                                dato = Integer.parseInt(datoString);

                                try {
                                    lista.insertarPosicion(posicion, dato);
                                    System.out.println("Dato insertado correctamente.");
                                } catch (Exception error) {
                                    System.out.println("Error: " + error.getMessage());
                                }

                                break;
                            case 2:

                                System.out.println("Ingrese el dato que sesea eliminar:");
                                datoString  = in.nextLine();

                                if (!validarEntradaNumeros(datoString)) {
                                    System.out.println("Error. Solo puede ingresar numeros.");
                                    continue;
                                }

                                dato = Integer.parseInt(datoString);

                                try {
                                    int eliminado = lista.eliminar(dato);
                                    System.out.println("Elemento: " + eliminado + ", eliminado con exito!!");
                                } catch (Exception error) {
                                    System.out.println("Error: " + error.getMessage());
                                }

                                break;
                            case 3:

                                System.out.println("Ingrese el dato a buscar:");
                                datoString = in.nextLine();

                                if (!validarEntradaNumeros(datoString)) {
                                    System.out.println("Error. Solo puede ingresar numeros.");
                                    continue;
                                }

                                dato = Integer.parseInt(datoString);

                                try {
                                    lista.buscar(dato);
                                } catch (Exception error) {
                                    System.out.println("Error: " + error.getMessage());
                                }

                                break;
                            case 4:

                                try {
                                    lista.mostrarAdelante();
                                    System.out.println("\n Lista mostrada con exito!!");
                                } catch (Exception error) {
                                    System.out.println("Error: " + error.getMessage());
                                }

                                break;
                            case 5:

                                try {
                                    lista.mostrarAtras();
                                    System.out.println("\n Lista mostrada con exito!!");
                                } catch (Exception error) {
                                    System.out.println("Error: " + error.getMessage());
                                }

                                break;
                            case 6:

                                if (lista.isEmpty()) {
                                    System.out.println("La lista esta vacia");
                                }
                                else {
                                    System.out.println("La lista no esta vacia");
                                }

                                System.out.println();

                                break;
                            case 7:

                                lista.vaciar();
                                System.out.println("La lista se ha vaciado con exito!!");
                                break;

                            case 8:

                                lista = null;
                                System.out.println("La lista se ha eliminado con exito!!");

                                int eleccionLista;
                                do {
                                    System.out.println("Desea crear otra lista doblemente enlazada?");
                                    System.out.println("1) Si");
                                    System.out.println("2) No. Salir de esta estructura de datos");

                                    String numeroString = in.nextLine();

                                    if (!validarEntradaNumeros(numeroString)) {
                                        System.out.println("Error. Solo puede ingresar numeros");
                                        continue;
                                    }

                                    eleccionLista = Integer.parseInt(numeroString);

                                    if (eleccionLista != 1 && eleccionLista != 2) {
                                        System.out.println("Error. Ingreso un numero de opcion invalido");
                                        continue;
                                    }

                                    if (eleccionLista == 1) {
                                        lista = new ListaDoblementeEnlazada();
                                        break;
                                    }
                                    else {
                                        eleccion = 10;
                                        break;
                                    }
                                } while (true);

                                break;
                            case 9:

                                System.out.println("Estructura de datos: Lista doblemente enlazada; Numero de elementos: " + lista.size());

                                break;
                        }
                    }while(eleccion!=10);
                    break;
            }
        }while(opcion!=4);
    }

    public static boolean validarEntradaNumeros(String numeroString){
        if (numeroString.isEmpty()) {
            return false;
        }

        if (!numeroString.matches("\\d+")) {
            return false;
        }

        return true;

    }
}
