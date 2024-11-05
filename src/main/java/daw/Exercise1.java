/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.Arrays;

/**
 *
 * @author alvaro
 */
public class Exercise1 {

    public static void main(String[] args) {
        // Arrays to test
        int[] arr1 = new int[]{1, 2, 3};
        int[] arr2 = new int[]{1, 2, 3};

        int[] arr3 = new int[]{1, 2, 3, 4};
        int[] arr4 = new int[]{1, 2, 3};

        int[] arr5 = new int[]{1, 2, 3};
        int[] arr6 = new int[]{1, 2, 2};
        
        boolean res1Func = Arrays.equals(arr1, arr2);
        boolean res2Func = Arrays.equals(arr3, arr4);
        boolean res3Func = Arrays.equals(arr5, arr6);

        boolean res1Met = areArraysEquals(arr1, arr2);
        boolean res2Met = areArraysEquals(arr3, arr4);
        boolean res3Met = areArraysEquals(arr5, arr6);

        showResponse(arr1, arr2, res1Func);
        showResponse(arr3, arr4, res2Func);
        showResponse(arr5, arr6, res3Func);

        System.out.println("");

        showResponse(arr1, arr2, res1Met);
        showResponse(arr3, arr4, res2Met);
        showResponse(arr5, arr6, res3Met);
    }

    public static void showResponse(int[] a, int[] b, boolean res) {
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println("Son iguales ? " + res);
    }

    /**
     * Compares two arrays of integers for equality.
     * <p>
     * This method checks if the two arrays are of the same length and if every
     * corresponding element in the arrays is equal. The comparison is done
     * element by element.
     * </p>
     *
     * @param a The first array of integers to compare.
     * @param b The second array of integers to compare.
     * @return  {@code true} if the two arrays have the same length and all
     *                       corresponding elements are equal; 
     *          {@code false} otherwise.
     */
    public static boolean areArraysEquals(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }
}
