public class Line
{
    private Point test1;
    private Point test2;
    
    public Line(Point p1, Point p2){
        test1 = p1;
        test2 = p2;
    }
    
    public Line(int x1, int y1, int x2, int y2){
        Point point1 = new Point(x1, y1);
        Point point2 = new Point(x2, y2);
    }
    
    public Point getP1(){
        return test1;
    }
    
    public Point getP2(){
        return test2;
    }
    
    public String toString(){
        return "[(" + test1.getX() + ", " + test1.getY() + "),(" + test2.getX() + ", " + test2.getY() + ")]";
    }
    
    public double toSlope(){
        return (double)(test2.getY() - test1.getY())/(test2.getX() - test1.getX());
    }
    
    public boolean isCollinear(Point p){
        if(toSlope() == ((double)((p.getY() - test1.getY())/ (p.getX() - test1.getX())))){
            return true;
        }
        else return false;
    }
}
