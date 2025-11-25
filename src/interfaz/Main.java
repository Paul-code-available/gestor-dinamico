package interfaz;

import java.util.Scanner;
import logica.Cola;
import logica.ListaDoblementeEnlazada;
import logica.Pila;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("||||||||||MENU||||||||||");
            System.out.println("Que estructura de datos desea crear: ");
            System.out.println("1.- Crear una cola");
            System.out.println("2.- Crear una pila");
            System.out.println("3.- Crear una lista doblemente enlazada");
            System.out.println("4.- Salir del programa");
            opcion = in.nextInt();

            int eleccion;
            switch(opcion){
                case 1:

                    do {
                        in.nextLine();
                        System.out.println("Opciones cola");
                        System.out.println("1.- Encolar (agregar un elemento a la cola)");
                        System.out.println("2.- Desencolar (eliminar un elemento de la cola)");
                        System.out.println("3.- Peek (mostrar el primer elemento de la cola)");
                        System.out.println("4.- Esta vacia? (Ver si la cola esta vacia)");
                        System.out.println("5.- Ver todos los elementos de la cola");
                        System.out.println("6.- Vaciar toda la estructura de datos");
                        System.out.println("7.- Eliminar la estructura de datos");
                        System.out.println("8.- Mostrar estado dell programa");
                        System.out.println("9.- Salir del programa");
                        eleccion = in.nextInt();

                        if (eleccion < 1 || eleccion > 9) {
                            System.out.println("Error. Ingreso un numero de opcion invalido");
                            continue;
                        }

                        switch (eleccion) {
                            case 1:
                                in.nextLine();



                                break;
                            case 2:
                                in.nextLine();

                                break;
                            case 3:
                                in.nextLine();

                                break;
                            case 4:
                                in.nextLine();

                                break;
                            case 5:
                                in.nextLine();

                                break;
                            case 6:
                                in.nextLine();

                                break;
                            case 7:
                                in.nextLine();

                                break;
                            case 8:
                                in.nextLine();

                                break;
                        }
                    }while(eleccion!=9);

                    break;
                case 2:
                    do {
                        in.nextLine();
                        System.out.println("Opciones pila");
                        System.out.println("1.- Push (agregar un elemento)");
                        System.out.println("2.- Pop (eliminar y devolver el elemento superior)");
                        System.out.println("3.- peek (mostrar sin eliminar el elemento superior)");
                        System.out.println("4.- Esta vacia? (Ver si la pila esta vacia)");
                        System.out.println("5.- Ver todos los elementos de la pila");
                        System.out.println("6.- Vaciar toda la estructura de datos");
                        System.out.println("7.- Eliminar la estructura de datos");
                        System.out.println("8.- Mostrar estado dell programa");
                        System.out.println("9.- Salir del programa");
                        eleccion = in.nextInt();

                        if (eleccion < 1 || eleccion > 9) {
                            System.out.println("Error. Ingreso un numero de opcion invalido");
                            continue;
                        }

                        switch (eleccion) {
                            case 1:
                                in.nextLine();

                                break;
                            case 2:
                                in.nextLine();

                                break;
                            case 3:
                                in.nextLine();

                                break;
                            case 4:
                                in.nextLine();

                                break;
                            case 5:
                                in.nextLine();

                                break;
                            case 6:
                                in.nextLine();

                                break;
                            case 7:
                                in.nextLine();

                                break;
                            case 8:
                                in.nextLine();

                                break;
                        }
                    }while(eleccion!=9);


                    break;
                case 3:
                    do {
                        in.nextLine();
                        System.out.println("Opciones lista doblemente enlazada");
                        System.out.println("1.- Insertar (agregar un elemento)");
                        System.out.println("2.- Eliminar (eliminar un elemento)");
                        System.out.println("3.- Buscar (Mostrar un elemento)");
                        System.out.println("4.- Esta vacia? (Ver si la lista esta vacia)");
                        System.out.println("5.- Ver todos los elementos de la lista");
                        System.out.println("6.- Vaciar toda la estructura de datos");
                        System.out.println("7.- Eliminar la estructura de datos");
                        System.out.println("8.- Mostrar estado dell programa");
                        System.out.println("9.- Salir del programa");
                        eleccion = in.nextInt();

                        if (eleccion < 1 || eleccion > 9) {
                            System.out.println("Error. Ingreso un numero de opcion invalido");
                            continue;
                        }


                        switch (eleccion) {
                            case 1:
                                in.nextLine();

                                break;
                            case 2:
                                in.nextLine();

                                break;
                            case 3:
                                in.nextLine();

                                break;
                            case 4:
                                in.nextLine();

                                break;
                            case 5:
                                in.nextLine();

                                break;
                            case 6:
                                in.nextLine();

                                break;
                            case 7:
                                in.nextLine();

                                break;
                            case 8:
                                in.nextLine();

                                break;
                        }
                    }while(eleccion!=9);
                    break;
            }
        }while(opcion!=4);






    }
}
