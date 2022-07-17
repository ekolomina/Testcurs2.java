import java.util.Scanner;

public class Testdom4 {

    //Данытривещественныхчисла a, b, c. Проверить: a, b, c.
    //1. a < b < c;
    //2. b > a > c.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите a");
        double a = sc.nextDouble();
        System.out.println("Введите b");
        double b = sc.nextDouble();
        System.out.println("Введите c");
        double c = sc.nextDouble();

        if(a<b && b<c){
            System.out.println("Неравенство a < b < c выполняется˙");
        }
        else if (b>a && a>c){
            System.out.println("Неравенство b > a > c выполняется˙");
        }
        else {
            System.out.println("Ни одно неравенство не выполняется");
        }
    }

}
