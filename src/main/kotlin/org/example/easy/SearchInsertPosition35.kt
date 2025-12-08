package org.example.easy

class SearchInsertPosition35 {
    fun searchInsert(nums: IntArray, target: Int): Int {
        val len=nums.size
        for(i in 0 until len ){
            if(target<=nums[i])
                return i
        }
        return len
    }
}