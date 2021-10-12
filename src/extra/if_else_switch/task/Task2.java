package extra.if_else_switch.task;
/**
Дано целое число.
 Определить, является ли последняя цифра этого числа -
 цифрой 3.
 */
public class Task2 {
    public static void main(String[] args) {
        int value = 234563;
        if (value%10==3){
            System.out.println("end wth 3");
        }else {
            System.out.println("no");
        }

    }
}
