import java.util.Scanner;

public class Programme1 {
    /**1. Write a java program that tells us that Input number is odd or even?
     HINT: use ternary operator (? :)
     *
     */
    public static void main(String[] args) {//main method

        Scanner sobj = new Scanner(System.in);
        System.out.print("Enter a number:--> ");// asking input the number

        int num = sobj.nextInt();
        String result = (num%2 == 0)? "Even Number": "Odd Number";//ternary operator(?,:) used to find the even odd number
        System.out.println(result);
        sobj.close();

        }
}
