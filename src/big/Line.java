package big;

public class Line {

    private Point point1;
    private Point point4;

    public Point getPoint1() {
        return point1;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public Point getPoint4() {
        return point4;
    }

    public void setPoint4(Point point4) {
        this.point4 = point4;
    }

    public void draw() {
        System.out.println("Printing a line");
        System.out.println("Point 1 [" + point1.getX() + "," + point1.getY()
                + "]");
        System.out.println("Point 4 [" + point4.getX() + "," + point4.getY()
                + "]");
    }

}
