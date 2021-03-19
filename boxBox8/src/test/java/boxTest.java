import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.*;

/**
 * Unit test for svg test
 */

public class boxTest
{
    box aBox;
    
    @Before
    public void initialize() {
        aBox = new box();
    }
    
    @Test
    public void testWork() 
    {
        try {
            aBox.work();
        } catch (Exception e) {
            System.out.println("test catch");
        }
    }

    //see if strings are equal
    @Test
    public void testUnit1() 
    {
        try {
            aBox.work();
            String right = "<?xml version='1.0' encoding='us-ascii'?>\n" +
        "<svg height=\"81.90mm\" viewBox=\"0.0 0.0 120.10 81.90\" width=\"120.10mm\"\n" + "xmlns=\"http://www.w3.org/2000/svg\" xmlns:cc=\"http://creativecommons.org/ns#\"\n" + "xmlns:dc=\"http://purl.org/dc/elements/1.1/\"\n" + "xmlns:inkscape=\"http://www.inkscape.org/namespaces/inkscape\"\n" + "xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n" + "xmlns:svg=\"http://www.w3.org/2000/svg/\"\n" + "xmlns:xlink=\"http://www.w3.org/1999/xlink/\">\n" +
            
                           "<g id=\"rectangle-almost\" style=\"fill:none;stroke-linecap:round;stroke-linejoin:round;\">\n" +
                           "<path d=\"M 1.0 5.0 H 6.0 v 2.0 H 1.0 V 5.0\" stroke=\"rgb(0,0,0)\" stroke-width=\"0.20\" />\n" +
                           "</g>\n" +
                           "<g id=\"rectangle-almost1\" style=\"fill:none;stroke-linecap:round;stroke-linejoin:round;\">\n" +
                           "<path d=\"M 1.0 8.0 H 6.0 v 2.0 H 1.0 V 5.0  \" stroke=\"rgb(0,0,0)\" stroke-width=\"0.20\" />\n" +
                           "</g>\n" +
                           "<g id=\"rectangle-almost2\" style=\"fill:none;stroke-linecap:round;stroke-linejoin:round;\">\n" +
                           " <path d=\"M 1.0 11.0 H 6.0 v 2.0 H 1.0 V 5.0 \" stroke=\"rgb(0,0,0)\" stroke-width=\"0.20\" />\n" +
                           "</g>\n" +
                           "<g id=\"rectangle-almost3\" style=\"fill:none;stroke-linecap:round;stroke-linejoin:round;\">\n" +
                           " <path d=\"M 1.0 14.0 H 6.0 v 2.0 H 1.0 V 5.0 \" stroke=\"rgb(0,0,0)\" stroke-width=\"0.20\" />\n" +
                           "</g>\n" +
                           "<g id=\"sq-almost1\" style=\"fill:none;stroke-linecap:round;stroke-linejoin:round;\">\n" +
                           " <path d=\"M 1.0 17.0 H 3.0 v 2.0 H 1.0 V 5.0 \" stroke=\"rgb(0,0,0)\" stroke-width=\"0.20\" />\n" +
                           "</g>\n" +
                           "<g id=\"sq-almost2\" style=\"fill:none;stroke-linecap:round;stroke-linejoin:round;\">\n" +
                           " <path d=\"M 1.0 20.0 H 3.0 v 2.0 H 1.0 V 5.0 \" stroke=\"rgb(0,0,0)\" stroke-width=\"0.20\" />\n" +
                           "</g>\n" +
                           "</svg>";
            assertEquals(aBox.guh, right );
        } catch (Exception e) {
            System.out.println("test catch");
        }
    }

    //see if the indexes are equal to each other
    @Test
    public void testUnit2() 
    {
        try {
            aBox.work();
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


}









