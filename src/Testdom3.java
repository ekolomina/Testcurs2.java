import java.util.Random;
import java.util.Scanner;

public class Testdom3 {

//Данодвузначноечисло. Определить: остаток от деления десятков на единицы, результат деления единиц на десятки.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        double unit = number%10;
        double decimal = number/10;
        System.out.println("остаток от деления десятков на единицы: " + decimal/unit);
        System.out.println("результат деления единиц на десятки: " + unit/decimal);
        
    }
}
