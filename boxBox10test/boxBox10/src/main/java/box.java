/**
 * Team 2: Fisher Coburn, Matthew Pietrucha, Mitchell Melrose
 * Professor: Brent Reeves
 * Project: Group Project Week 8
 *
 * Purpose: Creates an SVG file and prints out to it
 *
 *how to compile/build: mvn compile
 *						          mvn test
 *                      java -cp target/classes box
 */

import java.io.File;  // Import the File class
import java.io.FileWriter;
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.Scanner;

public class box
{
  public static String guh = "";
  public static double w = 0;
  public static double l = 0;
  public static double h = 0;
    public static void main( String[] args )  //have no idea why length seems shorter than the others
    {
            Scanner input = new Scanner(System.in);
            System.out.print("What do you want the width to be in inches? ");
            double width = input.nextInt();
            System.out.print("What do you want the length to be in inches? ");
            double length = input.nextInt();
            System.out.print("What do you want the height to be in inches? ");
            double height = input.nextInt();
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

        double addPos = width + 2.0;
        double point = 3.0;

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
        pieces[0] = ("<g id=\"floor\" style=\"fill:none;stroke-linecap:round;stroke-linejoin:round;\">\n" +
                             "<path d=\"M 1.0 1.0 h 16 v 16 h -16 v -16 \" stroke=\"rgb(0,0,0)\" stroke-width=\"0.20\" />\n" +
                             "</g>\n");
        pieces[1] = ("<g id=\"wall1\" style=\"fill:none;stroke-linecap:round;stroke-linejoin:round;\">\n" +
                             "<path d=\"M 1.0 20.0 h 4 v 2 h 4 v -2 h 4 v 2 h 4 v 18 h -4 v -2 h -4 v 2 h -4 v -2 h -4 v -18 \" stroke=\"rgb(0,0,0)\" stroke-width=\"0.20\" />\n" +
                             "</g>\n");
        pieces[2] = ("<g id=\"wall2\" style=\"fill:none;stroke-linecap:round;stroke-linejoin:round;\">\n" +
                             "<path d=\"M 1.0 42.0 h 4 v 2 h 4 v -2 h 4 v 2 h 4 v 18 h -4 v -2 h -4 v 2 h -4 v -2 h -4 v -18 \" stroke=\"rgb(0,0,0)\" stroke-width=\"0.20\" />\n" +
                             "</g>\n");
        pieces[3] = ("<g id=\"wall3\" style=\"fill:none;stroke-linecap:round;stroke-linejoin:round;\">\n" +
                             "<path d=\"M 20.0 1.0 h 4 v 2 h 4 v -2 h 4 v 2 h 4 v 18 h -4 v -2 h -4 v 2 h -4 v -2 h -4 v -18 \" stroke=\"rgb(0,0,0)\" stroke-width=\"0.20\" />\n" +
                             "</g>\n");
        pieces[4] = ("<g id=\"wall4\" style=\"fill:none;stroke-linecap:round;stroke-linejoin:round;\">\n" +
                             "<path d=\"M 20.0 23.0 h 4 v 2 h 4 v -2 h 4 v 2 h 4 v 18 h -4 v -2 h -4 v 2 h -4 v -2 h -4 v -18 \" stroke=\"rgb(0,0,0)\" stroke-width=\"0.20\" />\n" +
                             "</g>\n");
        // pieces[0] = ("<g id=\"rectangle-almost\" style=\"fill:none;stroke-linecap:round;stroke-linejoin:round;\">\n" +
        //                    "<path d=\"M 1.0 " + point + " H " + length * 1.5 + " v " + width + " H 1.0 V " + point + "\" stroke=\"rgb(0,0,0)\" stroke-width=\"0.20\" />\n" +
        //                    "</g>\n");
        // point += addPos;
        // pieces[1] = ("<g id=\"rectangle-almost\" style=\"fill:none;stroke-linecap:round;stroke-linejoin:round;\">\n" +
        //                    "<path d=\"M 1.0 " + point + " H " + length * 1.5 + " v " + width + " H 1.0 V " + point + "\" stroke=\"rgb(0,0,0)\" stroke-width=\"0.20\" />\n" +
        //                    "</g>\n");

        // point += addPos;
        // addPos = height + 2.0;
        // pieces[2] = ("<g id=\"rectangle-almost\" style=\"fill:none;stroke-linecap:round;stroke-linejoin:round;\">\n" +
        //                    "<path d=\"M 1.0 " + point + " H " + length * 1.5 + " v " + height + " H 1.0 V " + point + "\" stroke=\"rgb(0,0,0)\" stroke-width=\"0.20\" />\n" +
        //                    "</g>\n");
        // point += addPos;
        // pieces[3] = ("<g id=\"rectangle-almost\" style=\"fill:none;stroke-linecap:round;stroke-linejoin:round;\">\n" +
        //                    "<path d=\"M 1.0 " + point + " H " + length * 1.5 + " v " + height + " H 1.0 V " + point + "\" stroke=\"rgb(0,0,0)\" stroke-width=\"0.20\" />\n" +
        //                    "</g>\n");
        // point += addPos;
        // pieces[4] = ("<g id=\"rectangle-almost\" style=\"fill:none;stroke-linecap:round;stroke-linejoin:round;\">\n" +
        //                    "<path d=\"M 1.0 " + point + " H " + width * 1.5 + " v " + height + " H 1.0 V " + point + "\" stroke=\"rgb(0,0,0)\" stroke-width=\"0.20\" />\n" +
        //                    "</g>\n");
        // point += addPos;
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
