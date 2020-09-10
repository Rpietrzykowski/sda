package sda.instructions;

/*
Napisz program, który:
- przejmuje wiek od użytkownika
- pyta czy posiada zgodę rodziców
- pyta czy pracuje w służbie mundurowej
- pyta czy posiada kategorię A2 co najmniej 2 lata

następnie jako wynik wyświetla jaką kategorię prawa jazdy na motor jesteś w stanie uzyskać.

Kategoria AM - 14 lat
Kategoria A1 - 16 lat + zgoda rodziców lub 18 lat
Kategoria A2 - 18 lat
Kategoria A - 24 lata lub 20 lat + posiadanieposiadanie A2 co najmniej 2 lata lub 18 lat mundurówka

 */

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        //put your code here
        Scanner userInput = new Scanner(System.in);
        System.out.println("Podaj wiek: ");
        int age = userInput.nextInt();
        System.out.println("Czy posiadasz zgodę rodziców? (true/false)");
        boolean parentsPermission = userInput.nextBoolean();
        System.out.println("Czy pracujesz w służbie mundurowej? ");
        boolean workInMilitary = userInput.nextBoolean();
        System.out.println("Czy posiadasz kategorię A2 co najmniej dwa lata? ");
        boolean categoryA2For2Years = userInput.nextBoolean();
        if(age >= 24 || (age >= 20 && categoryA2For2Years) || (age >= 18 && workInMilitary)) {
            System.out.println("Jesteś w stanie uzyskać kateofrię A");
        }else if(age >= 18) {
            System.out.println("Jesteś w stanie uzyskać kateofrię A2");
        }else if(age >= 16 && parentsPermission) {
            System.out.println("Jesteś w stanie uzyskać kateofrię A1");
        }else  if(age >= 14){
            System.out.println("Jesteś w stanie uzyskać kateofrię AM");
        }else {
            System.out.println("\nNie jesteś w stanie uzyskać żadnej kategorii");
        }
    }
}
