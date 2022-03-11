package shapes;

public class Square extends Quadrilateral {

    public Square(double sideLength, double sideWidth) {
        super(sideLength, sideWidth);
    }

    @Override
    public double getPerimeter() {
       return (2 * length) + (2 * width);
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public void setLength(double length) {

    }

    @Override
    public void setWidth(double width) {

    }

//    @Override
//    public double getPerimeter() {
//        return (2 * length) + (2 * width);
//    }
//
//    @Override
//    public double getArea() {
//        return 0;
//    }
//
//    @Override
//    void setLength(double length) {
//
//    }
//
//    @Override
//    void setWidth(double width) {
//
//    }

//    // define a constructor that accepts one argument, side
//
//    public Square(int side) {
//        // calls the parent's constructor to set both the length and width to the value of side
//        super(side, side);
//    }
}
