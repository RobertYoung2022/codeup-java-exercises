import java.util.Arrays;

public class ArraysExercises {

    // Array for adding new person
    public static Person[] addPerson(Person[] people, Person single) { //  Person[] people = type of parameter then name
// Person[] = whatever you want to return   addPerson = name of variable
        // copy array and adding + 1
        Person[] newMember = Arrays.copyOf(people, people.length + 1);

        // spot in the array
        newMember[newMember.length - 1] = single;

        for(Person personR: newMember) {
            System.out.println(personR.getName());
        }
        return newMember;
    }

    public static void main(String[] args) {
//        // What happens when you run the following code? Why is Arrays.toString necessary?
//        int[] numbers = {1, 2, 3, 4, 5};
////        System.out.println(numbers); // [I@6bdf28bb


        // array object
        Person[] people = new Person[3];

        people[0] = new Person("Kyle");
        people[1] = new Person("Gerald");
        people[2] = new Person("Andrew");

        // Single person object
        Person varMe = new Person("Robert");

        // calling object/ single object to print
        addPerson(people, varMe);
    }
}
