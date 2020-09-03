package sda.string;

/*
Napisz program, który pobierze od użytkownika słowo i sprawdzi czy zaczyna się od małej litery j.
Program w konsoli powinien wyświetlić wartość true lub false.
*/

import java.util.Scanner;

public class Sol8 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        String givenChar = userInput.next().substring(0, 1);
        String char_j = "j";

        boolean isEqual = givenChar.equals(char_j);
        System.out.println(isEqual);
    }
}
