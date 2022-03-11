package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {
    protected double length;
    protected double width;


    //a constructor that accepts two numbers for the length and width and sets those properties.
    public double Measurement() {
        return length * width;
    }

    //methods for getting the length and width.
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    //abstract methods for setting the length and width.
    abstract void setLength(double length);
    abstract void setWidth(double width);




}
