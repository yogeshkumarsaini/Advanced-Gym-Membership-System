import java.io.Serializable;
import java.util.*;

public class Member implements Serializable {
    private static int counter = 100;

    private int id;
    private String name;
    private Plan plan;
    private Trainer trainer;
    private List<Attendance> attendanceList = new ArrayList<>();
    private List<Payment> payments = new ArrayList<>();

    public Member(String name, Plan plan, Trainer trainer) {
        this.id = counter++;
        this.name = name;
        this.plan = plan;
        this.trainer = trainer;
    }

    public int getId() { return id; }
    public String getName() { return name; }

    public void updatePlan(Plan newPlan) {
        this.plan = newPlan;
    }

    public void addAttendance(String date) {
        attendanceList.add(new Attendance(date));
    }

    public void addPayment(double amount) {
        payments.add(new Payment(amount));
    }

    public double getTotalPaid() {
        return payments.stream().mapToDouble(Payment::getAmount).sum();
    }

    public String toString() {
        return id + " | " + name +
                " | Plan: " + plan.getPlanName() +
                " | Trainer: " + trainer.getName() +
                " | Paid: ₹" + getTotalPaid();
    }
}