package com.gopi.jenkinsmavan;

public class SumOfDigits {
	public static int sumOfDigits(int num) {
		int sum = 0;
		while(num>0) {
			sum += num%10;
			num = num/10;
		}
		return sum;
	}
}
