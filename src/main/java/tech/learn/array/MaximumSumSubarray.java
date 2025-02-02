package tech.learn.array;

import java.util.function.ToIntFunction;

public class MaximumSumSubarray implements ToIntFunction<int[]> {
    @Override
    public int applyAsInt(int[] ints) {
        int n = ints.length;

        int globalMax = ints[0];
        int currentMax = ints[0];

        for (int i = 1; i < n; i++) {
            currentMax = Math.max(ints[i], ints[i] + currentMax);
            globalMax = Math.max(globalMax, currentMax);
        }

        return globalMax;
    }
}
