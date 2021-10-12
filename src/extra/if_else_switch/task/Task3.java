package extra.if_else_switch.task;

import java.util.Scanner;

/**
 * имеется целое число вводимое пользователем через консолью
 * Это число - сумма денег в рублях.Вывести это число,добавив
 * к нему слово "рубль" в правильном падеже(рубль,рублей)
 */
public class Task3 {
    public static void main(String[] args) {
        System.out.println("enter the amount:  ");
        Scanner scanner = new Scanner(System.in);
        int rubles = scanner.nextInt();
        //1 !11 рубль
        //2,3,4 рубля
        //0,5,6,7,8,9,10,11-19 рублей

        if (rubles%10 ==1&&rubles%100!=11){
            System.out.println(rubles+" рубль");
        }else if ((rubles%10==2&& rubles%10==3&& rubles%10==4)&&!(rubles%100==12&&rubles%100==13&&rubles%100==14)){
            System.out.println(rubles+" рубля");
        }else {
            System.out.println(rubles + " рублей");
        }



    }
}
