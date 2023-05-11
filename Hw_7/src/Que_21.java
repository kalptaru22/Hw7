public class Que_21 {
    /*
    Write a Java program to sum values of an array.
     */

    public static void main(String[] args) {
        arraytotal();
    }
    public static void arraytotal(){
        int x[]={4,6,8,9,12};
        int sum=0;
        for (int i : x )
            sum += i;
        System.out.println("The sum is :"+sum);
    }
}
