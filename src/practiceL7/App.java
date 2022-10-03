package practiceL7;

public class App {
    public static void main(String[] args) {
        Student student = new Aspirant("Petro", "Petrenko",
                "Podatky", 4.8, false);
        student.getScholarship();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        Student student1 = new Aspirant("Mykola", "Mykolenko",
                "Banky", 4.0, true);
        student1.getScholarship();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        Student student2 = new Student("Oleg", "Oleghanskiy",
                "Banky", 5.0);
        student2.getScholarship();
    }
}
