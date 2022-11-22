package Java2;

public class Student {

    public String name;
    public String cohort;
    public int age;

    public Student(String name) {
        this.name = name;
        cohort = "Unassigned";
        age = 18;
    }

    public Student(String name, String cohort) {
        this.name = name;
        this.cohort = cohort;
        age = 18;
    }

    public Student(String name, String cohort, int age) {
        this.name = name;
        this.cohort = cohort;
        this.age = age;
    }

    public String getInfo() {
        return String.format("Name: %s, cohort: %s, age: %s", name, cohort, age);
    }
}
