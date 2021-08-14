package cycles;

import java.util.Scanner;

public class WhileMaxInput {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner console = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        while (console.hasNextInt()) {
            int x = console.nextInt();
            if (x > max && (x % 2) == 0)
                max = x;
        }
        System.out.println(max);
    }
}
