public class Que_14 {
    /*
    Write a java program to print the numbers between 1 to 100 which can be divided by 3and
    5 separately.
     */
    public static void main(String[] args) {
    divi();
    }
    public static void divi(){

        for (int i=1; i<=100; i++){
            if (i%3==0)
                System.out.println("Divided by 3 : " + i);
        }
        for (int i=1; i<=100; i++){
            System.out.println("Divided by 5 : " +i);
        }



    }
}
