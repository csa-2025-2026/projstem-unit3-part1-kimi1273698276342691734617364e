import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // write solutions to problems here
    Rectangle r1 = new Rectangle(2.8, 5.4);
    Rectangle r2 = new Rectangle(5.4, 2.8);
    // 5.4 by 2.8
    
    boolean lengthSameWidth = length of r1 is equal to width of r2;
    boolean widthSameLength = width of r1 is equal to length of r2;
    boolean isRotated = lengthSameWidth AND widthSameLength;

    boolean isCongruent = r1.equals(r2) || (isRotated == true);

    // Logical AND - &&
    // Logical OR - ||
    //r1.equals(r2)

    double lengthRatio = 1.getLength() / r2.getLength();
    double widthRatio = 1.getWidth() / r2.getWidth();
    boolean equalRatio = lengthRatio == widthRatio;
    boolean isSimilar = (isCongruent == true) OR (equalRatio == true);


  }
}
