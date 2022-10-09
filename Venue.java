import java.util.Scanner;
public class Venue {
    int venueID;
    String venueName;

    public static void bookInspection()
    {
        System.out.println("------------------------------------------------------------------");
        System.out.println("Venue Inspection Menu");
        System.out.println("Please select from the following venues");
        System.out.println("1) Rod Laver Hall");
        System.out.println("2) The Hoff Downtown");
        System.out.println("3) The Tiny Shack");
        System.out.println("------------------------------------------------------------------");
        Scanner inspectOption= new Scanner(System.in);
        String inspectionSelect = inspectOption.nextLine();
            if (inspectionSelect.equals("1"))
                {
                    String op1 = "8/10/2022"; String op2 = "9/10/2022"; String op3 = "10/10/2022"; String op4 = "12/10/2022";
                    System.out.println("------------------------------------------------------------------");
                    System.out.println("Please select from the following dates: ");
                    System.out.println("1) [8/10/2022] ");
                    System.out.println("2) [9/10/2022] ");
                    System.out.println("3) [10/10/2022] ");
                    System.out.println("4) [12/10/2022] ");
                    System.out.println("5) Next Page (*Note just adding this as a miscellaneous option*) ");
                    Scanner dateOption= new Scanner(System.in);
                    String  dateInspectSelect = dateOption.nextLine();
                    if (dateInspectSelect.equals("1"))
                            {
                    System.out.println("------------------------------------------------------------------");
                    System.out.println("Inspection booked! You have booked the "+op1+ " to inspect the Rod Laver Hall");
                    System.out.println("Thank you for using our service. Returning you Customer Portal");
                    PotentialCustomer potentialCustomer = new PotentialCustomer();
                    potentialCustomer.newCustomer();
                            }
                    if (dateInspectSelect.equals("2"))
                            {
                    System.out.println("------------------------------------------------------------------");
                    System.out.println("Inspection booked! You have booked the "+op2+ " to inspect the Rod Laver Hall");
                    System.out.println("Thank you for using our service. Returning you Customer Portal");
                    PotentialCustomer potentialCustomer = new PotentialCustomer();
                    potentialCustomer.newCustomer();
                            }
                    if (dateInspectSelect.equals("3"))
                            {
                    System.out.println("------------------------------------------------------------------");
                    System.out.println("Inspection booked! You have booked the "+op3+ " to inspect the Rod Laver Hall");
                    System.out.println("Thank you for using our service. Returning you Customer Portal");
                    PotentialCustomer potentialCustomer = new PotentialCustomer();
                    potentialCustomer.newCustomer();
                            }
                if (dateInspectSelect.equals("4"))
                            {
                    System.out.println("------------------------------------------------------------------");
                    System.out.println("Inspection booked! You have booked the "+op4+ " to inspect the Rod Laver Hall");
                    System.out.println("Thank you for using our service. Returning you Customer Portal");
                    PotentialCustomer potentialCustomer = new PotentialCustomer();
                    potentialCustomer.newCustomer();
                            }
                } else if (inspectionSelect.equals("2"))
                {
                    String op1 = "8/10/2022"; String op2 = "9/10/2022"; String op3 = "10/10/2022"; String op4 = "12/10/2022";
                    System.out.println("------------------------------------------------------------------");
                    System.out.println("Please select from the following dates: ");
                    System.out.println("1) [8/10/2022] ");
                    System.out.println("2) [9/10/2022] ");
                    System.out.println("3) [10/10/2022] ");
                    System.out.println("4) [12/10/2022] ");
                    System.out.println("5) Next Page (*Note just adding this as a miscellaneous option*) ");
                    Scanner dateOption= new Scanner(System.in);
                    String  dateInspectSelect = dateOption.nextLine();
                    if (dateInspectSelect.equals("1"))
                            {
                    System.out.println("------------------------------------------------------------------");
                    System.out.println("Inspection booked! You have booked the "+op1+ " to inspect the The Hoff Downtown");
                    System.out.println("Thank you for using our service. Returning you Customer Portal");
                    PotentialCustomer potentialCustomer = new PotentialCustomer();
                    potentialCustomer.newCustomer();
                            }
                    if (dateInspectSelect.equals("2"))
                            {
                    System.out.println("------------------------------------------------------------------");
                    System.out.println("Inspection booked! You have booked the "+op2+ " to inspect the The Hoff Downtown");
                    System.out.println("Thank you for using our service. Returning you Customer Portal");
                    PotentialCustomer potentialCustomer = new PotentialCustomer();
                    potentialCustomer.newCustomer();
                            }
                    if (dateInspectSelect.equals("3"))
                            {
                    System.out.println("------------------------------------------------------------------");
                    System.out.println("Inspection booked! You have booked the "+op3+ " to inspect the The Hoff Downtown");
                    System.out.println("Thank you for using our service. Returning you Customer Portal");
                    PotentialCustomer potentialCustomer = new PotentialCustomer();
                    potentialCustomer.newCustomer();
                            }
                if (dateInspectSelect.equals("4"))
                            {
                    System.out.println("------------------------------------------------------------------");
                    System.out.println("Inspection booked! You have booked the "+op4+ " to inspect the The Hoff Downtown");
                    System.out.println("Thank you for using our service. Returning you Customer Portal");
                    PotentialCustomer potentialCustomer = new PotentialCustomer();
                    potentialCustomer.newCustomer();
                            }
                } else if (inspectionSelect.equals("3"))
                {
                    String op1 = "8/10/2022"; String op2 = "9/10/2022"; String op3 = "10/10/2022"; String op4 = "12/10/2022";
                    System.out.println("------------------------------------------------------------------");
                    System.out.println("Please select from the following dates: ");
                    System.out.println("1) [8/10/2022] ");
                    System.out.println("2) [9/10/2022] ");
                    System.out.println("3) [10/10/2022] ");
                    System.out.println("4) [12/10/2022] ");
                    System.out.println("5) Next Page (*Note just adding this as a miscellaneous option*) ");
                    Scanner dateOption= new Scanner(System.in);
                    String  dateInspectSelect = dateOption.nextLine();
                    if (dateInspectSelect.equals("1"))
                            {
                    System.out.println("------------------------------------------------------------------");
                    System.out.println("Inspection booked! You have booked the "+op1+ " to inspect the The Tiny Shack");
                    System.out.println("Thank you for using our service. Returning you Customer Portal");
                    PotentialCustomer potentialCustomer = new PotentialCustomer();
                    potentialCustomer.newCustomer();
                            }
                    if (dateInspectSelect.equals("2"))
                            {
                    System.out.println("------------------------------------------------------------------");
                    System.out.println("Inspection booked! You have booked the "+op2+ " to inspect the The Tiny Shack");
                    System.out.println("Thank you for using our service. Returning you Customer Portal");
                    PotentialCustomer potentialCustomer = new PotentialCustomer();
                    potentialCustomer.newCustomer();
                            }
                    if (dateInspectSelect.equals("3"))
                            {
                    System.out.println("------------------------------------------------------------------");
                    System.out.println("Inspection booked! You have booked the "+op3+ " to inspect the The Hoff Downtown");
                    System.out.println("Thank you for using our service. Returning you Customer Portal");
                    PotentialCustomer potentialCustomer = new PotentialCustomer();
                    potentialCustomer.newCustomer();
                            }
                if (dateInspectSelect.equals("4"))
                            {
                    System.out.println("------------------------------------------------------------------");
                    System.out.println("Inspection booked! You have booked the "+op4+ " to inspect the The Tiny Shack");
                    System.out.println("Thank you for using our service. Returning you Customer Portal");
                    PotentialCustomer potentialCustomer = new PotentialCustomer();
                    potentialCustomer.newCustomer();
                            }

                }

    
    }

    public static void bookOnlineTour()
    {
        
    }
}
