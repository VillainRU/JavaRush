package cycles;
/*
Используя вложенные циклы while (цикл в цикле) выведи на экран
незаполненный прямоугольник (его контур) размером 10 (высота) на 20 (ширина) из букв 'Б'.
Незаполненная часть состоит из пробелов.
 */
public class CyclesInCycles2 {
    public static void main(String[] args) {
        int h = 0;
        while ( h < 10 ) {
            int w = 0;
            while ( w < 20 ) {
                if ( h == 1 || h == 10 || w==1 || w==20 ) {
                    System.out.print("Б");
                } else {
                    System.out.print(" ");
                    }
                }
                w++;
            }
            System.out.println();
            h++;
        }
    }

