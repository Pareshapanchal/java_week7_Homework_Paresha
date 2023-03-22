import java.util.Scanner;

public class Programme7 {
    /**Write a java program input sales id, seller's name, sales amount, and salary basic and
     then fined this sales
     Commission
     Sales amount >= 50,000 35%
     Sales amount >= 30,000 20%
     >= 20,000 10%
     >= 10,000 5%
     < 10,000 2%  */
    static int saleId;static String sellerName; static double salAmt; static double salBasic; static double comm;
    public static void main(String[] args) {
        Scanner scobj = new Scanner(System.in);

        System.out.println("Enter Sales ID: ");
        saleId = scobj.nextInt();
        System.out.println("Enter Seller Name: ");
        sellerName = scobj.next();
        System.out.println("Enter Sales Amount: ");
        salAmt = scobj.nextDouble();
        System.out.println("Enter Basic Salary: ");
        salBasic = scobj.nextDouble();

        comm = commission(salAmt,salBasic);//method calling
        System.out.println("Sales Commision:---->" + comm);
        scobj.close();

    }
    //this method will calculate commission of sales
    public static double commission(double samt,double salbas)
    {
        double com;
        if(samt >= 50000)
        {
            com = (samt *35)/100;
            return com;
             } else if (samt >= 30000)
                 {
                   com =(samt*20) /100;
                   return com;
                 } else if (samt>=20000)
                     {
                         com =(samt*10) /100;
                         return com;
                      } else if (samt>=10000)
                      {
                          com =(samt*5) /100;
                          return com;
                      }else{
                          com =(samt*20) /100;
                          return com;
                           }



    }
}
