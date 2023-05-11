import java.util.Scanner;

public class Que_7 {
    public static void main(String[] args) {
        num();
    }
    public static void num(){
        int x;
        System.out.println("Please Enter a Number :" );//
        Scanner sc= new Scanner(System.in);
        x= sc.nextInt();//num entered by user stored in variable x
        if (x%2==0)
            System.out.println("You Have Entered an \"Even\" Number: "+x);
        else
            System.out.println("You Have Entered an \"Odd\" Number: "+x);
    }

}
