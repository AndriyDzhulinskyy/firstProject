package com.ua.robot.homework14;

public enum DayOfWeek {
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);

    private int numberOfDay;
    DayOfWeek(int numberOfDay) {
        this.numberOfDay = numberOfDay;
    }

    public static String nameOfDay(int numberOfDay) {
        for (DayOfWeek day : DayOfWeek.values()) {
            if (day.numberOfDay == numberOfDay)
         // if (day.ordinal() == (numberOfDay - 1))
            {
                return day.toString();
            }
        }
        return "This day doesn't exist.";
    }
}
