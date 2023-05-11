import java.util.Arrays;

public class Que_20 {
    /*
    Write a Java program to sort a numeric array and a string array.
     */
    public static void main(String[] args) {
    sort();
    }

    public static void sort(){
        int[] num ={22,9,8,17,1,4};
        String[] name= {"ram,raj,johm,charlie,joe"};
        System.out.println("Numeric Array :"+ Arrays.toString(num));
        Arrays.sort(num);
        System.out.println("String Array :"+ Arrays.toString(name));
        Arrays.toString(name);
        System.out.println("Sorted Numeric Array :" +Arrays.toString(num));
        System.out.println("Sorted String Array :" +Arrays.toString(name));

    }



}
