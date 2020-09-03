package sda.string;

/*
Napisz program, który pobierze od użytkownika tekst a następnie sprawi, że cały tekst wyświetli się wielkimi literami.
*/

import java.util.Scanner;

public class Sol4 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        String userString = userInput.nextLine();
        System.out.println(userString.toUpperCase());
    }
}
