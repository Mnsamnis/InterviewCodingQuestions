package Day2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class TopKFrequentElements {
    public static void main(String[] args) {
// Given an integer array nums and an integer k, return the k most frequent elements.
// Input: nums = [1,1,1,2,2,3], k = 2
// Output: [1,2]

        int nums[] = {1,1,1,2,2,3,4,4,5,4,5,4,5,4},  k =2;

         List<Integer> collect = Arrays.stream(nums).boxed()
                                .collect(Collectors.groupingBy(n->n, HashMap::new, Collectors.counting()))
                                .entrySet().stream()
                                .sorted((a,b)->Long.compare(b.getValue(), a.getValue()))
                                .limit(k)
                                .map(a->a.getKey())
                                .collect(Collectors.toList());

        System.out.println(collect);


    }
}
