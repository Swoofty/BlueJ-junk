//test
import java.lang.Math.*;

public class bad2
{
  private boolean hasCoat;
  private boolean hasHat;
  private int numEyes;
  private int numLegs;
  private int numButtons;
  
  public bad2()
   {
     
   }
   
  public void setHasCoat(boolean c)
  {
      hasCoat = c;
  }
  
  public void setHasHat(boolean h)
  {
      hasHat = h;
  }
  
  public void setnumEyes(int e)
  {
      numEyes = e;
  }
  
  public void setnumLegs(int f)
  {
      numLegs = f;
  }
  
  public void setnumButtons(int t)
  {
      numButtons = t;
  }
  
  public boolean gethasCoat()
  {
    return hasCoat;
    }
  
  public boolean gethashat()
  {
    return hasHat;
    }
  
  public int getNumEyes()
  {
    return numEyes;
    }
  
  public int getNumLegs()
  {
    return numLegs;
    }
  
  public int getNumButtons()
  {
    return numButtons;
    }
    
  public void walk()
  {
    System.out.println("I am walking");
    }
  
  public void addLeg()
  {
    numLegs++;
    }
  
  public void addMultipleLegs(int why)
  {
      numLegs += why;
    }
    
  public void increaseEyes(int e){
     numEyes += e; 
    }
}
