import java.io.Serializable;

public class Attendance implements Serializable {
    private String date;

    public Attendance(String date) {
        this.date = date;
    }

    public String toString() {
        return date;
    }
}