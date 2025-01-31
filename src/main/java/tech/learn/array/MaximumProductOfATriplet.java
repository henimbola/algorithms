package tech.learn.array;

import java.util.Arrays;
import java.util.function.Function;

public class MaximumProductOfATriplet implements Function<int[], Integer> {
    @Override
    public Integer apply(int[] array) {
        int maxProduct = Integer.MIN_VALUE;
        int n = array.length;

        int[] leftMax = new int[n];
        int[] leftMin = new int[n];
        int[] rightMax = new int[n];
        int[] rightMin = new int[n];

        Arrays.fill(leftMax, -1);
        Arrays.fill(leftMin, -1);
        Arrays.fill(rightMax, -1);
        Arrays.fill(rightMin, -1);

        int maxSum = array[0];
        int minSum = array[0];

        for(int i = 1; i < n; i++) {
            leftMax[i] = maxSum;
            if(array[i] > maxSum) {
                maxSum = array[i];
            }

            leftMin[i] = minSum;
            if(array[i] < minSum) {
                minSum = array[i];
            }
        }

        maxSum = array[n-1];
        minSum = array[n-1];

        for(int j = n - 2; j >= 0; j--) {
            rightMax[j] = maxSum;
            if(array[j] > maxSum) maxSum = array[j];

            rightMin[j] = minSum;
            if(array[j] < minSum) minSum = array[j];
        }

        for(int k = 1; k < n - 1; k++) {
            int max1 = Math.max(array[k] * leftMax[k] * rightMax[k], array[k] * leftMin[k] * rightMin[k]);
            int max2 = Math.max(array[k] * leftMax[k] * rightMin[k], array[k] * leftMin[k] * rightMax[k]);

            maxProduct = Math.max(maxProduct, Math.max(max1, max2));
        }

        return maxProduct;
    }
}
