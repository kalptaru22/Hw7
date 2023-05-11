import java.util.Scanner;

public class Que_19 {
    /*
    Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or“ZERO”
     */
    public static void main(String[] args) {
        pos();
    }
    public static void pos() {
        int x;
        System.out.println("Please Enter a Number :");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();//num entered by user stored in variable x
        if (x >= 1) {
            System.out.println(x + " Is a Positive Number");
        }    else if (x < 0) {
            System.out.println(x + " Is a Negative Number");
        }
        else if (x==0){
            System.out.println(x + " Is Zero");
        }

    }


}
