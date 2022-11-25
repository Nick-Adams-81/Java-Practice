package Java2;

public class Accountant extends NewEmployee{

    public Accountant(String name, String department) {
        super(name, department);
    }

    @Override
    public String work() {
        return "Do some Work Damnit!";
    }
}
