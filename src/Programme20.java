import java.util.Arrays;
import java.util.Scanner;

public class Programme20 {
    /**
     * 20. Write a Java program to test if an array contains a specific value.
     */
    public static void main(String[] args) {

        System.out.print("How many number do you want to add in the list:--> ");//this input will create a size of array
        Scanner scobj = new Scanner(System.in);
        int size = scobj.nextInt();
        int myArray[] = new int [size];

        System.out.println("Enter number one by one:--> "); //ask user to input number to add in the array list

        for(int i=0; i<size; i++){
            myArray[i] = scobj.nextInt();
        }
        System.out.println("My Number's List:--> "+ Arrays.toString(myArray));
        System.out.print("Enter Number you wish to check in the list:--> ");//ask user which number they want to check
        int num = scobj.nextInt();
        myNumberCheck(myArray,num);
        scobj.close();
    }
    //this method will check whether the input value is in the array or not
    public static void myNumberCheck(int myArray[], int numb)
    {  boolean check = false ;
        for(int num : myArray)
        { if(num == numb)
             { check = true;
                 System.out.println("Yes "+ numb +" Is in the list:-->  "+check);
                 break;}
        }
        if(check == false) {
            System.out.println(numb + "  Is not in the list:--> " + check);
        }
        }
    }


