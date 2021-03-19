/**
 * Team 2: Fisher Coburn, Matthew Pietrucha, Mitchell Melrose
 * Professor: Brent Reeves
 * Project: Group Project Week 8
 *
 * Purpose: Creates an SVG file and prints out to it
 *
 *how to compile/build: mvn compile
 *						mvn test
 */

import java.io.File;  // Import the File class
import java.io.FileWriter;
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.Scanner; //Import scanner for user input

public class box
{
  public static String guh = "";
  public static void main( String[] args )
  {
          System.out.println("Please Work");
          work();
  }

  public static void work()
  {
    try
    {
      File myObj = new File("tester.svg");
      if (myObj.createNewFile())
      {
        System.out.println("File created: " + myObj.getName());
      }
      else
      {
        System.out.println("File already exists.");
      }
    }
    catch (IOException e)
    {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
      try
      {
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

        //The build string will handle the box pieces code
        String[] pieces = new String[100];

        String userInput = ""; //String for user input
        int count = 0; //Which side of the box is being input
        Scanner scan = new Scanner(System.in); //Scanner to get input
        System.out.println("Use \"Quit\" to stop input");

        while(!(userInput.equalsIgnoreCase("quit"))) //Runs while user has not entered "quit"
        {
            System.out.println("Enter SVG specifications for side " + (count+1));
            userInput = scan.nextLine(); //Gets input
            if(!(userInput.equalsIgnoreCase("quit"))) //Inputs user input into specifications array and moves to next side, as long as user has not entered "quit"
            {
              pieces[count] = userInput;
              count++;
            }
        }

        String finalO = (top);
        for (int i = 0; pieces[i] != null; i++){
          finalO += pieces[i];
        }
        finalO += end;
        guh = finalO;
        myWriter.write(finalO);
        // myWriter.write(top+end);
        myWriter.close();
        System.out.println("Successfully wrote to the file.");
      }
      catch (IOException e)
      {
        System.out.println("An error occurred.");
        e.printStackTrace();
      }
    }
}
