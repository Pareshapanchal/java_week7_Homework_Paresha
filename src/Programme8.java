import java.util.Scanner;

public class Programme8 {
    /**
     *8. Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
     * any other alphabet should be invalid entry
     */
    public static void main(String[] args) {
        String alphabet,str;

        Scanner scobj = new Scanner(System.in);
        System.out.println("Enter a any Alphabet From A to F");
        str = scobj.next();
        // formula to get one alphabet from string and format into uppercase
        alphabet = str.substring(0,1).toUpperCase() +str.substring(1);
        // filter the option and print accordingly
        if(alphabet.equals("A"))
        { System.out.println("City name start with A --- Aberdeen");
         } else if (alphabet.equals("B")) {
            System.out.println("City name start with B --- Bath");
           } else if (alphabet.equals("C")) {
            System.out.println("City name start with C --- Cambridge");
             }else if (alphabet.equals("D")) {
            System.out.println("City name start with D --- Devon");
              }else if (alphabet.equals("E")) {
            System.out.println("City name start with E --- Edinburgh");
               }else if (alphabet.equals("F")) {
            System.out.println("City name start with F --- France");
                }else{
            System.out.println("Invalid Entry");
        }


        scobj.close();

    }
}
