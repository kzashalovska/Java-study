package practice4Exception;


import lecture9.UnClosedStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Group {
    private static final int MIN_QUANTITY_STUDENTS = 2;
    private static final int MAX_QUANTITY_STUDENTS = 30;
    private String groupName;
    public static int quantityStudents;
    final int MIN_GROUP_NAME_LENGTH = 3;

    public Group() {
    }

    public static Group createGroupInConsoleVal() {
        Group group = new Group();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new UnClosedStream(System.in)))) {

            while (true) {
                try {
                    System.out.println("Input groups name: ");
                    group.setGroupName(br.readLine());
                    break;
                } catch (GroupNameException e) {
                    System.out.println(e.getMessage());
                }
            }
            while (true) {
                try {
                    group.setQuantityStudents(readNumber(br, "Input quantities of students: "));
                    break;
                } catch (QuantityStudentsException e) {
                    System.out.println(e.getMessage());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return group;
    }


    public static Student[] createGroupOfStudents() {
        Student[] students = new Student[quantityStudents];

        for (int i = 0; i < quantityStudents; i++) {
            int step = 1;
            students[i] = students[i].createStudent(i + 1);
            if (i > 0) {
                for (int j = 0; j < i; j++) {
                    if (students[i].equals(students[i - step]) == true) {
                        System.out.println("This student was created before, please try again");
                        i--;
                        break;
                    } else {
                        step++;
                    }
                }
            }
        }
        return students;
    }


    public static int readNumber(BufferedReader br, String message) throws IOException {
        int number;
        while (true) {
            try {
                System.out.println(message);
                number = Integer.parseInt(br.readLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Not a number, try again");
            }
        }
        return number;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) throws GroupNameException {

        if (groupName.length() > MIN_GROUP_NAME_LENGTH) {
            this.groupName = groupName;
        } else {
            throw new GroupNameException("Wrong name length, use more than " + MIN_GROUP_NAME_LENGTH);
        }
    }

    public int getQuantityStudents() {
        return quantityStudents;
    }

    public void setQuantityStudents(int quantityStudents) throws QuantityStudentsException {
        if (quantityStudents > MIN_QUANTITY_STUDENTS & quantityStudents < MAX_QUANTITY_STUDENTS) {
            this.quantityStudents = quantityStudents;
        } else {
            throw new QuantityStudentsException("Not correctly quantity of students, please input integer between " +
                    MIN_QUANTITY_STUDENTS + " and " + MAX_QUANTITY_STUDENTS);
        }
    }

    @Override
    public String toString() {
        return "Name of group = " + getGroupName() + ", quantity of students = " + quantityStudents;
    }
}

