public class Toy {
    private int id;
    private String name;
    private int chanceValue;

    public Toy(int id, String name, int chanceValue) {
        this.id = id;
        this.name = name;
        this.chanceValue = chanceValue;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getChanceValue() {
        return chanceValue;
    }

    public String toString() {
        return String.join(",", String.valueOf(this.id), this.name, String.valueOf(this.chanceValue));
    }
}