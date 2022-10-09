import java.util.Scanner;

public class Main
{
 public static void main(String[] args)
    {
        System.out.println("Welcome to the Perfect Event Agency");
        userSelection();


    }

 public static void userSelection() 
    { 

        System.out.println("------------------------------------------------------------------");
        System.out.println("Are you a customer or an employee?");
        System.out.println("------------------------------------------------------------------");
        System.out.println("1) Employee");
        System.out.println("2) Customer");
        System.out.print("You have have selected: ");
        Scanner user = new Scanner(System.in);
        String userType = user.nextLine();
        switch (String.valueOf(userType)){
            case "1": //Calls the Employee class for access to cost plan and details

            break;

            case "2": //Calls the Customer class to allow them to book or view previous booking
            Customer customer = new Customer();
            customer.newOrOld();
            
            break;

            default:
            System.out.println("Please select from the following options again:");
            userSelection();
        }
        user.close();
    }
}