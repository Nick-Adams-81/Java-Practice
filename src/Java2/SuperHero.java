package Java2;

public class SuperHero extends Person{

    private final String alterEgo;

    public SuperHero(String firstName, String lastName, String alterEgo) {
        super(firstName, lastName);
        this.alterEgo = alterEgo;
    }

    public String getName() {
        return alterEgo;
    }

    public String getSecretIdentity() {
        return super.getName();
    }
}
