package sda.loops;

/*
Napisz program, który:

- Pobierze od użytkownika liczbę elementów do pobrania.
- Pozwoli wpisać taką samą liczbę różnych liczb jak liczba elementów podana wcześniej.
- Znajdzie najwyższą liczbę podzielną przez 4 i wyświetli ją na ekranie spośród tych liczb.

Liczba elementów do wpisania nie może być większa niż 1000.
Liczba wprowadzona jako pojedyńczy element nie może być większa niż 30000.

*/

import java.util.Scanner;

public class Sol7 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int divisibleByFour = 0;
        while (userInput.hasNext()) {
            int num = userInput.nextInt();
            if (num % 4 == 0 && divisibleByFour < num) {
                divisibleByFour = num;
            }
        }
        System.out.println(divisibleByFour);
    }
}
