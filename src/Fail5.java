public class Fail5 {
  //  Напечататьполнуютаблицусложенияввиде:
    //  1 + 1 = 2     1 + 2 = 3  ... 1 + 9 = 102 + 1 = 3
    //  2 + 2 = 4  ... 2 + 9 = 11...
    //
    //  9 + 1 = 10   9 + 2 = 11  ... 9 + 9 = 18


    public static void main(String[] args) {
        for (int i = 1; i < 10; i++){
            for (int j = 1; j <10; j++) {
                System.out.print(i+"+"+j+"="+(i+j)+"\t");

            }
            System.out.println ();
        }
    }
}
