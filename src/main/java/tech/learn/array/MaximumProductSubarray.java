package tech.learn.array;

import java.util.function.ToIntFunction;

public class MaximumProductSubarray implements ToIntFunction<int[]> {
    @Override
    public int applyAsInt(int[] ints) {
        int n = ints.length;

        int globalMax = ints[0];
        int currentMax = ints[0];
        int currentMin = ints[0];

        for(int i = 1; i < n; i++) {
            int temp = Math.max(ints[i], Math.max(currentMax * ints[i], currentMin * ints[i]));
            currentMin = Math.min(ints[i], Math.max(currentMax * ints[i], currentMin * ints[i]));
            currentMax = temp;

            globalMax = Math.max(currentMax, globalMax);
        }

        return globalMax;
    }
}
