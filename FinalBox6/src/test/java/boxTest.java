import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.*;
import java.util.Scanner;

/**
 * Unit test for svg test
 */

public class boxTest
{
    box aBox;

    @Before
    public void initialize() {
        aBox = new box();
        Scanner scan = new Scanner(System.in);
    }

    @Test
    public void testWork()
    {
        try {
            aBox.work(1,2,3);
        } catch (Exception e) {
            System.out.println("test catch");
        }
    }

    /*//see if strings are equal
    @Test
    public void testUnit1()
    {
        try {
            aBox.work(2,6,2);
            String right = "<?xml version='1.0' encoding='us-ascii'?>\n" +
        "<svg height=\"81.90mm\" viewBox=\"0.0 0.0 120.10 81.90\" width=\"120.10mm\"\n" + "xmlns=\"http://www.w3.org/2000/svg\" xmlns:cc=\"http://creativecommons.org/ns#\"\n" + "xmlns:dc=\"http://purl.org/dc/elements/1.1/\"\n" + "xmlns:inkscape=\"http://www.inkscape.org/namespaces/inkscape\"\n" + "xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n" + "xmlns:svg=\"http://www.w3.org/2000/svg/\"\n" + "xmlns:xlink=\"http://www.w3.org/1999/xlink/\">\n" +

                           "<g id=\"rectangle-almost\" style=\"fill:none;stroke-linecap:round;stroke-linejoin:round;\">\n" +
                           "<path d=\"M 1.0 3.0 H 6.0 v 2.0 H 1.0 V 3.0\" stroke=\"rgb(0,0,0)\" stroke-width=\"0.20\" />\n" +
                           "</g>\n" +
                           "<g id=\"rectangle-almost1\" style=\"fill:none;stroke-linecap:round;stroke-linejoin:round;\">\n" +
                           "<path d=\"M 1.0 7.0 H 6.0 v 2.0 H 1.0 V 7.0\" stroke=\"rgb(0,0,0)\" stroke-width=\"0.20\" />\n" +
                           "</g>\n" +
                           "<g id=\"rectangle-almost2\" style=\"fill:none;stroke-linecap:round;stroke-linejoin:round;\">\n" +
                           " <path d=\"M 1.0 11.0 H 6.0 v 2.0 H 1.0 V 11.0\" stroke=\"rgb(0,0,0)\" stroke-width=\"0.20\" />\n" +
                           "</g>\n" +
                           "<g id=\"rectangle-almost3\" style=\"fill:none;stroke-linecap:round;stroke-linejoin:round;\">\n" +
                           " <path d=\"M 1.0 15.0 H 6.0 v 2.0 H 1.0 V 15.0\" stroke=\"rgb(0,0,0)\" stroke-width=\"0.20\" />\n" +
                           "</g>\n" +
                           "<g id=\"sq-almost1\" style=\"fill:none;stroke-linecap:round;stroke-linejoin:round;\">\n" +
                           " <path d=\"M 1.0 19.0 H 2.0 v 2.0 H 1.0 V 19.0\" stroke=\"rgb(0,0,0)\" stroke-width=\"0.20\" />\n" +
                           "</g>\n" +
                           "<g id=\"sq-almost2\" style=\"fill:none;stroke-linecap:round;stroke-linejoin:round;\">\n" +
                           " <path d=\"M 1.0 23.0 H 2.0 v 2.0 H 1.0 V 23.0\" stroke=\"rgb(0,0,0)\" stroke-width=\"0.20\" />\n" +
                           "</g>\n" +
                           "</svg>";
            assertEquals(aBox.guh, right );
        } catch (Exception e) {
            System.out.println("test catch");
        }
    }*/

