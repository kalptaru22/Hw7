import java.util.Scanner;

public class Que_12 {
    /*
    Input any alphabet from “A" to “F” and print their city name accordingly if any
other alphabet should be invalid entry.(Using switch statement)
     */
    public static void main(String[] args) {
        city();
    }

    public static void  city(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Alphabet From \"A to E\"");
        char city = sc.next().charAt(0);

        switch (city){
            case 'A':
                System.out.println("Argentina");
                break;
            case 'B':
                System.out.println("Bulgaria");
                break;
            case 'C':
                System.out.println("Chile");
                break;
            case 'D':
                System.out.println("Denmark");
                break;
            case 'E':
                System.out.println("Ecuador");
                break;
            default:
                System.out.println("Invalid Entry");
        }
    }

}
