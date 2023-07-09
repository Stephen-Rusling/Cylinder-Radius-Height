// *********************************************************************************************************
// CylinderRadiusHeight.java
//
// Application that reads the radius and height of a cylinder then calculates and displays the volume and
// surface area, print output to 4 decimal places
// Formula: Volume = π r2 h
// Formula: Surface Area = 2 π r (h + r)
// *********************************************************************************************************
import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

public class CylinderRadiusHeight
{
    public static void main(String[] args)
    {
        // Constructors to build scanner object and decimal formatter object, pattern specified according to
        // requirements of assignment (4 decimal places)
        Scanner scan = new Scanner(System.in);
        DecimalFormat fmt = new DecimalFormat("0.####");

        // Takes user input for radius and height
        System.out.print("Please enter the radius: ");
        double radius = scan.nextDouble();
        System.out.print("Please enter the height: ");
        double height = scan.nextDouble();

        // Uses given formulas using Math.pow & PI to calculate the volume and surface area of a cylinder
        double volume = Math.PI * Math.pow(radius, 2) * height;
        double surfaceArea = 2 * Math.PI * radius * (height + radius);

        // Prints output to user in specified decimal format
        System.out.println("Volume: " + fmt.format(volume));
        System.out.println("Surface area: " + fmt.format(surfaceArea));
    }
}