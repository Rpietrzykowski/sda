package sda.loops;

/*
Napisz program, który wyświetla w konsoli liczby od 0 do 4 przy użyciu pętli while i for.
 */

public class Sol1 {
    public static void main(String[] args) {
        //FOR
        for (int x = 0; x <= 4; x++) {
            System.out.println(x);
        }
        System.out.println();

        //WHILE
        int x = 0;
        while (x <= 4) {
            System.out.println(x);
            x++;
        }
    }
}
