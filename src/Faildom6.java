import java.util.Scanner;

public class Faildom6 {
   // ����������� ������� ���������� ��������:
    // 1.����������
    // 2.�������������

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // �������� �������
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
