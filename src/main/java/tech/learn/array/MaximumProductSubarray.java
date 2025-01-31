package tech.learn.array;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.IntStream;

public class MaximumProductSubarray implements Function<int[], Integer> {
    @Override
    public Integer apply(int[] ints) {

        int n = ints.length;

        int[] maxArray = new int[n];
        int[] minArray = new int[n];

        Arrays.fill(maxArray, -1);
        Arrays.fill(minArray, -1);

        maxArray[0] = ints[0];
        minArray[0] = ints[0];

        for(int i = 1; i<n; i++) {
            if(ints[i] == 0) {
                maxArray[i] = 1;
                minArray[i] = 1;
            } else {
                maxArray[i] = Math.max(Math.max(minArray[i-1] * ints[i], maxArray[i-1] * ints[i]), ints[i]);
                minArray[i] = Math.min(Math.min(minArray[i-1] * ints[i], maxArray[i-1] * ints[i]), ints[i]);
            }
        }

        return IntStream.of(maxArray).max().getAsInt();
    }
}
