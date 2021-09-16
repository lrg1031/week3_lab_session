package com.mycompany.week3_problems;

public class week3_problem {
    
    boolean isPrime(int n) {
        for(int i = 2; i <= n-1; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        week3_problem nc = new week3_problem();
        boolean answer = nc.isPrime(16);
        System.out.println(answer);
        
    }
    
}
