/*
Name: Akshita Bajaj
Assignment: Assignment 2
Program:Computer system technology-software development and network engineering coop.
 */



import java.util.Scanner;
import java.lang.Math;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MySecondAssignment{

    public static final double PI = 3.14;


    public static void main (String [] args){   //main method for the geometrical calculations

        System.out.println("Cone Geometry \n");
        Scanner in = new Scanner (System.in);
        //version 2
        double doubleRadius;
        do {
            System.out.print("Enter Radius :");
            String stringRadius = in.next();
            //validation logic
            Pattern p = Pattern.compile("\\d{1,2}\\.\\d{1,2}");
            Matcher m = p.matcher(stringRadius);
            if(m.matches()){
                    doubleRadius = Double.parseDouble(stringRadius);
                    break;
                }else{
                    System.out.println("invalid Radius value provided");
                    continue;
                }
            //}
        }while(true);
        //
        double doubleHeight;
        do {
            System.out.print("Enter Height :");
            String stringHeight = in.next();
            //validation logic
            Pattern p = Pattern.compile("\\d{1,2}\\.\\d{1,2}");
            Matcher m = p.matcher(stringHeight);
            if(m.matches()){
                doubleHeight = Double.parseDouble(stringHeight);
                break;
            }else{
                System.out.println("invalid Height value provided");
                continue;
            }
        }while(true);
        //
        System.out.print("\n\n");

        //slant Height must be calculated in double floating type
        double slant = Math.sqrt(Math.pow(doubleRadius,2) + Math.pow(doubleHeight,2));
        // for formatting output of slant stringHeight upto two decimal places
        System.out.printf("Slant:%13.2f\n", slant);

        /* total surface area =lateral surface area + base surface area
        first calculate lateral surface area which is stored in 'double' floating type
         */
         double lateralSurfaceArea = Math.PI * doubleRadius * slant;

         // secondly calculate base surface area of the base of cone which is a circle
         double baseSurfaceArea = Math.PI * (Math.pow(doubleRadius,2));

         //total surface area is also stored in double data type
         double totalSurfaceArea = lateralSurfaceArea + baseSurfaceArea;


         System.out.printf("Surface Area:%6.2f\n", totalSurfaceArea);

         //volume of cone is also stored into a double data type
         double volume = (Math.PI * Math.pow(doubleRadius,2) * doubleHeight) / 3;

         // volume output upto two decimal places
         System.out.printf("Volume:%12.2f\n", volume);

         System.out.print("\n\n");

         //bonus questions
        //perimeter of triangle
        double trianglePerimeter = Math.sqrt(Math.pow(doubleRadius,2)
                + Math.pow(doubleHeight,2)) + doubleRadius+doubleHeight;
        // area of triangle
        double triangleArea = (doubleRadius * doubleHeight)/2;

        // print triangle perimeter  upto one decimal place
        System.out.printf("Triangle Perimeter:%6.1f\n", trianglePerimeter);
        //print triangle area upto one decimal place
        System.out.printf("Triangle Area:%11.1f\n",triangleArea);


    }
}
