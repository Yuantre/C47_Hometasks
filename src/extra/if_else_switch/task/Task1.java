package extra.if_else_switch.task;

public class Task1 {
    public static void main(String[] args) {
        //byte,short,int, char,Str,enum
        int month = 10;
        //winter 12,1,2
        //spring 3,4,5
        //summer 6,7,8
        //autumn 9,10,11

        if (month ==12||month==1||month==2){
            System.out.println("winter");
        }else if (month >=3&&month<=4){
            System.out.println("spring");
        }else if (month >=6&&month<=8) {
            System.out.println("summer");
        }else if (month >=9&&month<=11) {
            System.out.println("autumn");

        }else {
            System.out.println("impossible num of month");
        }
    }
}
