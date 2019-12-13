;public class Rectangle
{
    private int rectWidth;
    private int rectHeight;
    private int rectX;
    private int rectY;
    
    public Rectangle(int x, int y, int width, int height){
        rectX = x; rectY = y; rectWidth = width; rectHeight = height;
    }
        
    public Rectangle(Point p, int width, int height){
        rectX = p.getX(); rectY = p.getY(); rectWidth = width; rectHeight = height;
    }
    
    public int getHeight(){
        return rectHeight;
    }
    
    public int getWidth(){
        return rectWidth;
    }
    
    public int getX(){
        return rectX;
    }
    
    public int getY(){
        return rectY;
    }
    
    public String toString(){
        return "Rectangle[x=" + rectX + ",y=" + rectY + ",width=" + rectWidth + ",height=" + rectHeight + "]";
    }
    
    public boolean contains(int x, int y){
        boolean xCoordCheck = false;
        boolean yCoordCheck = false;
        if (x > rectX && rectX + rectWidth > x) xCoordCheck = true;
        if (y < rectY && rectY - rectHeight < y) yCoordCheck = true;
        if(xCoordCheck && yCoordCheck) return true;
        else return false;
    }
    
    public boolean contains(Point p){
        boolean xCoordCheck = false;
        boolean yCoordCheck = false;
        if (p.getX() > rectX && rectX + rectWidth > p.getX()) xCoordCheck = true;
        if (p.getY() < rectY && rectY - rectHeight < p.getY()) yCoordCheck = true;
        if(xCoordCheck && yCoordCheck) return true;
        else return false;
    }
    
    public Rectangle union(Rectangle rect){
        int newRectWidth = (rect.getWidth() + rectWidth);
        int newRectHeight = (rect.getHeight() + rectHeight);
        int newRectx;
        int newRecty;
        if(rect.getX() < rectX){
            newRectx = rect.getX();
        }
        else newRectx = rectX;
        if(rect.getY() < rectY){
            newRecty = rect.getY();
        }
        else newRecty = rectY;
        return new Rectangle(newRectx, newRecty, newRectWidth, newRectHeight);
    }
}
