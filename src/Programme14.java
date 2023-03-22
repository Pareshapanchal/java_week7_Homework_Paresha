public class Programme14 {
    public static class Person{//create a new class
        static String firstName,lastName; static int age;
        public String getFirstName(){//method with return no parameter
            this.firstName =firstName;
            return firstName;
        }
        public String getLastName()//method with return no parameter
        {
            this.lastName =lastName;
            return lastName;
        }
        public int age()//method with return no parameter
        {
            this.age =age;
            return age;
        }

        public void setLastName(String lastName) { //method no return with parameter
            this.lastName = lastName;
        }
        public void setFirstName(String firstName){     //method no return with parameter
            this.firstName =firstName;
        }
        public void setAge(int age)//method no return with parameter
        {   if(age<0 && age>100)
            this.age = 0;
            else
               this.age =age;
        }
        public boolean isTeen()//method with return no parameter
        {
            if(age>12 && age <20)
                return true;
            else
                return false;
        }

        public String getFullName()//method with return no parameter
        {
             if(firstName.isEmpty() && lastName.isEmpty())
                 return "";
             else if (firstName.isEmpty()) {
                 return lastName;
             }else if(lastName.isEmpty()){
                 return firstName;
             }else

            return firstName + lastName;
        }

        public static void main(String[] args) {
            Person person = new Person();
            person.setFirstName(""); // firstName is set to empty string
            person.setLastName(""); // lastName is set to empty string
            person.setAge(10);
            System.out.println("fullName= " + person.getFullName());
            System.out.println("teen= " + person.isTeen());
            person.setFirstName("John"); // firstName is set to John
            person.setAge(18);
            System.out.println("fullName= " + person.getFullName());
            System.out.println("teen= " + person.isTeen());
            person.setLastName("Smith"); // lastName is set to Smith
            System.out.println("fullName= " + person.getFullName());
        }


    }
}
