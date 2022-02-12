/*
Name: Akshita Bajaj
Assignment: Assignment 2
Program:Computer system technology-software development and network engineering coop.
 */



import java.util.Scanner;
import java.lang.Math;

public class MySecondAssignment{

    public static final double PI = 3.14;


    public static void main (String [] args){   //main method for the geometrical calculations

        System.out.println("Cone Geometry \n");
        Scanner in = new Scanner (System.in);
        System.out.print("Enter radius :");

        double radius = in.nextDouble();
        System.out.print("Enter Height: ");
        double height = in.nextDouble();

        System.out.print("\n\n");

        //slant height must be calculated in double floating type
        double slant = Math.sqrt(Math.pow(radius,2) + Math.pow(height,2));
        // for formatting output of slant height upto two decimal places
        System.out.printf("Slant:%13.2f\n", slant);

        /* total surface area =lateral surface area + base surface area
        first calculate lateral surface area which is stored in 'double' floating type
         */
         double lateralSurfaceArea = Math.PI * radius * slant;

         // secondly calculate base surface area of the base of cone which is a circle
         double baseSurfaceArea = Math.PI * (Math.pow(radius,2));

         //total surface area is also stored in double data type
         double totalSurfaceArea = lateralSurfaceArea + baseSurfaceArea;


         System.out.printf("Surface Area:%6.2f\n", totalSurfaceArea);

         //volume of cone is also stored into a double data type
         double volume = (Math.PI * Math.pow(radius,2) * height) / 3;

         // volume output upto two decimal places
         System.out.printf("Volume:%12.2f\n", volume);

         System.out.print("\n\n");

         //bonus questions
        //perimeter of triangle
        double trianglePerimeter = Math.sqrt(Math.pow(radius,2)
                + Math.pow(height,2)) + radius+height;
        // area of triangle
        double triangleArea = (radius * height)/2;

        // print triangle perimeter  upto one decimal place
        System.out.printf("Triangle Perimeter:%6.1f\n", trianglePerimeter);
        //print triangle area upto one decimal place
        System.out.printf("Triangle Area:%11.1f\n",triangleArea);


    }
}
