import java.util.Scanner;

public class Fail2 {


    public static void main(String[] args) {//главная функция
        Scanner sc = new Scanner(System.in); // создание сканера
        int a = sc.nextInt(); // просим ввести число а
        int b = sc.nextInt();// просим ввести число б
        sum(a,b);// вызываем функцию
    }

    public static void  sum (int a, int b) { // наша функция суммы
        System.out.println(a+b); // выводим сумму параметров
    }
}