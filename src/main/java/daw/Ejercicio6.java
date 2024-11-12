/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author alvaro
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        final int TAM = 20;
        final int MIN = 10;
        final int MAX = 100;
        ArrayList<Integer> list = new ArrayList<>();
        
        list = giveRandomValuesToList(TAM, MIN, MAX + 1);
        
        showIntList(list);
    }
    
    /**
     * Devuelve una lista rellana con numeros aleatorios de una tamaño, con un
     * minimo y maximo de los numeros aleatorios
     * 
     * @param tam el tamaño de la lista
     * @param min el minimo para los numeros aleatorios
     * @param max el maximo para los numeros aleatorios
     * @return  la nueva lista rellena con los numeros aleatorios
     */
    public static ArrayList<Integer> giveRandomValuesToList(int tam, int min, 
            int max) {
        ArrayList<Integer> resList = new ArrayList<>();
        Random rd = new Random();
        
        for (int i = 0; i < tam; i++) {
            resList.add(rd.nextInt(10, 101));
        }
        return resList;
    }
    
    /**
     * Muesta los valores de una lista de enteros
     * 
     * @param list la lista que vamos a mostrar
     */
    public static void showIntList(ArrayList<Integer> list) {
        System.out.println("La lista contiene los siguientes valores: ");
        System.out.println(list.toString());
    }
    
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }
    
    /**
     * Calcula la suma de todos los valores pares de una lista
     * 
     * @param list la lista donde vamos a buscar los valores pares
     * @return  la suma de los valores pares de la lista
     */
    public static int sumOfEvenNumOnList(ArrayList<Integer> list) {
        int sum = 0;
        
        for (Integer elem : list) {
            if (isEven(elem)) {
                sum += elem;
            }
        }
        return sum;
    }
    
    /**
     * Cuenta cuantos numeros impares hay en una lista dada
     * 
     * @param list la lista donde vamos a contar los impares
     * @return  la cantidad de impares que tiene la lista
     */
    public static int countOfOddNumOnList(ArrayList<Integer> list) {
        int cont = 0;
        
        for (Integer elem : list) {
            if (!isEven(elem)) {
                cont++;
            }
        }
        return cont;
    }
}
