package Java2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        // instance fields of a class(objects)
        Person nick = new Person("Nick", "Adams");
        Person mom = new Person("Terry", "Lev");




        System.out.println(nick.sayHello());
        System.out.println(mom.sayHello());

        //static field of a class
        System.out.println(Math.PI);
        System.out.println(Arithmetic.pi);
        System.out.println(Arithmetic.add(4, 5));
        System.out.println(Arithmetic.multiply(5, 2));

        Person theBestDrummer = new Person("Thomas", "Lang");
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
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println(matrix[0][1]);
        System.out.println(matrix[1][0]);
        System.out.println(matrix[2][2]);

        for(int[] row : matrix) {
            System.out.println("+---+---+---+");

            System.out.print("| ");
            for(int n : row) {
                System.out.print(n + " | ");
            }
            System.out.println();
            System.out.println("+---+---+---+");
        }

        Employee newEmployee = new Employee("Test", "Employee");
        System.out.println(newEmployee.sayHello());
        newEmployee.doWork();

        SuperHero theManOfSteel = new SuperHero("Clark", "Kent", "Superman");
        System.out.println(theManOfSteel.getName());
        System.out.println(theManOfSteel.getSecretIdentity());

        Accountant tim = new Accountant("Tim", "Software");
        System.out.println(tim.work());
        Developer john = new Developer("John", "hardware");
        System.out.println(john.work());

        System.out.println(john.getName() + ", " + john.getDepartment());

        // Array List
        ArrayList<Integer> myNums = new ArrayList<>();
        myNums.add(1);
        myNums.add(2);
        myNums.add(3);
        myNums.add(14);

        for(int num : myNums) {
            System.out.println(num);
        }

        System.out.println(myNums.size());
        System.out.println(myNums.contains(1));
        System.out.println(myNums.lastIndexOf(3));

        // Hash map
        HashMap<String, String> usernames = new HashMap<>();
        usernames.put("A", "Nick");
        usernames.put("B", "Chris");
        usernames.put("C", "Ryan");
        usernames.put("D", "Walt");
        System.out.println(usernames);

        System.out.println(usernames.get("A"));
        System.out.println(usernames.containsKey("d"));
        System.out.println(usernames.containsValue("Ryan"));

        int[] nums = {1, 2, 3};
        int x;
//        System.out.println(nums[9]);

        try {
            System.out.println("let's see...");
            int result = 10 / 2;
            System.out.println("Answer = " + result);
        } catch(ArithmeticException e) {
            System.out.println("Math still works!");
        }

        try {
            x = nums[100];
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an array index exception");
        } catch(Exception e) {
            System.out.println("Caught a generic exception");
        } finally {
            assert System.out != null;
            System.out.println("This will always run");
        }


    }
}
