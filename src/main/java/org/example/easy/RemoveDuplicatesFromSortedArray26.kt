package org.example.easy

class RemoveDuplicatesFromSortedArray26 {
    fun removeDuplicates(nums: IntArray): Int {
        val arrLen:Int = nums.size
        if(arrLen==1) return 1
        var xPointer =1
        for (i in 1 until arrLen){
            if(nums[i]!=nums[i-1]){
                nums[xPointer]=nums[i]
                xPointer++
            }
        }

        return xPointer
    }
}