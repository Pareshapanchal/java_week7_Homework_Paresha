import java.util.Scanner;

public class Programme13 {
    /**
     * 13. Write a Java program which input any number between 1 to 7 and it print The Days
     * name MONDAY, TUESDAY…..SUNDAY of the week accordingly by using switch.
     *  NOTE: if number is out of selection Print message “Week contains 1 to 7 days”
     */
         public static void main(String [] args)
        {

            Scanner num = new Scanner(System.in);
            int day;
            System.out.print("Enter Day number(Monday is 1):-->");//user will input a number
            day= num.nextInt();
            System.out.println("---------------------------------");
            switch (day)// it will give us day according to number
            {
                case 1: System.out.println("Day is Monday"); break;
                case 2: System.out.println("Day is Tuesday"); break;
                case 3: System.out.println("Day is Wednesday"); break;
                case 4: System.out.println("Day is Thursday");break;
                case 5: System.out.println("Day is Friday"); break;
                case 6: System.out.println("Day is Saturday");break;
                case 7: System.out.println("Day is Sunday");break;
                default: System.out.println("invalid week number");
            }
        }

    }
