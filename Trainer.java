import java.io.Serializable;

public class Trainer implements Serializable {
    private String name;

    public Trainer(String name) {
        this.name = name;
    }

    public String getName() { return name; }

    public String toString() {
        return name;
    }
}
