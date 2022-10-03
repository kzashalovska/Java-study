package practiceL7;

public class Aspirant extends Student {
    boolean scientificWork;

    public Aspirant(String firstName, String lastName, String group, double averageMark, boolean scientificWork) {
        super(firstName, lastName, group, averageMark);
        this.scientificWork = scientificWork;
        if (this.scientificWork == false) {
            System.out.println("The graduate student did not submit the research paper");
        }
    }
    public void getScholarship() {
        if (scientificWork == true) {
            if (averageMark == 5) {
                System.out.println("The scholarship of this student is UAH 200");
            } else if (averageMark < 5 & averageMark > 1) {
                System.out.println("The scholarship of this student is UAH 180");
            } else System.out.println("Evaluation error");
        } else System.out.println("It is impossible to calculate the scholarship, " +
                "the graduate student did not submit the research paper");
    }
}
