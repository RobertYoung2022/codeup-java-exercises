public class ObjectOrientedProgramming {


    public static void main(String[] args) {
        Person Bobby = new Person();
//        Bobby.firstName = "Bobby";
//        Bobby.lastName = "Young";
        System.out.println(Bobby.sayHello());
        // prints "Hello from Bobby Young!"


//        Arthemetic robMath = new Arthemetic();
//        System.out.println(robMath.pi);

        System.out.println("Arthemetic.pi = " + Arthemetic.pi);
        System.out.println("Arthemetic.multiply(6, 9) = " + Arthemetic.multiply(6, 9));
        System.out.println("Arthemetic.add(8, 8) = " + Arthemetic.add(8, 8));
    }
}
