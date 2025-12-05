package org.example.easy

class BuySellStock121 {
    fun maxProfit(prices: IntArray): Int {
        val len=prices.size
        var min=Int.MAX_VALUE
        var maxProfit=0
        for(i in 0 until len){
            if(prices[i]<min){
                min=prices[i]
            }
            val profitNow=prices[i]-min
            if(profitNow>maxProfit){
                maxProfit=profitNow
            }
        }
        return maxProfit
    }
}