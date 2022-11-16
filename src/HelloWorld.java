import java.util.Arrays;

public class HelloWorld {


    public static void main(String[] args) {

        Person theBestDrummer = new Person("thomas lang", 25);
        System.out.println(theBestDrummer.getPersonInfo());
        theBestDrummer.sayHello();
        String hello = "Hello people!";
        char hi = 'H';
        int number = 11;
        boolean isAdmin = false;

        int[] numbers = new int[2];
        numbers[0] = 1;
        numbers[1] = 2;
        System.out.println(Arrays.toString(numbers));

        String[] beatles = {"John", "Paul", "Ringo"};

        for (String beatle : beatles) {
            System.out.println(beatle);
        }


        System.out.println("hello");
        System.out.println(hello + " " + hi);
        System.out.println(number + " " + isAdmin);

    }
}
