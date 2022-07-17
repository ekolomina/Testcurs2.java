

public class Recursia {

    public static void main(String[] args) {
        String phrase = recFunction("Word");
        System.out.print(phrase);
        Fibonachi.fib(4);
    }

    public static String recFunction(String word){
        if (word == "Word"){
            recFunction("Hello ");
        }
        return word;
    }
}
