package com.practice.hibernateDemo;

public class sample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int N = 28; int nextValue = N + 1; while(true){ if(sumOfDigits(nextValue) ==
		 * sumOfDigits(N)){ System.out.println(nextValue); break; } nextValue += 1; } }
		 * 
		 * public static int sumOfDigits(int n){ int sum = 0; while(n > 0){ int digit =
		 * n % 10; sum = sum + digit; n = n /10; } return sum;
		 */
		
		String S = "aabbcc";
		int[] C = {1,2,1,2,1,2}; 
		int cost = 0;
		for(int i = 0 ; i < S.length() - 1; i++) {
			if(S.charAt(i) == S.charAt(i + 1)) {
				cost += C[i];
			}
		}
		
		System.out.println(cost);
    }

}
