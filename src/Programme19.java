import java.util.Arrays;
import java.util.Scanner;

public class Programme19 {
    /**
     *19. Write a Java program to calculate the average value of array elements.
     */
    public static void main(String[] args) {
        int avg;
        System.out.print("How many number do you want to find Average:--> ");//this input will create a length of array
        Scanner scobj = new Scanner(System.in);
        int size = scobj.nextInt();
        int myArray[] = new int [size];
        int sum = 0;
        System.out.println("Enter numbers one by one:--> ");

        for(int i=0; i<size; i++){// input will be added to array list and calculate the sum of the numbers
            myArray[i] = scobj.nextInt();
            sum = sum + myArray[i];
        }
        System.out.println("Numbers to Average:--> "+ Arrays.toString(myArray));
        System.out.println("Sum of the Numbers:--> "+sum);
        System.out.println("Average of the Numbers:--> " + (sum/size));// calculate the average of the numbers in array list
    }
}
