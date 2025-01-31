package tech.learn;

import tech.learn.array.SecondLargestNumber;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println(new SecondLargestNumber().apply(arr));
    }
}
