public class PointsTest
{
    public static void main(String[] args){
       Point test = new Point(-10, -4);
       Point test2 = new Point(2, 12);
       Point test4 = new Point(6, 10);
       Point test3 = new Point(4, 10);
       Line testLine = new Line(test, test2);
       Rectangle testRectangle = new Rectangle(test2, 6, 8);
       Rectangle testRectangle2 = new Rectangle(test3, 4, 4);
       System.out.println(test2.quadrant());
       //test.flip();
       System.out.println(test.quadrant());
       System.out.println(testLine.isCollinear(test3));
       System.out.println(testRectangle.contains(test4));
       Rectangle testRectangle3 = testRectangle.union(testRectangle2);
       System.out.println(testRectangle3.toString());
    }
}
