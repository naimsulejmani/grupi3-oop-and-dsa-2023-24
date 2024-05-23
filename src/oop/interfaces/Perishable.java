package oop.interfaces;

import java.time.Period;

public interface Perishable {
    //1. constants
    public static final int TOTAL_DAYS = 5;
    Period MAX_PERIOD = Period.ofDays(TOTAL_DAYS);

    //2. abstract methods
    void perish();

    boolean isPerished();

    //3. default methods
    default boolean verifyPeriod(Period period) {
        return comparePeriod(period) < 0;
    }

    //4. private methods
    private int comparePeriod(Period period) {
        return period.getDays() - MAX_PERIOD.getDays();
    }

    //5. static methods
    static int getMaxPeriodDays() {
        return MAX_PERIOD.getDays();
    }


}







