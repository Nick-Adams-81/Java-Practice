public class Person {
    public static long worldPopulation = 7_500_000_000L;
    public String name;
    public int yearsPlayed;

    public Person(String name, int yearsPlayed) {
        this.name = name;
        this.yearsPlayed = yearsPlayed;
    }

    public String getPersonInfo() {
        return String.format("Name: %s, Years Played: %s", name, yearsPlayed);
    }
}

