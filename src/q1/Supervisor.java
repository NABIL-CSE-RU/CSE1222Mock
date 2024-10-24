package q1;

public class Supervisor extends Worker{
    private String Division;

    public Supervisor(String name, double wage, String division) {
        super(name, wage);
        Division = division;
    }

    @Override
    public String toString() {
        return super.toString() + " " + " Division: " + Division;
    }
}
