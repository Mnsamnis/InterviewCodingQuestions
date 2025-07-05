package Day3;

// Problem 2: Count Subarrays With Given XOR K

// 🔧 Problem:
// Given an array of integers and a value K, return the number of subarrays with XOR = K
// Input: arr = [4, 2, 2, 6, 4], K = 6
// Output: 4

import java.util.*;

public class CountSubarrayWithGivenXORK {
    public static void main(String[] args) {
        int arr[]={4,2,2,6,4} , K=6;

            Map<Integer, Integer> map = new HashMap<>();
            int count = 0, xor = 0;
            map.put(0, 1);
        
            for (int num : arr) {
                xor ^= num;
                int required = xor ^ K;
                count += map.getOrDefault(required, 0);
                map.put(xor, map.getOrDefault(xor, 0) + 1);
            }
        
            System.out.println(count);
    }
}
