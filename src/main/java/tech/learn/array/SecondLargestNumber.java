package tech.learn.array;

import java.util.function.ToIntFunction;

public class SecondLargestNumber implements ToIntFunction<int[]> {

    @Override
    public int applyAsInt(int[] arr) {
        int max = -1;
        int secondMax = -1;

        for (int j : arr) {
            if (j > max) {
                secondMax = max;
                max = j;
            } else if (max > j && secondMax < j) {
                secondMax = j;
            }
        }

        return secondMax;
    }
}
