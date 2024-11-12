/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.ArrayList;
import java.util.Objects;
import javax.swing.JOptionPane;

/**
 *
 * @author alvaro
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        String phrase = "";
        String phraseNoSpaces = "";
        ArrayList<Integer> posList = new ArrayList<>();

        phrase = JOptionPane.showInputDialog("Introduzca una frase: ");

        // Controlamos si cancelamos el jpotion
        if (Objects.isNull(phrase)) {
            phrase = "";
        }

        System.out.println("La frase introducida es: ");
        System.out.println(phrase);

        // Parte 1
        System.out.println("De tamaño " + phrase.length());

        // Parte 2
        char testChar = 'a';
        System.out.println("La letra " + testChar + " esta en la posicion "
                + phrase.toLowerCase().indexOf(testChar));

        System.out.println("");

        // Parte 3
        posList = positionsOfChar(phrase.toLowerCase(), 'a');
        System.out.println("Posiciones donde se encuentra " + testChar + ": ");
        System.out.println(posList.toString());

        System.out.println("");

        // Parte 4
        getValueAndType(phrase);

        System.out.println("");

        // Parte 5
        phraseNoSpaces = removeSpaces(phrase);

        // Parte 6
        System.out.println("La nueva frase es: ");
        System.out.println(phraseNoSpaces);
        System.out.println("De tamaño " + phraseNoSpaces.length());
    }

    /**
     * Devuelve las posiciones donde se encuentra el caracter dentr del string,
     * pasando ambos por parametros
     *
     * @param str el string donde buscar el caracter
     * @param c el caracter que tenemos que buscar
     * @return la lista con las posiciones donde se encuentra el caracter en el
     * array
     */
    public static ArrayList<Integer> positionsOfChar(String str, char c) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                list.add(i);
            }
        }
        return list;
    }

    public static void getValueAndType(String str) {
        int value = 0;
        String type = "";

        // [48 - 57] -> Number
        // [65 - 90] -> Capital letter
        // [97 - 122] -> Small letter
        for (int i = 0; i < str.length(); i++) {
            value = Character.codePointAt(str, i);
            type = getCharType(value);

            System.out.println("La letra " + str.charAt(i) + " tiene el valor "
                    + value + " y en una " + type + ".");
        }
    }

    /**
     * Devuelve un string indicando si el valor de un char corresponde a un
     * numero, letra mayuscula, letra minuscula o caracter especial, mirando los
     * valores unicode
     *
     * @param cValue valor del char a comprobar
     * @return tipo del char dependiendo de su valor unicode
     */
    public static String getCharType(int cValue) {
        String type = "";

        if (cValue >= 48 && cValue <= 57) {
            type = "numero";
        } else if (cValue >= 65 && cValue <= 90) {
            type = "letra mayuscula";
        } else if (cValue >= 97 && cValue <= 122) {
            type = "letra minuscula";
        } else {
            type = "caracter especial";
        }
        return type;
    }

    /**
     * Quita los espacios de un string
     *
     * @param str el string con espacios
     * @return el string sin espacios
     */
    public static String removeSpaces(String str) {
        String res = str.replace(" ", "");
        return res;
    }
}
