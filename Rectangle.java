public class Rectangle
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
        while(rectX ) 
    }
}
