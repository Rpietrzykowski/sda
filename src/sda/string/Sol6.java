package sda.string;

/*
Napisz program, który pobierze od użytkownika pięć słów a następnie wyświetli je jako jeden tekst w konsoli.
*/

import java.util.Scanner;

public class Sol6 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        String firWord = userInput.next();
        String secWord = userInput.next();
        String thiWord = userInput.next();
        String fourWord = userInput.next();
        String fifWord = userInput.next();

        String fullSentence = firWord + secWord + thiWord + fourWord + fifWord;

        System.out.println(fullSentence);
    }
}
