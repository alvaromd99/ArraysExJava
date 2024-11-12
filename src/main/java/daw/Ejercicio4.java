/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alvaro
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        final int TAM = 10;

        int num = 0;
        int[] arr = new int[4];

        ArrayList<int[]> list = new ArrayList<>();
        ArrayList<int[]> pinList = new ArrayList<>();

        list = randomPinList(TAM);
        
        System.out.println("Lista de los pins en la lista principal: ");
        showListOfArray(list);

        // Parte 1
        System.out.println("");
        System.out.println("Pines que contengan un numero.");
        num = getNumber();
        pinList = getPinWithNum(list, num);
        System.out.println("Lista de los pins con el numero " + num + ": ");
        showListOfArray(pinList);

        // Parte 2
        System.out.println("");
        System.out.println("Esta el pin introducido en la lista.");
        arr = getIntArray();
        System.out.println("Array del usuario: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Esta el array introducido en la lista principal? "
                + isArrayInList(list, arr));
    }

    /**
     * Muestra por consola los arrays que contiene la lista.
     *
     * @param list la lista de arrays que se va a mostrar.
     */
    public static void showListOfArray(ArrayList<int[]> list) {
        for (int[] el : list) {
            System.out.println(Arrays.toString(el));
        }
    }

    /**
     * Crea una lista de arrays de tamaño 4, con números aleatorios en cada
     * array. Los números generados no se repiten dentro de cada array.
     *
     * @param tam el número de arrays que tendrá la lista.
     * @return la lista llena con arrays de números aleatorios sin repeticiones.
     */
    public static ArrayList<int[]> randomPinList(int tam) {
        ArrayList<int[]> list = new ArrayList<>();

        for (int i = 0; i < tam; i++) {
            // La inicializacion del array tiene que estar dentro porque dentro
            // de la lista estamos guardando las direcciones de memoria de los
            // arrays (obj), y tenemos que crear una nueva instancia del array
            // para poder guardar otro nuevo array en memoria y la direccion
            // del array en la lista.
            int[] arr = new int[4];

            arr = generatePinNoRepetition();

            list.add(arr);
        }
        return list;
    }

    /**
     * Genera un array de 4 enteros con números aleatorios entre 0 y 9 sin
     * repeticiones.
     *
     * @return un array de 4 números aleatorios sin repeticiones.
     */
    public static int[] generatePinNoRepetition() {
        Random rd = new Random();

        int[] arr = new int[4];
        int n = 0;

        int i = 0;
        while (i < 4) {
            n = rd.nextInt(0, 10);
            if (!isInArray(arr, n)) {
                arr[i] = n;
                i++;
            }
        }
        return arr;
    }

    /**
     * Comprueba si un número se encuentra dentro de un array.
     *
     * @param arr el array en el que buscamos el número.
     * @param n el número que buscamos en el array.
     * @return {@code true} si el número se encuentra en el array, {@code false}
     * si el número no está en el array.
     */
    public static boolean isInArray(int[] arr, int n) {
        for (int el : arr) {
            if (el == n) {
                return true;
            }
        }
        return false;
    }

    /**
     * Obtiene una lista de los arrays en la lista original que contienen el
     * número especificado.
     *
     * @param list la lista de arrays donde se realizará la búsqueda.
     * @param n el número que se busca dentro de los arrays.
     * @return una lista de arrays que contienen el número especificado.
     */
    public static ArrayList<int[]> getPinWithNum(ArrayList<int[]> list, int n) {
        ArrayList<int[]> listRes = new ArrayList<>();

        for (int[] elem : list) {
            if (isInArray(elem, n)) {
                listRes.add(elem);
            }
        }
        return listRes;
    }

    /**
     * Pedimos un numero entero al usuario, contralando la excepcion
     *
     * @return el numero que ha introducido el usuario
     */
    public static int getNumber() {
        Scanner sc = new Scanner(System.in);
        int n = 0;

        do {
            System.out.println("Introduce un numero (0 - 9): ");
            try {
                n = sc.nextInt();
            } catch (InputMismatchException ime) {
                System.out.println("Error. No has introducido un numero.");
                sc.nextLine();
            }
        } while (n < 0 || n > 9);

        return n;
    }

    /**
     * Solicita al usuario que introduzca un array de 4 números enteros,
     * asegurándose de que no haya repeticiones.
     *
     * @return un array de 4 números introducidos por el usuario sin
     * repeticiones.
     */
    public static int[] getIntArray() {
        int[] arr = new int[4];
        int n = 0;

        for (int i = 0; i < arr.length; i++) {
            // Controlamos que no pueda introducir numeros repetidos
            do {
                n = getNumber();

                if (!isInArray(arr, n)) {
                    arr[i] = n;
                    break;
                }
            } while (true);
        }
        return arr;
    }

    /**
     * Compara un array con los arrays contenidos en una lista y verifica si el
     * array introducido es igual a alguno de los de la lista.
     *
     * @param list la lista de arrays en la que se buscará el array.
     * @param arr el array que se va a buscar en la lista.
     * @return {@code true} si el array se encuentra en la lista {@code false}
     * si no se encuentra en la lista.
     */
    public static boolean isArrayInList(ArrayList<int[]> list, int[] arr) {
        for (int[] listElem : list) {
            if (Arrays.equals(listElem, arr)) {
                return true;
            }
        }
        return false;
    }
}
