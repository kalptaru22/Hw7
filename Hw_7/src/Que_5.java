

import java.util.Scanner;

public class Que_5 {

/*
Write a java program to input student Name, roll No, and three subjects Math, Science and English
marks (marks is between 0 to 100 and if it is out of range print error message “InvalidInput, Marks
should between 0 to 100”) and find out total, percentage and result.
If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
%> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format*/


    public static void sub() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student name: ");
        String name = sc.next();
        System.out.println("Enter Student Roll No.: ");
        int id = id = sc.nextInt();
        System.out.println("Enter Marks For Maths : ");
        int maths = sc.nextInt();
        if ((maths < 0 && maths > 100)) {
            System.out.println("Invalid Input, Marks should be between 0 to 100");
        }
        System.out.println("Enter Marks For Science : ");
        int science = sc.nextInt();
        if ((science < 0 && science > 100)) {
            System.out.println("Invalid Input, Marks should be between 0 to 100");
        }
        System.out.println("Enter Marks For English : ");
        int eng = sc.nextInt();
        if ((eng<=0 && eng>100)){
            System.out.println("Invalid Input, Marks should be between 0 to 100");
        }
        int total = (eng+maths+science);
        System.out.println("Total : " +total);
        float percentage = ((total*100/300));
        System.out.println(("Percentage : "+ percentage));
        String result;
        if (percentage>=35){
            System.out.println("Result: Pass");
        }else {
            System.out.println("Result: Fail");
        }


        if (percentage >=80){
            System.out.println(" Result : A+");
        } else if (percentage >= 60) {
            System.out.println(" REsult A");
        } else if (percentage>= 50) {
            System.out.println("Result B");
        } else if (percentage >= 35) {
            System.out.println("Result C");
        }
    }

    public static void main(String[] args) {
        sub();
    }
    }







