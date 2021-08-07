package cycles;

import java.util.Scanner;

/*
Программа должна считывать целые числа с клавиатуры до тех пор,
пока не будет введено что-то другое: например, строка или символ.
Выведи на экран минимальное число из введенных. Если введено несколько таких чисел,
необходимо вывести любое из них.
 */
public class WhileBreak {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner console = new Scanner(System.in);
        while (true) {
            String x = console.nextLine();
            if (x.equals("enough"))
                break;
            System.out.println(x);
        }


    }
}
