package sda.tables;

/*
Napisz program w którym:
 - zadeklarujesz tablicę typu liczbowego
 - przypiszesz wybrane przez Ciebie wartości w danej tablicy
 - wyświetlisz stan tablicy w konsoli przed sortowaniem
 - posortujesz tablicę rosnąco
 - wyświetlisz stan tablicy po sortowaniu
 */

import java.lang.reflect.Array;
import java.util.Arrays;

public class Exercise1 {
    public static void main(String[] args) {
        //put your code here
        int[] newArray;
        newArray = new int[] {110, 0, 15, 55, 1};
        for (int el:newArray) {
            System.out.print(el + " ");
        }

        System.out.println();
        for (int el:newArray) {
            System.out.print( el + " ");
        }

    }
}

//import java.util.Arrays;
//public class Exercise1 {
//    public static void main(String[] args){
//
//        int[] my_array1 = {
//                1789, 2035, 1899, 1456, 2013,
//                1458, 2458, 1254, 1472, 2365,
//                1456, 2165, 1457, 2456};

//        System.out.println("Original numeric array : "+Arrays.toString(my_array1));
//        Arrays.sort(my_array1);
//        System.out.println("Sorted numeric array : "+Arrays.toString(my_array1));
//    }
//}