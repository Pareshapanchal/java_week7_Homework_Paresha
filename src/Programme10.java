import java.util.Scanner;

public class Programme10 {
    /**
     * 10.Write a java program to input any two number and ask user to enter their symbol (+, -,
     * /, *) find addition, Subtraction, multiplication and division according to their symbol
     * (using if else)
     */
    static double number1, number2;
    static String str, operator;

    public static void main(String[] args) {
        Scanner scobj = new Scanner(System.in);

        System.out.println("Enter Number1");
        number1 = scobj.nextDouble();
        System.out.println("Enter Number 2");
        number2 = scobj.nextDouble();
        System.out.println("Enter a Operation(+,-,*,/)");
        str = scobj.next();
        operator = str.substring(0, 1) + str.substring(1);
       //condition to do calculation according to user input
         double ans;
         if(operator.equals("+")) {
            ans = number1 + number2;
             System.out.println(number1 + " " + operator + " " + number2 + " = " + ans);
        } else if (operator.equals("-")){
            ans = number1 - number2;
             System.out.println(number1 + " " + operator + " " + number2 + " = " + ans);
        } else if (operator.equals("*")){
            ans = number1 * number2;
             System.out.println(number1 + " " + operator + " " + number2 + " = " + ans);
        } else if (operator.equals("/")){
            ans = number1 / number2;
             System.out.println(number1 + " " + operator + " " + number2 + " = " + ans);
        } else {
            System.out.println("Invalid Operator");
        }



        scobj.close();
    }




}

