package com.mycompany.week3_problems;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

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
    
    //uses scanner to read given file input, and loops through scanner while re-assigning specific indicies to match data from file
    public int[] getArrayFromFile(String fl) throws FileNotFoundException{
        Scanner sc = new Scanner(new File(fl));
        int[] arr = new int[100];
        int i = 0;
        while(sc.hasNextInt()) {
            arr[i++] = sc.nextInt();
        }
        return arr;
    }
    
    //makes us of the getArrayFromFile and getPrimeSum methods to return the sum of primes from a text file
    public int sumOfPrimesFromFile(String fl) throws FileNotFoundException{
        Scanner sc = new Scanner(new File(fl));
        int[] theArray = getArrayFromFile(fl);
        int answer = getPrimeSum(theArray);
        return answer;
    }
    
    
    public static void main(String[] args) throws FileNotFoundException {
        week3_problem nc = new week3_problem();
        int answer = nc.sumOfPrimesFromFile("C:/Users/Staib/Documents/NetBeansProjects/Week3_lab_session/NumberList.txt");
        System.out.println("Sum of primes in text file is: " + answer);
        
    }
    
}
