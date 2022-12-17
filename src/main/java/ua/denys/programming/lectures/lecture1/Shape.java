package ua.denys.programming.lectures.lecture1;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.awt.*;

public abstract class Shape {
    public static Color createColor(){
        return new Color(1,1,1);
    }
    @Data
    @AllArgsConstructor
    private static class Color {
        private int green;
        private int red;
        private int blue;
    }
}
