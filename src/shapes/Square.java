package shapes;

public class Square extends Rectangle {
    // define a constructor that accepts one argument, side
    int side;

    // calls the parent's constructor to set both the length and width to the value of side
    public Square(int rectLength, int rectWidth, int side) {
        super(rectLength, rectWidth);
        this.side = side;
    }


}
