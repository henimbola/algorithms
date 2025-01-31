package tech.learn.array;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.function.Function;

public class MaximumProductOfATripletPriorityQueue implements Function<int[], Integer> {
    @Override
    public Integer apply(int[] ints) {
        if (ints.length < 3) {
            return -1;
        }

        PriorityQueue<Integer> pqmax = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer> pqmin = new PriorityQueue<>();

        for(Integer j : ints) {
            pqmax.add(j);
            pqmin.add(j);
        }

        int maximum = pqmax.poll();

        int product1 = maximum * pqmax.poll() * pqmax.poll();
        int product2 = maximum * pqmin.poll() * pqmin.poll();

        return Math.max(product1, product2);
    }
}
