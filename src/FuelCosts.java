import java.util.Scanner;

public class FuelCosts
{
    public static void main(String[] args)
    {
        double gallons = 0.0;
        double milesPerGallon = 0.0;
        double price = 0.0;
        boolean doneGallon = false;
        boolean doneMiles = false;
        boolean donePrice = false;
        String trash = "";


        Scanner in = new Scanner(System.in);
        do
        {
            System.out.print("Please enter the number of gallons the tank can hold: ");
            if(in.hasNextDouble())
            {
                gallons = in.nextDouble();
                in.nextLine();
                System.out.println("The number of gallon the tank can hold is " + gallons);
                doneGallon = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You entered " + trash + " which is not a valid number");
            }
        }while(!doneGallon);
        do
        {
            System.out.print("Please enter the miles per gallon: ");
            if(in.hasNextDouble())
            {
                milesPerGallon = in.nextDouble();
                in.nextLine();
                System.out.println("The miles per gallon is " + milesPerGallon);
                doneMiles = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You entered " + trash + " which is not a valid number");
            }
        }while(!doneMiles);
        do
        {
            System.out.print("Please enter the price per gallon: ");
            if(in.hasNextDouble())
            {
                price = in.nextDouble();
                in.nextLine();
                System.out.println("The price per gallon is " + price);
                donePrice = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You entered " + trash + " which is not a valid price");
            }
        }while(!donePrice);
        double finalPrice = (100/milesPerGallon) * price;
        double distance = milesPerGallon * gallons;
        System.out.println("To travel 100 miles it would cost " + finalPrice + " and you can go " + distance + " miles");
    }
}
