import java.util.HashMap;

public class EventID 
{
     static int eventID;
     String eventDetails;

    public static HashMap<Integer, String> eventIdlist = new HashMap<Integer, String>();
    public static HashMap<String, String> enquiries = new HashMap<String, String>();
    static
    {
        eventIdlist.put(1,"Kanye East");
        eventIdlist.put(2,"Sam O' Nella");
    }

    public static void updateMap()
    {
        
    }
    
    
    int getEventID()
    {
        
       return eventID; 
    }
















}