    //see if the indexes are equal to each other
    @Test
    public void testUnit2()
    {
        try {
            aBox.work(1,1,1);
            String right = "<?xml version='1.0' encoding='us-ascii'?>\n" +
        "<svg height=\"81.90mm\" viewBox=\"0.0 0.0 120.10 81.90\" width=\"120.10mm\"\n" + "xmlns=\"http://www.w3.org/2000/svg\" xmlns:cc=\"http://creativecommons.org/ns#\"\n" + "xmlns:dc=\"http://purl.org/dc/elements/1.1/\"\n" + "xmlns:inkscape=\"http://www.inkscape.org/namespaces/inkscape\"\n" + "xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n" + "xmlns:svg=\"http://www.w3.org/2000/svg/\"\n" + "xmlns:xlink=\"http://www.w3.org/1999/xlink/\">\n" +

                           "<g id=\"line-01\" style=\"fill:none;stroke-linecap:round;stroke-linejoin:round;\">\n" +
                           "<path d=\"M 1.0 2.0 H 11.0\" stroke=\"rgb(0,0,0)\" stroke-width=\"0.20\" />\n" +
                           "</g>\n" +
                           "<g id=\"corner\" style=\"fill:none;stroke-linecap:round;stroke-linejoin:round;\">\n" +
                           "<path d=\"M 1.0 3.0 H 9.0 V 5.1 \" stroke=\"rgb(0,0,0)\" stroke-width=\"0.20\" />\n" +
                           "</g>\n" +
                           "<g id=\"line-u\" style=\"fill:none;stroke-linecap:round;stroke-linejoin:round;\">\n" +
                           " <path d=\"M 1.0 4.0 H 7.0 V 8.0 H 1.0 \" stroke=\"rgb(0,0,0)\" stroke-width=\"0.20\" />\n" +
                           "</g>\n" +
                           "<g id=\"rectangle-almost\" style=\"fill:none;stroke-linecap:round;stroke-linejoin:round;\">\n" +
                           "<path d=\"M 1.0 5.0 H 6.0 v 2.0 H 1.0 V 5.5 \" stroke=\"rgb(0,0,0)\" stroke-width=\"0.20\" />\n" +
                           "</g>\n" +
                           "<g id=\"dovetail\" style=\"fill:none;stroke-linecap:round;stroke-linejoin:round;\">\n" +
                           "<path d=\"M 1.0 9.0 h 1.0 v 1.0 h 2.0 v -1 h 2.0 v 1 h 2.0 v -1 h 1 \" stroke=\"rgb(255,0,0)\" stroke-width=\"0.20\" />\n" +
                           "</g>\n" +
                           "</svg>";
            int a = right.indexOf("?");
            int b = aBox.guh.indexOf("?");
            assertEquals(a, b);
        } catch (Exception e) {
            System.out.println("test catch");
        }
    }

        //see if width is correct
    @Test
    public void testUnit3()
    {
        try {
            aBox.work(2,4,6);
            double a = 2;
            double b = aBox.w;
            assertEquals(a, b, 0.001);
        } catch (Exception e) {
            System.out.println("test catch");
        }
    }

            //see if width is correct
    @Test
    public void testUnit4()
    {
        try {
            aBox.work(10,4,6);
            double a = 10;
            double b = aBox.w;
            assertEquals(a, b, 0.001);
        } catch (Exception e) {
            System.out.println("test catch");
        }
    }

            //see if length is correct
    @Test
    public void testUnit5()
    {
        try {
            aBox.work(2,4,6);
            double a = 4;
            double b = aBox.l;
            assertEquals(a, b, 0.001);
        } catch (Exception e) {
            System.out.println("test catch");
        }
    }

            //see if height is correct
    @Test
    public void testUnit6()
    {
        try {
            aBox.work(2,4,6);
            double a = 6;
            double b = aBox.h;
            assertEquals(a, b, 0.001);
        } catch (Exception e) {
            System.out.println("test catch");
        }
    }

            //see if width is correct
    @Test
    public void testUnit7()
    {
        try {
            aBox.work(44,4,6);
            double a = 44;
            double b = aBox.w;
            assertEquals(a, b, 0.001);
        } catch (Exception e) {
            System.out.println("test catch");
        }
    }

