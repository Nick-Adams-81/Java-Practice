package Java2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static int removeDuplicates(int[] arr, int n) {
        if(n == 0 || n == 1) {
            return n;
        }
        int[]temp = new int[n];
        int j = 0;

        for(int i = 0; i < n -1; i++) {
            if(arr[i] != arr[ i + 1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n -1];

        for(int i = 0; i < j; i++) {
            arr[i] = temp[i];
        }

        return j;

    }

    public static void main(String[] args) throws IOException {
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

        // file i/o
        List<String> groceryList = Arrays.asList("coffee", "tea", "sugar");
        Path filepath = Paths.get("groceries.txt");
        Files.write(filepath, groceryList);

        Path groceryPath = Paths.get("groceries.txt");
        List<String> groceriesList = Files.readAllLines(groceryPath);
        for(int i = 0; i < groceriesList.size(); i++) {
            System.out.println((i + 1) + ": " + groceriesList.get(i));
        }

        Files.write(Paths.get("groceries.txt"), Arrays.asList("eggs"), StandardOpenOption.APPEND);
        List<String> newList = Files.readAllLines(groceryPath);
        for(int i = 0; i < newList.size(); i++) {
            System.out.println(newList.get(i));
        }

        List<String> lines = Files.readAllLines(Paths.get("groceries.txt"));
        List<String> list2 = new ArrayList<>();
        for(String line : lines) {
            if (line.equals("eggs")) {
                list2.add("cream");
                continue;
            }
            list2.add(line);
        }

        Files.write(Paths.get("groceries.txt"), list2);

        System.out.println(list2);



        int[] testArr = {1, 2, 3, 3, 4, 5, 6, 7, 7, 8};
        int n = testArr.length;

        n = removeDuplicates(testArr, n);

        for(int i = 0; i < n; i++) {
            System.out.println(testArr[i]);
        }



        ArrayList<String> someList = new ArrayList<>();
        someList.add("hello");
        someList.add("My name is Nick");
        someList.add("Whats your name?");

        System.out.println(someList);
        for(String a : someList) {
            System.out.println(a);
        }

        System.out.println(someList.size());
        System.out.println(someList.indexOf("My name is Nick"));



    }
}
