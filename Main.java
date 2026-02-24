import java.util.*;

public class Main {

    public static void main(String[] args) {

        GymManager gym = new GymManager();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n🏋️ GYM MENU");
            System.out.println("1 Add Member");
            System.out.println("2 Remove Member");
            System.out.println("3 Update Plan");
            System.out.println("4 Mark Attendance");
            System.out.println("5 Pay Fees");
            System.out.println("6 View Members");
            System.out.println("7 Save");
            System.out.println("8 Load");
            System.out.println("0 Exit");

            try {
                switch (sc.nextInt()) {
                    case 1 -> gym.addMember();
                    case 2 -> gym.removeMember();
                    case 3 -> gym.updatePlan();
                    case 4 -> gym.markAttendance();
                    case 5 -> gym.payFees();
                    case 6 -> gym.viewMembers();
                    case 7 -> FileHandler.save(gym.getMembers());
                    case 8 -> gym.setMembers(FileHandler.load());
                    case 0 -> System.exit(0);
                }
            } catch (Exception e) {
                System.out.println("⚠ Error: " + e.getMessage());
            }
        }
    }
}