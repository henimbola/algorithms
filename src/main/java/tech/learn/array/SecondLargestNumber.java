package tech.learn.array;

import java.util.function.Function;

public class SecondLargestNumber implements Function<int[], Integer> {

    @Override
    public Integer apply(int[] arr) {
        int max = -1;
        int secondMax = -1;

        for (int j : arr) {
            if (j > max) {
                secondMax = max;
                max = j;
            }
        }

        return secondMax;
    }
}
