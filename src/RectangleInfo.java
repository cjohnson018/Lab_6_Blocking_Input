import java.util.Scanner;
import java.lang.Math;
public class RectangleInfo
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double width = 0.0;
        double height = 0.0;
        boolean doneWidth = false;
        boolean doneHeight = false;
        String trash = "";

        do
        {
            System.out.print("Please enter the width of the rectangle: ");
            if(in.hasNextDouble())
            {
                width = in.nextDouble();
                in.nextLine();
                System.out.println("The width is " + width);
                doneWidth = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You entered " + trash + " which is not a valid width");
            }
        }while(!doneWidth);
        do
        {
            System.out.print("Please enter the height of the rectangle: ");
            if(in.hasNextDouble())
            {
                height = in.nextDouble();
                in.nextLine();
                System.out.println("The height is " + height);
                doneHeight = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You entered " + trash + " which is not a valid height");
            }
        }while(!doneHeight);
        double area = width * height;
        double perimeter = (2*width)+(2*height);
        double diagonal = Math.sqrt((height * height)+(width*width));
        System.out.println("The perimeter of the rectangle is " + perimeter);
        System.out.println("The area of the rectangle is " + area);
        System.out.println("The diagonal of the rectangle is " + diagonal);
    }
}
