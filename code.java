/**This program computes the intersection of two rectangles—that is, the rectangle that would be formed by two overlapping rectangles if they were drawn,
corner as the original.
 * @author (Fikri Şan Köktaş)
 * @version (22 October 2020)*/
import java.awt.Rectangle;
import java.util.Scanner;

public class KFS_IntersectionPrinter_Main
{
    public static void main(String [] args)
    {
        Rectangle r1 = new Rectangle(100,100,50,50); 
        Rectangle r2 = new Rectangle(80,70,30,90); 
        Rectangle r3 = r1.intersection(r2); //Formula for the intersecting rectangle 
        Rectangle r4 = new Rectangle(200,200,10,10); //This rectangle doesn't have any intersection with any of the other rectangles
        Rectangle r5 = r1.intersection(r4); //There shouldn't be such a rectangle because there is no intersection of r1 and r4
        
        System.out.println(r3); //Intersecting rectangle for r1 and r2 
        System.out.println(r5); //This rectangle isn't valid because height and width is negative
    }
}


