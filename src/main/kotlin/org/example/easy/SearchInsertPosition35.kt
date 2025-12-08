package org.example.easy

class SearchInsertPosition35 {
    fun searchInsert(nums: IntArray, target: Int): Int {
        var left=0
        var right=nums.size-1
        while(left<=right){
            val mid=(left+right)/2
            if(target==nums[mid]){
                return mid
            }else if(target>nums[mid]){
                left=mid+1
            }else{
                right=mid-1
            }
        }
        return left
    }
}