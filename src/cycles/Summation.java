package cycles;

import java.util.Scanner;

/*
boolean isExit = false;
while (!isExit)
{
   String s = console.nextLine();
   isExit = s.equals("exit");
}
 */
public class Summation {
    public static void main(String[] args) {
        //напишите тут ваш код
        boolean isEnter = false;
        Scanner console = new Scanner(System.in);
        int sum = 0;
        while (!isEnter) {
            String x = console.nextLine();
            isEnter = x.equals("ENTER");
            if (!isEnter) {
                sum += Integer.parseInt(x);
            }
        }
        System.out.println(sum);
    }
}
