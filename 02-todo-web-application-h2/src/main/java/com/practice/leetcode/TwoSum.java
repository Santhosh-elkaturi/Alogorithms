package com.practice.leetcode;

public class TwoSum {

	 public static int[] twoSum(int[] nums, int target) {
		 	
		 int[] temp = new int[2];
		 for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if(nums[i]+nums[j]==target) {
					temp[0] = nums[i];
					temp[1] = nums[j];
				}
			}
		 }
		return temp;
		 
	 }
	        
	
	public static void main(String[] args) {
		
		int[] nums = {2,8,1};
		int target = 9;
		int[] temp = twoSum(nums,target);
		System.out.println(temp[0]+","+temp[1]);
	}
}

