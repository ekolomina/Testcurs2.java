import java.util.Scanner;

public class Fail2 {


    public static void main(String[] args) {//������� �������
        Scanner sc = new Scanner(System.in); // �������� �������
        int a = sc.nextInt(); // ������ ������ ����� �
        int b = sc.nextInt();// ������ ������ ����� �
        sum(a,b);// �������� �������
    }

    public static void  sum (int a, int b) { // ���� ������� �����
        System.out.println(a+b); // ������� ����� ����������
    }
}