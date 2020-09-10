package sda.instructions;

/*
Napisz program, który:
- Przyjmuje od użytkownika liczby A, B oraz C a jako długości boków trójkąta.
- Sprawdza czy trójkąt z wymienionymi bokami mógłby istnieć.

Warunki istnienia trójkąta:
1. A + B > C
2. A + C > B
3. B + C > A
 */

import java.util.Scanner;

public class Sol2 {
    public static void main(String[] args) {

        //put your code here
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a + b > c && b + c > a && c + a > b) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
