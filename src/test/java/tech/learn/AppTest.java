package tech.learn;

import junit.framework.TestCase;
import tech.learn.array.*;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
    public void testFindSecondLargestNumber() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertEquals(8, new SecondLargestNumber().apply(arr).intValue());
    }

    public void testFindThirdLargestNumber() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertEquals(7, new ThirdLargestNumber().apply(arr).intValue());
    }

    public void testMaximumProductOfATriplet() {
        int[] arr = new int[]{10, 3, 5, 6, 20};
        assertEquals(1200, new MaximumProductOfATriplet().apply(arr).intValue());

        arr = new int[]{-10, -3, -5, -6, -20};
        assertEquals(-90, new MaximumProductOfATriplet().apply(arr).intValue());

        arr = new int[]{1, -4, 3, -6, 7, 0};
        assertEquals(168, new MaximumProductOfATriplet().apply(arr).intValue());
    }

    public void testMaximumProductOfATripletPriorityQueue() {
        int[] arr = new int[]{10, 3, 5, 6, 20};
        assertEquals(1200, new MaximumProductOfATripletPriorityQueue().apply(arr).intValue());

        arr = new int[]{-10, -3, -5, -6, -20};
        assertEquals(-90, new MaximumProductOfATripletPriorityQueue().apply(arr).intValue());

        arr = new int[]{1, -4, 3, -6, 7, 0};
        assertEquals(168, new MaximumProductOfATripletPriorityQueue().apply(arr).intValue());
    }

    public void testMaximumProductSubarray() {
        int[] arr = new int[]{2, 3, -2, 4};
        assertEquals(6, new MaximumProductSubarray().apply(arr).intValue());

        arr = new int[]{-1, -2, -3};
        assertEquals(6, new MaximumProductSubarray().apply(arr).intValue());
    }
}
