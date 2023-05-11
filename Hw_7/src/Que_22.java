public class Que_22 {
    /*
    Write a Java program to calculate the average value of array elements.
     */
    public static void main(String[] args) {
        avg();
    }
    public static void avg(){
        int [] x = {2,4,6,8,10};
        int sum = 0;
        for (int i=0;i< x.length;i++)//calculate sum of array
            sum = sum + x[i];
        double average = sum / x.length;
        System.out.println("The average of the array elements : "+average);
    }
}

