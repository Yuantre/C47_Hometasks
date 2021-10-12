package extra.functions;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        //[модификатор] "public" "static" и тд
        // возвращаемый тип "void" "int" "String"
        //название "main"
        // ()[параметры] args - переменная в скобках

        int year = 2000;
        isLeapYear(year);


    }

    public static boolean isLeapYear(int year) {
        return (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
//        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
//            return true;
//        } else
//           return false;

    }
}
