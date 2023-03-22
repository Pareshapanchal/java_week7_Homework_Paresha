import java.util.Scanner;

public class Programme16 {
    /**
     * 16. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
     * “ZERO”
     */
    public static void main(String[] args) {
        int num,a ; String ans,ans1;

            Scanner scobj = new Scanner(System.in);
            //do while loop will give the user chance check as many number they want
            do {
            System.out.print("Please Enter a any number(Positve,Negative or Zero):---> ");
            num = scobj.nextInt();
            myNumber(num);
            System.out.println("---------------------------------");
            System.out.print("Do you want to continue(yes/no):--> ");
            ans = scobj.next();
            ans1 = "yes";
            a = ans1.compareToIgnoreCase(ans);
                System.out.println("");
            }while (a==0);



         scobj.close();
    }
    //this method will check whether the input number is positive,negative or zero
    public static void myNumber(int numb)
    {      if (numb<0) {
                System.out.println("Number is a Negative Number ");
            }
            else if ((numb >0)) {
                System.out.println("Number is a Positive Number");
            } else if(numb==0) {
                System.out.println("Number is Zero ");
            }else {
                System.out.println("Invalid Entry");
            }
    }
}


