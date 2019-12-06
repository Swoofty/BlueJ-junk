public class Point
{
  private int x;
  private int y;
    
  public Point(int test1, int test2){
     x = test1;
     y = test2;
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
  
  public Line(Point p1, Point p2)
  public Point getP1(){
      return p1;
  }
  public Point getP2(){
      return p2;
  }
  public String to
}
