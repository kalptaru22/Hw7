import java.util.Scanner;

import static java.lang.System.out;

public class Que_6 {
    /*WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Grosssalary
    HRA = basic salary 10%
    DA = Basic salary 8%
    TA = Basic salary 9%
    PF= Basic salary 20%
    Gross salary = basic salary + HRA + TA + DA –PFPrint in following format
 */
    public static void main(String[] args) {
        Salaryslip();
    }

    public static void Salaryslip(){
        Scanner sc = new Scanner(System.in);//
        out.println("Enter Employee ID: ");
        int id= sc.nextInt();
        out.println("Enter Employee Name: ");
        String name = sc.next();
        out.println("Enter Basic Salary");
        int bs = sc.nextInt();

        int HRA= ((bs*10)/100);
        int DA= ((bs*8)/100);
        int TA= ((bs*9)/100);
        int PF= ((bs*20)/100);
        int GS=(bs+HRA+DA+TA+PF);

        out.println("|         Salary Slip           |");
        out.println("|                               |");
        out.println("_________________________________");
        out.println("|                               |");
        out.println("|Employee ID         :"+id+"        |");
        out.println("|Employee Name       :"+(name)+"    |");
        out.println("|                               |");
        out.println("_________________________________");
        out.println("|                               |");
        out.println("|Basic Salary           :"+bs+  "  |");
        out.println("|HRA 10%                :"+HRA+"   |");
        out.println("|TA 8%                  :"+TA+"    |");
        out.println("|DA 9%                  :"+DA+"    |");
        out.println("|PF-20%                 :"+PF+"    |");
        out.println("|                                   ");
        out.println("____________________________________");
        out.println("|                                   ");
        out.println(" Gross Salary           :"+GS+"     |");
        out.println("|===================================|");


    }



}