import java.util.Scanner;

public class Que_11 {
    /*
    Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if any
    other alphabet should be invalid entry.
     */
    public static void main(String[] args) {
        abc();
    }
    public static void abc(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Alphabet From \"A to E\"");
        char city = sc.next().charAt(0);
        if('A' == city) {
            System.out.println("Argentina");
        }else if ('B'== city){
            System.out.println("Bulgaria");

        }else if ('C'== city){
            System.out.println("Chile");
        }else if ('D'== city){
            System.out.println("Denmark");

        }else if ('E'== city){
            System.out.println("Ecuador");
        }else {
            System.out.println("Invalid Output");
        }





    }
}
