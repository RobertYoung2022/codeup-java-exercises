package shapes;

public class Square extends Rectangle {
    // define a constructor that accepts one argument, side
   int side = rectWidth * rectLength;

    // calls the parent's constructor to set both the length and width to the value of side
    public Square(int side) {
        super(rectLength, rectWidth);

        @Override
        int getPerimeter() {
            return ;
        }
    }
}
