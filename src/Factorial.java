import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();
        System.out.println(getFactorial(f));
    }
    public static int getFactorial (int f) {
        if (f <= 1) {
            return 1;
        }
        else {
            return f * getFactorial (f-1);
        }
    }
}
