package ua.denys.programming.lectures.lecture1;

import lombok.*;

@Data
@AllArgsConstructor
public class Human {
    static {
        System.out.println("Static init block");
    }

    private String name;
    private int age;

}
