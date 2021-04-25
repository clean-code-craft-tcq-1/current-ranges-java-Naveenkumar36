package com.battery.monitor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author {@literal Jayaram Naveenkumar (jayaram.naveenkumar@in.bosch.com)}
 */
public final class BatteryMonitor {

    private BatteryMonitor() {
    }

    /**
     * Return often encountered range
     *
     * @param asList List of Double
     * @return Map of value
     */
    public static Map<String, Integer> oftenEncounteredCurrentRange(List<Integer> asList) {
        Map<String, Integer> map = new HashMap<>();
        if (asList == null || asList.isEmpty()) {
            return null;
        }
        for (int i = 0; i < asList.size() - 1; i++) {
            if (asList.get(i) + 1 != asList.get(i + 1)) {
                return null;
            }
        }
        map.put("" + asList.get(0) + asList.get(asList.size() - 1) + "", asList.size());
        return map;
    }
}
