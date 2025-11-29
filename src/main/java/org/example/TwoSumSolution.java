package org.example;

import java.util.HashMap;

public class TwoSumSolution {
    /*
     * Solution with time complexity O(n2)
     */
    public static int[] twoSum(int[] nums, int target) {
        /*int arrLen=nums.length;
        if(arrLen<2)
            return null;
        for (int i=0;i<arrLen-1;i++){
            for(int j=i+1;j<arrLen;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return null;*/
        return twoSumSolution2(nums, target);
    }
    /*
     * Improved solution with time complexity O(n)
     */
    static int[] twoSumSolution2(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int arrLen=numbers.length;
        if(arrLen<2)
            return null;
        for (int i = 0; i < arrLen; i++) {
            int complement = target - numbers[i];
            // If the complement exists in the map, return the pair of indices
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            // Otherwise, store the current number and its index in the map
            map.put(numbers[i], i);
        }
        return null;
    }
}
