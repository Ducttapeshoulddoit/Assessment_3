import java.util.HashMap;
public class Payments {
    public static HashMap<String, Integer> packagesPrice = new HashMap<String, Integer>();
    
    static
    {
        packagesPrice.put("1",500);
        packagesPrice.put("2",800);
        packagesPrice.put("3",1600);
    }
}
