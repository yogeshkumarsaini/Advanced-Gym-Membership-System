public class AttendanceThread extends Thread {
    private Member member;
    private String date;

    public AttendanceThread(Member member, String date) {
        this.member = member;
        this.date = date;
    }

    public void run() {
        member.addAttendance(date);
        System.out.println("✅ Attendance marked for " + member.getName());
    }
}