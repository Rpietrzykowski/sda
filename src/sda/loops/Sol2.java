package sda.loops;

/*
Napisz program, który przyjmuje liczbę następnie wyświetla
liczby parzyste od 0 do wpisanej liczby.

 */

import java.util.Scanner;

public class Sol2 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int userNumber = userInput.nextInt();

        for (int x = 1; x <= userNumber; x++) {
            if (x % 2 != 1) {
                System.out.println(x);
            }
        }
    }
}
