package com.practice.leetcode;

public class SingleNonRepeatedNumInArrayBS {

	    public int singleNonDuplicate(int[] nums) {
	        
	        int num = binarySearch(nums,0,nums.length-1);
			return num;
	        
	    }

		public int binarySearch(int[] nums, int l, int h) {
			
			if(nums.length==1) {
				return nums[0];
			}
			if(nums[0]!=nums[1]) {
				return nums[0];
			}
			if(nums[h]!=nums[h-1]) {
				return nums[h];
			}
			
			while(l<=h) {
				
				int mid =(l+h)/2;
				if(((mid)&1) == 1) {
					if(nums[mid] == nums[mid-1]) {
						l=mid+1;
					}else {
						h=mid-1;
					}
				}else {
					if(nums[mid]==nums[mid+1]) 
						l=mid+1;
					else if(nums[mid] == nums[mid-1])
						h=mid-1;
					else 
						return nums[mid];
				}
				
			}
			return 0;
		}
		}
