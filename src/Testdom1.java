import java.util.Scanner;

public class Testdom1 {

//� ���������� �� ������� ������� �� ������� ������ 3 ����,
    // ���������� � 0, ������� � 1.
    // �������� ���������� �����, ���������� �������� �� ����.
    // ���������� ��������� ��������� ����
    // (�������, �������� ��� �����).


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result= scanner.nextInt();
        switch (result){
            case (0) :
                System.out.println("��������");
                break;
            case (1) :
                System.out.println("�����");
                break;
            case (3) :
                System.out.println("�������");
                break;
            default:
                System.out.println("�� ������ ������");
                break;
        }
    }
}