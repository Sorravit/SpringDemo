package big;

public class Circle {
    private int no;
    private String myType;

    public Circle(int no, String type) {
        this.no = no;
        this.myType = type;
    }

    public void draw() {
        System.out.println("I am drawing a " + " " + this.no + " "
                + this.myType + " circle najaa eiei");
    }

}
