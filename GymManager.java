import java.util.*;

public class GymManager {

    private List<Member> members = new ArrayList<>();
    private List<Plan> plans = new ArrayList<>();
    private List<Trainer> trainers = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public GymManager() {
        plans.add(new Plan("Monthly", 1000));
        plans.add(new Plan("Yearly", 8000));

        trainers.add(new Trainer("Ravi"));
        trainers.add(new Trainer("Aman"));
    }

    public void addMember() {
        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        Plan plan = plans.get(0);
        Trainer trainer = trainers.get(0);

        members.add(new Member(name, plan, trainer));
        System.out.println("✅ Member added!");
    }

    public Member findMember(int id) {
        for (Member m : members)
            if (m.getId() == id)
                return m;
        return null;
    }

    public void removeMember() {
        System.out.print("Enter ID: ");
        members.removeIf(m -> m.getId() == sc.nextInt());
    }

    public void updatePlan() {
        System.out.print("Enter ID: ");
        Member m = findMember(sc.nextInt());
        if (m != null) m.updatePlan(plans.get(1));
    }

    public void markAttendance() {
        System.out.print("Enter ID: ");
        Member m = findMember(sc.nextInt());

        if (m != null) {
            AttendanceThread t = new AttendanceThread(m, java.time.LocalDate.now().toString());
            t.start();
        }
    }

    public void payFees() {
        System.out.print("Enter ID: ");
        Member m = findMember(sc.nextInt());

        if (m != null) {
            System.out.print("Enter amount: ");
            m.addPayment(sc.nextDouble());
        }
    }

    public void viewMembers() {
        members.forEach(System.out::println);
    }

    public List<Member> getMembers() { return members; }
    public void setMembers(List<Member> members) { this.members = members; }
}