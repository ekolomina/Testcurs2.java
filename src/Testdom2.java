import java.util.Scanner;

public class Testdom2 {

//Даны радиус круга и сторона квадрата.
    // У какой фигуры площадь больше?

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer r = scanner.nextInt();
        Integer s = scanner.nextInt();

        Double cS = Math.pow(r,2);
        System.out.println(cS);

        Double qS = Math.pow(s,2);
        System.out.println(qS);

        if (cS > qS) {
            System.out.println("Площадь круга больше");
        }
        else if (cS < qS) {
            System.out.println("Площадь квадрата больше");
        }
        else {
            System.out.println("Площадь круга равна площади квадрата");
        }
    }
}