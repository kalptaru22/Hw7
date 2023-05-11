import java.util.Scanner;

public class Que_13 {
    /*
    Write a java program to input any two number and ask user to enter their symbol (+, -, /, *)
    find addition, Subtraction, multiplication and division according to theirsymbol(using if else)
     */
    public static void main(String[] args) {

        Scanner  sc = new Scanner(System.in);
        System.out.println("Please First Number: ");
        int num1 = sc.nextInt();
        System.out.println("Please Second Number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter a Symbol For Calculation: ");
        char func = sc.next().charAt(0);
        cal(num1,num2,func);//calling method

    }
    public static float cal(int num1, int num2, char func ){

        float ans=0;
        if(func == '+'){//addition
            ans = (num1+num2);
            System.out.println("The Sum of Numbers is : " +ans);
        }else if (func == '-'){//subtraction
            ans = (num1-num2);
            System.out.println("The Subtraction of Numbers is : " +ans);

        }else if (func =='*') {//multiplication
            ans = (num1*num2);
            System.out.println("The Multiplication of Numbers is : " +ans);

        }else if (func=='/'){//division
            ans = (num1/num2);
            System.out.println("The Division of Numbers is " +ans);

        }else {
            System.out.println("Invalid Entry");
        }
        return ans;
    }
}
