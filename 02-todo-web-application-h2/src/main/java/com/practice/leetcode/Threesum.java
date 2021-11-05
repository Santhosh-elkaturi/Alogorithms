package com.practice.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Threesum {

	public static List<List<Integer>> threesum(int[] nums) {

		if(nums==null || nums.length<3) {
			return new ArrayList<List<Integer>>();
		}
		 
		List<List<Integer>> result = new ArrayList<>();
		int[] temp = new int[3];
		for (int i = 0; i < nums.length-2; i++) {
			for (int j = i + 1; j <nums.length-1; j++) {
				for (int k = j+1; k < nums.length; k++) {
					
				
				if (nums[i] + nums[j]+nums[k] == 0 && (k!=j && j!=i && i!=k)) {
					temp[0]=nums[i];
					temp[1]=nums[j];
					temp[2]=nums[k];
					
					result.add(Arrays.asList(nums[i],nums[j],nums[k]));
				}
					
				}
			}
		}
		return result;

	}

	public static void main(String[] args) {

		int[] nums = {-1,0,1,2,-1,-4};
	
		 List<List<Integer>> threesum = threesum(nums);
		 System.out.println(threesum);
	}
}
