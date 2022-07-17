import java.util.Scanner;

public class Faildom6 {
   // Реализовать функцию нахождения минимума:
    // 1.Изтрёхчисел
    // 2.Изчетырёхчисел

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // создание сканера
        int n= sc.nextInt();

        System.out.println(findMinimum (n));
    }

    public static int findMinimum (int  n) {
        int min = Integer.MAX_VALUE;

        Scanner sc = new Scanner(System.in);
        for (int i= 0; i<n; i++) {
            int number = sc.nextInt();
            if (number<min){
                min = number;
            }
        }
        return min;
    }
}
