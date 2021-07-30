package level03.lecture03;

import java.util.Scanner;

public class Coordinates {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner console = new Scanner(System.in);
        int x = console.nextInt();
        int y = console.nextInt();

        System.out.println(x > 0 ? y > 0 ? 1 : 4 : y > 0 ? 2 : 3);
    }
}
