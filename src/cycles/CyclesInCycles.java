package cycles;
/*
Используя вложенные циклы while (цикл в цикле) выведи
на экран прямоугольник размером 5 (высота) на 10 (ширина),
заполненный буквой 'Q'.
 */
public class CyclesInCycles {
    public static void main(String[] args) {

        int h = 0;
        while (h < 5) {
            int w = 0;

            while (w < 10) {
                System.out.print("Q");
                w++;
            }

            System.out.println();
            h++;
    }
}
}
