package sda.instructions;

/*
Napisz program, który przyjmuje liczbę a następnie wyświetla w konsoli YES,
jeżeli jest dodatnia lub NO, jeżeli jest ujemna lub zerowa.

 */

import java.util.Scanner;

public class Sol1 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int firstNumber = userInput.nextInt();
        if (firstNumber > 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
