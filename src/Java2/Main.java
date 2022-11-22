package Java2;

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
    }
}