            //see if width * height is correct
    @Test
    public void testUnit8()
    {
        try {
            aBox.work(2,4,6);
            double a = 12;
            double b = aBox.w * aBox.h;
            assertEquals(a, b, 0.001);
        } catch (Exception e) {
            System.out.println("test catch");
        }
    }

            //see if width is correct
    @Test
    public void testUnit9()
    {
        try {
            aBox.work(200,4,6);
            double a = 200;
            double b = aBox.w;
            assertEquals(a, b, 0.001);
        } catch (Exception e) {
            System.out.println("test catch");
        }
    }

    //see if height is correct
    @Test
    public void testUnit10()
    {
        try {
            aBox.work(2,4,60);
            double a = 60;
            double b = aBox.h;
            assertEquals(a, b, 0.001);
        } catch (Exception e) {
            System.out.println("test catch");
        }
    }

    //See if width * length is correct
    @Test
    public void testUnit11()
    {
      try {
          aBox.work(10,20,60);
          assertEquals(200, aBox.w*aBox.l, 0.001);
      } catch (Exception e) {
          System.out.println("test catch");
      }
    }

    //See if length * height is correct
    @Test
    public void testUnit12()
    {
      try {
          aBox.work(2,15,20);
          assertEquals(300, aBox.l*aBox.h, 0.001);
      } catch (Exception e) {
          System.out.println("test catch");
      }
    }

    //See if length, width, and height are all correct indididually
    @Test
    public void testUnit13()
    {
      try {
          aBox.work(10,20,30);
          assertEquals(10, aBox.w, 0.001);
          assertEquals(20, aBox.l, 0.001);
          assertEquals(30, aBox.h, 0.001);
      } catch (Exception e) {
          System.out.println("test catch");
      }
    }

    //See if all of the multiplications are correct
    @Test
    public void testUnit14()
    {
      try {
          aBox.work(3,4,5);
          assertEquals(12, aBox.w*aBox.l, 0.001);
          assertEquals(20, aBox.l*aBox.h, 0.001);
          assertEquals(15, aBox.h*aBox.w, 0.001);
      } catch (Exception e) {
          System.out.println("test catch");
      }
    }

    //See if all the multiplications are correct
    @Test
    public void testUnit15()
    {
      try {
        aBox.work(10,5,20);
        assertEquals(50, aBox.w*aBox.l, 0.001);
        assertEquals(100, aBox.l*aBox.h, 0.001);
        assertEquals(200, aBox.h*aBox.w, 0.001);
      } catch (Exception e) {
          System.out.println("test catch");
      }
    }

        //See if position and and the adder are correct at the end of the files run
    @Test
    public void testUnit16()
    {
      try {
          aBox.work(10,20,60);
          assertEquals(213, aBox.p, 0.001);
          assertEquals(62, aBox.ap, 0.001);
      } catch (Exception e) {
          System.out.println("test catch");
      }
    }

    //See if position and and the adder are correct at the end of the files run
    @Test
    public void testUnit17()
    {
      try {
          aBox.work(2,15,20);
          assertEquals(77, aBox.p, 0.001);
          assertEquals(22, aBox.ap, 0.001);
      } catch (Exception e) {
          System.out.println("test catch");
      }
    }

    //See if position and and the adder are correct at the end of the files run
    @Test
    public void testUnit18()
    {
      try {
          aBox.work(10,20,30);
          assertEquals(123, aBox.p, 0.001);
          assertEquals(32, aBox.ap, 0.001);
      } catch (Exception e) {
          System.out.println("test catch");
      }
    }

    //See if position and and the adder are correct at the end of the files run
    @Test
    public void testUnit19()
    {
      try {
          aBox.work(3,4,5);
          assertEquals(34, aBox.p, 0.001);
          assertEquals(7, aBox.ap, 0.001);
      } catch (Exception e) {
          System.out.println("test catch");
      }
    }

