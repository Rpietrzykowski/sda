package sda.loops;

/*
Napisz program, który:
- jako pierwszą liczbę przyjmuje ilość liczb, które muszą zostać wpisane do programu
- następnie wpisać ilość zadeklarowanych wcześniej liczb w konsoli
- wyświetli wszystkie wpisane liczby
- liczby podzielne przez 8 zsumuje i wyświetli na końcu jako liczbę całkowitą
 */

import java.util.Scanner;

public class Sol4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int iterator = sc.nextInt();
        int nextNum;
        int sumOfNums = 0;

        for (int i = 0; i < iterator; i++) {
            nextNum = sc.nextInt();
            if (nextNum % 6 == 0) {
                sumOfNums = sumOfNums + nextNum;
            }
        }
        System.out.println(sumOfNums);
    }
}
