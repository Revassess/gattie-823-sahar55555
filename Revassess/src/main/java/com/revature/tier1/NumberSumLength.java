package com.revature.tier1;

import java.util.Scanner;

public class NumberSumLength {

	public static boolean checkNumberPowerLength(long num) {
		 long  n, sum = 0;
		 int pwr,cnt=0;
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the number:");
	        num = sc.nextInt();
	        while(num >= 0)
	        {
	        	cnt++;
	        	num/=10;
	        
	            n=num%10;
	            sum+=Math.pow(n, cnt);
	        }
	        if(sum==num)
	        	return true;
		return false;
	}
}
