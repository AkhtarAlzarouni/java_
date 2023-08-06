import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Employee e =new Employee();
        e.salary=1000;
        e.name="Ahmad";
        e.id=5678;

        Employee e1 =new Employee();
        e1.salary=3000;
        e1.name="Fatma";
        e1.id=9045;

        Employee e3 =new Employee();
        e3.salary=2000;
        e3.name="Maryam";
        e3.id=9945;


        NewEmployee ne= new NewEmployee();
        ne.salary=2345;
        ne.id=1234;





        Scanner read = new Scanner(System.in);

        System.out.println("Welcome to the Employee System,");
        System.out.println(  "1: new Employee, 2:View employee salaries ,3: Exit choose");
        int input = read.nextInt();
        switch (input){
            case 1 :
                System.out.println("Please enter your name: ");
                String name = read.next();
                System.out.println("Please enter your email: ");
                String email = read.next();
                boolean emaillog = NewEmployee.isValid(email);
                if (emaillog == true)
                    System.out.println("Provided email address " + email + " is valid");
                else
                    System.out.println("Provided email address " + email + " is invalid");
                System.out.println("Please enter you phone number : ");
                String phonenumber = read.next();
                boolean num = NewEmployee.isValidPhoneNumber(phonenumber);
                if (num == true)
                    System.out.println("Provided number is valid");
                else
                    System.out.println("Provided number is invalid");

                System.out.println("hello  "+name+"your salary ");
                ne.EmployeeSalary();

                  break;


            case 2:
                System.out.println("View employee salaries");
                 e.EmployeeSalary();
                 e1.EmployeeSalary();
                 e3.EmployeeSalary();
                break;
            case 3:
                System.out.println("Thank you.");
                System.exit(0);
            default:
                System.out.println("Please choose.");
        }
    }
}



