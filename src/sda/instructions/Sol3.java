package sda.instructions;

import java.util.Scanner;

/*
Napisz program, który przyjmuje jako parametr liczebność wojska a następnie klasyfikuje je co do wielkości:

Poniżej 0 - brak armii
Od 1 do 19 - drużyna
Od 20 do 249 - pluton
Od 250 do 999 - kompania
Powyżej 1000 - batalion

 */

public class Sol3 {
    public static void main(String[] args) {

        // put your code here
        Scanner sc = new Scanner(System.in);

        int troops = sc.nextInt();

        if (troops < 1) {
            System.out.println("Brak armii");
        } else if (troops <= 19) {
            System.out.println("Drużyna");
        } else if (troops <= 249) {
            System.out.println("Pluton");
        } else if (troops <= 999) {
            System.out.println("Kompania");
        } else {
            System.out.println("Batalion");
        }
    }
}

