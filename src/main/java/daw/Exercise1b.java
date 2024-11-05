/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author alvaro
 */
public class Exercise1b {

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3));

        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> list4 = new ArrayList<>(Arrays.asList(1, 2, 3));

        ArrayList<Integer> list5 = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> list6 = new ArrayList<>(Arrays.asList(1, 2, 2));

        boolean res1Fun = list1.equals(list2);
        boolean res2Fun = list3.equals(list4);
        boolean res3Fun = list5.equals(list6);
        
        boolean res1Met = areArrListEquales(list1, list2);
        boolean res2Met = areArrListEquales(list3, list4);
        boolean res3Met = areArrListEquales(list5, list6);
        
        showResponse(list1, list2, res1Fun);
        showResponse(list3, list4, res2Fun);
        showResponse(list5, list6, res3Fun);
        
        System.out.println("");
        
        showResponse(list1, list2, res1Met);
        showResponse(list3, list4, res2Met);
        showResponse(list5, list6, res3Met);
    }
    
    public static void showResponse(ArrayList<Integer> a, ArrayList<Integer> b,
            boolean res) {
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println("Son iguales ? " + res);
    }

    public static boolean areArrListEquales(ArrayList<Integer> a,
            ArrayList<Integer> b) {
        if (a.size() != b.size()) {
            return false;
        }
        
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) != b.get(i)) {
                return false;
            }
        }

        return true;
    }
}
