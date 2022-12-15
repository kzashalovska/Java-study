package FundamentalsPractice_7;

public class Student {
    String firstName;
    String lastName;
    String group;
    double averageMark;

    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public void getScholarship() {
        if (averageMark == 5) {
            System.out.println("The scholarship of this student is UAH 100");
        } else if (averageMark < 5 & averageMark > 1) {
            System.out.println("The scholarship of this student is UAH 80");
        }
        else System.out.println("Evaluation error");
    }
}
