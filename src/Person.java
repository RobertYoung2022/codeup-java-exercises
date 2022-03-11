public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName(){
//TODO: return the person's name
      return this.name;
    }

    public void setName(String name){
//TODO: change the name field to the passed value
        this.name = name;
    }


    //TODO: print a message to the console using the person's name
    public String sayHello() {
//        return String.format("Hello from %s %s!", firstName, lastName);
        return null;
    }



    public static void main(String[] args) {
//        Person rick = new Person("Rob");
////        rick.firstName = "Rick";
////        rick.lastName = "Sanchez";
//        System.out.println(rick.sayHello());
//        // prints "Hello from Rick Sanchez!"


        // QUIZ - JAVA II
        Employee emp = new Employee("Peter Gibbons", "IT");
        System.out.println(emp.getName() + " works in " + emp.getDepartment());


        String[] names = {"Rick", "Stacey", "Brad", "Becca"};
        String x;
        try {
            x = names[100];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught!");
            x = "";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("This will always run.");
        }
    }
}