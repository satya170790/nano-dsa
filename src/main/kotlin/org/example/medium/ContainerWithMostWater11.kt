package org.example.medium

class ContainerWithMostWater11 {
    fun maxArea(height: IntArray): Int {
        val len=height.size
        var maxWater=0
        var leftPointer=0
        var rightPointer=len-1
        while(leftPointer<rightPointer){

            val containerHeight= height[leftPointer].coerceAtMost(height[rightPointer])
            val containerWidth=rightPointer-leftPointer
            val currentWater=containerWidth*containerHeight
            maxWater= currentWater.coerceAtLeast(maxWater)
            if(height[leftPointer]<height[rightPointer])  leftPointer++ else rightPointer--

        }
        return maxWater
    }
}