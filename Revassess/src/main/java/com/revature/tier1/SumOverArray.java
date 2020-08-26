package com.revature.tier1;

public class SumOverArray {

	public static int IterateAndSum(int[] arr) {
		int len=arr.length;
		int sum=0;
		for(int i=0;i<len;i++)
		{
			sum+=arr[i];
		}
		
		return sum;
	}
}