    //See if position and and the adder are correct at the end of the files run
    @Test
    public void testUnit20()
    {
      try {
        aBox.work(12,5,4);
        assertEquals(49, aBox.p, 0.001);
        assertEquals(6, aBox.ap, 0.001);
      } catch (Exception e) {
          System.out.println("test catch");
      }
    }

    @Test
    public void testUnit21remakeOnceNotchesFixed()
    {
        try {
            aBox.work(1,1,1);
            String right = "<g id=\"floor\" style=\"fill:none;stroke-linecap:round;stroke-linejoin:round;\">\n" +
                             "<path d=\"M 1.0 1.0 h 16 v 16 h -16 v -16 \" stroke=\"rgb(0,0,0)\" stroke-width=\"0.20\" />\n";
            int a = right.indexOf("16");
            int b = aBox.guh1.indexOf("16");
            assertEquals(a, b);
        } catch (Exception e) {
            System.out.println("test catch");
        }
    }

        @Test
    public void testUnit22remakeOnceNotchesFixed()
    {
        try {
            aBox.work(1,1,1);
            String right = "<g id=\"wall1\" style=\"fill:none;stroke-linecap:round;stroke-linejoin:round;\">\n" +
                             "<path d=\"M 1.0 20.0 h 4 v 2 h 4 v -2 h 4 v 2 h 4 v 18 h -4 v -2 h -4 v 2 h -4 v -2 h -4 v -18 \" stroke=\"rgb(0,0,0)\" stroke-width=\"0.20\" />\n" +
                             "</g>\n";
            assertEquals(right, aBox.guh2);
        } catch (Exception e) {
            System.out.println("test catch");
        }
    }

        @Test
    public void testUnit23remakeOnceNotchesFixed()
    {
        try {
            aBox.work(1,1,1);
            String right = "<g id=\"wall2\" style=\"fill:none;stroke-linecap:round;stroke-linejoin:round;\">\n" +
                             "<path d=\"M 1.0 42.0 h 4 v 2 h 4 v -2 h 4 v 2 h 4 v 18 h -4 v -2 h -4 v 2 h -4 v -2 h -4 v -18 \" stroke=\"rgb(0,0,0)\" stroke-width=\"0.20\" />\n" +
                             "</g>\n";
            int a = right.indexOf("42");
            int b = aBox.guh3.indexOf("42");
            assertEquals(a, b);
        } catch (Exception e) {
            System.out.println("test catch");
        }
    }

        @Test
    public void testUnit24remakeOnceNotchesFixed()
    {
        try {
            aBox.work(1,1,1);
            String right = "<g id=\"wall3\" style=\"fill:none;stroke-linecap:round;stroke-linejoin:round;\">\n" +
                             "<path d=\"M 20.0 1.0 h 4 v 2 h 4 v -2 h 4 v 2 h 4 v 18 h -4 v -2 h -4 v 2 h -4 v -2 h -4 v -18 \" stroke=\"rgb(0,0,0)\" stroke-width=\"0.20\" />\n" +
                             "</g>\n";
            int a = right.indexOf("18");
            int b = aBox.guh4.indexOf("18");
            assertEquals(a, b);
        } catch (Exception e) {
            System.out.println("test catch");
        }
    }

    @Test
    public void testUnit25remakeOnceNotchesFixed()
    {
        try {
            aBox.work(1,1,1);
            String right = "<g id=\"wall4\" style=\"fill:none;stroke-linecap:round;stroke-linejoin:round;\">\n" +
                             "<path d=\"M 20.0 23.0 h 4 v 2 h 4 v -2 h 4 v 2 h 4 v 18 h -4 v -2 h -4 v 2 h -4 v -2 h -4 v -18 \" stroke=\"rgb(0,0,0)\" stroke-width=\"0.20\" />\n" +
                             "</g>\n";
            assertEquals(right, aBox.guh5);
        } catch (Exception e) {
            System.out.println("test catch");
        }
    }
}
