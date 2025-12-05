package org.example.easy

class PlusOne66{
    fun plusOne(digits: IntArray): IntArray {
        val len=digits.size
        for(i in len-1 downTo 0 ){
            if(digits[i]<9){
                digits[i]++
                return digits
            }
            digits[i]=0
        }
        val newDigits=IntArray(len+1)
        newDigits[0]=1
        return newDigits
    }
}