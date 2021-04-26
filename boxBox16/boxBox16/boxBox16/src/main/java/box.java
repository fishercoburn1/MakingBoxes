/**
 * Team 2: Fisher Coburn, Matthew Pietrucha, Mitchell Melrose
 * Professor: Brent Reeves
 * Project: Group Project Week 8
 *
 * Purpose: Creates an SVG file and prints out to it
 *
 *how to compile/build: mvn compile
 *                      mvn test
 *                      java -cp target/classes box
 */

import java.io.File;  // Import the File class
import java.io.FileWriter;
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.Scanner;

public class box
{
  public static String guh = "";
  public static String guh1 = "";
  public static String guh2 = "";
  public static String guh3 = "";
  public static String guh4 = "";
  public static String guh5 = "";
  public static double width = 0;
  public static double length = 0;
  public static double height = 0;
  public static double w = 0;
  public static double l = 0;
  public static double h = 0;
  public static double p = 0;
  public static double ap = 0;
  public static double lp = 0;
    public static void main( String[] args )  //have no idea why length seems shorter than the others
    {
      //Will have a while loop to go through and make sure that they have input that is
      //within the bounds of the numbers allowed
      boolean check = false;
        while (!check) {
            Scanner input = new Scanner(System.in);
            System.out.print("\n\nChoose the dimensions for your box. \nPlease keep in mind that the minimum measurement is 2, and the maximum is 12.\n");
            System.out.print("What do you want the width to be in inches? ");
            width = input.nextInt();
            System.out.print("What do you want the length to be in inches? ");
            length = input.nextInt();
            System.out.print("What do you want the height to be in inches? ");
            height = input.nextInt();
            System.out.println();
            if (width > 12){
              System.out.print("Error: Your width measurement was above 12");
            }
            if (width < 2){
              System.out.print("Error: Your width measurement was below 2");
            }
            if (length > 12){
              System.out.print("Error: Your length measurement was above 12");
            }
            if (length < 2){
              System.out.print("Error: Your length measurement was below 2");
            }
            if (height > 12){
              System.out.print("Error: Your height measurement was above 6");
            }
            if (height < 2){
              System.out.print("Error: Your height measurement was below 2");
            }
            if (width <= 12 && width >= 2 && length <= 12 && length >= 2 && height <= 12 && height >= 2){
              check = true;
            }

          }
          System.out.println("Please Work");
          work(width, length, height);
  }

