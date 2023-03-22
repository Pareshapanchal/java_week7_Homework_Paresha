import java.util.Scanner;

public class Programme12 {
    /**
     *12. Write a program that tells us input value is number or an alphabet or symbol.
     */

           public static void main(String args[]) {
            Scanner scobj = new Scanner( System.in );
            System.out.print("Enter number or special character or alphabets:-->");
            char ob1 = scobj.next().charAt(0);
            //conditions to filters the value enter by user
               if (Character.isDigit(ob1)) {
                   System.out.println("Numbers");
               }else if(Character.isLetter(ob1)) {
                   System.out.println("Alphabets");
               }else if (!Character.isDigit(ob1) && !Character.isLetter(ob1)&& !Character.isWhitespace(ob1)) {
                   System.out.println("Special Character!");
               }

           }
    }