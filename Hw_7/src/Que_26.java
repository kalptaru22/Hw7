public class Que_26 {
    /*
    Write a Java program to reverse a word.
    Sample Output:
    Input a word: dsaf
    Reverse word: fasd
     */
    public static void main(String[] args) {
        reverse();
    }

    public static void reverse(){
        String org="MAULIK";
        StringBuilder rev=new StringBuilder();
        rev.append(org);
        rev.reverse();
        System.out.println("This is original string: "+org);
        System.out.println("This is reversed string: "+rev);

    }
}
