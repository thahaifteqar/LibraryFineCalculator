
package com.library;

public class FineCalculator {

    private static final int FINE_PER_DAY = 2;

    public int calculateFine(int overdueDays) {

        if (overdueDays < 0) {
            throw new IllegalArgumentException(
                "Overdue days cannot be negative"
            );
        }

        return overdueDays * FINE_PER_DAY;
    }
}
