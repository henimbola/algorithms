package tech.learn.array;

import java.util.function.Function;
import java.util.function.ToIntFunction;

public class ThirdLargestNumber implements ToIntFunction<int[]> {

    @Override
    public int applyAsInt(int[] array) {

        int first = array[0], second = Integer.MIN_VALUE, third = Integer.MIN_VALUE;

        for(int j: array) {
            if(j > first) {
                third = second;
                second = first;
                first = j;
            }
            else if (j > second) {
                third = second;
                second = j;
            }
            else if (j > third) {
                third = j;
            }
        }

        return third;
    }
}
