package tech.learn.array;

import java.util.function.Function;

public class MoveAllZerosToEnd implements Function<int[], int[]> {

    @Override
    public int[] apply(int[] ints) {
        int n = ints.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if(ints[i] != 0) {
                ints[count++] = ints[i];
            }
        }

        while(count < n)
            ints[count++] = 0;

        return ints;
    }
}
