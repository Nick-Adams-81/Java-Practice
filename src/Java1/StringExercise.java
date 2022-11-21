package Java1;

public class StringExercise {

    // first method creation, the static key in the method definition means the method belongs to the class as opposed to an instance of the class

    public static String sayHello(String name) {
        return "Hello " + name + ", nice to meet you!";
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static int mulitply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        String myString1 = "we dont need no education";
        String myString2 = "we dont need no thought control";
        System.out.println(myString1 + ", " + myString2);

        String str = "Check \"this\" out!, \"s inside of \"s!";
        System.out.println(str);

        String newStr = "I can do backslashes \\, double backslashes \\\\,\n" +
                "and the amazing triple backslash \\\\\\!";
        System.out.println(newStr);

        System.out.println(sayHello("Nick"));
        System.out.println(add(4, 2));
        System.out.println(subtract(10, 5));
        System.out.println(divide(10, 2));
        System.out.println(mulitply(10, 5));


    }
}
