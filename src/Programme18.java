import java.util.Arrays;
import java.util.Scanner;

public class Programme18 {
    /**
     * 18. Write a Java program to sum values of an array.
     */
    public static void main(String[] args) {

        System.out.println("How many number do you want to total:--> ");//input will create a length of array
        Scanner scobj = new Scanner(System.in);
        int size = scobj.nextInt();
        int myArray[] = new int [size];
        int sum = 0;
        System.out.println("Enter number one by one:--> ");

        for(int i=0; i<size; i++){       //  this will add the numbers in the array and total the value at the sametime
            myArray[i] = scobj.nextInt();
            sum = sum + myArray[i];
        }
        System.out.println("Numbers to total:--> "+ Arrays.toString(myArray));
        System.out.println("Sum of the Number:--> "+sum);
    }






}
