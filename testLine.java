public class testLine
{
    public static void main(String[] args){
        Point testPoint1 = new Point(7, 4);
        Point testPoint2 = new Point(10, 3);
        Line testLine = new Line(testPoint1,testPoint2);
        Line testLine2 = new Line(7, 4, 10, 3);
        System.out.println(testLine.toString());
        System.out.println(testLine.toSlope());
        System.out.println(testLine.isCollinear(testPoint1));
    }
}