  public static void work(double width, double length, double height)
  {
    try {
      File myObj = new File("tester.svg");
      if (myObj.createNewFile()) {
        System.out.println("File created: " + myObj.getName());
      } else {
        System.out.println("File already exists.");
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
      try {

        //double addPos = width + 2.0;
        double addPos = (length * 4) + 2.0;
        double point = 3.0;
        double leftPoint = 1.0;

        FileWriter myWriter = new FileWriter("tester.svg");
        //This string "top" will just hold the declaration top part of the SVG file
        String top = "<?xml version='1.0' encoding='us-ascii'?>\n" +
        "<svg height=\"81.90mm\" viewBox=\"0.0 0.0 120.10 81.90\" width=\"120.10mm\"\n" +
        "xmlns=\"http://www.w3.org/2000/svg\" xmlns:cc=\"http://creativecommons.org/ns#\"\n" +
        "xmlns:dc=\"http://purl.org/dc/elements/1.1/\"\n" +
        "xmlns:inkscape=\"http://www.inkscape.org/namespaces/inkscape\"\n" +
        "xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n" +
        "xmlns:svg=\"http://www.w3.org/2000/svg/\"\n" +
        "xmlns:xlink=\"http://www.w3.org/1999/xlink/\">\n";
        // //The end string is just the closing out of the svg file
        String end = "</svg>";

        //The build string will handle the box pieces code - - Until we get user input these will just be the string that we are hard coding outselves to make the box
        String[] pieces = new String[100];
        //The base parameters are based off of a 4x4 box
        //This is assuming that each point is a quarter of an inch
        //That makes this starting box a 
        //Width: 5
        //Length: 5
        //Height: 4

        //This will be the box for if it is above 4 on height
        pieces[0] = ("<g id=\"floor\" style=\"fill:none;stroke-linecap:round;stroke-linejoin:round;\">\n" +
                             "<path d=\"M " + leftPoint + " " + point + " h " + (width*4) + " v " + (length*4) + " h -" + (width*4) + " v -" + (length*4) + " \" stroke=\"rgb(0,0,0)\" stroke-width=\"0.20\" />\n" +
                             "</g>\n");
        point += addPos;

        if(point + addPos > 100)
        {
        	leftPoint += height * 4 + 2;
        	point = 3;
        }//this part isnt really tested

        pieces[1] = ("<g id=\"length1\" style=\"fill:none;stroke-linecap:round;stroke-linejoin:round;\">\n" +
                             "<path d=\"M " + leftPoint + " " + point + " h " + height/2 + " v 1 h " + height/2 + " v -1 h " + height/2 + " v 1 h " + height/2 + " v -1 h " + height/2 + " v 1 h " + height/2 + " v -1 h " + height/2 + " v 1 h " + height/2 + " v " + ((length*4) -1) + " h -" + height/2 + " v -1 h -" + height/2 + " v 1 h -" + height/2 + " v -1 h -" + height/2 + " v 1 h -" + height/2 + " v -1 h -" + height/2 + " v 1 h -" + height/2 + " v -1 h -" + height/2 + " v -" + ((length*4) -1) + " \" stroke=\"rgb(0,0,0)\" stroke-width=\"0.20\" />\n" +
                             "</g>\n");
        point += addPos;
        addPos = (length * 4) + 2.0;

        if(point + addPos > 100)
        {
        	leftPoint += height * 4 + 2;
        	point = 3;
        }//this part isnt really tested
        pieces[2] = ("<g id=\"length2\" style=\"fill:none;stroke-linecap:round;stroke-linejoin:round;\">\n" +
                             "<path d=\"M " + leftPoint + " " + point + " h " + height/2 + " v 1 h " + height/2 + " v -1 h " + height/2 + " v 1 h " + height/2 + " v -1 h " + height/2 + " v 1 h " + height/2 + " v -1 h " + height/2 + " v 1 h " + height/2 + " v  " + ((length*4) -1) + " h -" + height/2 + " v -1 h -" + height/2 + " v 1 h -" + height/2 + " v -1 h -" + height/2 + " v 1 h -" + height/2 + " v -1 h -" + height/2 + " v 1 h -" + height/2 + " v -1 h -" + height/2 + " v -" + ((length*4) -1) + " \" stroke=\"rgb(0,0,0)\" stroke-width=\"0.20\" />\n" +
                             "</g>\n");
        point += addPos;

        if(point + addPos > 100)
        {
        	leftPoint += height * 4 + 2;
        	point = 3;
        }//this part isnt really tested


        pieces[3] = ("<g id=\"width1\" style=\"fill:none;stroke-linecap:round;stroke-linejoin:round;\">\n" +
                             "<path d=\"M " + leftPoint + " " + point + " h " + height/2 + " v 1 h " + height/2 + " v -1 h " + height/2 + " v 1 h " + height/2 + " v -1 h " + height/2 + " v 1 h " + height/2 + " v -1 h " + height/2 + " v 1 h " + height/2 + " v  " + ((width*4) -1) + " h -" + height/2 + " v -1 h -" + height/2 + " v 1 h -" + height/2 + " v -1 h -" + height/2 + " v 1 h -" + height/2 + " v -1 h -" + height/2 + " v 1 h -" + height/2 + " v -1 h -" + height/2 + " v -" + ((width*4) -1) + " \" stroke=\"rgb(0,0,0)\" stroke-width=\"0.20\" />\n" +
                             "</g>\n");
        point += addPos;

        if(point + addPos > 100)
        {
        	leftPoint += height * 4 + 2;
        	point = 3;
        }//this part isnt really tested

        pieces[4] = ("<g id=\"width2\" style=\"fill:none;stroke-linecap:round;stroke-linejoin:round;\">\n" +
                             "<path d=\"M " + leftPoint + " " + point + " h " + height/2 + " v 1 h " + height/2 + " v -1 h " + height/2 + " v 1 h " + height/2 + " v -1 h " + height/2 + " v 1 h " + height/2 + " v -1 h " + height/2 + " v 1 h " + height/2 + " v  " + ((width*4) -1) + " h -" + height/2 + " v -1 h -" + height/2 + " v 1 h -" + height/2 + " v -1 h -" + height/2 + " v 1 h -" + height/2 + " v -1 h -" + height/2 + " v 1 h -" + height/2 + " v -1 h -" + height/2 + " v -" + ((width*4) -1) + " \" stroke=\"rgb(0,0,0)\" stroke-width=\"0.20\" />\n" +
                             "</g>\n");

        point += addPos;

        if(point + addPos > 100)
        {
        	leftPoint += height * 4;
        	point = 3;
        }//this part isnt really tested

        /*
      NEED TO FIGURE OUT NOTCHES FOR USER INPUT
        */


        // pieces[0] = ("<g id=\"rectangle-almost\" style=\"fill:none;stroke-linecap:round;stroke-linejoin:round;\">\n" +
        //                    "<path d=\"M 1.0 " + point + " H " + length * 1.5 + " v " + width + " H 1.0 V " + point + "\" stroke=\"rgb(0,0,0)\" stroke-width=\"0.20\" />\n" +
        //                    "</g>\n");
        
        // pieces[1] = ("<g id=\"rectangle-almost\" style=\"fill:none;stroke-linecap:round;stroke-linejoin:round;\">\n" +
        //                    "<path d=\"M 1.0 " + point + " H " + length * 1.5 + " v " + width + " H 1.0 V " + point + "\" stroke=\"rgb(0,0,0)\" stroke-width=\"0.20\" />\n" +
        //                    "</g>\n");


        // pieces[2] = ("<g id=\"rectangle-almost\" style=\"fill:none;stroke-linecap:round;stroke-linejoin:round;\">\n" +
        //                    "<path d=\"M 1.0 " + point + " H " + length * 1.5 + " v " + height + " H 1.0 V " + point + "\" stroke=\"rgb(0,0,0)\" stroke-width=\"0.20\" />\n" +
        //                    "</g>\n");
        
        // pieces[3] = ("<g id=\"rectangle-almost\" style=\"fill:none;stroke-linecap:round;stroke-linejoin:round;\">\n" +
        //                    "<path d=\"M 1.0 " + point + " H " + length * 1.5 + " v " + height + " H 1.0 V " + point + "\" stroke=\"rgb(0,0,0)\" stroke-width=\"0.20\" />\n" +
        //                    "</g>\n");
        
        // pieces[4] = ("<g id=\"rectangle-almost\" style=\"fill:none;stroke-linecap:round;stroke-linejoin:round;\">\n" +
        //                    "<path d=\"M 1.0 " + point + " H " + width * 1.5 + " v " + height + " H 1.0 V " + point + "\" stroke=\"rgb(0,0,0)\" stroke-width=\"0.20\" />\n" +
        //                    "</g>\n");
        
        // pieces[5] = ("<g id=\"rectangle-almost\" style=\"fill:none;stroke-linecap:round;stroke-linejoin:round;\">\n" +
        //                    "<path d=\"M 1.0 " + point + " H " + width * 1.5 + " v " + height + " H 1.0 V " + point + "\" stroke=\"rgb(0,0,0)\" stroke-width=\"0.20\" />\n" +
        //                    "</g>\n");
        String finalO = (top);
        for (int i = 0; pieces[i] != null; i++){
          finalO += pieces[i];
        }
        finalO += end;
        guh = finalO;
        w = width;
        l = length;
        h = height;
        p = point;
        ap = addPos;
        lp = leftPoint;
        guh1 = pieces[0];
        guh2 = pieces[1];
        guh3 = pieces[2];
        guh4 = pieces[3];
        guh5 = pieces[4];
        myWriter.write(finalO);
        // myWriter.write(top+end);
        myWriter.close();
        System.out.println("Successfully wrote to the file.");
      } catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
      }
    }
}
