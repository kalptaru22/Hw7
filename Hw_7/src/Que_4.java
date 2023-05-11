import java.util.Scanner;

public class Que_4 {
    /*
    Write if else condition and print your group name in console else others group name.
     */

    public static void group() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Any Group Name");
        String a = sc.nextLine();
        if (a=="Postman"){
            System.out.println(a+ " is my Group Name");
        }else {
            System.out.println(a+" This is not my Group Name");
        }


    }

    public static void main(String[] args) {
        group();

    }
}


