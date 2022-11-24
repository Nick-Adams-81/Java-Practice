package Java2;

public class Person {

    public String firstName;
    public String lastName;
    public static long worldPopulation = 7_500_000_000L;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String sayHello() {
        return String.format("Hello from %s %s!", firstName, lastName);
    }
}
