package big;

import java.util.List;

public class Rectangle {
    private List<Point> points;

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    public void draw() {
        int i=0;
        for (Point p : points) {
            i++;
            System.out.println("Point "+i+" [" + p.getX() + "," + p.getY() + "]");
        }
    }
}
