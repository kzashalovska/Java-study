package ua.denys.programming.lectures.lecture2;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public enum Day {
    SUNDAY(7, true),
    MONDAY(1),
    TUESDAY(2, false),
    WEDNESDAY(3, false);
    private final int number;
    private boolean holiday;

    Day(int number, boolean holiday) {
        this.number = number;
        this.holiday = holiday;
    }
    Day(int number) {
        this.number = number;
    }

    public void setHoliday(boolean holiday) {
        this.holiday = holiday;
    }

    public static Day getByNumber(int number) {
        Day day = null;
        switch (number) {
            case 1:
                day = Day.MONDAY;
                break;
            case 2:
                day = Day.TUESDAY;
                break;
            case 3:
                day = day.WEDNESDAY;
                break;
            case 7:
                day = day.SUNDAY;
                break;
        }
        return day;
    }
}
