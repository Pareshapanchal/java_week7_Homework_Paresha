import java.util.Scanner;

public class Programme9 {
    /**
     * 9. Same as above program-8 using switch statement.
     */
    public static void main(String[] args) {
        String alphabet,str;
        Scanner scobj = new Scanner(System.in);
        System.out.print("Enter any Alphabet from A to F :-->");
        str = scobj.next();
        alphabet = str.substring(0,1).toUpperCase()+str.substring(1);
       //switch is used to print city name according to alphabet
        switch (alphabet)
        {
            case "A" :
                System.out.println("City name start with A --- Aberdeen");
                break;
            case "B":
                System.out.println("City name start with B --- Bath");
                break;
            case "C":
                System.out.println("City name start with C --- Cambridge");
                break;
            case "D":
                System.out.println("City name start with D --- Devon");
                break;
            case "E":
                System.out.println("City name start with E --- Edinburgh");
                break;
            case "F":
                System.out.println("City name start with F --- France");
                break;
            default:
                System.out.println("Invalid Entry");
        }
        scobj.close();

    }
}

