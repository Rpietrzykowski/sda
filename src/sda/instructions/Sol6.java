package sda.instructions;

/*
Napisz program, który przejmuje liczbę a jako wynik wyświetla czy wprowadzona liczba jest parzysta czy nie.
 */

import java.util.Scanner;

public class Sol6 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Podaj liczbę naturalną: ");
        int givenNumber = userInput.nextInt();

        if (givenNumber % 2 == 0){
            System.out.println("Liczba parzysta");
        }
        else {
            System.out.println("Liczba nieparzysta");
        }
    }
}
