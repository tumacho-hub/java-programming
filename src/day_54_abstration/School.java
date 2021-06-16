package day_54_abstration;

public class School {
    public static void main(String[] args) {
        OnlineStudents onlineStudents = new OnlineStudents();
        onlineStudents.attendClass();

        CampusStudent campusStudent = new CampusStudent();
        campusStudent.attendClass();

    }

}
