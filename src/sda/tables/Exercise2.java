package sda.tables;

/*
Napisz program w którym:
 - zadeklarujesz tablicę typu String
 - przypiszesz wybrane przez Ciebie wartości w danej tablicy
 - wyświetlisz stan tablicy w konsoli przed sortowaniem
 - posortujesz tablicę rosnąco
 - wyświetlisz stan tablicy po sortowaniu
 */

import java.util.Arrays;

public class Exercise2 {
    public static void main(String[] args) {
        //put your code here
        String[] stringArray = new String[] { "Mleko", "Jablko", "Banan", "Rower" };
        for (String element:stringArray) {
            System.out.print(element + " ");
        }
        Arrays.sort(stringArray);
        System.out.println();
        for (int x = 0; x < stringArray.length; x++ ){
            System.out.print(stringArray[x] + " ");
        }

    }
}

//import java.util.Arrays;
//
//public class Exercise2 {
//    public static void main(String[] args){
//        String[] my_array2 = {
//                "Java",
//
//                "Python",
//                "PHP",
//                "C#",
//                "C Programming",
//                "C++"
//        };
//
//        System.out.println("Original string array : "+Arrays.toString(my_array2));
//        Arrays.sort(my_array2);
//        System.out.println("Sorted string array : "+Arrays.toString(my_array2));
//    }
//}