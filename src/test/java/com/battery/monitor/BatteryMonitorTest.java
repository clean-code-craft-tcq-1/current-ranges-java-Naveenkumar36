package com.battery.monitor;

import java.util.Arrays;
import java.util.Collections;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author {@literal Jayaram Naveenkumar (jayaram.naveenkumar@in.bosch.com)}
 */
class BatteryMonitorTest {

    @Test
    void givenEmptyCurrentRange_whenCharging_thenObtainEmptyValue() {
        // Arrange Act Assert
        assertNull(BatteryMonitor.oftenEncounteredCurrentRange(Collections.emptyList()));
    }

    @Test
    void givenSteadilyIncreasingCurrentRange_whenCharging_thenObtainMostOftenEncounteredValue() {
        // Arrange Act Assert
        assertNotNull(BatteryMonitor.oftenEncounteredCurrentRange(Arrays.asList(2, 3, 4)));
    }

    @Test
    void givenArbitraryCurrentRange_whenCharging_thenObtainMostOftenEncounteredValue() {
        // Arrange Act Assert
        assertNotNull(BatteryMonitor.oftenEncounteredCurrentRange(Arrays.asList(3, 3, 3, 4, 4, 5, 9, 10, 11, 12)));
    }

}
