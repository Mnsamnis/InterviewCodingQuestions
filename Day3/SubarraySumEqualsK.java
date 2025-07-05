// --------------------------------------------------------------------------------------------------------------        
//          Problem 1: Subarray Sum Equals K
// 🔧 Problem:
// Given an array nums and an integer k, return the total number of continuous subarrays whose sum equals to k.
// Input: nums = [1, 1, 1], k = 2
// Output: 2 ([1,1] at index 0–1 and 1–2)
//---------------------------------------------------------------------------------------------------------------

package Day3;

import java.util.HashMap;
import java.util.*;
import java.util.Map;

public class SubarraySumEqualsK {
    public static void main(String[] args) {

        int nums[] = {3,5,2,1,4,2,6,2,2}, k=10;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0, count = 0;
        for (int num : nums) {
            sum += num;
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        System.out.println(count);
    }
}
