import java.io.Serializable;

public class Plan implements Serializable {
    private String planName;
    private double fee;

    public Plan(String planName, double fee) {
        this.planName = planName;
        this.fee = fee;
    }

    public String getPlanName() { return planName; }
    public double getFee() { return fee; }

    public String toString() {
        return planName + " | ₹" + fee;
    }
}