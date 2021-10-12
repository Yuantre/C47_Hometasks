package extra.if_else_switch.task;

public class Task5 {
    public static void main(String[] args) {
        int value = 5;
        var charValue =switch (value){ //присваивание чару свича
            case 1 ->'A';
            case 2,3,4 -> 'b';
            case 5 -> 'C';
            default -> 'X';
        };



    }
}
