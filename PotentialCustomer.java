import java.util.Scanner;
public class PotentialCustomer {

    public static void newCustomer()
    {
        Venue venue = new Venue();
        Main main = new Main();
        Booking bookings = new Booking();

        System.out.println("------------------------------------------------------------------");
        System.out.println("Welcome to the Perfect Agency Customer Portal!");
        System.out.println("------------------------------------------------------------------");
        System.out.println("What would you like to do?");
        System.out.println("1) Book a package");
        System.out.println("2) View an available packages");
        System.out.println("3) Book an inspection");
        System.out.println("4) View virutal tour");
        System.out.println("5) Make an enquiry");
        System.out.println("6) Return to the Main Menu");
        System.out.println("------------------------------------------------------------------");
        Scanner custOption= new Scanner(System.in);
        String PcustomerSelect = custOption.nextLine();

            switch (String.valueOf(PcustomerSelect))
            {
                case "1":
                bookings.pickPackage();
                break;

                case "3":
                Venue.bookInspection();
                break;
                case "4":
                Venue.bookOnlineTour();
                break;
                case "5":
                makeEnquiry();
                break;
                case "6":
                Main.userSelection();
            }


    }

    

    public static void makeEnquiry()
    {
    
    EventID eventID = new EventID();    
    System.out.println("------------------------------------------------------------------");
    System.out.println("Please enter your email so we get get back to you about your enquiry");
    System.out.println("------------------------------------------------------------------");
    Scanner ema= new Scanner(System.in);
    String email = ema.nextLine();
    
    System.out.println("------------------------------------------------------------------");
    System.out.println("Please write your enquiry below");
    System.out.println("------------------------------------------------------------------");
    Scanner enq= new Scanner(System.in);
    String enquiry = enq.nextLine();
    eventID.enquiries.put(email,enquiry);
    System.out.println("------------------------------------------------------------------");
    System.out.println("Your enquiry has been sent to our team. You will hear from them soon!");
    System.out.println("------------------------------------------------------------------");
    newCustomer();
    }


    
}
