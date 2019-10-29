public class SuperHero
{
  private int powerLevel;
  private int numIq;
  private String heroAbilities;
  private boolean hasArmor;
  
  public void setPowerLevel(int a)
  {
      powerLevel = a;
  }
  
  public void setNumIq(int b)
  {
      numIq = b;
  }
  
  public void setHeroAbilites(String c)
  {
      heroAbilities = c;
  }
  
  public void hasArmor(boolean d)
  {
      hasArmor = d;
  }
  
  public int getPowerLevel()
  {
    return powerLevel;
    }
  
  public int getNumIq()
  {
    return numIq;
    }
  
  public String getHeroAbilites()
  {
    return heroAbilities;
    }
  
  public boolean getHasArmor()
  {
    return hasArmor;
    }
}
