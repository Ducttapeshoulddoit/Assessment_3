import java.util.Scanner;
public class Customer 
{
    int customerID;
    String customerName;
    String address;
    String email;
    int mobileNumber;

public void newOrOld()
    {
        PotentialCustomer potCust = new PotentialCustomer();
        System.out.println("------------------------------------------------------------------");
        System.out.println("Welcome to the Perfect Agency Customer Portal!");
        System.out.println("Are you making a new booking or an existing customer?");
        System.out.println("------------------------------------------------------------------");
        System.out.println("1) New Booking");
        System.out.println("2) View Booking");
        System.out.println("------------------------------------------------------------------");
        System.out.print("You have have selected: ");
        
        Scanner custType = new Scanner(System.in);
        String customerType = custType.nextLine();

            switch (String.valueOf(customerType))
                {
                case "1": //Call method for making new booking
                potCust.newCustomer();
                break;

                case "2": //Calls method for customer who already made a booking
                oldCustomer();            
                break;

                default:
                System.out.println("Please select from the following options again:");
                newOrOld();

                } 
            custType.close();
    }



    public static void oldCustomer()
    {

        EventID eventID = new EventID();
        System.out.println("------------------------------------------------------------------");
        System.out.println("Welcome back!");
        System.out.println("Please enter your EventID");
        System.out.println("------------------------------------------------------------------");
        System.out.println("To demonstrate functionality of the program, sample eventIDs are show below");
        System.out.println("so the accessor can examine the program");
        System.out.println(eventID.eventIdlist);
        System.out.println("------------------------------------------------------------------");
        System.out.print("You have have selected: ");

        Scanner idInput = new Scanner(System.in);
        Integer eventIDInput = idInput.nextInt();
    
        String output = eventID.eventIdlist.get(eventIDInput);
            if (output == null) {
                System.out.println("Invalid input");
            } else {
                System.out.println("------------------------------------------------------------------");
                System.out.println("Welcome back " + output);
                System.out.println("What would you like to do? ");
                System.out.println("------------------------------------------------------------------");
                System.out.println("1) View Progress");
                System.out.println("2) Ask an query");
                System.out.println("3) Lodge an complaint");
                System.out.println("4) Request a cancellation of a order");
                System.out.println("5) Changing a service");
            }
            idInput.close();

        

        




    }










}
