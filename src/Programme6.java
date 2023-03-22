import java.util.Scanner;

public class Programme6 {
    /**
     * Write a java program to input any number and find out if it’s odd or even
     */
    public static void main(String[] args) {
        int number,a; String ans,ans1;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number");
        number = sobj.nextInt();

        if(number%2 ==0)// condition to find odd or even number
            System.out.println("Number is Even");
        else
            System.out.println("Number is Odd");

        System.out.println("---------------------------------");
        System.out.println("Do you want to continue(yes/no): ");
         ans1 = sobj.next();
         ans = "yes";
         a = ans.compareToIgnoreCase(ans1);

        while(a==0)//user get chance to find out for more numbers
        {
            System.out.println("Enter Number");
            number = sobj.nextInt();
            if(number%2 ==0)
                System.out.println("Number is Even");
            else
                System.out.println("Number is Odd");
            System.out.println("---------------------------------");
            System.out.println("Do you want to continue(yes/no): ");
             ans1 = sobj.next();
             ans = "yes";
             a = ans.compareToIgnoreCase(ans1);
        }
        System.out.println("Thank you");
        sobj.close();

    }
 }

