package sda.loops;

/*
Napisz program, który:

- Na samym początku zapyta czy chcesz dodać cyfrę do wyniku.
- Jeżeli użytkownik wpisze String tak, licznik ma zostać zwiększony o 1 i wyświetlony aktualny wynik.
- Jeżeli użytkownik wpisze String nie, program ma wyświetlić wynik i wyświetlić komunikat koniec gry.
- Jeżeli użytkownik wpisze jakikolwiek inny znak wtedy ma wyświetlić ponownie pytanie i licznik ma nie zostać zwiększony.
 */

import java.util.Scanner;

public class Sol6 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String userString;
        int score = 0;

        while (true) {
            System.out.print("Czy chcesz zwiększyć wynik? (Wpisz tak): ");
            userString = userInput.nextLine().toLowerCase();
            if(userString.equals("tak")) {
                score++;
            } else if (userString.equals("nie")) {
                System.out.println("Twój wynik to: " + score);
                System.out.println("Koniec gry!");
                break;
            }
        }

    }
}
