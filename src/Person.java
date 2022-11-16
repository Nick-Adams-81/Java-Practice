public class Person {

    public String name;
    public int yearsPlayed;

    public Person(String name, int yearsPlayed) {
        this.name = name;
        this.yearsPlayed = yearsPlayed;
    }

    public String getPersonInfo() {
        return String.format("Name: %s, Years Played: %s", name, yearsPlayed);
    }

    public void sayHello() {
        System.out.println("Hello from " + name);
    }
}

