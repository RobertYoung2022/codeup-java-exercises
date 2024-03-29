package shapes;

public class ShapesTest {

    // declare a variable of the type Measurable named myShape
    static Measurable myShape;

    // Test your code by creating instances of both Square and Rectangle and assigning them to myShape so you can display the shape's area and perimeter.
    public static void main(String[] args) {
        myShape = new Square(5, 3);
        System.out.println("My rectangle perimeter: " + myShape.getPerimeter());
        System.out.println("My rectangle area: " + myShape.getArea());

        myShape = new Rectangle(6,5);
        System.out.println("My square perimeter: " + myShape.getPerimeter());
        System.out.println("My square area: " + myShape.getArea());
    }


//    public ShapesTest(int rectLength, int rectWidth) {
//        super(rectLength, rectWidth);
//    }

/*    public static void main(String[] args) {
        // create a variable of the type Rectangle named box1 and assign it a new instance of the Rectangle class with a width of 4 and a length of 5
        Rectangle box1 = new Rectangle(5,4);

        //verify that the getPerimeter and getArea methods return 18 and 20, respectively.
        System.out.println(box1.getPerimeter());
        System.out.println(box1.getArea());

        //create a variable of the type Rectangle named box2 and assign it a new instance of the Square class that has a side value of 5.
        Rectangle box2 = new Square(5);


        //verify that the getPerimeter and getArea methods return 20 and 25, respectively.
        System.out.println("box2 perimeter = " + box2.getPerimeter());
        System.out.println("box2 area = " + box2.getArea());

    }*/
}
