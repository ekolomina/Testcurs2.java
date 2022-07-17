import java.util.Scanner;

public class Testdom5 {
    //Даныдвачисла. Если квадратный корень из второго числа
    // меньше первого числа, то увеличить второе число в пятьраз.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите a");
        int a = sc.nextInt();
        System.out.println("Введите b");
        int b = sc.nextInt();

        if (Math.sqrt(b) < a) {
        b= b* 5;
    }

        System.out.printf("Первое число - %d, второе число - %d", a, b);

}
}
