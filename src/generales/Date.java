package generales;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class Date {
    private final int day,month,year;
    private static String format;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    @Override

   /* public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Date date))
            return false;
        return year == date.year &&
                month == date.month &&
                day == date.day;
    }*/
    public String toString() {
        return String.format("%02d/%02d/%d", day, month, year);
    }


    public boolean equals(Object o) {
        return this == o || (o instanceof Date date &&
                year == date.year &&
                month == date.month &&
                day == date.day);
    }

}
