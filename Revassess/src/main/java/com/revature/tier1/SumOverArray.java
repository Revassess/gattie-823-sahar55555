package com.revature.tier1;

import java.util.*;
public class SumOverArray {

	public static int IterateAndSum(int[] arr) {
		try {
		int len=arr.length;
		int sum=0;
	
		for(int i=0;i<len;i++)
			{
				sum+=arr[i];
			}
		return sum;
	}catch (Exception e) {
		return 0;
	}
	}
}
