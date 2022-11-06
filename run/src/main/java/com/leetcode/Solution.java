package com.leetcode;

import org.junit.Test;

import java.sql.Array;
import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    @Test
    public void run() {
        int[] res = this.twoSum(new int[]{3, 2, 4}, 6);
        System.out.println(Arrays.toString(res));
    }

    // public int[] twoSum(int[] nums, int target) {
    //     for (int i = 1; i < nums.length; i++) {
    //         int j = 0;
    //         while (j < i) {
    //             int sum;
    //             if ((sum = nums[i] + nums[j]) == target) {
    //                 return new int[]{i, j};
    //             }
    //             j++;
    //         }
    //     }
    //     return new int[]{};
    // }

    // Approach 1: brute force
    //public int[] twoSum(int[] numbers, int target) {
    //    int start = 0, end = numbers.length - 1;
    //    while (start < end) {
    //        int sum;
    //        if ((sum = numbers[start] + numbers[end]) == target) {
    //            return new int[]{start + 1, end + 1};
    //        }
    //        if (sum < target) {
    //            start++;
    //        } else {
    //            end--;
    //        }
    //    }
    //    return new int[0];
    //}

    // Approach 2: Hashtable
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];
            int complement = target - value;
            if (hashMap.containsKey(complement)) {
                return new int[]{i, hashMap.get(complement)};
            }
            hashMap.put(value, i);
        }

        return new int[0];
    }
}
