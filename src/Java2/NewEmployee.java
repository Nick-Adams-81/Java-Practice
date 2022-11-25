package Java2;

abstract class NewEmployee {
    protected String name;
    protected String department;

    public NewEmployee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public abstract String work();

}
