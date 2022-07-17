public class Fail4 {
    //Напечатать числа ввиде следующей таблицы:
    // 5
    // 5 5
    // 5 5 5
    // 5 5 5 5
    // 5 5 5 5 5

    public static void main(String[] args) {
        print5(6);
    }

        public static void print5( int n) {
            String row = " ";
            for (int i = 0; i < n; i++){
                row = row + "5";
                System.out.println(row);
        }
    }

}
