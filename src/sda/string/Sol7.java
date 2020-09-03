package sda.string;

/*
Napisz program, który pobierze od użytkownika dwa zdania i sprawdzi czy zdania są takie same wyświetlając na końcu true
 lub false.
*/

import java.util.Scanner;

public class Sol7 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Wprowadź pierwsze zdanie: ");
        String firstSentence = userInput.nextLine();

        System.out.println("Wprowadź drugie zdanie: ");
        String secondSentence = userInput.nextLine();

        boolean isSame = firstSentence.equalsIgnoreCase(secondSentence);
        System.out.println(isSame);
    }
}
