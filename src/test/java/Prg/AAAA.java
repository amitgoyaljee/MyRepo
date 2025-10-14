package Prg;


import org.testng.annotations.Test;

public class AAAA {

//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//You can return the answer in any order.
//
//Example 1:
//Input: nums = [2,7,11]

    //Input: nums = [2,7,11,15], target = 9 Output: [0,1]Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

    @Test
    public void myFun1(){
        int num [] =  {10, 20, 25, 63, 96, 57};
        int target= 30;

        int length= num.length;

        for( int i=0;i< length;i++){
            for( int j=i+1;i< length;i++){
                if(num[i]+num[j]==target){
                    int [] n= new int[] { i, j };
                    System.out.println("num1--  "+ n[i]+"    num2 --     "+n[j]);
                    System.out.println("num1  "+ num[i]+"    num2      "+num[j]);
                }
            }

        }

    }

}
