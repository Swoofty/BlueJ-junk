public class Point
{
  private int x;
  private int y;
    
  public Point(int test1, int test2){
     x = test1;
     y = test2;
  }
  
  public int getX(){
     return x;
  }
  
  public int getY(){
     return y;
  }
  
  public int quadrant(){
     if (x > 0 && y > 0) return 1;
     if (x < 0 && y > 0) return 2;
     if (x < 0 && y < 0) return 3;
     if (x > 0 && y < 0) return 4;
     else return 0;
  }
  
  public void flip(){
     x = x + y;
     y = x - y;
     x = x - y;
     x *= -1;
     y *= -1;
  }
}
