/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alvaro
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        int n = 0;

        do {
            System.out.println("Introduce un numero entre 1 y 20. Introduce"
                    + " 0 para salir:");
            n = sc.nextInt();

            if (n > 0 && n < 20) {
                list.add(n);
            }
        } while (n != 0);

        for (int i = 0; i < list.size(); i++) {
            System.out.print((i + 1) + ": ");

            for (int j = 0; j < list.get(i); j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
