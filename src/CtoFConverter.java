import java.util.Scanner;

public class CtoFConverter
{
    public static void main(String[] args)
    {
        double celsius = 0;
        String trash = "";
        boolean done = false;

        Scanner in = new Scanner(System.in);

        do
        {
            System.out.print("Please enter the temperature in Celsius: ");
            if(in.hasNextDouble())
            {
                celsius = in.nextDouble();
                double fahrenheit = (celsius * 9/5) + 32;
                in.nextLine();
                System.out.print("Your temperature in Fahrenheit is " + fahrenheit);
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You entered " + trash + " which is not a valid temperature");
            }
        }while(!done);
    }
}