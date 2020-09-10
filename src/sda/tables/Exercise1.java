package sda.tables;

/*
Napisz program w którym:
 - zadeklarujesz tablicę typu liczbowego
 - przypiszesz wybrane przez Ciebie wartości w danej tablicy
 - wyświetlisz stan tablicy w konsoli przed sortowaniem
 - posortujesz tablicę rosnąco
 - wyświetlisz stan tablicy po sortowaniu
 */

import java.util.Arrays;

public class Exercise1 {
    public static void main(String[] args) {
        //put your code here
        int[] tab;
        tab = new int[]{100, 200, 5, 7, 11, 3};

        for (int val : tab) {
            System.out.print(val + " ");
        }
        System.out.println();
        Arrays.sort(tab);

        for (int val : tab) {
            System.out.print(val + " ");
        }

    }
}