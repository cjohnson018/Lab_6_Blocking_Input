import java.util.Scanner;

public class MetricConverter
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double meters = 0.0;
        boolean done = false;
        String trash = "";

        do
        {
            System.out.print("Please enter the measurement in meters: ");
            if(in.hasNextDouble())
            {
                meters = in.nextDouble();
                in.nextLine();
                System.out.println("The measurement is " + meters + " meters");
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You entered " + trash + " which is not a valid measurement");
            }
        }while(!done);
        double miles = meters / 1609;
        double feet = meters * 3.281;
        double inches = meters * 39.37;
        System.out.println("The conversion from meters to miles is " + miles);
        System.out.println("The conversion from meters to feet is " + feet);
        System.out.println("The conversion from meters to inches is " + inches);
    }
}
