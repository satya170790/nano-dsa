package org.example.easy

class FindMajorityElement {
    fun majorityElement(nums: IntArray): Int {
        val map = HashMap<Int, Int>()
        val size=nums.size
        val majorityThreshold=size/2
        map[nums[0]] = 1
        for(i in 1 until size){
            val item=nums[i]
            // If the element exists in the map, increment the occurrence
            if (map.containsKey(item)) {
                map[item]=map.getValue(item)+1
                if (map.getValue(item)>majorityThreshold){
                    return item
                }
            }else{
                // Otherwise, store the current number and its occurrence in the map
                map[item] = 1
            }

        }
        return -1
    }
}