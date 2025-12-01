package org.example.easy

class RemoveElement27 {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        val len=nums.size
        var xPointer=0
        for(i in 0 until len){
            if(nums[i]!=`val`){
                    nums[xPointer]=nums[i]
                    xPointer++
                }
        }
        return xPointer
    }
}