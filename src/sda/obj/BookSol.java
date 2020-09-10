package sda.obj;

/*
Stwórz klasę o nazwie Book. Stworzona klasa ma zawierać trzy pola:
- pole string o nazwie title,
- pole int o nazwie yearOfPublishing
- pole boolean o nazwie isAvailable

Następnie stwórz w klasie Exercise1 trzy wybrane przez Ciebie książki.
 */

class Book2 {
    String title;
    int yearOfPublishing;
    boolean isAvailable;
}

public class Sol1 {
    public static void main(String[] args) {
        Book2 negotiate = new Book2();
        negotiate.title = "Negotiate";
        negotiate.yearOfPublishing = 2012;
        negotiate.isAvailable = true;

        Book ninjaAttack = new Book();
//        ninjaAttack.title = "Ninja Attack";
//        ninjaAttack.yearOfPublishing = 1999;
//        ninjaAttack.isAvailable = false;
//
//        Book startCode = new Book();
//        startCode.title = "Start to Code";
//        startCode.yearOfPublishing = 2020;
//        startCode.isAvailable = false;
    }
}
