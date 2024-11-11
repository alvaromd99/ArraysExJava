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
public class Ejercicio2 {

    public static void main(String[] args) {
        final int TAM = 10;

        ArrayList<Integer> list1 = new ArrayList<>(TAM);
        ArrayList<Integer> list2 = new ArrayList<>(TAM);
        ArrayList<Integer> listRes = new ArrayList<>(TAM);

        giveRandomValues(list1, TAM);
        giveRandomValues(list2, TAM);

        showList(list1);
        showList(list2);

        listRes = multiplyLists(list1, list2);
        showList(listRes);
        
        System.out.println("Mostrar personalizado: ");
        showList2(listRes);
        System.out.println("");
        showList3(listRes);
    }

    public static void giveRandomValues(ArrayList<Integer> list, int tam) {
        Random rd = new Random();

        for (int i = 0; i < tam; i++) {
            int n = rd.nextInt(1, 100) + 1;
            list.add(n);
        }
    }

    public static void showList(ArrayList<Integer> list) {
        System.out.println(list.toString());
    }

    public static void showList2(ArrayList<Integer> list) {
        System.out.print("{ ");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                System.out.print(list.get(i));
            } else {
                System.out.print(list.get(i) + " -> ");
            }
        }
        System.out.print(" }");
    }

    public static void showList3(ArrayList<Integer> list) {
        String res = "";
        res += "{ ";
        for (Integer el : list) {
            res = res.concat(el + " -> ");
        }
        res = res.substring(0, res.length() - 4);
        res += " }";

        System.out.println(res);
    }

    public static ArrayList<Integer> multiplyLists(ArrayList<Integer> listA,
            ArrayList<Integer> listB) {
        ArrayList<Integer> listRes = new ArrayList<>();

        for (int i = 0; i < listA.size(); i++) {
            listRes.add(listA.get(i) * listB.get(i));
        }

        return listRes;
    }
}
