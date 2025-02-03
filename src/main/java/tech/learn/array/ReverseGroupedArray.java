package tech.learn.array;

import java.util.function.BiFunction;

public class ReverseGroupedArray implements BiFunction<int[], Integer, int[]> {
    @Override
    public int[] apply(int[] ints, Integer k) {
        int n = ints.length;

        for(int i = 0; i < n; i += k) {
            int left = i;
            int right = Math.min(i + k - 1, n - 1);
            int tmp;

            while (left < right) {
                tmp = ints[right];
                ints[right] = ints[left];
                ints[left] = tmp;

                left++;
                right--;
            }
        }

        return ints;
    }
}
