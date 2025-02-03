package tech.learn;

import junit.framework.TestCase;
import tech.learn.array.*;

import java.util.Arrays;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
    public void testFindSecondLargestNumber() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertEquals(8, new SecondLargestNumber().applyAsInt(arr));
    }

    public void testFindSecondLargestNumber2() {
        int[] arr = {8, 3, 4, 4};
        assertEquals(4, new SecondLargestNumber().applyAsInt(arr));
    }

    public void testFindThirdLargestNumber() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertEquals(7, new ThirdLargestNumber().applyAsInt(arr));
    }

    public void testMaximumProductOfATriplet() {
        int[] arr = new int[]{10, 3, 5, 6, 20};
        assertEquals(1200, new MaximumProductOfATriplet().applyAsInt(arr));

        arr = new int[]{-10, -3, -5, -6, -20};
        assertEquals(-90, new MaximumProductOfATriplet().applyAsInt(arr));

        arr = new int[]{1, -4, 3, -6, 7, 0};
        assertEquals(168, new MaximumProductOfATriplet().applyAsInt(arr));
    }

    public void testMaximumProductOfATripletPriorityQueue() {
        int[] arr = new int[]{10, 3, 5, 6, 20};
        assertEquals(1200, new MaximumProductOfATripletPriorityQueue().applyAsInt(arr));

        arr = new int[]{-10, -3, -5, -6, -20};
        assertEquals(-90, new MaximumProductOfATripletPriorityQueue().applyAsInt(arr));

        arr = new int[]{1, -4, 3, -6, 7, 0};
        assertEquals(168, new MaximumProductOfATripletPriorityQueue().applyAsInt(arr));
    }

    public void testMaximumProductSubarray() {
        int[] arr = new int[]{2, 3, -2, 4};
        assertEquals(6, new MaximumProductSubarray().applyAsInt(arr));

        arr = new int[]{-1, -2, -3};
        assertEquals(6, new MaximumProductSubarray().applyAsInt(arr));

        arr = new int[]{-2,0,-1};
        assertEquals(0, new MaximumProductSubarray().applyAsInt(arr));
    }

    public void testMaximumSumSubarray() {
        int[] arr = {2, 3, -8, 7, -1, 2, 3};
        assertEquals(11, new MaximumSumSubarray().applyAsInt(arr));
    }

    public void testMaxConsecutiveOnes() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1};
        assertEquals(4, new MaxConsecutiveOnes().applyAsInt(arr));
    }

    public void testMoveAllZerosToEnd() {
        int[] arr = {0, 1, 0, 3, 12};
        assertTrue(Arrays.equals(new MoveAllZerosToEnd().apply(arr), new int[]{1, 3, 12, 0, 0}));
    }

    public void testReverseArray() {
        int[] arr = {0, 1, 0, 3, 12};
        assertTrue(Arrays.equals(new ReverseArray().apply(arr), new int[]{12, 3, 0, 1, 0}));
    }

    public void testReverseGroupedArray() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int k = 3;

        assertTrue(Arrays.equals(new ReverseGroupedArray().apply(arr, k), new int[]{3, 2, 1, 6, 5, 4, 8, 7}));
    }

    public void testString() {
        String test = "dfa12321afd";

        secondMax(test);
    }

    public void testString2() {
        String test = "abc1111";

        secondMax(test);
    }

    public void testString3() {
        String test = "sjhtz8344";

        secondMax(test);
    }

    private void secondMax(String s) {
        int max = -1;
        int sMax = -1;

        for(char j: s.toCharArray()) {
            if(Character.isDigit(j) && Integer.parseInt(String.valueOf(j)) > max) {
                sMax = max;
                max = Integer.parseInt(String.valueOf(j));
            }
            else if(Character.isDigit(j) && Integer.parseInt(String.valueOf(j)) > sMax && Integer.parseInt(String.valueOf(j)) < max) {
                sMax = Integer.parseInt(String.valueOf(j));
            }
        }

        System.out.println(sMax);
    }
}
