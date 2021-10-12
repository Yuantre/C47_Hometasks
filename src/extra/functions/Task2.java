package extra.functions;

/**
 * Написать фукцию, которая принимает 2 целочисленных
 * параметра, и возвращает наибольший результат
 */
public class Task2 {
    public static void main(String[] args) {
        int value1 = 14;
        int value2 = 7;
        int result = getMax(value1, value2);
        System.out.println(result);


    }

    public static int getMax(int a, int b) {
        if
        (a > b) {
            return a;
        }
        return b;
    }

}
