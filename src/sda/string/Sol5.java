package sda.string;

/*
Napisz program, który pobierze od użytkownika tekst a następnie sprawi, że cały tekst wyświetli się małymi literami.
*/

import java.util.Scanner;

public class Sol5 {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        String userString = userInput.nextLine();
        System.out.println(userString.toUpperCase());
    }
}
