public class Programme11 {
    /**
     * 11. Write a java program to print the numbers between 1 to 100 which can be divided by 3
     * and 5 separately.
     */
    public static void main(String[] args) {

    divByThree();//method calling
        System.out.println("");
    divByFive();//method calling
    }
    //method will give you list of number divisiable by 3 in range(1 to 100)
    public static void divByThree()
    {
        int i=1;
        System.out.println("Number divisable by 3");
        System.out.println("-----------------------");
        while(i<100){
            if(i%3==0)
                System.out.print(i+" ,");
            i++;
        }
    }
    public static void divByFive()//method will give you list of number divisiable by 5
    {
        int i=1;
        System.out.println("Number divisable by 5");
        System.out.println("-----------------------");
        while(i<100){
            if(i%5==0)
                System.out.print(i +" ,");
            i++;
        }
    }

    }



