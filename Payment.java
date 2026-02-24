import java.io.Serializable;
import java.time.LocalDate;

public class Payment implements Serializable {
    private double amount;
    private LocalDate date;

    public Payment(double amount) {
        this.amount = amount;
        this.date = LocalDate.now();
    }

    public double getAmount() { return amount; }

    public String toString() {
        return amount + " on " + date;
    }
}