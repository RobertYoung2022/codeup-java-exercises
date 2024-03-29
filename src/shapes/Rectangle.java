package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public double getPerimeter() {
      return (2 * length) + (2 * width);
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void setLength(double length) {

    }

    @Override
    public void setWidth(double width) {

    }


//    // Protected properties for both length and width.
//    protected static int rectLength = 6;
//    protected static int rectWidth = 3;
//
//
//    // Define a constructor that accepts two numbers for length and width, and sets those properties
//    public Rectangle(int rectLength, int rectWidth) {
//        this.rectLength = rectLength;
//        this.rectWidth = rectWidth;
//    }
//
//    // Create two methods on the Rectangle class, getArea and getPerimeter that return the respective values
//    static int getArea() {
//        return rectLength * rectWidth;
//    }
//
//    static int getPerimeter() {
//        return (2 * rectLength) + (2 * rectWidth); // 2 * (rectLength + rectWidth);
//    }
//
//    public static void main(String[] args) {
//        System.out.println("getArea() = " + getArea());
//        System.out.println("getPerimeter() = " + getPerimeter());
//    }
}
