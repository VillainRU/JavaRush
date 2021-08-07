package cycles;

public class whilesum {
    public static void main(String[] args) {
        //напишите тут ваш код
        int sum = 0;
        int n = 0;
        while (n < 100) {
            n++;
            if (n % 3 != 0) {
                sum = sum + n;
            } else {
                continue;
            }
        }
        System.out.println(sum);
    }
}
