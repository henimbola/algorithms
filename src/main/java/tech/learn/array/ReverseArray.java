package tech.learn.array;

import java.util.function.Function;

public class ReverseArray implements Function<int[], int[]> {
    @Override
    public int[] apply(int[] ints) {
        int left = 0;
        int right = ints.length-1;
        int tmp;

        while(left < right) {
            tmp = ints[left];
            ints[left] = ints[right];
            ints[right] = tmp;

            left++;
            right--;
        }

        return ints;
    }
}
