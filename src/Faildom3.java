import java.util.Scanner;

public class Faildom3 {
// ���� ������� ���� �������������.
// ����� ����� �� ���������� � ����� �� ��������.
// (���������� ��������� ��� ������� ��������� �������� ������������ �� ��� ��������.)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // �������� �������
        int a = sc.nextInt(); // ������ ������ ����� �
        int b = sc.nextInt();
        int c = sc.nextInt();
        int a1 = sc.nextInt(); // ������ ������ ����� �
        int b1 = sc.nextInt();
        int c1 = sc.nextInt();

        System.out.println(perimeter(a, b, c) + perimeter(a1, b1, c1));
        System.out.println(square(a,b,c) + square(a1,b1,c1));

    }


        public static int perimeter(int a, int b ,int c ) {
            return a+b+c;
        }
        public static double square (int a, int b, int c){
        int p = perimeter(a, b, c)/2;
        double h = (2* Math.sqrt(p*(p-a)*(p-b)*(p-c)))/a;
        return  0.5 * a *h;
        }


    }





