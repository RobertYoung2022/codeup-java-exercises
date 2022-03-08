public class ExceptionsTest {
    public static void main(String[] args) throws Exception {
        System.out.println("Good Morning, Sirius");
//        throw new Exception("Woops - Exception encountered");


//        try {
//            throw new RuntimeException("Something broke while running the application!");
//        } catch (RuntimeException exceptionObject) {
//            System.out.println("Here is an example of .getMessage()" + exceptionObject.getMessage());
//            exceptionObject.printStackTrace();
//        }

        try {
            // after new - insert the type of exception you want to print the exception for
            throw new NullPointerException("Something broke while running the application!");
        } catch (NullPointerException exceptionObject) { // path A - if I change the new <type>Exception
            System.out.println("This is a null pointer exception");
            System.out.println("Here is an example of .getMessage()" + exceptionObject.getMessage());
            exceptionObject.printStackTrace();
        } catch (RuntimeException exceptionObject) { // path B - if I change the new <type>Exception
            System.out.println("This is a runtime exception");
            System.out.println("Here is an example of .getMessage()" + exceptionObject.getMessage());
            exceptionObject.printStackTrace();
        } catch (Exception exceptionObject) { // default
            System.out.println("this is a generic, top level exception");
            System.out.println("Here is an example of .getMessage()" + exceptionObject.getMessage());
            exceptionObject.printStackTrace();
        }
//        System.out.println("Testing the location of this sout"); // printed above the exception object
    }
}
