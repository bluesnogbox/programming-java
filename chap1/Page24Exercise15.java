import java.util.*;

public class Page24Exercise15
{

    // named constants and/or stream objects declarations

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args)
    {

    // declarations
        int StartPrice;
        double RetailPrice;
        double DiscountPrice;

    
//input
        System.out.print("Enter price of item at cost: ");
        StartPrice = console.nextInt();
        System.out.println();
        
//process
         RetailPrice = 1.8 * StartPrice;
         DiscountPrice = RetailPrice - (RetailPrice * .1);

//output 
        System.out.println("Retail Price: $" + RetailPrice);
        System.out.println("Sale Price (10% Discount): $" + DiscountPrice);        

     }
}