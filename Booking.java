import java.util.Scanner;
public class Booking {
    int packageNo;
    int packagePrice;
    int venuePrice;
    int venueNo;
    int guestNumber;
    int guestNo;
    String menuChoice;
    int foodPrice;
    int id = 3;
    int bandCost;
    int systemCost;
    int flowerCost;
    int finalPrice;
    
    public void pickPackage()
    {
    System.out.println("------------------------------------------------------------------");
    System.out.println("Please select from the following packages: ");
    System.out.println("1) Family Package");
    System.out.println("    - Serves up to 15 people: \n    - Located in the heart of Melbourne CBD...\n    - Approximate Price: $500");
    System.out.println("2) Party Package ");
    System.out.println("    - Serves up to 50 people: \n    - Located in the heart of Melbourne CBD...");
    System.out.println("3) The Grand Event Package ");
    System.out.println("    - Serves up to 150 people: \n    - Located in the heart of Melbourne CBD...");
    System.out.println("------------------------------------------------------------------");
    Scanner obj1= new Scanner(System.in);
    String packPick = obj1.nextLine();
        switch(String.valueOf(packPick))
        {
            case "1":
            packageNo = 1;
            packagePrice = 500;
            System.out.println("------------------------------------------------------------------");
            System.out.println("You have selected the Family Package"); 
            venueSelction();
            break;
        
        }

    }
    public void venueSelction()
    {
        System.out.println("Now please select a venue from the following list");
            System.out.println("1) Rod Laver Hall \n    - Price: $3300 \n    - Can seat up to 200");
            System.out.println("2) The Hoff Downtown \n    - Price: $1200 \n    - Can seat up to 50");
            System.out.println("3) The Tiny Shack \n    - Price: $800 \n    - Can seat up to 20");
            System.out.println("------------------------------------------------------------------");
            Scanner obj2= new Scanner(System.in);
            String venueSelect = obj2.nextLine();
            switch(String.valueOf(venueSelect))
        {
            case "1":
            venueNo = 1;
            venuePrice = 3300;
            System.out.println("------------------------------------------------------------------");
            System.out.println("You have selected the Rod Laver Hall"); 
            selectNumAttending();
            break;
            
            


            

        }

    }
    
    public void selectNumAttending()
    {
        boolean check = false;
        Scanner obj3= new Scanner(System.in);
            System.out.println("Please enter the number of guest that will be attending");
            System.out.println("------------------------------------------------------------------");
                while(!check)
                {
                    guestNo = obj3.nextInt();
                    if (guestNo >200)
                        {
                        System.out.println("The venue cannot host that many people \nPlease try again: \nPlease enter the number of guest that will be attending");
                        }
                    else if (guestNo <200)
                    {
                        check = true;
                        System.out.println("You have selected " + guestNo +" guests");
                        selectFood();
                        
                        
                    }
                    
                } 
                
        
    }

    public void selectFood()
    {
        System.out.println("------------------------------------------------------------------");
        System.out.println("Please select from the following food menus");
        System.out.println("------------------------------------------------------------------");
        System.out.println("1) Uno, Does, Taquitos \n    - Simmering food straight from the scorching Mexican desert....\n    - Cost per head: $53");
        System.out.println("2) High On Thai");
        System.out.println("3) DiGiorno's Family Catering");
        System.out.println("------------------------------------------------------------------");
        Scanner obj4= new Scanner(System.in);
        String foodSelection = obj4.nextLine();
        switch (String.valueOf(foodSelection))
        {
            case "1":
            System.out.println("------------------------------------------------------------------");
            System.out.println("You have selected: Uno, Does, Taquitos");
            System.out.println("------------------------------------------------------------------");
            menuChoice = "Uno, Does, Taquitos";
            foodPrice = guestNo * 53;
            SelectOptionalService();
            break;
        }
       

    }

    public void SelectOptionalService()
    {
        System.out.println("Do you want to hire either: \n    - Music Band/Equipment/Sound System \n    - Flower Arrangments?  ");
        System.out.println("------------------------------------------------------------------");
        Scanner obj5= new Scanner(System.in);
        String optionalS = obj5.nextLine();
        switch(String.valueOf(optionalS))
        {  
            case "Y":
            System.out.println("Please select either option");
            System.out.println("1) Music Band + Sound System hire");
            System.out.println("2) Flower services");
            System.out.println("------------------------------------------------------------------");
            Scanner obj6= new Scanner(System.in);
            String optionalSelection = obj6.nextLine();
            
                switch(String.valueOf(optionalSelection))
                {
                    case "1":
                    System.out.println("Please select either option");
                    System.out.println("1) AC/DC Voltage \n    - Price: $300");
                    System.out.println("2) Metallicar \n    - Price: $290");
                    System.out.println("------------------------------------------------------------------");
                    Scanner obj7= new Scanner(System.in);
                    String musicBandSelection = obj7.nextLine();
                        switch(String.valueOf(musicBandSelection))
                        {
                            case "1":
                            bandCost = 300;
                            System.out.println("Thank you choosing. We will book your selected band for your venue");
                            System.out.println("------------------------------------------------------------------");
                            System.out.println("Do you want to hire additional flower decorations?");
                            System.out.println("------------------------------------------------------------------");
                            Scanner obj8 = new Scanner(System.in);
                            String anyMore = obj8.nextLine();
                            
                                switch(String.valueOf(anyMore))
                                    {
                                        case "N":
                                        totalCost();
                                        break;

                                        case "Y":
                                        System.out.println("1) Regina's Family Flourist \n    - Price: $250");
                                        System.out.println("2) RMIT Flourists \n    - Price: $500");
                                        System.out.println("------------------------------------------------------------------");
                                        Scanner obj9 = new Scanner(System.in);
                                        String flowerSelection = obj9.nextLine();
                                            switch(String.valueOf(flowerSelection))
                                            {
                                                case "N":
                                                totalCost();
                                                break;
                                                
                                                case "1":
                                                System.out.println("You will prepare flower decorations for your venue");
                                                System.out.println("We will now prepare your final bill");
                                                System.out.println("------------------------------------------------------------------");
                                                flowerCost = 250;
                                                totalCost();
                                                
                                            
                                            }
                                        

                                    }


                            
                            break;
                            

                        }

                    break;
                }

        

        }
    }

    public void totalCost()
    {

        finalPrice = packagePrice + venuePrice + foodPrice + bandCost + flowerCost + systemCost;
        
        System.out.println("Your final bill: " + finalPrice);
        System.out.println("------------------------------------------------------------------");
    }






}
