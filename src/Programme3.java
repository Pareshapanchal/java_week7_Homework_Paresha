import java.util.Scanner;

public class Programme3 {
    /**
     * 3. Write a java program to input student Name, roll No, and three subjects Math, Science and
     * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
     * Input, Marks should between 0 to 100”) and find out total, percentage and result.
     * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
     * %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
     * _______________________________
     * | |
     * | Mark Sheet |
     * |_______________________________|
     * | Name : Jay |
     * | Roll No: 08 |
     * |_______________________________|
     * | Subjects : Marks |
     * |_______________________________|
     * | Math : 98 |
     * | Science : 90 |
     * | English : 85 |
     * |_______________________________|
     * | Total : 273 |
     * |_______________________________|
     * | Percentage : 91.0 |
     * | Result : Pass |
     * | Grade : A+ |
     * |_______________________________|
     */
     static int  math,sci,eng,total;static double per; static String sRollno,sName;static boolean result; static String grad;
     public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);//scanner object created
        System.out.print("Enter Student Rollno:--> ");
        sRollno = sobj.next();
        System.out.print("Enter Student Name:--> ");
        sName = sobj.next();
        sName = sName.toUpperCase();
        System.out.print("Enter Maths Marks:--> ");
        math = sobj.nextInt();

        if(math>0 && math<100)// check for valid entry
        {    System.out.print("Enter Science Marks-->: ");
             sci = sobj.nextInt();
             if(sci>0 && sci<=100)//check for valid entry
             {    System.out.print("Enter English Marks:--> ");
                  eng = sobj.nextInt();
                 if(eng>0 && eng<=100)//check for valid english marks
                 {   total = getTotalOFMark(math,sci,eng);
                     double ans = getPercentage(total);
                     grad = grade(ans);
                     result = passOrFail(ans);

                 } else {
                     System.out.println("Please Enter valid marks");
                 }
             } else {
                 System.out.println("Please Enter valid marks");
             }
        }else {
            System.out.println("Please Enter valid marks");
        }
        printMarkSheet(sRollno,sName,math,sci,eng,total,per,grad,result);//method calling for printing marksheet

        sobj.close();
    }
    public static double getPercentage(double p)//Calculate the percentage of total marks
    {       per = (total *100)/300;
            return per;
    }
    public static int getTotalOFMark(int m,int s, int e)//this method will give total of all the subjects marks
    {
      total = m+s+e;
      return total;
    }
    public static String grade(double percentage)//Calculate the grades
    {
        if(percentage>=80){
            return  "A+";
        }else if (percentage>=60) {
            return "A";
        }else if (percentage>=50) {
            return "B";
        } else if (percentage>=35) {
            return "C";
        } else  return "Fail";

    }
    public static boolean passOrFail(double per)//calculate pass or fail
    {
       if (per<35)
         {
             return false;
         }
         else return true;

    }
    public static void printMarkSheet(String sRollno, String sName, int math, int sci, int eng, int total,double per,String grade,boolean result)
    {String res;
         if(result = true)
             res="Pass";
         else
             res = "Fail";



        System.out.println(" --------------------------------------------------------------");
        System.out.println("|                                                              |");
        System.out.println("|                   Mark Sheet                                 |");
        System.out.println("|                                                              |");
        System.out.println("|--------------------------------------------------------------|");
        System.out.println("|            Name       :      "+sName+"                             |");
        System.out.println("|            Roll No:   :      "+sRollno+"                              |");
        System.out.println("|--------------------------------------------------------------|");
        System.out.println("|            Subjects   :      Marks                           |");
        System.out.println("|--------------------------------------------------------------|");
        System.out.println("|            Maths      :      "+math+"                              |");
        System.out.println("|            Science    :      "+sci +"                              |");
        System.out.println("|            English    :      "+eng +"                              |");
        System.out.println("|--------------------------------------------------------------|");
        System.out.println("|            Total      :      "+total+"                             |");
        System.out.println("|--------------------------------------------------------------|");
        System.out.println("|            Percentage :      "+per+"                            |");
        System.out.println("|            Result      :     "+res+"                            |");
        System.out.println("|            Grade      :      "+grad+"                              |");
        System.out.println("|--------------------------------------------------------------|");
    }

 }

