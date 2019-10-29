import java.util.Scanner;

public class Triangles
{
  public static void printTriangleType(int side1, int side2, int side3){
    if (side1 == 0 || side2 == 0 || side3 == 0){
        System.out.println("Hey, zero isn't a side!");
    }
    else if (side1 == side2 && side2 == side3){
        System.out.println("equilateral");
    }
    else if (side1 == side3 || side2 == side1 || side3 == side2){
        System.out.println("isosceles");
    }
    else{
        System.out.println("scalene");
    }
  }
    public static void main(String[] args) { 
      Scanner userNumber = new Scanner(System.in);
      System.out.print("Enter 3 lengths of a sides in a triangle to see what type of triangle it is: ");
      int userInput = userNumber.nextInt();
      int userInput2 = userNumber.nextInt();
      int userInput3 = userNumber.nextInt();
      Triangles moreTest = new Triangles();
      moreTest.printTriangleType(userInput, userInput2, userInput3);
  }
}
