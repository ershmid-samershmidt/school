package org.o;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class RacingStatisticsTest {

    @org.junit.jupiter.api.Test
    void getAvgLapSpeed() {
        RacingStatistics stats = new RacingStatistics();
        assertEquals(10, stats.getAvgLapSpeed(1000, 100), 0.000001);

    }

    @Disabled("not implemented yet")
    @org.junit.jupiter.api.Test
    void getAvgLapSpeedWithZeroTime() {
        RacingStatistics stats = new RacingStatistics();
        assertEquals(10, stats.getAvgLapSpeed(1000, 0), 0.000001);

    }
}