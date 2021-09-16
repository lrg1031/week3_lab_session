package com.mycompany.week3_problems;

public class week3_problem {
    
    public boolean isPrime(int n) {
        for(int i = 2; i <= n-1; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public int getPrimeSum(int[] nums) {
        int sum = 0;
        for(int i = 0; i<nums.length; i++) {
            if(isPrime(nums[i])) {
                sum += nums[i];
            }
        }
        return sum;
    }
    
    public static void main(String[] args) {
        week3_problem nc = new week3_problem();
        int x = 5;
        int[] arr = {3,4,8,7,9,10,12,5};
        int sum = nc.getPrimeSum(arr);
        System.out.println("Sum of primes in array is " + sum);
        
    }
    
}
