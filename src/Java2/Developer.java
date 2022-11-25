package Java2;

public class Developer extends NewEmployee{

    public Developer(String name, String department) {
        super(name, department);
    }

    @Override
    public String work() {
        return "Writing code";
    }
}
