

public class HelloWorld {


    public static void main(String[] args) {

        Person theBestDrummer = new Person("thomas lang", 25);
        Person.worldPopulation += 1;
        System.out.println(theBestDrummer.getPersonInfo());
        String hello = "Hello people!";
        char hi = 'H';
        int number = 11;
        boolean isAdmin = false;

        System.out.println("hello");
        System.out.println(hello + " " + hi);
        System.out.println(number + " " + isAdmin);

    }
}
