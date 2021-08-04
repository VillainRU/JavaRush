package cycles;

/*
Используя вложенные циклы while (цикл в цикле) выведи на экран
незаполненный прямоугольник (его контур) размером 10 (высота) на 20 (ширина) из букв 'Б'.
Незаполненная часть состоит из пробелов.
 */
public class CyclesInCycles2 {
    public static void main(String[] args) {
        int h = 0;
        while (h < 10) {
            int w = 0;
            while (w < 20) {
                if (h == 0 || h == 9 || w == 0 || w == 19) {
                    System.out.print("Б");
                } else {
                    System.out.print(" ");
                }
                w++;
            }
            h++;
            System.out.println();
        }
    }
}


