import java.util.Scanner;

public class Que_1 {
    /*
    Write a java program that tells us that Input number is odd or even? HINT: use ternary
    operator (? :)
     */

    public static void main(String[] args) {
        num();
    }
    public static void num(){
        int x;
        System.out.println("Please Enter a Number :" );
        Scanner sc= new Scanner(System.in);
        x= sc.nextInt();//num entered,stored in variable x
        if (x%2==0)
            System.out.println("You Have Entered an Even Number: "+x);
        else
            System.out.println("You Have Entered an Odd Number: "+x);
    }


}
