package com.practice.items.classesAndInterface;


/**
 * public classes should never expose mutable fields.
 * It is less harmful, though still questionable, for public classes to expose immutable fields.
 * It is, however, sometimes desirable for package-private or private nested classes to
 * expose fields, whether mutable or immutable.
 */
// Public class with exposed immutable fields - questionable
public final class Time {
    private static final int HOURS_PER_DAY    = 24;
    private static final int MINUTES_PER_HOUR = 60;
    public final int hour;
    public final int minute;
    public Time(int hour, int minute) {
        if (hour < 0 || hour >= HOURS_PER_DAY)
            throw new IllegalArgumentException("Hour: " + hour);
        if (minute < 0 || minute >= MINUTES_PER_HOUR)
            throw new IllegalArgumentException("Min: " + minute); this.hour = hour;
        this.minute = minute;
    }

}
