public class Animal
{
  private double animalSize;
  private int numLegs;
  private String animalName;
  private boolean isMammal;
  
  public Animal(){}
  public Animal(double e, int f, String g, boolean h)
  {
   animalSize = e; numLegs = f; animalName = g; isMammal = h;
    }
  
  public void setAnimalSize(double a)
  {
      animalSize = a;
  }
  
  public void setNumLegs(int b)
  {
      numLegs = b;
  }
  
  public void setAnimalName(String c)
  {
      animalName = c;
  }
  
  public void setIsMammal(boolean d)
  {
      isMammal = d;
  }
  
  public double getAnimalSize()
  {
    return animalSize;
    }
  
  public int getNumLegs()
  {
    return numLegs;
    }
  
  public String getAnimalName()
  {
    return animalName;
    }
  
  public boolean getIsMammal()
  {
    return isMammal;
    }
}
