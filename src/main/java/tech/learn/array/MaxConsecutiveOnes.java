package tech.learn.array;

import java.util.function.ToIntFunction;

public class MaxConsecutiveOnes implements ToIntFunction<int[]> {
    @Override
    public int applyAsInt(int[] ints) {
        int max = 0;
        int current = 0;

        for(int j : ints) {
            if(j == 1) current++;
            else {
                max = Math.max(max, current);
                current = 0;
            }
        }

        return Math.max(max, current);
    }
}
