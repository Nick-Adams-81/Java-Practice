package Java2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // instance fields of a class(objects)
        Person nick = new Person();
        Person mom = new Person();
        nick.firstName = "Nick";
        nick.lastName = "Adams";

        mom.firstName = "Terry";
        mom.lastName = "Lev";

        System.out.println(nick.sayHello());
        System.out.println(mom.sayHello());

        //static field of a class
        System.out.println(Math.PI);
        System.out.println(Arithmetic.pi);
        System.out.println(Arithmetic.add(4, 5));
        System.out.println(Arithmetic.multiply(5, 2));

        Person theBestDrummer = new Person();
        theBestDrummer.firstName = "Thomas";
        theBestDrummer.lastName = "Lang";
        Person.worldPopulation += 1;
        System.out.println(Person.worldPopulation);
        System.out.println(theBestDrummer.sayHello());

        Student newStudent = new Student("Nickie barnes");
        System.out.println(newStudent.getInfo());

        Student anotherNewStudent = new Student("John Doe", "Quasar");
        System.out.println(anotherNewStudent.getInfo());

        Student janeDoe = new Student("Jane Doe", "Pulsar", 24);
        System.out.println(janeDoe.getInfo());

        // arrays
        int[] myArr = new int[2];
        myArr[0] = 10;
        myArr[1] = 20;

        for(int i : myArr) {
            System.out.println(i);
        }

        String[] theBeatles = {"John", "Paul", "George", "Ringo"};
        System.out.println(Arrays.toString(theBeatles));

        // 2d arrays



    }
}
