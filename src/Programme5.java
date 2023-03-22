import java.util.Scanner;


public class Programme5 {
    /**WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
     salary
     HRA = basic salary 10%
     DA = Basic salary 8%
     TA = Basic salary 9%
     PF= Basic salary 20%
     Gross salary = basic salary + HRA + TA + DA –PF
     Print in following format
     _______________________________
     | Salary Slip |
     |______________________________|
     | Employee Id : 2564 |
     | Employee Name : Jay |
     |______________________________|
     | Basic Salary : 25000.0 |
     | HRA 10% : 2500.0 |
     | TA 8% : 2250.0 |
     | DA 9% : 2000.0 |
     | PF - 20& : 5000.0 |
     |______________________________|
     | Gross Salary : 26750.0 |
     |===========================|

     *
     */

    static int empId; static String empName; static double empBasicSal; static double hra; static double ta;
    static double da; static double pf; static double grossSal;  static String str;

    public static void main(String[] args) {
        Scanner scobj = new Scanner(System.in);
        System.out.println("Enter Employee ID:");
        empId =scobj.nextInt();
        System.out.println("Enter Employee Name:");
        String name = scobj.next();
        empName = name.substring(0,1).toUpperCase() + name.substring(1);
        System.out.println("Enter Employee Basic Salary:");
        empBasicSal =scobj.nextDouble();
       hra = calHRA(empBasicSal);
       calHRA(empBasicSal);
       calDa(empBasicSal);
       calTa(empBasicSal);
       calPf(empBasicSal);
       calGrossSal(empBasicSal,hra,ta,da,pf);
       printSalSlip(empBasicSal,hra,ta,da,pf,grossSal);

        scobj.close();
    }
    // this method will calculate HRA = Basic Salary 10%
    public static double calHRA(double basicSal)
    {
         hra =  (basicSal*10)/100;
         return hra;
    }
    //this method will calculate TA= Basic Salary 9%
    public static double calTa(double basicSal)
    {
        ta =  (basicSal*9)/100;
        return ta;
    }
    //this method will calculate DA =Basic Salary 8%
    public static double calDa(double basicSal)
    {
        da =  (basicSal*8)/100;
        return da;
    }
    //this method will calculate PF= basic salary 20%
    public static double calPf(double basicSal)
    {
        pf =  (basicSal*20)/100;
        return pf;
    }
    //this method will calculate Gross Salary
    public static double calGrossSal(double basicSal,double hra,double ta,double da, double pf)
    {
        grossSal = basicSal + hra + ta + da - pf;
        return grossSal;
    }
    //this method is created to print the salary slip
    public static void printSalSlip(double basicSal,double hra,double ta,double da, double pf,double grossSal)
    {
        System.out.println("-------------------------------------------------");
        System.out.println("|             Salary Slip                       |");
        System.out.println("|  Employee Id     :"+empId +"                           |");
        System.out.println("|  Employee Name   :"+empName+"                     |");
        System.out.println("|  Basic Salary    :"+empBasicSal+"                     |");
        System.out.println("|  HRA 10%         :"+hra+"                      |");
        System.out.println("|  TA 8%           :"+ta+"                      |");
        System.out.println("|  Da 9%           :"+da+"                      |");
        System.out.println("|  PF -20%         :"+pf+"                      |");
        System.out.println("-------------------------------------------------");
        System.out.println("|  Gross Salary    :"+grossSal+"                     |");
        System.out.println("|===============================================|");
    }


}
