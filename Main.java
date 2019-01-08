package com.company;

public class Main {
    public static void main(String[] args) {
       int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
       int max = Integer.MIN_VALUE;
       int max_here = 0;
        for (int i = 0; i < nums.length; i++) {
            max_here = max_here + nums[i];
            if(max < max_here){
                max = max_here;
            }
            if(max_here < 0){
                max_here = 0;
            }
        }
        System.out.println(max);
    }
}
