import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Programme17 {
    /**
     * 17. Write a Java program to sort a numeric array and a string array.
     */
    //main method
    public static void main(String[] args) {
        Scanner scobj = new Scanner(System.in);
        System.out.print("How many number do you want to Sortout:--> ");//it will give us size of array
        int size = scobj.nextInt();
        Integer myArray[] = new Integer[size];
        String myStr[] = new String[size];

        for(int i=0; i<size;i++)//store input in array to sort out
        {  System.out.print("Enter Number "+i+" :--> ");
            myArray[i] = scobj.nextInt();
        }
        //Sorts out numeric array in Ascending order
        Arrays.sort(myArray);
        System.out.println("In Ascending Order:-->"+ Arrays.toString(myArray));
        Arrays.sort(myArray,Collections.reverseOrder());
        System.out.println("In Descending Order:-->"+ Arrays.toString(myArray) );

        for(int i=0; i<size;i++)//store string input in array
        {
            System.out.print("Enter Name "+i+" :--> ");
            myStr[i] = scobj.next();
        }
        //Sort out String array myStr[] in ascending order
        Arrays.sort(myStr);
        System.out.println("In Ascending order:-->"+Arrays.toString(myStr));
        Arrays.sort(myStr, Collections.reverseOrder());
        System.out.println("In Descending order:-->"+Arrays.toString(myStr));
        scobj.close();
    }

}
