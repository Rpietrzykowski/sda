package sda.string;

import java.util.Scanner;

/*
Napisz program, który pobierze od użytkownika tekst oraz początek i koniec nowego tekstu a następnie wyświetli nowy
tekst w konsoli.
*/

public class Sol3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userString = scanner.nextLine();
        int start = scanner.nextInt();
        int stop = scanner.nextInt() + 1;

        System.out.println(userString.substring(start, stop));
    }
}
