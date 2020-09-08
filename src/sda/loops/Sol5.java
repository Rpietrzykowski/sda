package sda.loops;

/*
Napisz program, który będzie przyjmował znak następnie pytał użytkownika czy chce wyjść z gry.
Jeżeli użytkownik wpisze znak q wtedy ma zostać wyświetlony komunikat "Gra wyłączona"
Jeżeli użytkownik wpisze inny znak, ma się pojawić ponownie pytanie czy chce wyjść z gry.
 */

import java.util.Scanner;

public class Sol5 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        boolean quit = true;
        String userChar;

        while(quit) {
            System.out.println("Czy chcesz wyjść z gry? (Wpisz q, aby wyjść.)");
            userChar = userInput.next();
            if (userChar.equals("q")) {
                quit = false;
            }


        }
    }
}
