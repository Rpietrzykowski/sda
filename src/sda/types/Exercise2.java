package sda.types;

/*
Napisz program, w którym wprowadzisz 5 dowolnie wybranych typów zmiennych z użyciem System.in a następnie wyświetlisz wprowadzone wartości.
Klasa, której należy użyć do importu została zaimplementowana.
*/

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        // put your code here
        System.out.println("Podaj numer: ");
        int givenNumber = userInput.nextInt();
        System.out.println("Podaj imię: ");
        String givenName = userInput.next();
        System.out.println("Podaj swój cytat: ");
        String givenSentence = userInput.nextLine();


        //print region

        System.out.println(givenNumber);
        System.out.println(givenName);
        System.out.println(givenSentence);
    }
}