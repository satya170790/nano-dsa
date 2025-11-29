package org.example;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        //Call Two Sum Method
        callTwoSum();
//        callThreeSum();

    }
    public static void callTwoSum(){
        System.out.print("Hello and welcome to 2 Sum Solution!");
        System.out.println("Input[2, 7, 11, 15], 9: Output: "+ Arrays.toString(TwoSumSolution.twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println("Input[3, 2, 3], 6: Output: "+ Arrays.toString(TwoSumSolution.twoSum(new int[]{3, 2,3}, 6)));
        System.out.println("Input[6, -3, 1, 15], 12: Output: "+ Arrays.toString(TwoSumSolution.twoSum(new int[]{6,-3,1,15}, 12)));
    }

    public static void callThreeSum(){
        System.out.print("Hello and welcome to 3 Sum Solution!");
        System.out.println("Input[-1,0,1,2,-1,-4]: Output: "+ ThreeSum.threeSum(new int[]{-1,0,1,2,-1,-4}));
        System.out.println("Input[0,1,1]: Output: "+ ThreeSum.threeSum(new int[]{0,1,1}));
        System.out.println("Input[0,0,0]: Output: "+ ThreeSum.threeSum(new int[]{0,0,0}));
    }
}