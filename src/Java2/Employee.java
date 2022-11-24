package Java2;

public class Employee extends Person{

    private double salary;
    public Employee(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public void doWork(){
        System.out.println("work, work...");
    }

    public String sayHello() {
        return "How can I help you?";
    }


}
