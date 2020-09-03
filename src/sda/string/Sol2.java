package sda.string;

import java.util.Scanner;

/*
Napisz program, który pobierze od użytkownika nazwę miasta a następnie sprawdzi czy na końcu wystąpi końcówka -burg.

Output:
Ausburg
true
Oslo
false
 */

public class Sol2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        System.out.println(city.endsWith("burg"));
    }
}
