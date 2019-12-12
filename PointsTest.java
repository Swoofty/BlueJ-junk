public class PointsTest
{
    public static void main(String[] args){
       Point test = new Point(-9, -4);
       Point test2 = new Point(-2, 12);
       Line testLine = new Line(test, test2);
       System.out.println(test2.quadrant());
       test.flip();
       System.out.println(test.quadrant());
       System.out.println(testLine.isCollinear(test2));
    }
}
