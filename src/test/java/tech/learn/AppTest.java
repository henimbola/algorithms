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

    public void testMoveAllZerosToEdn() {
        int[] arr = {0, 1, 0, 3, 12};
        System.out.println(Arrays.toString(new MoveAllZerosToEnd().apply(arr)));
    }
}
