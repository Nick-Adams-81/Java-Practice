package Java1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        {
            // This is a single line comment
            /* this takes up one line */
            /*
             * this
             * is a
             * multiline
             * comment
             */

            /*
            Primitive Data Types:
            byte: very short integers from -128 to 127
            short: short integers from -32,768 to 32,767
            int: integers from -2,147,483,648 to 2,147,483,647
            long: long integers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
            float: Single-precision, floating-point numbers from -3.4E38 to 3.4E38 with up to 7 significant digits
            double: Double-precision, floating-point numbers from -1.7E308 to 1.7E308 with up to 16 significant digits
            char: a single unicode character that's stored in two bytes
            boolean: true or false value
            * */


            System.out.println("Code needs to be intended");
            System.out.println("By four spaces OR one tab");
        }

        int myFavNum = 23;
        System.out.println(myFavNum);

        String myString = "hello";
        System.out.println(myString);

        float myNum = (float) 3.14;
        System.out.println(myNum);

        int x = 5;
        System.out.println(x++);
        System.out.println(x);

        int y = 5;
        System.out.println(++y);
        System.out.println(y);


        String name = "Nick Adams";
        String greeting = "Hola!";
        System.out.printf("Hello %s, nice to meet you!%n", name);

        System.out.printf("%s, %s %n", greeting, name);

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Type something...");
//        String userInput = sc.nextLine();
//        System.out.println("You entered " + userInput);

//        int i = 5;
//        while(i <= 15) {
//            System.out.println(i);
//            i++;
//        }

//        for(int i = 1; i < 100; i++) {
//            if(i % 15 == 0) System.out.println("Fizz Buzz");
//            else if(i % 3 == 0) System.out.println("Fizz");
//            else if(i % 5 == 0) System.out.println("Buzz");
//            else System.out.println(i);
//        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number grade");
        int response = Integer.parseInt(scanner.nextLine());


        if (response <= 60) System.out.println("Your grade is an 'F'");
        else if (response <= 70) System.out.println("Your grade is a 'D'");
        else if (response <= 80) System.out.println("Your grade is a 'C'");
        else if (response <= 90) System.out.println("Your grade is a 'B'");
        else if (response <= 100) System.out.println("Your grade is an 'A'");
        else System.out.println("please enter a valid grade number");
        System.out.println("Can't parse input, please try again");


    }
}
