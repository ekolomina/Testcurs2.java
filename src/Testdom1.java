import java.util.Scanner;

public class Testdom1 {

//В чемпионате по футболу команде за выигрыш дается 3 очка,
    // запроигрыш — 0, заничью — 1.
    // Известно количество очков, полученных командой за игру.
    // Определить словесный результат игры
    // (выигрыш, проигрыш или ничья).


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result= scanner.nextInt();
        switch (result){
            case (0) :
                System.out.println("Проигрыш");
                break;
            case (1) :
                System.out.println("Ничья");
                break;
            case (3) :
                System.out.println("Выигрыш");
                break;
            default:
                System.out.println("Не верные данные");
                break;
        }
    }
}