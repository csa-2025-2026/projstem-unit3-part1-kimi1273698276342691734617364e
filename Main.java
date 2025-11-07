import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // write solutions to problems here
    Rectangle r1 = new Rectangle(2.8, 5.4);
    Rectangle r2 = new Rectangle(5.4, 2.8);
    // 5.4 by 2.8
    
    boolean lengthSameWidth = r1.getLength() == r2.getWidth();
    // length of r1 is equal to width of r2;
    boolean widthSameLength = r1.getWidth() == r2.getLength();
    // width of r1 is equal to length of r2;
    boolean isRotated = lengthSameWidth && widthSameLength;
    // Rotated if the length of 1 is equal to the width of 2 and vice versa

    boolean isCongruent = r1.equals(r2) || (isRotated == true);
    // Congruent if they are either rotated, or exactly equal to each other
    
    // Logical AND - &&
    // Logical OR - ||
    //r1.equals(r2)

    boolean isSimilar = isCongruent || ((r1.getLength / r2.getLength) == (r1.getWidth / r2.getWidth));
    // Similar if they are either congruent, or if the ratio of the lengths is equal to the ratio of the widths

    // alternative:
    double lengthRatio = 1.getLength() / r2.getLength();
    double widthRatio = 1.getWidth() / r2.getWidth();
    boolean equalRatio = lengthRatio == widthRatio;
    boolean isSimilar = (isCongruent == true) OR (equalRatio == true);


  }
}
