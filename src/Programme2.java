import java.util.Scanner;

public class Programme2 {
    /**
     * 2. Write a java program to input any year like (ex.2007) and find out if it is leap year or
     * not?
     * If the year is evenly divisible by 4, go to step 2. Otherwise, go to step 5.
     * If the year is evenly divisible by 100, go to step 3. Otherwise, go to step 4.
     * If the year is evenly divisible by 400, go to step 4. Otherwise, go to step 5.
     * The year is a leap year (it has 366 days).
     * The year is not a leap year (it has 365 days).
     */
    static int year; static String r;//public variable
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
       int a; String ans; String ans1;

        System.out.print("Enter a Year(Ex 2007):-->");
         year = sobj.nextInt();

        String result = leapYear(year);

        System.out.println(result);
        System.out.println("---------------------------------");
        System.out.println("Do you want to continue(yes/no): ");

         ans1= sobj.next();
         ans ="yes" ;
         a =ans.compareToIgnoreCase(ans1);

        while( a==0 )//giving user a opportunity to ask for more year to find out leap year
        {
            System.out.println("Enter a Year(Ex.- 2007):");
            year = sobj.nextInt();
             result = leapYear(year);
            System.out.println(result);
            System.out.println("---------------------------------");
            System.out.println("Do you want to continue(yes/no): ");
             ans1= sobj.next();
             ans ="yes" ;
             a =ans.compareToIgnoreCase(ans1);
        }

            System.out.println("Thank you");

        sobj.close();
    }

    public static String leapYear(int y)//method is to calculation the leap year
    { String result;
        if (y % 4 == 0) {
            if (y % 100 == 0) {
                if (y % 400 == 0) {
                   result= "This is a Leap Year ";
                } else { result= "This is Not a Leap Year ";

                }
            } else { result= "This is a Leap Year ";

            }
        } else { result= "This is Not a Leap Year ";

        }
        return result;
    }
}




