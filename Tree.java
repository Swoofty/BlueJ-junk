import java.util.Scanner;



public class Tree
{
  public int numBranches;
  private int numLeaves;
  private double numHeight;
  private boolean isConiferous;
  
  public Tree()
  {}
  
  public Tree(int e, int f, double g, boolean h){
      numBranches = e; numLeaves = f; numHeight = g; isConiferous = h;
    }
  
  public void setNumBranches(int a)
  {
      numBranches = a;
  }
  
  public void setNumleaves(int b)
  {
      numLeaves = b;
  }
  
  public void setNumHeight(double c)
  {
      numHeight = c;
  }
  
  public void setIsConiferous(boolean d)
  {
      isConiferous = d;
  }
  
  public int getNumBranches()
  {
    return numBranches;
    }
  
  public int getNumLeaves()
  {
    return numLeaves;
    }
  
  public double getNumHeight()
  {
    return numHeight;
    }
  
  public boolean getIsConiferous()
  {
    return isConiferous;
    }
  
  public void blowInTheWind()
  {
    System.out.println("The tree is blowing in the wind.");
    }
    
  public void grow(int y)
  {
    System.out.println("The tree grew " + (numHeight+=y));
    }
  
  public void loseLeaves()
  {
    System.out.println("The tree lost all it's leaves. \nNow there are " + (numLeaves *= 0) + " leaves left.");
    }
  
  public void trimBranches()
  {
    Scanner userNumber = new Scanner(System.in);
    System.out.println("How many branches do you want to trim?: ");
    numBranches -= userNumber.nextInt();
    System.out.println("You now have " + numBranches + " branches left");
    }
}