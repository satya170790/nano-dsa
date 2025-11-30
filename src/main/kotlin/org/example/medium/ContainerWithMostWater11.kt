package org.example.medium

class ContainerWithMostWater11 {
    fun maxArea(height: IntArray): Int {
        val len=height.size
        var maxWater=0
        for(i in 0 until len){
            for(j in i+1 until len){
                val containerHeight= height[i].coerceAtMost(height[j])
                val containerWidth=j-i
                val containerSize=containerWidth*containerHeight
                if(containerSize>maxWater){
                    maxWater=containerSize
                }
            }
        }
        return maxWater
    }
}