package org.example.medium;

import java.util.*;

public class ThreeSum {

    /*
     * Brute force Solution
     */
    public static List<List<Integer>> threeSum(int[] numbers) {
        int arrLen=numbers.length;
        if(arrLen<3)
            return null;
        List<List<Integer>> resultList=new ArrayList<>();
        Set<List<Integer>> unify = new HashSet<>();
        for(int i=0;i<arrLen;i++){
            for(int j=i+1;j<arrLen;j++){
                for(int k=j+1;k<arrLen;k++){
                    if(numbers[i]+numbers[j]+numbers[k]==0){
                        List<Integer> item=new ArrayList<>();
                        Collections.addAll(item, numbers[i], numbers[j], numbers[k]);
                        Collections.sort(item);
                        if(!unify.contains(item)){
                            unify.add(item);
                            resultList.add(item);
                        }
                    }

                }
            }

        }
        return resultList;
    }

    /*
     * Solution with optimized approach
     */
    /*public static public static List<List<Integer>> threeSumOptimized(int[]){
        //ToDo
    }*/
}
