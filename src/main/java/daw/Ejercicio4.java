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

        ArrayList<int[]> list = new ArrayList<>();
        ArrayList<int[]> pinList = new ArrayList<>();

        list = randomPinList(TAM);

        showListOfArray(list);

        num = getNumber();
        pinList = getPinWithNum(list, num);

        showListOfArray(pinList);
    }

    public static void showListOfArray(ArrayList<int[]> list) {
        System.out.println("Arrays dentro de la lista: ");
        for (int[] el : list) {
            System.out.println(Arrays.toString(el));
        }
    }

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

    public static boolean isInArray(int[] arr, int n) {
        for (int el : arr) {
            if (el == n) {
                return true;
            }
        }
        return false;
    }

    public static ArrayList<int[]> getPinWithNum(ArrayList<int[]> list, int n) {
        ArrayList<int[]> listRes = new ArrayList<>();

        for (int[] elem : list) {
            if (isInArray(elem, n)) {
                listRes.add(elem);
            }
        }
        return listRes;
    }

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
}
