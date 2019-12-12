public class TestingLine
{
    public static void main(String[] args){
        Point testingPoint = new Point(4, 5);
        Point testingPoint2 = new Point(6, 7);
        Line testingLine = new Line(testingPoint, testingPoint2);
        System.out.println(testingLine.toString());
    }
}
