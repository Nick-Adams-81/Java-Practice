
public class Person {

    public String name;
    public int yearsPlayed;
    public int age;

    public Person(String name, int yearsPlayed, int age) {
        this.name = name;
        this.yearsPlayed = yearsPlayed;
        this.age = age;
    }

    public String getPersonInfo() {
        return String.format("Name: %s, Years Played: %s, Age: %s", name, yearsPlayed, age);
    }

    public void sayHello() {
        System.out.println("Hello from " + name);
    }

}

